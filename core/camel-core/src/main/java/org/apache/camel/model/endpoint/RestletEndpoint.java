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
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * Component for consuming and producing Restful resources using Restlet.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class RestletEndpoint {


    public static class RestletCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String protocol;
        private String host;
        private Integer port;
        private String uriPattern;
        private Object restletMethod;
        private Boolean basicPropertyBinding;
        private HeaderFilterStrategy headerFilterStrategy;
        private Object restletBinding;
        private Boolean synchronous;
        private Map<String, String> restletRealm;
        private Object sslContextParameters;

        /**
         * The protocol to use which is http or https. The option is a
         * java.lang.String type.
         */
        public T protocol(String protocol) {
            this.protocol = protocol;
            return (T) this;
        }

        /**
         * The hostname of the restlet service. The option is a java.lang.String
         * type.
         */
        public T host(String host) {
            this.host = host;
            return (T) this;
        }

        /**
         * The port number of the restlet service. The option is a int type.
         */
        public T port(int port) {
            this.port = port;
            return (T) this;
        }

        /**
         * The resource pattern such as /customer/{id}. The option is a
         * java.lang.String type.
         */
        public T uriPattern(String uriPattern) {
            this.uriPattern = uriPattern;
            return (T) this;
        }

        /**
         * On a producer endpoint, specifies the request method to use. On a
         * consumer endpoint, specifies that the endpoint consumes only
         * restletMethod requests. The option is a org.restlet.data.Method type.
         */
        public T restletMethod(Object restletMethod) {
            this.restletMethod = restletMethod;
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
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message. The option is a
         * org.apache.camel.spi.HeaderFilterStrategy type.
         */
        public T headerFilterStrategy(HeaderFilterStrategy headerFilterStrategy) {
            this.headerFilterStrategy = headerFilterStrategy;
            return (T) this;
        }

        /**
         * To use a custom RestletBinding to bind between Restlet and Camel
         * message. The option is a
         * org.apache.camel.component.restlet.RestletBinding type.
         */
        public T restletBinding(Object restletBinding) {
            this.restletBinding = restletBinding;
            return (T) this;
        }

        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(Boolean synchronous) {
            this.synchronous = synchronous;
            return (T) this;
        }

        /**
         * To configure the security realms of restlet as a map. The option is a
         * java.util.Map<java.lang.String,java.lang.String> type.
         */
        public T restletRealm(Map<String, String> restletRealm) {
            this.restletRealm = restletRealm;
            return (T) this;
        }

        /**
         * To configure security using SSLContextParameters. The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
            return (T) this;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

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

        public String getUriPattern() {
            return uriPattern;
        }

        public void setUriPattern(String uriPattern) {
            this.uriPattern = uriPattern;
        }

        public Object getRestletMethod() {
            return restletMethod;
        }

        public void setRestletMethod(Object restletMethod) {
            this.restletMethod = restletMethod;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public HeaderFilterStrategy getHeaderFilterStrategy() {
            return headerFilterStrategy;
        }

        public void setHeaderFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            this.headerFilterStrategy = headerFilterStrategy;
        }

        public Object getRestletBinding() {
            return restletBinding;
        }

        public void setRestletBinding(Object restletBinding) {
            this.restletBinding = restletBinding;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }

        public Map<String, String> getRestletRealm() {
            return restletRealm;
        }

        public void setRestletRealm(Map<String, String> restletRealm) {
            this.restletRealm = restletRealm;
        }

        public Object getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(Object sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }
    }

    public static class RestletConsumer
            extends
                RestletCommon<RestletConsumer> {
        private Boolean bridgeErrorHandler;
        private Object[] restletMethods;
        private Boolean disableStreamCache;
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
        public RestletConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
            return (RestletConsumer) this;
        }

        /**
         * Specify one or more methods separated by commas (e.g.
         * restletMethods=post,put) to be serviced by a restlet consumer
         * endpoint. If both restletMethod and restletMethods options are
         * specified, the restletMethod setting is ignored. The possible methods
         * are: ALL,CONNECT,DELETE,GET,HEAD,OPTIONS,PATCH,POST,PUT,TRACE. The
         * option is a java.lang.String type.
         */
        public RestletConsumer restletMethods(Object[] restletMethods) {
            this.restletMethods = restletMethods;
            return (RestletConsumer) this;
        }

        /**
         * Determines whether or not the raw input stream from Restlet is cached
         * or not (Camel will read the stream into a in memory/overflow to file,
         * Stream caching) cache. By default Camel will cache the Restlet input
         * stream to support reading it multiple times to ensure Camel can
         * retrieve all data from the stream. However you can set this option to
         * true when you for example need to access the raw stream, such as
         * streaming it directly to a file or other persistent store.
         * DefaultRestletBinding will copy the request input stream into a
         * stream cache and put it into message body if this option is false to
         * support reading the stream multiple times. The option is a boolean
         * type.
         */
        public RestletConsumer disableStreamCache(boolean disableStreamCache) {
            this.disableStreamCache = disableStreamCache;
            return (RestletConsumer) this;
        }

        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public RestletConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
            return (RestletConsumer) this;
        }

        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public RestletConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
            return (RestletConsumer) this;
        }

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public Object[] getRestletMethods() {
            return restletMethods;
        }

        public void setRestletMethods(Object[] restletMethods) {
            this.restletMethods = restletMethods;
        }

        public Boolean getDisableStreamCache() {
            return disableStreamCache;
        }

        public void setDisableStreamCache(Boolean disableStreamCache) {
            this.disableStreamCache = disableStreamCache;
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

    public static class RestletProducer
            extends
                RestletCommon<RestletProducer> {
        private Integer connectTimeout;
        private Object cookieHandler;
        private Integer socketTimeout;
        private Boolean throwExceptionOnFailure;
        private Boolean autoCloseStream;
        private Boolean streamRepresentation;

        /**
         * The Client will give up connection if the connection is timeout, 0
         * for unlimited wait. The option is a int type.
         */
        public RestletProducer connectTimeout(int connectTimeout) {
            this.connectTimeout = connectTimeout;
            return (RestletProducer) this;
        }

        /**
         * Configure a cookie handler to maintain a HTTP session. The option is
         * a org.apache.camel.http.common.cookie.CookieHandler type.
         */
        public RestletProducer cookieHandler(Object cookieHandler) {
            this.cookieHandler = cookieHandler;
            return (RestletProducer) this;
        }

        /**
         * The Client socket receive timeout, 0 for unlimited wait. The option
         * is a int type.
         */
        public RestletProducer socketTimeout(int socketTimeout) {
            this.socketTimeout = socketTimeout;
            return (RestletProducer) this;
        }

        /**
         * Whether to throw exception on a producer failure. If this option is
         * false then the http status code is set as a message header which can
         * be checked if it has an error value. The option is a boolean type.
         */
        public RestletProducer throwExceptionOnFailure(
                boolean throwExceptionOnFailure) {
            this.throwExceptionOnFailure = throwExceptionOnFailure;
            return (RestletProducer) this;
        }

        /**
         * Whether to auto close the stream representation as response from
         * calling a REST service using the restlet producer. If the response is
         * streaming and the option streamRepresentation is enabled then you may
         * want to auto close the InputStream from the streaming response to
         * ensure the input stream is closed when the Camel Exchange is done
         * being routed. However if you need to read the stream outside a Camel
         * route, you may need to not auto close the stream. The option is a
         * boolean type.
         */
        public RestletProducer autoCloseStream(boolean autoCloseStream) {
            this.autoCloseStream = autoCloseStream;
            return (RestletProducer) this;
        }

        /**
         * Whether to support stream representation as response from calling a
         * REST service using the restlet producer. If the response is streaming
         * then this option can be enabled to use an java.io.InputStream as the
         * message body on the Camel Message body. If using this option you may
         * want to enable the autoCloseStream option as well to ensure the input
         * stream is closed when the Camel Exchange is done being routed.
         * However if you need to read the stream outside a Camel route, you may
         * need to not auto close the stream. The option is a boolean type.
         */
        public RestletProducer streamRepresentation(boolean streamRepresentation) {
            this.streamRepresentation = streamRepresentation;
            return (RestletProducer) this;
        }

        public Integer getConnectTimeout() {
            return connectTimeout;
        }

        public void setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
        }

        public Object getCookieHandler() {
            return cookieHandler;
        }

        public void setCookieHandler(Object cookieHandler) {
            this.cookieHandler = cookieHandler;
        }

        public Integer getSocketTimeout() {
            return socketTimeout;
        }

        public void setSocketTimeout(Integer socketTimeout) {
            this.socketTimeout = socketTimeout;
        }

        public Boolean getThrowExceptionOnFailure() {
            return throwExceptionOnFailure;
        }

        public void setThrowExceptionOnFailure(Boolean throwExceptionOnFailure) {
            this.throwExceptionOnFailure = throwExceptionOnFailure;
        }

        public Boolean getAutoCloseStream() {
            return autoCloseStream;
        }

        public void setAutoCloseStream(Boolean autoCloseStream) {
            this.autoCloseStream = autoCloseStream;
        }

        public Boolean getStreamRepresentation() {
            return streamRepresentation;
        }

        public void setStreamRepresentation(Boolean streamRepresentation) {
            this.streamRepresentation = streamRepresentation;
        }
    }
}