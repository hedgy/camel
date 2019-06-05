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

import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The atomix-set component is used to access Atomix's distributed set.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class AtomixSetEndpoint {


    public static class AtomixSetCommon extends EndpointConfiguration {
        /**
         * The distributed resource name. The option is a java.lang.String type.
         */
        private String resourceName;
        /**
         * The Atomix instance to use. The option is a io.atomix.Atomix type.
         */
        private Object atomix;
        /**
         * The Atomix configuration uri. The option is a java.lang.String type.
         */
        private String configurationUri;
        /**
         * The default action. The option is a
         * org.apache.camel.component.atomix.client.set.AtomixSet.Action type.
         */
        private Object defaultAction;
        /**
         * The address of the nodes composing the cluster. The option is a
         * java.lang.String type.
         */
        private List<Object> nodes;
        /**
         * The header that wil carry the result. The option is a
         * java.lang.String type.
         */
        private String resultHeader;
        /**
         * Sets the Atomix transport. The option is a
         * io.atomix.catalyst.transport.Transport type.
         */
        private Class<Object> transport;
        /**
         * The resource ttl. The option is a long type.
         */
        private long ttl;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private boolean basicPropertyBinding;
        /**
         * The cluster wide default resource configuration. The option is a
         * java.util.Properties type.
         */
        private Properties defaultResourceConfig;
        /**
         * The local default resource options. The option is a
         * java.util.Properties type.
         */
        private Properties defaultResourceOptions;
        /**
         * Sets if the local member should join groups as PersistentMember or
         * not. If set to ephemeral the local member will receive an auto
         * generated ID thus the local one is ignored. The option is a boolean
         * type.
         */
        private boolean ephemeral;
        /**
         * The read consistency level. The option is a
         * io.atomix.resource.ReadConsistency type.
         */
        private ReadConsistency readConsistency;
        /**
         * Cluster wide resources configuration. The option is a
         * java.util.Map<java.lang.String,java.util.Properties> type.
         */
        private Map<String, Properties> resourceConfigs;
        /**
         * Local resources configurations. The option is a
         * java.util.Map<java.lang.String,java.util.Properties> type.
         */
        private Map<String, Properties> resourceOptions;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private boolean synchronous;

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public Object getAtomix() {
            return atomix;
        }

        public void setAtomix(Object atomix) {
            this.atomix = atomix;
        }

        public String getConfigurationUri() {
            return configurationUri;
        }

        public void setConfigurationUri(String configurationUri) {
            this.configurationUri = configurationUri;
        }

        public Object getDefaultAction() {
            return defaultAction;
        }

        public void setDefaultAction(Object defaultAction) {
            this.defaultAction = defaultAction;
        }

        public List<Object> getNodes() {
            return nodes;
        }

        public void setNodes(List<Object> nodes) {
            this.nodes = nodes;
        }

        public String getResultHeader() {
            return resultHeader;
        }

        public void setResultHeader(String resultHeader) {
            this.resultHeader = resultHeader;
        }

        public Class<Object> getTransport() {
            return transport;
        }

        public void setTransport(Class<Object> transport) {
            this.transport = transport;
        }

        public long getTtl() {
            return ttl;
        }

        public void setTtl(long ttl) {
            this.ttl = ttl;
        }

        public boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Properties getDefaultResourceConfig() {
            return defaultResourceConfig;
        }

        public void setDefaultResourceConfig(Properties defaultResourceConfig) {
            this.defaultResourceConfig = defaultResourceConfig;
        }

        public Properties getDefaultResourceOptions() {
            return defaultResourceOptions;
        }

        public void setDefaultResourceOptions(Properties defaultResourceOptions) {
            this.defaultResourceOptions = defaultResourceOptions;
        }

        public boolean getEphemeral() {
            return ephemeral;
        }

        public void setEphemeral(boolean ephemeral) {
            this.ephemeral = ephemeral;
        }

        public ReadConsistency getReadConsistency() {
            return readConsistency;
        }

        public void setReadConsistency(ReadConsistency readConsistency) {
            this.readConsistency = readConsistency;
        }

        public Map<String, Properties> getResourceConfigs() {
            return resourceConfigs;
        }

        public void setResourceConfigs(Map<String, Properties> resourceConfigs) {
            this.resourceConfigs = resourceConfigs;
        }

        public Map<String, Properties> getResourceOptions() {
            return resourceOptions;
        }

        public void setResourceOptions(Map<String, Properties> resourceOptions) {
            this.resourceOptions = resourceOptions;
        }

        public boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(boolean synchronous) {
            this.synchronous = synchronous;
        }
    }

    public static class AtomixSetConsumer extends AtomixSetCommon {
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

    public static class AtomixSetProducer extends AtomixSetCommon {
    }

    public static enum ReadConsistency {
        ATOMIC, ATOMIC_LEASE, SEQUENTIAL, LOCAL;
    }
}