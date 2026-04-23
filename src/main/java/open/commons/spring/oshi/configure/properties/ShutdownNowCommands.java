/*
 * Copyright 2026 Park Jun-Hong (parkjunhong77@gmail.com)
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
 * Date  : 2026. 4. 23. 오후 3:28:39
 *
 * Author: Park Jun-Hong (parkjunhong77@gmail.com)
 * 
 */

package open.commons.spring.oshi.configure.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <br>
 * 
 * <pre>
 * [개정이력]
 *     날짜        | 작성자                   |   내용
 * -----------------------------------------------------
 * 2026. 4. 23.     parkjunhong77@gmail.com     최초 작성
 * </pre>
 *
 * @since 2026. 4. 23.
 * @version 4.0.0
 * @author Park Jun-Hong (parkjunhong77@gmail.com)
 */
@ConfigurationProperties(prefix = Const.PROPERTIES_OPEN_COMMONS_SPRING_OSHI_ROOT_PATH + ".commands.shutdown-now")
public record ShutdownNowCommands( //
        String[] windows //
        , String[] linux //
        , String[] macos //
        , String[] solaris //
        , String[] freebsd //
        , String[] openbsd //
        , String[] netbsd //
        , String[] aix //
) {
}
