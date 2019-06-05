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

/**
 * The cm-sms component allows to integrate with CM SMS Gateway.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class CMEndpoint {


    public static class CMCommon extends EndpointConfiguration {
        /**
         * SMS Provider HOST with scheme. The option is a java.lang.String type.
         */
        private String host;
        /**
         * This is the sender name. The maximum length is 11 characters. The
         * option is a
         * (@javax.validation.constraints.NotNull,@javax.validation.constraints.Size(min=1, max=11) :: java.lang.String) type.
         */
        private String defaultFrom;
        /**
         * If it is a multipart message forces the max number. Message can be
         * truncated. Technically the gateway will first check if a message is
         * larger than 160 characters, if so, the message will be cut into
         * multiple 153 characters parts limited by these parameters. The option
         * is a
         * (@javax.validation.constraints.Min(1L),@javax.validation.constraints.Max(8L) :: int) type.
         */
        private int defaultMaxNumberOfParts;
        /**
         * The unique token to use. The option is a
         * (@javax.validation.constraints.NotNull :: java.lang.String) type.
         */
        private String productToken;
        /**
         * Whether to test the connection to the SMS Gateway on startup. The
         * option is a boolean type.
         */
        private boolean testConnectionOnStartup;
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

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getDefaultFrom() {
            return defaultFrom;
        }

        public void setDefaultFrom(String defaultFrom) {
            this.defaultFrom = defaultFrom;
        }

        public int getDefaultMaxNumberOfParts() {
            return defaultMaxNumberOfParts;
        }

        public void setDefaultMaxNumberOfParts(int defaultMaxNumberOfParts) {
            this.defaultMaxNumberOfParts = defaultMaxNumberOfParts;
        }

        public String getProductToken() {
            return productToken;
        }

        public void setProductToken(String productToken) {
            this.productToken = productToken;
        }

        public boolean getTestConnectionOnStartup() {
            return testConnectionOnStartup;
        }

        public void setTestConnectionOnStartup(boolean testConnectionOnStartup) {
            this.testConnectionOnStartup = testConnectionOnStartup;
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

    public static class CMConsumer extends CMCommon {
    }

    public static class CMProducer extends CMCommon {
    }
}