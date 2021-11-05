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
 * Date  : 2021. 11. 5. 오후 3:31:10
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.data;

/**
 * 시스템 자원 정보.<br>
 * 
 * <a href="http://tools.ietf.org/html/rfc7159">JSON</a> source: <br>
 * 
 * <pre>
 * 
 * [CASE - 0]
 * 
 * {
 *   "cpus": {
 *     "usage": 0.423,
 *     "cores": [
 *       {
 *         "id": 0,
 *         "usage": 0.3453
 *       },
 *       "timestamp": 1234567890123
 *     ],
 *     "timestamp": 1234567890123
 *   },
 *   "memory": {
 *     "total": 320000000000,
 *     "used": 5000000000,
 *     "timestamp": 1234567890123
 *   },
 *   "storages": {
 *     "count": 1,
 *     "disks": [
 *       {
 *         "drive": "disk0",
 *         "total": 123123123123,
 *         "free": 123123000000
 *       },
 *       "timestamp": 1234567890123
 *     ],
 *     "timestamp": 1234567890123
 *   },
 *   "networks": {
 *     "count": 2,
 *     "nics": [
 *       {
 *         "name": "eth1",
 *         "displayName": "Realtek PCIe GBE Family Controller",
 *         "alias": "ExternalEthernet",
 *         "ipv4Addr": "10.10.10.10",
 *         "ipv6Addr": "fe80:0:0:0:69bc:9fac:1dac:29c2",
 *         "macAddr": "D0:17:C2:92:F8:44",
 *         "status": "UP",
 *         "timestamp": 1234567890123
 *       }
 *     ],
 *     "timestamp": 1234567890123
 *   },
 *   "running": {
 *     "bootTime": 1635983822000,
 *     "upTime": 6539,
 *     "timestamp": 1234567890123
 *   },
 *   "timestamp": 1234567890123
 * }
 * </pre>
 *
 * @since 2021. 11. 5.
 * @version 0.1.0
 * @author parkjunhong77@gmail.com
 */
public class SystemStatus extends Timestamped {

    /**
     * CPU 사용현황 <br>
     * <b>JSON name: "cpus"</b>
     */
    private Cpu cpus;

    /**
     * 메모리 사용현황<br>
     * <b>JSON name: "memory"</b>
     */
    private Memory memory;

    /**
     * 저장장치 사용현황<br>
     * <b>JSON name: "storages"</b>
     */
    private Storage storages;

    /**
     * 네트워크 설정현황<br>
     * <b>JSON name: "networks"</b>
     */
    private Network networks;

    /**
     * 시스템 구동현황<br>
     * <b>JSON name: "running"</b>
     */
    private SystemRunning running;

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
    public SystemStatus() {
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
     * @return the cpus
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #cpus
     */

    public Cpu getCpus() {
        return cpus;
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
     * @return the memory
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #memory
     */

    public Memory getMemory() {
        return memory;
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
     * @return the networks
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #networks
     */

    public Network getNetworks() {
        return networks;
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
     * @return the running
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #running
     */

    public SystemRunning getRunning() {
        return running;
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
     * @return the storages
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #storages
     */

    public Storage getStorages() {
        return storages;
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
     * @param cpus
     *            the cpus to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #cpus
     */
    public void setCpus(Cpu cpus) {
        this.cpus = cpus;
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
     * @param memory
     *            the memory to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #memory
     */
    public void setMemory(Memory memory) {
        this.memory = memory;
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
     * @param networks
     *            the networks to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #networks
     */
    public void setNetworks(Network networks) {
        this.networks = networks;
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
     * @param running
     *            the running to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #running
     */
    public void setRunning(SystemRunning running) {
        this.running = running;
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
     * @param storages
     *            the storages to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #storages
     */
    public void setStorages(Storage storages) {
        this.storages = storages;
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
        builder.append("SystemStatus [cpus=");
        builder.append(cpus);
        builder.append(", memory=");
        builder.append(memory);
        builder.append(", storages=");
        builder.append(storages);
        builder.append(", networks=");
        builder.append(networks);
        builder.append(", running=");
        builder.append(running);
        builder.append(", timestamp=");
        builder.append(timestamp);
        builder.append("]");
        return builder.toString();
    }

}
