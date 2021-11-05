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
 * Date  : 2021. 11. 5. 오후 3:21:19
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.data;

/**
 * 메모리 사용현황<br>
 * 
 * <a href="http://tools.ietf.org/html/rfc7159">JSON</a> source: <br>
 * 
 * <pre>
 * 
 * [CASE - 0]
 * 
 * {
 *   "total": 320000000000,
 *   "used": 5000000000,
 *   "timestamp": 1234567890123
 * }
 * </pre>
 *
 * @since 2021. 11. 5.
 * @version 0.1.0
 * @author parkjunhong77@gmail.com
 */
public class Memory extends Timestamped {

    /**
     * 전체 메모리 용량 (단위: BASE)<br>
     * <b>JSON name: "total"</b>
     */
    private Long total;

    /**
     * 사용 중인 메모리 (단위: BASE)<br>
     * <b>JSON name: "used"</b>
     */
    private Long used;

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
    public Memory() {
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
     * @return the total
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #total
     */

    public Long getTotal() {
        return total;
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
     * @return the used
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #used
     */

    public Long getUsed() {
        return used;
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
     * @param total
     *            the total to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #total
     */
    public void setTotal(Long total) {
        this.total = total;
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
     * @param used
     *            the used to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #used
     */
    public void setUsed(Long used) {
        this.used = used;
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
        builder.append("Memory [total=");
        builder.append(total);
        builder.append(", used=");
        builder.append(used);
        builder.append(", timestamp=");
        builder.append(timestamp);
        builder.append("]");
        return builder.toString();
    }

}
