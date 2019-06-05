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

import java.net.URI;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * To call external HTTP services using Async Http Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class AhcEndpoint {


    public static class AhcCommon extends EndpointConfiguration {
        /**
         * The URI to use such as http://hostname:port/path. The option is a
         * java.net.URI type.
         */
        private URI httpUri;
        /**
         * If the option is true, then the Exchange.HTTP_URI header is ignored,
         * and use the endpoint's URI for request. You may also set the
         * throwExceptionOnFailure to be false to let the AhcProducer send all
         * the fault response back. The option is a boolean type.
         */
        private boolean bridgeEndpoint;
        /**
         * The initial in-memory buffer size used when transferring data between
         * Camel and AHC Client. The option is a int type.
         */
        private int bufferSize;
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message. The option is a
         * org.apache.camel.spi.HeaderFilterStrategy type.
         */
        private HeaderFilterStrategy headerFilterStrategy;
        /**
         * Option to disable throwing the AhcOperationFailedException in case of
         * failed responses from the remote server. This allows you to get all
         * responses regardless of the HTTP status code. The option is a boolean
         * type.
         */
        private boolean throwExceptionOnFailure;
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type (for example
         * using Jetty or Servlet Camel components). On the producer side the
         * exception will be deserialized and thrown as is, instead of the
         * AhcOperationFailedException. The caused exception is required to be
         * serialized. This is by default turned off. If you enable this then be
         * aware that Java will deserialize the incoming data from the request
         * to Java and that can be a potential security risk. The option is a
         * boolean type.
         */
        private boolean transferException;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private boolean basicPropertyBinding;
        /**
         * To use a custom AhcBinding which allows to control how to bind
         * between AHC and Camel. The option is a
         * org.apache.camel.component.ahc.AhcBinding type.
         */
        private Object binding;
        /**
         * To configure the AsyncHttpClient to use a custom
         * com.ning.http.client.AsyncHttpClientConfig instance. The option is a
         * org.asynchttpclient.AsyncHttpClientConfig type.
         */
        private Object clientConfig;
        /**
         * To configure the AsyncHttpClientConfig using the key/values from the
         * Map. The option is a java.util.Map<java.lang.String,java.lang.Object>
         * type.
         */
        private Map<String, Object> clientConfigOptions;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private boolean synchronous;
        /**
         * To configure the AsyncHttpClientConfig Realm using the key/values
         * from the Map. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        private Map<String, Object> clientConfigRealmOptions;
        /**
         * Reference to a org.apache.camel.support.jsse.SSLContextParameters in
         * the Registry. This reference overrides any configured
         * SSLContextParameters at the component level. See Using the JSSE
         * Configuration Utility. Note that configuring this option will
         * override any SSL/TLS configuration options provided through the
         * clientConfig option at the endpoint or component level. The option is
         * a org.apache.camel.support.jsse.SSLContextParameters type.
         */
        private Object sslContextParameters;

        public URI getHttpUri() {
            return httpUri;
        }

        public void setHttpUri(URI httpUri) {
            this.httpUri = httpUri;
        }

        public boolean getBridgeEndpoint() {
            return bridgeEndpoint;
        }

        public void setBridgeEndpoint(boolean bridgeEndpoint) {
            this.bridgeEndpoint = bridgeEndpoint;
        }

        public int getBufferSize() {
            return bufferSize;
        }

        public void setBufferSize(int bufferSize) {
            this.bufferSize = bufferSize;
        }

        public HeaderFilterStrategy getHeaderFilterStrategy() {
            return headerFilterStrategy;
        }

        public void setHeaderFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            this.headerFilterStrategy = headerFilterStrategy;
        }

        public boolean getThrowExceptionOnFailure() {
            return throwExceptionOnFailure;
        }

        public void setThrowExceptionOnFailure(boolean throwExceptionOnFailure) {
            this.throwExceptionOnFailure = throwExceptionOnFailure;
        }

        public boolean getTransferException() {
            return transferException;
        }

        public void setTransferException(boolean transferException) {
            this.transferException = transferException;
        }

        public boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Object getBinding() {
            return binding;
        }

        public void setBinding(Object binding) {
            this.binding = binding;
        }

        public Object getClientConfig() {
            return clientConfig;
        }

        public void setClientConfig(Object clientConfig) {
            this.clientConfig = clientConfig;
        }

        public Map<String, Object> getClientConfigOptions() {
            return clientConfigOptions;
        }

        public void setClientConfigOptions(
                Map<String, Object> clientConfigOptions) {
            this.clientConfigOptions = clientConfigOptions;
        }

        public boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(boolean synchronous) {
            this.synchronous = synchronous;
        }

        public Map<String, Object> getClientConfigRealmOptions() {
            return clientConfigRealmOptions;
        }

        public void setClientConfigRealmOptions(
                Map<String, Object> clientConfigRealmOptions) {
            this.clientConfigRealmOptions = clientConfigRealmOptions;
        }

        public Object getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(Object sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }
    }

    public static class AhcConsumer extends AhcCommon {
    }

    public static class AhcProducer extends AhcCommon {
        /**
         * Define if the Connection Close header has to be added to HTTP
         * Request. This parameter is false by default. The option is a boolean
         * type.
         */
        private boolean connectionClose;
        /**
         * Configure a cookie handler to maintain a HTTP session. The option is
         * a org.apache.camel.http.common.cookie.CookieHandler type.
         */
        private Object cookieHandler;

        public boolean getConnectionClose() {
            return connectionClose;
        }

        public void setConnectionClose(boolean connectionClose) {
            this.connectionClose = connectionClose;
        }

        public Object getCookieHandler() {
            return cookieHandler;
        }

        public void setCookieHandler(Object cookieHandler) {
            this.cookieHandler = cookieHandler;
        }
    }
}