/*
 * Copyright (C) 2014 tarent AG
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.osiam.addons.administration.exception;

public class OsiamException extends RuntimeException {

    private static final long serialVersionUID = -292158452140136468L;

    private String key;
    private int httpStatusCode;

    public OsiamException() {
        super();
    }

    public OsiamException(String message, Throwable cause) {
        super(message, cause);
    }

    public OsiamException(String message, String key, int httpStatusCode, Throwable cause) {
        super(message, cause);
        this.key = key;
        this.httpStatusCode = httpStatusCode;
    }

    public OsiamException(String message, String key, int httpStatusCode) {
        super(message);
        this.key = key;
        this.httpStatusCode = httpStatusCode;
    }

    public String getKey() {
        return key;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

}
