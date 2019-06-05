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
 * The websocket component provides websocket endpoints with Jetty for
 * communicating with clients using websocket.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class WebsocketEndpoint {


    public static class WebsocketCommon extends EndpointConfiguration {
        /**
         * The hostname. The default value is 0.0.0.0. Setting this option on
         * the component will use the component configured value as default. The
         * option is a java.lang.String type.
         */
        private String host;
        /**
         * The port number. The default value is 9292. Setting this option on
         * the component will use the component configured value as default. The
         * option is a java.lang.Integer type.
         */
        private Integer port;
        /**
         * Name of the websocket channel to use. The option is a
         * java.lang.String type.
         */
        private String resourceUri;
        /**
         * Can be used to set the size in bytes that the websocket created by
         * the websocketServlet may be accept before closing. (Default is -1 -
         * or unlimited). The option is a java.lang.Integer type.
         */
        private Integer maxBinaryMessageSize;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private boolean basicPropertyBinding;
        /**
         * Set the buffer size of the websocketServlet, which is also the max
         * frame byte size (default 8192). The option is a java.lang.Integer
         * type.
         */
        private Integer bufferSize;
        /**
         * Set the time in ms that the websocket created by the websocketServlet
         * may be idle before closing. (default is 300000). The option is a
         * java.lang.Integer type.
         */
        private Integer maxIdleTime;
        /**
         * Can be used to set the size in characters that the websocket created
         * by the websocketServlet may be accept before closing. The option is a
         * java.lang.Integer type.
         */
        private Integer maxTextMessageSize;
        /**
         * Can be used to set the minimum protocol version accepted for the
         * websocketServlet. (Default 13 - the RFC6455 version). The option is a
         * java.lang.Integer type.
         */
        private Integer minVersion;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private boolean synchronous;
        /**
         * The CORS allowed origins. Use to allow all. The option is a
         * java.lang.String type.
         */
        private String allowedOrigins;
        /**
         * Whether to enable CORS. The option is a boolean type.
         */
        private boolean crossOriginFilterOn;
        /**
         * Context path for filtering CORS. The option is a java.lang.String
         * type.
         */
        private String filterPath;
        /**
         * If this option is true, Jetty JMX support will be enabled for this
         * endpoint. See Jetty JMX support for more details. The option is a
         * boolean type.
         */
        private boolean enableJmx;
        /**
         * To configure security using SSLContextParameters. The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        private Object sslContextParameters;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getResourceUri() {
            return resourceUri;
        }

        public void setResourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
        }

        public Integer getMaxBinaryMessageSize() {
            return maxBinaryMessageSize;
        }

        public void setMaxBinaryMessageSize(Integer maxBinaryMessageSize) {
            this.maxBinaryMessageSize = maxBinaryMessageSize;
        }

        public boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Integer getBufferSize() {
            return bufferSize;
        }

        public void setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
        }

        public Integer getMaxIdleTime() {
            return maxIdleTime;
        }

        public void setMaxIdleTime(Integer maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
        }

        public Integer getMaxTextMessageSize() {
            return maxTextMessageSize;
        }

        public void setMaxTextMessageSize(Integer maxTextMessageSize) {
            this.maxTextMessageSize = maxTextMessageSize;
        }

        public Integer getMinVersion() {
            return minVersion;
        }

        public void setMinVersion(Integer minVersion) {
            this.minVersion = minVersion;
        }

        public boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(boolean synchronous) {
            this.synchronous = synchronous;
        }

        public String getAllowedOrigins() {
            return allowedOrigins;
        }

        public void setAllowedOrigins(String allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
        }

        public boolean getCrossOriginFilterOn() {
            return crossOriginFilterOn;
        }

        public void setCrossOriginFilterOn(boolean crossOriginFilterOn) {
            this.crossOriginFilterOn = crossOriginFilterOn;
        }

        public String getFilterPath() {
            return filterPath;
        }

        public void setFilterPath(String filterPath) {
            this.filterPath = filterPath;
        }

        public boolean getEnableJmx() {
            return enableJmx;
        }

        public void setEnableJmx(boolean enableJmx) {
            this.enableJmx = enableJmx;
        }

        public Object getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(Object sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }
    }

    public static class WebsocketConsumer extends WebsocketCommon {
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
         * Whether to enable session support which enables HttpSession for each
         * http request. The option is a boolean type.
         */
        private boolean sessionSupport;
        /**
         * Set a resource path for static resources (such as .html files etc).
         * The resources can be loaded from classpath, if you prefix with
         * classpath:, otherwise the resources is loaded from file system or
         * from JAR files. For example to load from root classpath use
         * classpath:., or classpath:WEB-INF/static If not configured (eg null)
         * then no static resource is in use. The option is a java.lang.String
         * type.
         */
        private String staticResources;
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

        public boolean getSessionSupport() {
            return sessionSupport;
        }

        public void setSessionSupport(boolean sessionSupport) {
            this.sessionSupport = sessionSupport;
        }

        public String getStaticResources() {
            return staticResources;
        }

        public void setStaticResources(String staticResources) {
            this.staticResources = staticResources;
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

    public static class WebsocketProducer extends WebsocketCommon {
        /**
         * Timeout in millis when sending to a websocket channel. The default
         * timeout is 30000 (30 seconds). The option is a java.lang.Integer
         * type.
         */
        private Integer sendTimeout;
        /**
         * To send to all websocket subscribers. Can be used to configure on
         * endpoint level, instead of having to use the
         * WebsocketConstants.SEND_TO_ALL header on the message. The option is a
         * java.lang.Boolean type.
         */
        private Boolean sendToAll;

        public Integer getSendTimeout() {
            return sendTimeout;
        }

        public void setSendTimeout(Integer sendTimeout) {
            this.sendTimeout = sendTimeout;
        }

        public Boolean getSendToAll() {
            return sendToAll;
        }

        public void setSendToAll(Boolean sendToAll) {
            this.sendToAll = sendToAll;
        }
    }
}