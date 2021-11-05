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
 * Date  : 2021. 11. 5. 오후 3:19:26
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.data;

/**
 * 디스크 사용현황<br>
 * 
 * <a href="http://tools.ietf.org/html/rfc7159">JSON</a> source: <br>
 * 
 * <pre>
 * 
 * [CASE - 0]
 * 
 * {
 *   "name": "로컬 고정 디스크 (D:)",
 *   "label": "Google Drive",
 *   "description": "Fixed drive",
 *   "drive": "disk0",
 *   "total": 123123123123,
 *   "usable": 123123000000,
 *   "timestamp": 1234567890123
 * }
 * </pre>
 *
 *
 * @since 2021. 11. 5.
 * @version 0.1.0
 * @author parkjunhong77@gmail.com
 */
public class DiskStatus extends Timestamped {

    /**
     * 드라이브 이름<br>
     * <b>JSON name: "name"</b>
     */
    private String name;

    /**
     * 드라이브 별명<br>
     * <b>JSON name: "label"</b>
     */
    private String label;

    /**
     * 드라이브 설명<br>
     * <b>JSON name: "description"</b>
     */
    private String description;

    /**
     * 드라이브(Drive) 명<br>
     * <b>JSON name: "drive"</b>
     */
    private String drive;

    /**
     * 전체 용량 (단위: BASE)<br>
     * <b>JSON name: "total"</b>
     */
    private Long total;

    /**
     * 사용가능한 용량 (단위: BASE)<br>
     * <b>JSON name: "usable"</b>
     */
    private Long usable;

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
    public DiskStatus() {
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
     * @return the description
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #description
     */

    public String getDescription() {
        return description;
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
     * @return the drive
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #drive
     */

    public String getDrive() {
        return drive;
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
     * @return the label
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #label
     */

    public String getLabel() {
        return label;
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
     * @return the usable
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #usable
     */

    public Long getUsable() {
        return usable;
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
     * @param description
     *            the description to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @param drive
     *            the drive to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #drive
     */
    public void setDrive(String drive) {
        this.drive = drive;
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
     * @param label
     *            the label to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #label
     */
    public void setLabel(String label) {
        this.label = label;
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
     * @param usable
     *            the usable to set
     *
     * @since 2021. 11. 5.
     * @version 0.1.0
     * @author parkjunhong77@gmail.com
     *
     * @see #usable
     */
    public void setUsable(Long usable) {
        this.usable = usable;
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
        builder.append("DiskStatus [name=");
        builder.append(name);
        builder.append(", label=");
        builder.append(label);
        builder.append(", description=");
        builder.append(description);
        builder.append(", drive=");
        builder.append(drive);
        builder.append(", total=");
        builder.append(total);
        builder.append(", usable=");
        builder.append(usable);
        builder.append(", timestamp=");
        builder.append(timestamp);
        builder.append("]");
        return builder.toString();
    }

}
