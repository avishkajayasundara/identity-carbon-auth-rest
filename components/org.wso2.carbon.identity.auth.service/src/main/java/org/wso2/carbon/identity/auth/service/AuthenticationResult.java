/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.auth.service;

import java.io.Serializable;

/**
 * AuthenticationResult hold the status.
 *
 */
public class AuthenticationResult implements Serializable{

    private AuthenticationStatus authenticationStatus = AuthenticationStatus.FAILED;

    private String authenticatedUser ;

    private String code = null ;
    private String message = null ;
    /**
     *
     *
     * @param authenticationStatus
     */
    public AuthenticationResult(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    /**
     *
     * @param authenticationStatus
     */
    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    /**
     * @return
     */
    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAuthenticatedUser() {
        return authenticatedUser;
    }

    public void setAuthenticatedUser(String authenticatedUser) {
        this.authenticatedUser = authenticatedUser;
    }
}