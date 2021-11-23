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
 * Date  : 2021. 11. 23. 오후 4:59:08
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.service.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Future;

import org.springframework.boot.SpringApplication;

import open.commons.Result;
import open.commons.spring.oshi.service.ISystemService;
import open.commons.spring.web.mvc.IAsyncJobHandler;
import open.commons.spring.web.mvc.service.CliExecutionComponent;
import open.commons.utils.ArrayUtils;

import oshi.PlatformEnum;
import oshi.SystemInfo;

/**
 * 시스템에 관한 기능을 제공합니다.
 * 
 * @since 2021. 11. 23.
 * @version 0.1.0
 * @author parkjunhong77@gmail.com
 */
public class SystemService extends CliExecutionComponent implements ISystemService, IAsyncJobHandler {

    public static final String BEAN_QUALIFIER = "open.commons.spring.oshi.service.impl.SystemService";

    private final static String SHUTDOWN_CMD_WINDOWS = "shutdown";

    /** 현재 운영체제 */
    private final PlatformEnum platform = SystemInfo.getCurrentPlatform();

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 23.		박준홍			최초 작성
     * </pre>
     *
     *
     * @since 2021. 11. 23.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     */
    public SystemService() {
    }

    /**
     *
     * @since 2021. 11. 23.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see open.commons.spring.web.mvc.IAsyncJobHandler#getAsyncManagerHolder()
     */
    @Override
    public Object getAsyncManagerHolder() {
        return getClass();
    }

    /**
     *
     * @since 2021. 11. 23.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see open.commons.spring.oshi.service.ISystemService#shutdownSystem(String...)
     */
    @SuppressWarnings("deprecation")
    @Override
    public Future<Object> shutdownSystem(String... args) {
        Object obj = null;

        switch (this.platform) {
            case AIX:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case ANDROID:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case FREEBSD:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case GNU:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case KFREEBSD:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case LINUX:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case MACOS:
            case MACOSX:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case NETBSD:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case OPENBSD:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case SOLARIS:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case UNKNOWN:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            case WINDOWS:
                obj = shutdownWindows(args);
                break;
            case WINDOWSCE:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
            default:
                throw new UnsupportedOperationException(String.format("현재 운영체제에서는 지원하지 않는 기능입니다.", this.platform));
        }

        return future(obj);
    }

    private Result<Boolean> shutdownWindows(String... args) {
        String[] cmdarray = ArrayUtils.prepend(args, SHUTDOWN_CMD_WINDOWS);
        Result<Boolean> resultShutdown = null;
        try {
            resultShutdown = executeNoWait(cmdarray, "시스템 종료");
        } catch (IOException e) {
            logger.error("시스템 종료 명령 실행을 실패하였습니다. 명령={}, 원인={}", Arrays.toString(cmdarray), e.getMessage(), e);
            resultShutdown = Result.error(e.getMessage());
        }

        // 프로그램 종료
        int exitCode = SpringApplication.exit(this.context, () -> 0);
        System.exit(exitCode);

        return resultShutdown;
    }
}
