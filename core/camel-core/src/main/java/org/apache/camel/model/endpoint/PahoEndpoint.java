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
 * Component for communicating with MQTT M2M message brokers using Eclipse Paho
 * MQTT Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class PahoEndpoint {


    public static class PahoCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String topic;
        private Boolean autoReconnect;
        private String brokerUrl;
        private String clientId;
        private Object connectOptions;
        private String filePersistenceDirectory;
        private String password;
        private PahoPersistence persistence;
        private Integer qos;
        private Boolean resolveMqttConnectOptions;
        private Boolean retained;
        private String userName;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;

        /**
         * Name of the topic. The option is a java.lang.String type.
         */
        public T topic(String topic) {
            this.topic = topic;
            return (T) this;
        }

        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost. The option is a boolean type.
         */
        public T autoReconnect(boolean autoReconnect) {
            this.autoReconnect = autoReconnect;
            return (T) this;
        }

        /**
         * The URL of the MQTT broker. The option is a java.lang.String type.
         */
        public T brokerUrl(String brokerUrl) {
            this.brokerUrl = brokerUrl;
            return (T) this;
        }

        /**
         * MQTT client identifier. The option is a java.lang.String type.
         */
        public T clientId(String clientId) {
            this.clientId = clientId;
            return (T) this;
        }

        /**
         * Client connection options. The option is a
         * org.eclipse.paho.client.mqttv3.MqttConnectOptions type.
         */
        public T connectOptions(Object connectOptions) {
            this.connectOptions = connectOptions;
            return (T) this;
        }

        /**
         * Base directory used by the file persistence provider. The option is a
         * java.lang.String type.
         */
        public T filePersistenceDirectory(String filePersistenceDirectory) {
            this.filePersistenceDirectory = filePersistenceDirectory;
            return (T) this;
        }

        /**
         * Password to be used for authentication against the MQTT broker. The
         * option is a java.lang.String type.
         */
        public T password(String password) {
            this.password = password;
            return (T) this;
        }

        /**
         * Client persistence to be used - memory or file. The option is a
         * org.apache.camel.component.paho.PahoPersistence type.
         */
        public T persistence(PahoPersistence persistence) {
            this.persistence = persistence;
            return (T) this;
        }

        /**
         * Client quality of service level (0-2). The option is a int type.
         */
        public T qos(int qos) {
            this.qos = qos;
            return (T) this;
        }

        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry. The option is a boolean type.
         */
        public T resolveMqttConnectOptions(boolean resolveMqttConnectOptions) {
            this.resolveMqttConnectOptions = resolveMqttConnectOptions;
            return (T) this;
        }

        /**
         * Retain option. The option is a boolean type.
         */
        public T retained(boolean retained) {
            this.retained = retained;
            return (T) this;
        }

        /**
         * Username to be used for authentication against the MQTT broker. The
         * option is a java.lang.String type.
         */
        public T userName(String userName) {
            this.userName = userName;
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

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public Boolean getAutoReconnect() {
            return autoReconnect;
        }

        public void setAutoReconnect(Boolean autoReconnect) {
            this.autoReconnect = autoReconnect;
        }

        public String getBrokerUrl() {
            return brokerUrl;
        }

        public void setBrokerUrl(String brokerUrl) {
            this.brokerUrl = brokerUrl;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public Object getConnectOptions() {
            return connectOptions;
        }

        public void setConnectOptions(Object connectOptions) {
            this.connectOptions = connectOptions;
        }

        public String getFilePersistenceDirectory() {
            return filePersistenceDirectory;
        }

        public void setFilePersistenceDirectory(String filePersistenceDirectory) {
            this.filePersistenceDirectory = filePersistenceDirectory;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public PahoPersistence getPersistence() {
            return persistence;
        }

        public void setPersistence(PahoPersistence persistence) {
            this.persistence = persistence;
        }

        public Integer getQos() {
            return qos;
        }

        public void setQos(Integer qos) {
            this.qos = qos;
        }

        public Boolean getResolveMqttConnectOptions() {
            return resolveMqttConnectOptions;
        }

        public void setResolveMqttConnectOptions(
                Boolean resolveMqttConnectOptions) {
            this.resolveMqttConnectOptions = resolveMqttConnectOptions;
        }

        public Boolean getRetained() {
            return retained;
        }

        public void setRetained(Boolean retained) {
            this.retained = retained;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
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

    public static class PahoConsumer extends PahoCommon<PahoConsumer> {
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
        public PahoConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
            return (PahoConsumer) this;
        }

        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public PahoConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
            return (PahoConsumer) this;
        }

        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public PahoConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
            return (PahoConsumer) this;
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

    public static class PahoProducer extends PahoCommon<PahoProducer> {
    }

    public static enum PahoPersistence {
        FILE, MEMORY;
    }
}