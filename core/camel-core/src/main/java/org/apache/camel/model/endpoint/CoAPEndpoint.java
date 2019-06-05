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
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The coap component is used for sending and receiving messages from COAP
 * capable devices.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class CoAPEndpoint {


    public static class CoAPCommon extends EndpointConfiguration {
        /**
         * The URI for the CoAP endpoint. The option is a java.net.URI type.
         */
        private URI uri;
        /**
         * Sets the alias used to query the KeyStore for the private key and
         * certificate. This parameter is used when we are enabling TLS with
         * certificates on the service side, and similarly on the client side
         * when TLS is used with certificates and client authentication. If the
         * parameter is not specified then the default behavior is to use the
         * first alias in the keystore that contains a key entry. This
         * configuration parameter does not apply to configuring TLS via a Raw
         * Public Key or a Pre-Shared Key. The option is a java.lang.String
         * type.
         */
        private String alias;
        /**
         * Sets the cipherSuites String. This is a comma separated String of
         * ciphersuites to configure. If it is not specified, then it falls back
         * to getting the ciphersuites from the sslContextParameters object. The
         * option is a java.lang.String type.
         */
        private String cipherSuites;
        /**
         * Sets the configuration options for server-side client-authentication
         * requirements. The value must be one of NONE, WANT, REQUIRE. If this
         * value is not specified, then it falls back to checking the
         * sslContextParameters.getServerParameters().getClientAuthentication()
         * value. The option is a java.lang.String type.
         */
        private String clientAuthentication;
        /**
         * Set the configured private key for use with Raw Public Key. The
         * option is a java.security.PrivateKey type.
         */
        private PrivateKey privateKey;
        /**
         * Set the PskStore to use for pre-shared key. The option is a
         * org.eclipse.californium.scandium.dtls.pskstore.PskStore type.
         */
        private Object pskStore;
        /**
         * Set the configured public key for use with Raw Public Key. The option
         * is a java.security.PublicKey type.
         */
        private PublicKey publicKey;
        /**
         * Set the SSLContextParameters object for setting up TLS. This is
         * required for coapstcp, and for coaps when we are using certificates
         * for TLS (as opposed to RPK or PKS). The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        private Object sslContextParameters;
        /**
         * Set the TrustedRpkStore to use to determine trust in raw public keys.
         * The option is a
         * org.eclipse.californium.scandium.dtls.rpkstore.TrustedRpkStore type.
         */
        private Object trustedRpkStore;
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

        public URI getUri() {
            return uri;
        }

        public void setUri(URI uri) {
            this.uri = uri;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getCipherSuites() {
            return cipherSuites;
        }

        public void setCipherSuites(String cipherSuites) {
            this.cipherSuites = cipherSuites;
        }

        public String getClientAuthentication() {
            return clientAuthentication;
        }

        public void setClientAuthentication(String clientAuthentication) {
            this.clientAuthentication = clientAuthentication;
        }

        public PrivateKey getPrivateKey() {
            return privateKey;
        }

        public void setPrivateKey(PrivateKey privateKey) {
            this.privateKey = privateKey;
        }

        public Object getPskStore() {
            return pskStore;
        }

        public void setPskStore(Object pskStore) {
            this.pskStore = pskStore;
        }

        public PublicKey getPublicKey() {
            return publicKey;
        }

        public void setPublicKey(PublicKey publicKey) {
            this.publicKey = publicKey;
        }

        public Object getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(Object sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public Object getTrustedRpkStore() {
            return trustedRpkStore;
        }

        public void setTrustedRpkStore(Object trustedRpkStore) {
            this.trustedRpkStore = trustedRpkStore;
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

    public static class CoAPConsumer extends CoAPCommon {
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
         * Comma separated list of methods that the CoAP consumer will bind to.
         * The default is to bind to all methods (DELETE, GET, POST, PUT). The
         * option is a java.lang.String type.
         */
        private String coapMethodRestrict;
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

        public String getCoapMethodRestrict() {
            return coapMethodRestrict;
        }

        public void setCoapMethodRestrict(String coapMethodRestrict) {
            this.coapMethodRestrict = coapMethodRestrict;
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

    public static class CoAPProducer extends CoAPCommon {
    }
}