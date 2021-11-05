/*
 * Copyright 2021 Park Jun-Hong_(parkjunhong77@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 *
 * This file is generated under this project, "open-commons-spring-oshi".
 *
 * Date  : 2021. 11. 5. 오후 3:38:22
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

import open.commons.Result;
import open.commons.function.Runner;
import open.commons.spring.oshi.data.Cpu;
import open.commons.spring.oshi.data.CpuCore;
import open.commons.spring.oshi.data.DiskStatus;
import open.commons.spring.oshi.data.Memory;
import open.commons.spring.oshi.data.Network;
import open.commons.spring.oshi.data.Nic;
import open.commons.spring.oshi.data.Storage;
import open.commons.spring.oshi.data.SystemRunning;
import open.commons.spring.oshi.data.SystemStatus;
import open.commons.spring.oshi.service.IResourceService;
import open.commons.spring.web.mvc.service.AbstractComponent;
import open.commons.utils.CollectionUtils;
import open.commons.utils.ThreadUtils;

import oshi.PlatformEnum;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

/**
 * 시스템 자원현황 제공 서비스.
 * 
 * @since 2021. 11. 5.
 * @version 0.1.0
 * @author parkjunhong77@gmail.com
 */
public class ResourceService extends AbstractComponent implements IResourceService {

    /**
     * 논리 프로세스별 사용률을 제공한다.
     * 
     * @param cp
     *            Processor 정보 제공 객체
     * @param sleep
     *            사용률을 계산할 시간량 (단위: ms)
     * 
     * @return 논리 프로세스별 사용률
     */
    private static final BiFunction<CentralProcessor, Long, double[]> LOGICAL_PROCESSORS_USAGE = (cp, sleep) -> {
        // 이전 Tick 계산.
        long[][] oldTicks = cp.getProcessorCpuLoadTicks();

        // 일정시간 sleep
        long begin = System.currentTimeMillis();
        long t = sleep;
        while (!ThreadUtils.sleep(t)) {
            if ((t = sleep - System.currentTimeMillis() - begin) <= 0) {
                break;
            }
        }

        return cp.getProcessorCpuLoadBetweenTicks(oldTicks);
    };

    /**
     * CPU 사용률을 제공한다.
     * 
     * @param cp
     *            Processor 정보 제공 객체
     * @param sleep
     *            사용률을 계산할 시간량 (단위: ms)
     * 
     * @return CPU 사용률
     */
    private static final BiFunction<CentralProcessor, Long, Double> CPU_USAGE = (cp, sleep) -> {
        // 이전 Tick 계산.
        long[] oldTicks = cp.getSystemCpuLoadTicks();

        // 일정시간 sleep
        long begin = System.currentTimeMillis();
        long t = sleep;
        while (!ThreadUtils.sleep(t)) {
            if ((t = sleep - System.currentTimeMillis() - begin) <= 0) {
                break;
            }
        }

        return cp.getSystemCpuLoadBetweenTicks(oldTicks);
    };

    /** 시스템 정보 */
    protected final SystemInfo si;
    /** H/W 정보 */
    protected final HardwareAbstractionLayer hw;
    /** O.S 정보 */
    protected final OperatingSystem os;
    /** Platform 정보 */
    protected final PlatformEnum platform;

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 5.		박준홍			최초 작성
     * </pre>
     *
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     */
    public ResourceService() {
        this.si = new SystemInfo();
        this.hw = si.getHardware();
        this.os = si.getOperatingSystem();
        this.platform = SystemInfo.getCurrentPlatform();
    }

    /**
     * 
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 5.		박준홍			최초 작성
     * </pre>
     *
     * @param <T>
     *            데이터 타입
     * @param provider
     *            데이터 제공자
     * @param con
     *            데이터 소비자
     * @param errMsgBuf
     *            에러 메시지 취합
     *
     * @since 2021. 11. 5.
     * @version _._._
     * @author parkjunhong77@gmail.com
     */
    private <T> boolean getAndSet(Supplier<Result<T>> provider, Consumer<T> con, ArrayList<String> errMsgBuf) {
        Result<T> r = (Result<T>) provider.get();
        if (r.isSuccess()) {
            con.accept(r.getData());
        } else {
            errMsgBuf.add(r.getMessage());
        }
        return r.isSuccess();
    }

    /**
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see open.commons.spring.oshi.service.IResourceService#getCpu()
     */
    @Override
    public Result<Cpu> getCpu() {

        Supplier<Result<Cpu>> action = () -> {

            Cpu cpu = new Cpu();
            List<CpuCore> cores = new ArrayList<>();
            cpu.setCores(cores);

            CentralProcessor cp = hw.getProcessor();
            long sleep = 1000L;
            Runner runnerCpuUsage = () -> {
                cpu.setUsage(CPU_USAGE.apply(cp, sleep));
            };

            Runner runnerProcUsage = () -> {
                CpuCore cc = null;

                double[] usages = LOGICAL_PROCESSORS_USAGE.apply(cp, sleep);
                for (int idx = 0; idx < usages.length; idx++) {
                    cc = new CpuCore();
                    cc.setId(idx);
                    cc.setUsage(usages[idx]);

                    cores.add(cc);
                }
            };
            // 비동기 실행
            CollectionUtils.newList(runnerCpuUsage, runnerProcUsage).parallelStream() //
                    .forEach(r -> r.run());

            return Result.success(cpu);
        };

        return execute(action, "CPU 현황");
    }

    /**
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see open.commons.spring.oshi.service.IResourceService#getMemory()
     */
    @Override
    public Result<Memory> getMemory() {

        Supplier<Result<Memory>> action = () -> {

            Memory mem = new Memory();

            GlobalMemory gm = hw.getMemory();

            mem.setTotal(gm.getTotal());
            mem.setUsed(gm.getTotal() - gm.getAvailable());

            return Result.success(mem);
        };

        return execute(action, "Memory 현황");
    }

    /**
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see open.commons.spring.oshi.service.IResourceService#getNetwork()
     */
    @Override
    public Result<Network> getNetwork() {

        Supplier<Result<Network>> action = () -> {

            Network net = new Network();
            List<Nic> nics = new ArrayList<>();
            net.setNics(nics);

            HardwareAbstractionLayer hw = si.getHardware();
            hw.getNetworkIFs().forEach(ifs -> {
                Nic nic = new Nic();
                nic.setName(ifs.getName());
                nic.setDisplayName(ifs.getDisplayName());
                nic.setAlias(ifs.getIfAlias());
                nic.setIpv4Addr(String.join(".", ifs.getIPv4addr()));
                nic.setIpv6Addr(String.join(".", ifs.getIPv6addr()));
                nic.setMacAddr(ifs.getMacaddr());
                nic.setStatus(ifs.getIfOperStatus());

                nics.add(nic);
            });

            return Result.success(net);
        };

        return execute(action, "Network 현황");

    }

    /**
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see open.commons.spring.oshi.service.IResourceService#getStorage()
     */
    @Override
    public Result<Storage> getStorage() {

        Supplier<Result<Storage>> action = () -> {

            Storage storage = new Storage();
            List<DiskStatus> disks = new ArrayList<>();
            storage.setDisks(disks);

            os.getFileSystem().getFileStores().forEach(osfs -> {
                DiskStatus disk = new DiskStatus();
                disk.setName(osfs.getName());
                disk.setLabel(osfs.getLabel());
                disk.setDescription(osfs.getDescription());
                disk.setDrive(osfs.getMount());
                disk.setTotal(osfs.getTotalSpace());
                disk.setUsable(osfs.getUsableSpace());

                disks.add(disk);
            });

            return Result.success(storage);
        };

        return execute(action, "Storage 현황");
    }

    /**
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see open.commons.spring.oshi.service.IResourceService#getSystemRunning()
     */
    @Override
    public Result<SystemRunning> getSystemRunning() {

        Supplier<Result<SystemRunning>> action = () -> {

            SystemRunning sysRun = new SystemRunning();

            sysRun.setBootTime(os.getSystemBootTime());
            sysRun.setUpTime(os.getSystemUptime());

            return Result.success(sysRun);
        };

        return execute(action, "Running 현황");
    }

    /**
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see open.commons.spring.oshi.service.IResourceService#getSystemStatus()
     */
    @SuppressWarnings("unchecked")
    @Override
    public Result<SystemStatus> getSystemStatus() {

        Supplier<Result<SystemStatus>> action = () -> {

            SystemStatus sys = new SystemStatus();

            // 에러 메시지
            ArrayList<String> errMsg = new ArrayList<>();
            // CPU
            Supplier<Boolean> supCpu = () -> getAndSet(this::getCpu, sys::setCpus, errMsg);
            // Memory
            Supplier<Boolean> supMem = () -> getAndSet(this::getMemory, sys::setMemory, errMsg);
            // Network
            Supplier<Boolean> supNet = () -> getAndSet(this::getNetwork, sys::setNetworks, errMsg);
            // Storage
            Supplier<Boolean> supStorage = () -> getAndSet(this::getStorage, sys::setStorages, errMsg);
            // System Running
            Supplier<Boolean> supSysRun = () -> getAndSet(this::getSystemRunning, sys::setRunning, errMsg);

            // 비동기 실행.
            long errorCount = CollectionUtils.newList(supCpu, supMem, supNet, supStorage, supSysRun).parallelStream() //
                    .filter(s -> !s.get()) //
                    .count();
            return new Result<SystemStatus>(sys, errorCount != 5).setMessage(String.join(",", errMsg.toArray(new String[0])));
        };

        return execute(action, "시스템 현황");
    }
}
