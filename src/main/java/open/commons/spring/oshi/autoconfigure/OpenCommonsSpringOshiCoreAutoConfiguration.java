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
 * Date  : 2026. 4. 23. 오후 3:44:04
 *
 * Author: Park Jun-Hong (parkjunhong77@gmail.com)
 * 
 */

package open.commons.spring.oshi.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

import open.commons.spring.oshi.configure.properties.ShutdownNowCommands;
import open.commons.spring.oshi.service.IResourceService;
import open.commons.spring.oshi.service.ISystemService;
import open.commons.spring.oshi.service.impl.ResourceService;
import open.commons.spring.oshi.service.impl.SystemService;

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
@AutoConfiguration
@ConfigurationPropertiesScan(basePackages = { //
        "open.commons.spring.oshi.configure.properties" //
})
public class OpenCommonsSpringOshiCoreAutoConfiguration {
    public OpenCommonsSpringOshiCoreAutoConfiguration() {
    }

    /**
     * 
     * <br>
     * 
     * <pre>
     * [개정이력]
     *     날짜        | 작성자                   |   내용
     * -----------------------------------------------------
     * 2026. 4. 23.     parkjunhong77@gmail.com     최초 작성
     * </pre>
     *
     * @return
     *
     * @since 2026. 4. 23.
     * @version 4.0.0
     */
    @Bean(name = ResourceService.BEAN_QUALIFIER)
    @ConditionalOnMissingBean(name = ResourceService.BEAN_QUALIFIER)
    IResourceService resourceService() {
        return new ResourceService();
    }

    /**
     * 사용자의 애플리케이션 컨텍스트에 {@link SystemService} 타입의 빈이 없을 경우, 라이브러리에서 기본으로 제공하는
     * {@link SystemService}를 빈으로 등록합니다. <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜       | 작성자                   |   내용
     * -----------------------------------------------------
     * 2026. 4. 23.     parkjunhong77@gmail.com     최초 작성
     * </pre>
     * 
     * @param shutdownCommands
     *            yml에 설정된 OS별 종료 명령어 객체 (스프링이 자동 주입)
     * 
     * @return 기본 시스템 서비스 구현체
     * 
     * @since 2026. 4. 23.
     * @version 4.0.0
     */
    @Bean(name = SystemService.BEAN_QUALIFIER)
    @ConditionalOnMissingBean(name = SystemService.BEAN_QUALIFIER)
    ISystemService systemService(ShutdownNowCommands shutdownCommands) {
        return new SystemService(shutdownCommands);
    }
}
