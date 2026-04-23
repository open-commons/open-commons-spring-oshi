/*
 * Copyright 2021 Park Jun-Hong (parkjunhong77@gmail.com)
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
 * Date  : 2021. 11. 23. 오후 4:59:08
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

/*
 * Copyright 2021-2026 Park Jun-Hong (parkjunhong77@gmail.com)
 * ...
 */
package open.commons.spring.oshi.service.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.Async;

import open.commons.core.Result;
import open.commons.core.utils.ArrayUtils;
import open.commons.spring.oshi.configure.properties.ShutdownNowCommands;
import open.commons.spring.oshi.service.ISystemService;
import open.commons.spring.web.configure.concurrent.async.AsyncTaskExecutorConfiguration;
import open.commons.spring.web.mvc.IAsyncJobHandler;
import open.commons.spring.web.mvc.service.CliExecutionComponent;

import oshi.util.PlatformEnum;

/**
 * 시스템에 관한 기능을 제공합니다. <br>
 * 
 * <pre>
 * [개정이력]
 *     날짜        | 작성자                   |   내용
 * -----------------------------------------------------
 * 2021. 11. 23.    parkjunhong77@gmail.com     최초 작성
 * 2026. 4. 23.     parkjunhong77@gmail.com     JDK 25 및 OSHI 6.12.0 (FFM API) 마이그레이션 적용
 * </pre>
 * 
 * @since 2021. 11. 23.
 * @version 4.0.0
 * @author parkjunhong77@gmail.com
 */
public class SystemService extends CliExecutionComponent implements ISystemService, IAsyncJobHandler {

    public static final String BEAN_QUALIFIER = "open.commons.spring.oshi.service.impl.SystemService";

    // OS별 즉시 종료 명령어 세팅 (관리자/sudo 권한 전제)
    // sudoers 설정 호환성을 위해 유닉스 계열은 절대 경로 권장
    private final String[] shutdown_windows;
    private final String[] shutdown_linux;
    private final String[] shutdown_macos;
    private final String[] shutdown_solaris;
    private final String[] shutdown_freebsd;
    private final String[] shutdown_openbsd;
    private final String[] shutdown_netbsd;
    private final String[] shutdown_aix;

    /** 현재 운영체제 */
    private final PlatformEnum platform = PlatformEnum.getCurrentPlatform();

    /** 특정 명령어 실행 시 sudo 사용 여부 (application.yml 등에서 설정 가능) */
    @Value("${open-commons.spring.oshi.use-sudo:false}")
    private boolean useSudo = false;

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *     날짜        | 작성자                   |   내용
     * -----------------------------------------------------
     * 2021. 11. 23.    parkjunhong77@gmail.com     최초 작성
     * </pre>
     *
     * @since 2021. 11. 23.
     * @version 0.1.0
     */
    public SystemService(ShutdownNowCommands shutdownCommands) {
        this.shutdown_windows = shutdownCommands.windows();
        this.shutdown_linux = shutdownCommands.linux();
        this.shutdown_macos = shutdownCommands.macos();
        this.shutdown_solaris = shutdownCommands.solaris();
        this.shutdown_freebsd = shutdownCommands.freebsd();
        this.shutdown_openbsd = shutdownCommands.openbsd();
        this.shutdown_netbsd = shutdownCommands.netbsd();
        this.shutdown_aix = shutdownCommands.aix();
    }

    /**
     * @since 2021. 11. 23.
     * @version 0.1.0
     *
     * @see open.commons.spring.web.mvc.IAsyncJobHandler#getAsyncManagerHolder()
     */
    @Override
    public Object getAsyncManagerHolder() {
        return getClass();
    }

    /**
     * OS 명령을 실행하고 Spring Context를 안전하게 종료하는 공통 헬퍼 메소드입니다.
     */
    private Result<Boolean> performShutdown(String[] baseCommand, String... args) {

        // 1. 기본 명령어와 추가 인자 결합
        String[] cmdarray = ArrayUtils.merge(baseCommand, args);

        // 2. 관리자 권한 대행(sudo) 처리 (Windows 제외)
        if (this.useSudo && this.platform != PlatformEnum.WINDOWS) {
            cmdarray = ArrayUtils.prepend(cmdarray, "sudo");
        }

        Result<Boolean> resultShutdown;

        try {
            resultShutdown = executeNoWait(cmdarray, "시스템 종료");
        } catch (IOException e) {
            logger.error("시스템 종료 명령 실행을 실패하였습니다. 명령={}, 원인={}", Arrays.toString(cmdarray), e.getMessage(), e);
            resultShutdown = Result.error(e.getMessage());
        }

        // 프로그램(Spring Context) 안전 종료 처리
        int exitCode = SpringApplication.exit(this.context, () -> 0);
        System.exit(exitCode);

        return resultShutdown;
    }

    // =========================================================================
    // OS별 개별 처리 메소드 영역
    // =========================================================================

    private Result<Boolean> shutdownAix(String... args) {
        return performShutdown(shutdown_aix, args);
    }

    private Result<Boolean> shutdownFreeBsd(String... args) {
        return performShutdown(shutdown_freebsd, args);
    }

    private Result<Boolean> shutdownLinux(String... args) {
        // 필요에 따라 Linux 전용 args (예: "-h", "now")를 덮어쓰거나 가공할 수 있습니다.
        return performShutdown(shutdown_linux, args);
    }

    private Result<Boolean> shutdownMacOs(String... args) {
        return performShutdown(shutdown_macos, args);
    }

    private Result<Boolean> shutdownNetBsd(String... args) {
        return performShutdown(shutdown_netbsd, args);
    }

    private Result<Boolean> shutdownOpenBsd(String... args) {
        return performShutdown(shutdown_openbsd, args);
    }

    private Result<Boolean> shutdownSolaris(String... args) {
        return performShutdown(shutdown_solaris, args);
    }

    /**
     * 시스템 종료 명령을 수행합니다. <br>
     * *
     * 
     * <pre>
     * [개정이력]
     * 날짜        | 작성자                   |   내용
     * -----------------------------------------------------
     * 2021. 11. 23.    parkjunhong77@gmail.com     최초 작성
     * 2026. 4. 23.     parkjunhong77@gmail.com     모던 자바 Switch 표현식 적용
     * 2026. 4. 23.     parkjunhong77@gmail.com     OSHI 6.x PlatformEnum 전용 개별 종료 메소드 구현
     * </pre>
     * 
     * @since 2021. 11. 23.
     * @version 4.0.0
     *
     * @see open.commons.spring.oshi.service.ISystemService#shutdownSystem(String...)
     */
    @Async(AsyncTaskExecutorConfiguration.BEAN_QUALIFIER_VIRTUAL_THREAD_TASK_EXECUTEOR)
    @Override
    public Future<Object> shutdownSystem(String... args) {

        Object obj = switch (this.platform) {
            case MACOS -> shutdownMacOs(args);
            case LINUX -> shutdownLinux(args);
            case WINDOWS -> shutdownWindows(args);
            case SOLARIS -> shutdownSolaris(args);
            case FREEBSD -> shutdownFreeBsd(args);
            case OPENBSD -> shutdownOpenBsd(args);
            case AIX -> shutdownAix(args);
            case NETBSD -> shutdownNetBsd(args);
            case UNKNOWN -> throw new UnsupportedOperationException("현재 운영체제(UNKNOWN)를 식별할 수 없어 시스템을 종료할 수 없습니다.");
            default
            // case WINDOWSCE
            // case ANDROID
            // case GNU
            // case KFREEBSD
            // case DRAGONFLYBSD
                    -> throw new UnsupportedOperationException(
                            String.format("현재 운영체제(%s)에서는 지원하지 않는 기능입니다.", this.platform));
        };

        return future(obj);
    }

    // =========================================================================
    // 공통 실행 로직 추상화 (DRY 원칙)
    // =========================================================================

    private Result<Boolean> shutdownWindows(String... args) {
        return performShutdown(shutdown_windows, args);
    }
}