/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Integrates Camel with Wordpress.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class WordpressEndpoint {


    public static class WordpressCommon extends EndpointConfiguration {
        /**
         * The endpoint operation. The option is a java.lang.String type.
         */
        private String operation;
        /**
         * The second part of an endpoint operation. Needed only when endpoint
         * semantic is not enough, like wordpress:post:delete. The option is a
         * java.lang.String type.
         */
        private String operationDetail;
        /**
         * The Wordpress REST API version. The option is a java.lang.String
         * type.
         */
        private String apiVersion;
        /**
         * The criteria to use with complex searches. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        private Map<String, Object> criteria;
        /**
         * Whether to bypass trash and force deletion. The option is a
         * java.lang.Boolean type.
         */
        private Boolean force;
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post. The option is a
         * java.lang.Integer type.
         */
        private Integer id;
        /**
         * Password from authorized user. The option is a java.lang.String type.
         */
        private String password;
        /**
         * Search criteria. The option is a
         * org.apache.camel.component.wordpress.api.model.SearchCriteria type.
         */
        private Object searchCriteria;
        /**
         * The Wordpress API URL from your site, e.g.
         * http://myblog.com/wp-json/. The option is a java.lang.String type.
         */
        private String url;
        /**
         * Authorized user to perform writing operations. The option is a
         * java.lang.String type.
         */
        private String user;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private boolean basicPropertyBinding;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private boolean synchronous;

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public String getOperationDetail() {
            return operationDetail;
        }

        public void setOperationDetail(String operationDetail) {
            this.operationDetail = operationDetail;
        }

        public String getApiVersion() {
            return apiVersion;
        }

        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }

        public Map<String, Object> getCriteria() {
            return criteria;
        }

        public void setCriteria(Map<String, Object> criteria) {
            this.criteria = criteria;
        }

        public Boolean getForce() {
            return force;
        }

        public void setForce(Boolean force) {
            this.force = force;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getSearchCriteria() {
            return searchCriteria;
        }

        public void setSearchCriteria(Object searchCriteria) {
            this.searchCriteria = searchCriteria;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(boolean synchronous) {
            this.synchronous = synchronous;
        }
    }

    public static class WordpressConsumer extends WordpressCommon {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        private boolean bridgeErrorHandler;
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        private ExceptionHandler exceptionHandler;
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        private ExchangePattern exchangePattern;

        public boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public ExceptionHandler getExceptionHandler() {
            return exceptionHandler;
        }

        public void setExceptionHandler(ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
        }

        public ExchangePattern getExchangePattern() {
            return exchangePattern;
        }

        public void setExchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
        }
    }

    public static class WordpressProducer extends WordpressCommon {
    }
}