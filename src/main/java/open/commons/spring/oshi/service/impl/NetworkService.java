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
 * Date  : 2021. 11. 16. 오후 1:06:17
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentSkipListMap;

import open.commons.core.Result;
import open.commons.core.utils.ArrayUtils;
import open.commons.spring.oshi.data.Network;
import open.commons.spring.oshi.data.Nic;
import open.commons.spring.oshi.data.ResourceNotFoundException;
import open.commons.spring.oshi.service.INetworkService;
import open.commons.spring.oshi.service.IResourceService;
import open.commons.spring.web.mvc.service.CliExecutionComponent;

import oshi.PlatformEnum;
import oshi.SystemInfo;

/**
 * 
 * @since 2021. 11. 16.
 * @version 0.1.0
 * @author parkjunhong77@gmail.com
 */
public class NetworkService extends CliExecutionComponent implements INetworkService {

    public static final String BEAN_QUALIFIER = "open.commons.spring.oshi.service.impl.NetworkService";

    protected static final Map<PlatformEnum, String[]> NET_COMMANDS = new ConcurrentSkipListMap<>();
    static {
        // Windows. (e.g. netsh interface set interface <alias>")
        // @see {@link Nic#getAlias}
        NET_COMMANDS.put(PlatformEnum.WINDOWS, new String[] { "netsh", "interface", "set", "interface" });
    }

    /** 현재 운영체제 */
    protected final PlatformEnum platform = SystemInfo.getCurrentPlatform();
    /** 시스템 정보 제공 서비스 */
    protected IResourceService resourceSvc;

    /**
     * Ethernet 이름과 Alias 정보.<br>
     * Ethernet을 비활성화 시킨 후 다시 활성화 하는 경우, 비활성화 된 Ethernet는 조회가 되지 않는 현상
     * <ul>
     * <li>key: Ethernet name. Nic#getName()
     * <li>value: Alias . Nic#getAlias()
     * </ul>
     * 
     * @see Nic#getName()
     * @see Nic#getAlias()
     */
    protected final Map<String, String> ethernetAliases = new HashMap<>();

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 16.		박준홍			최초 작성
     * </pre>
     * 
     * @param resorceSvc
     *            자원 정보 제공 서비스
     *
     *
     * @since 2021. 11. 16.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     */
    public NetworkService(IResourceService resourceSvc) {
        this.resourceSvc = resourceSvc;
    }

    protected final String[] getCommand(PlatformEnum platform) {
        String[] netcmd = NET_COMMANDS.get(platform);
        if (netcmd == null) {
            throw new UnsupportedOperationException(String.format("현재 운영체제(%s)에서는 지원하지 않는 기능입니다.", this.platform));
        }

        return netcmd;
    }

    /**
     * 주어진 정보(이더넷 이름)에 해당하는 Alias 값을 제공합니다. <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜      | 작성자   |   내용
     * ------------------------------------------
     * 2021. 11. 16.        박준홍         최초 작성
     * </pre>
     *
     * @param name
     *            이더넷 이름
     * @return
     *
     * @since 2021. 11. 16.
     * @author Park_Jun_Hong (parkjunhong77@gmail.com)
     */
    protected Result<String> getEthernetAlias(String name) throws ResourceNotFoundException {

        Result<Network> resultNetwork = resourceSvc.getNetwork();
        if (resultNetwork.isError()) {
            return Result.error(resultNetwork.getMessage());
        }

        Optional<String> optAlias = resultNetwork.getData().getNics().stream()//
                .filter(nic -> name.equalsIgnoreCase(nic.getName())) //
                .map(nic -> nic.getAlias()) //
                .findFirst();

        if (optAlias.isPresent()) {
            return Result.success(optAlias.get());
        } else {
            throw new ResourceNotFoundException("'%s'에 해당하는 이더넷 카드가 존재하지 않습니다.", name);
        }
    }

    /**
     *
     * @since 2021. 11. 16.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see open.commons.spring.oshi.service.INetworkService#handleEthernet(java.lang.String, String, String, boolean)
     */
    @SuppressWarnings("deprecation")
    @Override
    public Result<Boolean> handleEthernet(String name, String displayName, String alias, boolean enable) {
        switch (platform) {
            case AIX:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case ANDROID:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case FREEBSD:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case GNU:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case KFREEBSD:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case LINUX:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case MACOS:
            case MACOSX:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case NETBSD:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case OPENBSD:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case SOLARIS:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case UNKNOWN:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            case WINDOWS:
                return handleEthernetOnWindows(name, alias, enable);
            case WINDOWSCE:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
            default:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", platform));
        }
    }

    protected Result<Boolean> handleEthernetOnWindows(String name, String alias, boolean enable) {
        try {
            updateEthernets();

            // 주어진 이더넷에 대한 최신 'alias' 값
            String latestAlias = this.ethernetAliases.get(name);

            if (latestAlias != null) {
                alias = latestAlias;
            } else if (alias == null) {
                throw new ResourceNotFoundException("'%s'에 해당하는 이더넷 카드가 존재하지 않습니다.", name);
            }

            String[] netcmd = getCommand(this.platform);
            String[] cmdarray = ArrayUtils.add(netcmd, alias, enable ? "enable" : "disable");

            return executeNoWait(cmdarray, enable ? "이더넷 활성화" : "이더넷 비활성화");
        } catch (ResourceNotFoundException | IOException e) {
            String errMsg = String.format("이더넷(%s) %s 작업을 실패하였습니다. 원인=%s", name, enable ? "활성화" : "비활성화", e.getMessage());
            logger.error(errMsg, e);
            return Result.error(errMsg);
        }
    }

    /**
     * 현재 Ethernet 정보를 갱신합니다. <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 16.		박준홍			최초 작성
     * </pre>
     *
     *
     * @since 2021. 11. 16.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     */
    protected void updateEthernets() {
        Result<Network> resultNetwork = resourceSvc.getNetwork();
        if (resultNetwork.isError()) {
            logger.warn("이더넷 정보를 갱신하지 못하였습니다. 원인=%s", resultNetwork.getMessage());
        } else {
            resultNetwork.getData().getNics().stream()//
                    .forEach(nw -> {
                        ethernetAliases.put(nw.getName(), nw.getAlias());
                    });
        }
    };
}
