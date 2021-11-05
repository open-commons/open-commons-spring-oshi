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
 * Date  : 2021. 11. 5. 오후 3:22:15
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.data;

import oshi.hardware.NetworkIF.IfOperStatus;

/**
 * <a href="https://en.wikipedia.org/wiki/Network_interface_controller">NIC(Network Interface Controller)</a> 설정정보<br>
 * 
 * <a href="http://tools.ietf.org/html/rfc7159">JSON</a> source: <br>
 * 
 * <pre>
 * 
 * [CASE - 0]
 * 
 * {
 *   "name": "eth1",
 *   "displayName": "Realtek PCIe GBE Family Controller",
 *   "alias": "ExternalEthernet",
 *   "ipv4Addr": "10.10.10.10",
 *   "ipv6Addr": "fe80:0:0:0:69bc:9fac:1dac:29c2",
 *   "macAddr": "D0:17:C2:92:F8:44",
 *   "status": "UP",
 *   "timestamp": 1234567890123
 * }
 * </pre>
 * 
 * @since 2021. 11. 5.
 * @version 0.1.0
 * @author parkjunhong77@gmail.com
 */
public class Nic extends Timestamped {

    /**
     * 이더넷 이름(Ethernet Name)<br>
     * <b>JSON name: "name"</b>
     */
    private String name;

    /**
     * 제품 또는 벤더사가 제공하는 이름(Product / Vendor Supplied Name)<br>
     * <b>JSON name: "displayName"</b>
     */
    private String displayName;

    /**
     * 사용자에게 익숙한 이름 (User-Friendly Name)<br>
     * <b>JSON name: "alias"</b>
     * 
     * @see <a href="https://datatracker.ietf.org/doc/html/rfc2863">RFC 2863</a>
     */
    private String alias;

    /**
     * IPv4(Internal Protocol v4) 주소<br>
     * <b>JSON name: "ipv4Addr"</b>
     */
    private String ipv4Addr;

    /**
     * IPv6(Internet Protocol v6) 주소<br>
     * <b>JSON name: "ipv6Addr"</b>
     */
    private String ipv6Addr;

    /**
     * MAC(Media Access Control) 주소<br>
     * <b>JSON name: "macAddr"</b>
     */
    private String macAddr;

    /**
     * 실행 상태.<br>
     * <b>JSON name: "status"</b>
     * 
     * @see <a href="https://datatracker.ietf.org/doc/html/rfc2863">RFC 2863</a>
     */
    private IfOperStatus status;

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
    public Nic() {
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
     * @return the alias
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #alias
     */

    public String getAlias() {
        return alias;
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
     * @return the displayName
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #displayName
     */

    public String getDisplayName() {
        return displayName;
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
     * @return the ipv4Addr
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #ipv4Addr
     */

    public String getIpv4Addr() {
        return ipv4Addr;
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
     * @return the ipv6Addr
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #ipv6Addr
     */

    public String getIpv6Addr() {
        return ipv6Addr;
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
     * @return the macAddr
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #macAddr
     */

    public String getMacAddr() {
        return macAddr;
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
     * @return the name
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #name
     */

    public String getName() {
        return name;
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
     * @return the status
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #status
     */

    public IfOperStatus getStatus() {
        return status;
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
     * @param alias
     *            the alias to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
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
     * @param displayName
     *            the displayName to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
     * @param ipv4Addr
     *            the ipv4Addr to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #ipv4Addr
     */
    public void setIpv4Addr(String ipv4Addr) {
        this.ipv4Addr = ipv4Addr;
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
     * @param ipv6Addr
     *            the ipv6Addr to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #ipv6Addr
     */
    public void setIpv6Addr(String ipv6Addr) {
        this.ipv6Addr = ipv6Addr;
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
     * @param macAddr
     *            the macAddr to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #macAddr
     */
    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
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
     * @param name
     *            the name to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #name
     */
    public void setName(String name) {
        this.name = name;
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
     * @param status
     *            the status to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #status
     */
    public void setStatus(IfOperStatus status) {
        this.status = status;
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
        builder.append("Nic [name=");
        builder.append(name);
        builder.append(", displayName=");
        builder.append(displayName);
        builder.append(", alias=");
        builder.append(alias);
        builder.append(", ipv4Addr=");
        builder.append(ipv4Addr);
        builder.append(", ipv6Addr=");
        builder.append(ipv6Addr);
        builder.append(", macAddr=");
        builder.append(macAddr);
        builder.append(", status=");
        builder.append(status);
        builder.append(", timestamp=");
        builder.append(timestamp);
        builder.append("]");
        return builder.toString();
    }

}
