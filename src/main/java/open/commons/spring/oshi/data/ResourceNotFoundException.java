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
 * Date  : 2021. 11. 16. 오후 1:13:39
 *
 * Author: parkjunhong77@gmail.com
 * 
 */

package open.commons.spring.oshi.data;

/**
 * 시스템에서 자원을 발견하지 못한 경우 발생.
 * 
 * @since 2021. 11. 16.
 * @version _._._
 * @author parkjunhong77@gmail.com
 */
public class ResourceNotFoundException extends Exception {

    private static final long serialVersionUID = 2369581631660835941L;

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 16.		박준홍			최초 작성
     * </pre>
     *
     *
     * @since 2021. 11. 16.
     * @version _._._
     * @author parkjunhong77@gmail.com
     */
    public ResourceNotFoundException() {
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 16.		박준홍			최초 작성
     * </pre>
     *
     * @param message
     *
     * @since 2021. 11. 16.
     * @version _._._
     * @author parkjunhong77@gmail.com
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 16.		박준홍			최초 작성
     * </pre>
     *
     * @param format
     * @param args
     *
     * @since 2021. 11. 16.
     * @version _._._
     * @author parkjunhong77@gmail.com
     * 
     * @see String#format(String, Object...)
     */
    public ResourceNotFoundException(String format, Object... args) {
        this(String.format(format, args));
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 16.		박준홍			최초 작성
     * </pre>
     *
     * @param message
     * @param cause
     *
     * @since 2021. 11. 16.
     * @version _._._
     * @author parkjunhong77@gmail.com
     */
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 16.		박준홍			최초 작성
     * </pre>
     *
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     *
     * @since 2021. 11. 16.
     * @version _._._
     * @author parkjunhong77@gmail.com
     */
    public ResourceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 16.		박준홍			최초 작성
     * </pre>
     *
     * @param cause
     *
     * @since 2021. 11. 16.
     * @version _._._
     * @author parkjunhong77@gmail.com
     */
    public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 16.		박준홍			최초 작성
     * </pre>
     * 
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     * @param format
     * @param args
     *            TODO
     *
     * @since 2021. 11. 16.
     * @version _._._
     * @author parkjunhong77@gmail.com
     */
    public ResourceNotFoundException(Throwable cause, boolean enableSuppression, boolean writableStackTrace, String format, Object... args) {
        super(String.format(format, args), cause, enableSuppression, writableStackTrace);
    }

    /**
     * <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2021. 11. 16.		박준홍			최초 작성
     * </pre>
     *
     * @param format
     * @param args
     *
     * @since 2021. 11. 16.
     * @version _._._
     * @author parkjunhong77@gmail.com
     * 
     * @see String#format(String, Object...)
     */
    public ResourceNotFoundException(Throwable cause, String format, Object... args) {
        this(String.format(format, args), cause);
    }

}
