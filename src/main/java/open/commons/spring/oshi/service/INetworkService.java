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
 * Date  : 2021. 11. 16. 오후 1:04:18
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.service;

import open.commons.core.Result;

/**
 * 
 * @since 2021. 11. 16.
 * @version 0.1.0
 * @author parkjunhong77@gmail.com
 */
public interface INetworkService {

    /**
     * 이더넷 카드를 활성/비활성화 시킨다. <br>
     * <font color="red"><b>* 시스템 관리자 권한 필요</b></font>
     * 
     * <pre>
     * [개정이력]
     *      날짜      | 작성자   |   내용
     * ------------------------------------------
     * 2021. 11. 16.        박준홍         최초 작성
     * </pre>
     *
     * @param name
     *            이더넷 이름.
     * @param displayName TODO
     * @param alias TODO
     * @param enable
     *            활성화/비활성화 여부. (true: 활성화)
     * @return
     *
     * @since 2021. 11. 16.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     */
    public Result<Boolean> handleEthernet(String name, String displayName, String alias, boolean enable);

}
