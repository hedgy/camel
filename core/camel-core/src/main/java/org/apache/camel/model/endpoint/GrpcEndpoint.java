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
 * The gRPC component allows to call and expose remote procedures via HTTP/2
 * with protobuf dataformat
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class GrpcEndpoint {


    public static class GrpcCommon extends EndpointConfiguration {
        /**
         * The gRPC server host name. This is localhost or 0.0.0.0 when being a
         * consumer or remote server host name when using producer. The option
         * is a java.lang.String type.
         */
        private String host;
        /**
         * The gRPC local or remote server port. The option is a int type.
         */
        private int port;
        /**
         * Fully qualified service name from the protocol buffer descriptor file
         * (package dot service definition name). The option is a
         * java.lang.String type.
         */
        private String service;
        /**
         * The HTTP/2 flow control window size (MiB). The option is a int type.
         */
        private int flowControlWindow;
        /**
         * The maximum message size allowed to be received/sent (MiB). The
         * option is a int type.
         */
        private int maxMessageSize;
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
        /**
         * Authentication method type in advance to the SSL/TLS negotiation. The
         * option is a org.apache.camel.component.grpc.GrpcAuthType type.
         */
        private GrpcAuthType authenticationType;
        /**
         * JSON Web Token sign algorithm. The option is a
         * org.apache.camel.component.grpc.auth.jwt.JwtAlgorithm type.
         */
        private JwtAlgorithm jwtAlgorithm;
        /**
         * JSON Web Token issuer. The option is a java.lang.String type.
         */
        private String jwtIssuer;
        /**
         * JSON Web Token secret. The option is a java.lang.String type.
         */
        private String jwtSecret;
        /**
         * JSON Web Token subject. The option is a java.lang.String type.
         */
        private String jwtSubject;
        /**
         * The X.509 certificate chain file resource in PEM format link. The
         * option is a java.lang.String type.
         */
        private String keyCertChainResource;
        /**
         * The PKCS#8 private key file password. The option is a
         * java.lang.String type.
         */
        private String keyPassword;
        /**
         * The PKCS#8 private key file resource in PEM format link. The option
         * is a java.lang.String type.
         */
        private String keyResource;
        /**
         * Identifies the security negotiation type used for HTTP/2
         * communication. The option is a io.grpc.netty.NegotiationType type.
         */
        private NegotiationType negotiationType;
        /**
         * Service Account key file in JSON format resource link supported by
         * the Google Cloud SDK. The option is a java.lang.String type.
         */
        private String serviceAccountResource;
        /**
         * The trusted certificates collection file resource in PEM format for
         * verifying the remote endpoint's certificate. The option is a
         * java.lang.String type.
         */
        private String trustCertCollectionResource;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        public int getFlowControlWindow() {
            return flowControlWindow;
        }

        public void setFlowControlWindow(int flowControlWindow) {
            this.flowControlWindow = flowControlWindow;
        }

        public int getMaxMessageSize() {
            return maxMessageSize;
        }

        public void setMaxMessageSize(int maxMessageSize) {
            this.maxMessageSize = maxMessageSize;
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

        public GrpcAuthType getAuthenticationType() {
            return authenticationType;
        }

        public void setAuthenticationType(GrpcAuthType authenticationType) {
            this.authenticationType = authenticationType;
        }

        public JwtAlgorithm getJwtAlgorithm() {
            return jwtAlgorithm;
        }

        public void setJwtAlgorithm(JwtAlgorithm jwtAlgorithm) {
            this.jwtAlgorithm = jwtAlgorithm;
        }

        public String getJwtIssuer() {
            return jwtIssuer;
        }

        public void setJwtIssuer(String jwtIssuer) {
            this.jwtIssuer = jwtIssuer;
        }

        public String getJwtSecret() {
            return jwtSecret;
        }

        public void setJwtSecret(String jwtSecret) {
            this.jwtSecret = jwtSecret;
        }

        public String getJwtSubject() {
            return jwtSubject;
        }

        public void setJwtSubject(String jwtSubject) {
            this.jwtSubject = jwtSubject;
        }

        public String getKeyCertChainResource() {
            return keyCertChainResource;
        }

        public void setKeyCertChainResource(String keyCertChainResource) {
            this.keyCertChainResource = keyCertChainResource;
        }

        public String getKeyPassword() {
            return keyPassword;
        }

        public void setKeyPassword(String keyPassword) {
            this.keyPassword = keyPassword;
        }

        public String getKeyResource() {
            return keyResource;
        }

        public void setKeyResource(String keyResource) {
            this.keyResource = keyResource;
        }

        public NegotiationType getNegotiationType() {
            return negotiationType;
        }

        public void setNegotiationType(NegotiationType negotiationType) {
            this.negotiationType = negotiationType;
        }

        public String getServiceAccountResource() {
            return serviceAccountResource;
        }

        public void setServiceAccountResource(String serviceAccountResource) {
            this.serviceAccountResource = serviceAccountResource;
        }

        public String getTrustCertCollectionResource() {
            return trustCertCollectionResource;
        }

        public void setTrustCertCollectionResource(
                String trustCertCollectionResource) {
            this.trustCertCollectionResource = trustCertCollectionResource;
        }
    }

    public static class GrpcConsumer extends GrpcCommon {
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
         * This option specifies the top-level strategy for processing service
         * requests and responses in streaming mode. If an aggregation strategy
         * is selected, all requests will be accumulated in the list, then
         * transferred to the flow, and the accumulated responses will be sent
         * to the sender. If a propagation strategy is selected, request is sent
         * to the stream, and the response will be immediately sent back to the
         * sender. The option is a
         * org.apache.camel.component.grpc.GrpcConsumerStrategy type.
         */
        private GrpcConsumerStrategy consumerStrategy;
        /**
         * Determines if onCompleted events should be pushed to the Camel route.
         * The option is a boolean type.
         */
        private boolean forwardOnCompleted;
        /**
         * Determines if onError events should be pushed to the Camel route.
         * Exceptions will be set as message body. The option is a boolean type.
         */
        private boolean forwardOnError;
        /**
         * The maximum number of concurrent calls permitted for each incoming
         * server connection. The option is a int type.
         */
        private int maxConcurrentCallsPerConnection;
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

        public GrpcConsumerStrategy getConsumerStrategy() {
            return consumerStrategy;
        }

        public void setConsumerStrategy(GrpcConsumerStrategy consumerStrategy) {
            this.consumerStrategy = consumerStrategy;
        }

        public boolean getForwardOnCompleted() {
            return forwardOnCompleted;
        }

        public void setForwardOnCompleted(boolean forwardOnCompleted) {
            this.forwardOnCompleted = forwardOnCompleted;
        }

        public boolean getForwardOnError() {
            return forwardOnError;
        }

        public void setForwardOnError(boolean forwardOnError) {
            this.forwardOnError = forwardOnError;
        }

        public int getMaxConcurrentCallsPerConnection() {
            return maxConcurrentCallsPerConnection;
        }

        public void setMaxConcurrentCallsPerConnection(
                int maxConcurrentCallsPerConnection) {
            this.maxConcurrentCallsPerConnection = maxConcurrentCallsPerConnection;
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

    public static class GrpcProducer extends GrpcCommon {
        /**
         * gRPC method name. The option is a java.lang.String type.
         */
        private String method;
        /**
         * The mode used to communicate with a remote gRPC server. In SIMPLE
         * mode a single exchange is translated into a remote procedure call. In
         * STREAMING mode all exchanges will be sent within the same request
         * (input and output of the recipient gRPC service must be of type
         * 'stream'). The option is a
         * org.apache.camel.component.grpc.GrpcProducerStrategy type.
         */
        private GrpcProducerStrategy producerStrategy;
        /**
         * When using STREAMING client mode, it indicates the endpoint where
         * responses should be forwarded. The option is a java.lang.String type.
         */
        private String streamRepliesTo;
        /**
         * The user agent header passed to the server. The option is a
         * java.lang.String type.
         */
        private String userAgent;

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public GrpcProducerStrategy getProducerStrategy() {
            return producerStrategy;
        }

        public void setProducerStrategy(GrpcProducerStrategy producerStrategy) {
            this.producerStrategy = producerStrategy;
        }

        public String getStreamRepliesTo() {
            return streamRepliesTo;
        }

        public void setStreamRepliesTo(String streamRepliesTo) {
            this.streamRepliesTo = streamRepliesTo;
        }

        public String getUserAgent() {
            return userAgent;
        }

        public void setUserAgent(String userAgent) {
            this.userAgent = userAgent;
        }
    }

    public static enum GrpcConsumerStrategy {
        AGGREGATION, PROPAGATION;
    }

    public static enum GrpcProducerStrategy {
        SIMPLE, STREAMING;
    }

    public static enum GrpcAuthType {
        NONE, GOOGLE, JWT;
    }

    public static enum JwtAlgorithm {
        HMAC256, HMAC384, HMAC512;
    }

    public static enum NegotiationType {
        TLS, PLAINTEXT_UPGRADE, PLAINTEXT;
    }
}