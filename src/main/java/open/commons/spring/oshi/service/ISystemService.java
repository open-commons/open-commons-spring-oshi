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
 * Date  : 2021. 11. 23. 오후 4:57:49
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.service;

import java.util.concurrent.Future;

/**
 * 시스템에 관한 기능을 제공합니다.
 * 
 * @since 2021. 11. 23.
 * @version 0.1.0
 * @author parkjunhong77@gmail.com
 */
public interface ISystemService {

    /**
     * 시스템을 정지시킵니다.<br>
     * 
     * <font color="red"><b>* 시스템 관리자 권한 필요</b></font>
     * 
     * <pre>
     * [개정이력]
     *      날짜      | 작성자   |   내용
     * ------------------------------------------
     * 2021. 11. 23.        박준홍         최초 작성
     * </pre>
     * 
     * @param args
     *            TODO
     *
     *
     * @since 2021. 11. 23.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Future<Object> shutdownSystem(String... args);
}
