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
 * Date  : 2021. 11. 5. 오후 3:24:11
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.data;

import java.util.ArrayList;
import java.util.List;

/**
 * 시스템에 설치된 <a href="https://en.wikipedia.org/wiki/Network_interface_controller">NIC(Network Interface Controller)</a>
 * 현황<br>
 * 
 * <a href="http://tools.ietf.org/html/rfc7159">JSON</a> source: <br>
 * 
 * <pre>
 * 
 * [CASE - 0]
 * 
 * {
 *   "count": 2,
 *   "nics": [
 *     {
 *       "name": "eth1",
 *       "displayName": "Realtek PCIe GBE Family Controller",
 *       "alias": "ExternalEthernet",
 *       "ipv4Addr": "10.10.10.10",
 *       "ipv6Addr": "fe80:0:0:0:69bc:9fac:1dac:29c2",
 *       "macAddr": "D0:17:C2:92:F8:44",
 *       "status": "UP",
 *       "timestamp": 1234567890123
 *     }
 *   ]
 * }
 * </pre>
 * 
 * @since 2021. 11. 5.
 * @version 0.1.0
 * @author parkjunhong77@gmail.com
 */
public class Network extends Timestamped {

    /**
     * <a href="https://en.wikipedia.org/wiki/Network_interface_controller">NIC(Network Interface Controller)</a> 개수<br>
     * <b>JSON name: "count"</b>
     */
    private Integer count;

    /**
     * NIC 정보<br>
     * <b>JSON name: "nics"</b>
     */
    private List<Nic> nics = new ArrayList<>();

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
    public Network() {
    }

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
     * @return the count
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #count
     */

    public Integer getCount() {
        return count;
    }

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
     * @return the nics
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #nics
     */

    public List<Nic> getNics() {
        return nics;
    }

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
     * @param nics
     *            the nics to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #nics
     */
    public void setNics(List<Nic> nics) {
        this.nics = nics;
        this.count = nics != null ? nics.size() : 0;
    }

    /**
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Network [count=");
        builder.append(count);
        builder.append(", nics=");
        builder.append(nics);
        builder.append(", timestamp=");
        builder.append(timestamp);
        builder.append("]");
        return builder.toString();
    }

}
