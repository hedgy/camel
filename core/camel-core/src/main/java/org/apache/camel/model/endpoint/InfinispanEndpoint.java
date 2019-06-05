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
import java.util.Set;
import java.util.function.BiFunction;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * For reading/writing from/to Infinispan distributed key/value store and data
 * grid.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class InfinispanEndpoint {


    public static class InfinispanCommon extends EndpointConfiguration {
        /**
         * The cache to use. The option is a java.lang.String type.
         */
        private String cacheName;
        /**
         * Specifies the host of the cache on Infinispan instance. The option is
         * a java.lang.String type.
         */
        private String hosts;
        /**
         * Specifies the query builder. The option is a
         * org.apache.camel.component.infinispan.InfinispanQueryBuilder type.
         */
        private Object queryBuilder;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private boolean basicPropertyBinding;
        /**
         * Specifies the cache Container to connect. The option is a
         * org.infinispan.commons.api.BasicCacheContainer type.
         */
        private Object cacheContainer;
        /**
         * The CacheContainer configuration. Uses if the cacheContainer is not
         * defined. Must be the following types:
         * org.infinispan.client.hotrod.configuration.Configuration - for remote
         * cache interaction configuration;
         * org.infinispan.configuration.cache.Configuration - for embedded cache
         * interaction configuration;. The option is a java.lang.Object type.
         */
        private Object cacheContainerConfiguration;
        /**
         * Implementation specific properties for the CacheManager. The option
         * is a java.util.Map<java.lang.String,java.lang.String> type.
         */
        private Map<String, String> configurationProperties;
        /**
         * An implementation specific URI for the CacheManager. The option is a
         * java.lang.String type.
         */
        private String configurationUri;
        /**
         * A comma separated list of Flag to be applied by default on each cache
         * invocation, not applicable to remote caches. The option is a
         * java.lang.String type.
         */
        private Object[] flags;
        /**
         * Set a specific remappingFunction to use in a compute operation. The
         * option is a java.util.function.BiFunction type.
         */
        private BiFunction remappingFunction;
        /**
         * Store the operation result in a header instead of the message body.
         * By default, resultHeader == null and the query result is stored in
         * the message body, any existing content in the message body is
         * discarded. If resultHeader is set, the value is used as the name of
         * the header to store the query result and the original message body is
         * preserved. This value can be overridden by an in message header
         * named: CamelInfinispanOperationResultHeader. The option is a
         * java.lang.Object type.
         */
        private Object resultHeader;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private boolean synchronous;

        public String getCacheName() {
            return cacheName;
        }

        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        public String getHosts() {
            return hosts;
        }

        public void setHosts(String hosts) {
            this.hosts = hosts;
        }

        public Object getQueryBuilder() {
            return queryBuilder;
        }

        public void setQueryBuilder(Object queryBuilder) {
            this.queryBuilder = queryBuilder;
        }

        public boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Object getCacheContainer() {
            return cacheContainer;
        }

        public void setCacheContainer(Object cacheContainer) {
            this.cacheContainer = cacheContainer;
        }

        public Object getCacheContainerConfiguration() {
            return cacheContainerConfiguration;
        }

        public void setCacheContainerConfiguration(
                Object cacheContainerConfiguration) {
            this.cacheContainerConfiguration = cacheContainerConfiguration;
        }

        public Map<String, String> getConfigurationProperties() {
            return configurationProperties;
        }

        public void setConfigurationProperties(
                Map<String, String> configurationProperties) {
            this.configurationProperties = configurationProperties;
        }

        public String getConfigurationUri() {
            return configurationUri;
        }

        public void setConfigurationUri(String configurationUri) {
            this.configurationUri = configurationUri;
        }

        public Object[] getFlags() {
            return flags;
        }

        public void setFlags(Object[] flags) {
            this.flags = flags;
        }

        public BiFunction getRemappingFunction() {
            return remappingFunction;
        }

        public void setRemappingFunction(BiFunction remappingFunction) {
            this.remappingFunction = remappingFunction;
        }

        public Object getResultHeader() {
            return resultHeader;
        }

        public void setResultHeader(Object resultHeader) {
            this.resultHeader = resultHeader;
        }

        public boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(boolean synchronous) {
            this.synchronous = synchronous;
        }
    }

    public static class InfinispanConsumer extends InfinispanCommon {
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
         * If true, the listener will be installed for the entire cluster. The
         * option is a boolean type.
         */
        private boolean clusteredListener;
        /**
         * The operation to perform. The option is a java.lang.String type.
         */
        @Deprecated
        private String command;
        /**
         * Returns the custom listener in use, if provided. The option is a
         * org.apache.camel.component.infinispan.InfinispanCustomListener type.
         */
        private Object customListener;
        /**
         * Specifies the set of event types to register by the consumer.
         * Multiple event can be separated by comma. The possible event types
         * are: CACHE_ENTRY_ACTIVATED, CACHE_ENTRY_PASSIVATED,
         * CACHE_ENTRY_VISITED, CACHE_ENTRY_LOADED, CACHE_ENTRY_EVICTED,
         * CACHE_ENTRY_CREATED, CACHE_ENTRY_REMOVED, CACHE_ENTRY_MODIFIED,
         * TRANSACTION_COMPLETED, TRANSACTION_REGISTERED,
         * CACHE_ENTRY_INVALIDATED, DATA_REHASHED, TOPOLOGY_CHANGED,
         * PARTITION_STATUS_CHANGED. The option is a java.lang.String type.
         */
        private Set<String> eventTypes;
        /**
         * If true, the consumer will receive notifications synchronously. The
         * option is a boolean type.
         */
        private boolean sync;
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

        public boolean getClusteredListener() {
            return clusteredListener;
        }

        public void setClusteredListener(boolean clusteredListener) {
            this.clusteredListener = clusteredListener;
        }

        @Deprecated
        public String getCommand() {
            return command;
        }

        @Deprecated
        public void setCommand(String command) {
            this.command = command;
        }

        public Object getCustomListener() {
            return customListener;
        }

        public void setCustomListener(Object customListener) {
            this.customListener = customListener;
        }

        public Set<String> getEventTypes() {
            return eventTypes;
        }

        public void setEventTypes(Set<String> eventTypes) {
            this.eventTypes = eventTypes;
        }

        public boolean getSync() {
            return sync;
        }

        public void setSync(boolean sync) {
            this.sync = sync;
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

    public static class InfinispanProducer extends InfinispanCommon {
        /**
         * The operation to perform. The option is a
         * org.apache.camel.component.infinispan.InfinispanOperation type.
         */
        private InfinispanOperation operation;

        public InfinispanOperation getOperation() {
            return operation;
        }

        public void setOperation(InfinispanOperation operation) {
            this.operation = operation;
        }
    }

    public static enum InfinispanOperation {
        PUT, PUTASYNC, PUTALL, PUTALLASYNC, PUTIFABSENT, PUTIFABSENTASYNC, GET, GETORDEFAULT, CONTAINSKEY, CONTAINSVALUE, REMOVE, REMOVEASYNC, REPLACE, REPLACEASYNC, SIZE, CLEAR, CLEARASYNC, QUERY, STATS, COMPUTE, COMPUTEASYNC;
    }
}