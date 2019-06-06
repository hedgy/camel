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

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The cmis component uses the Apache Chemistry client API and allows you to
 * add/read nodes to/from a CMIS compliant content repositories.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class CMISEndpoint {


    public static class CMISCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String cmsUrl;
        private Integer pageSize;
        private Boolean readContent;
        private Integer readCount;
        private String repositoryId;
        private Boolean basicPropertyBinding;
        private Object sessionFacadeFactory;
        private Boolean synchronous;
        private String password;
        private String username;

        /**
         * URL to the cmis repository. The option is a java.lang.String type.
         */
        public T cmsUrl(String cmsUrl) {
            this.cmsUrl = cmsUrl;
            return (T) this;
        }

        /**
         * Number of nodes to retrieve per page. The option is a int type.
         */
        public T pageSize(int pageSize) {
            this.pageSize = pageSize;
            return (T) this;
        }

        /**
         * If set to true, the content of document node will be retrieved in
         * addition to the properties. The option is a boolean type.
         */
        public T readContent(boolean readContent) {
            this.readContent = readContent;
            return (T) this;
        }

        /**
         * Max number of nodes to read. The option is a int type.
         */
        public T readCount(int readCount) {
            this.readCount = readCount;
            return (T) this;
        }

        /**
         * The Id of the repository to use. If not specified the first available
         * repository is used. The option is a java.lang.String type.
         */
        public T repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return (T) this;
        }

        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
            return (T) this;
        }

        /**
         * To use a custom CMISSessionFacadeFactory to create the
         * CMISSessionFacade instances. The option is a
         * org.apache.camel.component.cmis.CMISSessionFacadeFactory type.
         */
        public T sessionFacadeFactory(Object sessionFacadeFactory) {
            this.sessionFacadeFactory = sessionFacadeFactory;
            return (T) this;
        }

        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.synchronous = synchronous;
            return (T) this;
        }

        /**
         * Password for the cmis repository. The option is a java.lang.String
         * type.
         */
        public T password(String password) {
            this.password = password;
            return (T) this;
        }

        /**
         * Username for the cmis repository. The option is a java.lang.String
         * type.
         */
        public T username(String username) {
            this.username = username;
            return (T) this;
        }

        public String getCmsUrl() {
            return cmsUrl;
        }

        public void setCmsUrl(String cmsUrl) {
            this.cmsUrl = cmsUrl;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public Boolean getReadContent() {
            return readContent;
        }

        public void setReadContent(Boolean readContent) {
            this.readContent = readContent;
        }

        public Integer getReadCount() {
            return readCount;
        }

        public void setReadCount(Integer readCount) {
            this.readCount = readCount;
        }

        public String getRepositoryId() {
            return repositoryId;
        }

        public void setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Object getSessionFacadeFactory() {
            return sessionFacadeFactory;
        }

        public void setSessionFacadeFactory(Object sessionFacadeFactory) {
            this.sessionFacadeFactory = sessionFacadeFactory;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    public static class CMISConsumer extends CMISCommon<CMISConsumer> {
        private Boolean bridgeErrorHandler;
        private String query;
        private ExceptionHandler exceptionHandler;
        private ExchangePattern exchangePattern;

        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public CMISConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
            return (CMISConsumer) this;
        }

        /**
         * The cmis query to execute against the repository. If not specified,
         * the consumer will retrieve every node from the content repository by
         * iterating the content tree recursively. The option is a
         * java.lang.String type.
         */
        public CMISConsumer query(String query) {
            this.query = query;
            return (CMISConsumer) this;
        }

        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public CMISConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
            return (CMISConsumer) this;
        }

        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public CMISConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
            return (CMISConsumer) this;
        }

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
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

    public static class CMISProducer extends CMISCommon<CMISProducer> {
        private Boolean queryMode;

        /**
         * If true, will execute the cmis query from the message body and return
         * result, otherwise will create a node in the cmis repository. The
         * option is a boolean type.
         */
        public CMISProducer queryMode(boolean queryMode) {
            this.queryMode = queryMode;
            return (CMISProducer) this;
        }

        public Boolean getQueryMode() {
            return queryMode;
        }

        public void setQueryMode(Boolean queryMode) {
            this.queryMode = queryMode;
        }
    }
}