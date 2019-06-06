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
 * The atmos component is used for integrating with EMC's Atomos Storage.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class AtmosEndpoint {


    public static class AtmosCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String name;
        private AtmosOperation operation;
        private Boolean enableSslValidation;
        private String fullTokenId;
        private String localPath;
        private String newRemotePath;
        private String query;
        private String remotePath;
        private String secretKey;
        private String uri;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;

        /**
         * Atmos name. The option is a java.lang.String type.
         */
        public T name(String name) {
            this.name = name;
            return (T) this;
        }

        /**
         * Operation to perform. The option is a
         * org.apache.camel.component.atmos.util.AtmosOperation type.
         */
        public T operation(AtmosOperation operation) {
            this.operation = operation;
            return (T) this;
        }

        /**
         * Atmos SSL validation. The option is a boolean type.
         */
        public T enableSslValidation(boolean enableSslValidation) {
            this.enableSslValidation = enableSslValidation;
            return (T) this;
        }

        /**
         * Atmos client fullTokenId. The option is a java.lang.String type.
         */
        public T fullTokenId(String fullTokenId) {
            this.fullTokenId = fullTokenId;
            return (T) this;
        }

        /**
         * Local path to put files. The option is a java.lang.String type.
         */
        public T localPath(String localPath) {
            this.localPath = localPath;
            return (T) this;
        }

        /**
         * New path on Atmos when moving files. The option is a java.lang.String
         * type.
         */
        public T newRemotePath(String newRemotePath) {
            this.newRemotePath = newRemotePath;
            return (T) this;
        }

        /**
         * Search query on Atmos. The option is a java.lang.String type.
         */
        public T query(String query) {
            this.query = query;
            return (T) this;
        }

        /**
         * Where to put files on Atmos. The option is a java.lang.String type.
         */
        public T remotePath(String remotePath) {
            this.remotePath = remotePath;
            return (T) this;
        }

        /**
         * Atmos shared secret. The option is a java.lang.String type.
         */
        public T secretKey(String secretKey) {
            this.secretKey = secretKey;
            return (T) this;
        }

        /**
         * Atomos server uri. The option is a java.lang.String type.
         */
        public T uri(String uri) {
            this.uri = uri;
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
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.synchronous = synchronous;
            return (T) this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public AtmosOperation getOperation() {
            return operation;
        }

        public void setOperation(AtmosOperation operation) {
            this.operation = operation;
        }

        public Boolean getEnableSslValidation() {
            return enableSslValidation;
        }

        public void setEnableSslValidation(Boolean enableSslValidation) {
            this.enableSslValidation = enableSslValidation;
        }

        public String getFullTokenId() {
            return fullTokenId;
        }

        public void setFullTokenId(String fullTokenId) {
            this.fullTokenId = fullTokenId;
        }

        public String getLocalPath() {
            return localPath;
        }

        public void setLocalPath(String localPath) {
            this.localPath = localPath;
        }

        public String getNewRemotePath() {
            return newRemotePath;
        }

        public void setNewRemotePath(String newRemotePath) {
            this.newRemotePath = newRemotePath;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getRemotePath() {
            return remotePath;
        }

        public void setRemotePath(String remotePath) {
            this.remotePath = remotePath;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }
    }

    public static class AtmosConsumer extends AtmosCommon<AtmosConsumer> {
        private Boolean bridgeErrorHandler;
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
        public AtmosConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
            return (AtmosConsumer) this;
        }

        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public AtmosConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
            return (AtmosConsumer) this;
        }

        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public AtmosConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
            return (AtmosConsumer) this;
        }

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
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

    public static class AtmosProducer extends AtmosCommon<AtmosProducer> {
    }

    public static enum AtmosOperation {
        put, del, search, get, move;
    }
}