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
 * The caffeine-loadcache component is used for integration with Caffeine Load
 * Cache.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class CaffeineLoadCacheEndpoint {


    public static class CaffeineLoadCacheCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String cacheName;
        private Boolean createCacheIfNotExist;
        private Boolean basicPropertyBinding;
        private Class<Object> keyType;
        private Boolean synchronous;
        private Class<Object> valueType;

        /**
         * the cache name. The option is a java.lang.String type.
         */
        public T cacheName(String cacheName) {
            this.cacheName = cacheName;
            return (T) this;
        }

        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured. The option is a boolean type.
         */
        public T createCacheIfNotExist(boolean createCacheIfNotExist) {
            this.createCacheIfNotExist = createCacheIfNotExist;
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
         * The cache key type, default java.lang.Object. The option is a
         * java.lang.String type.
         */
        public T keyType(Class<Object> keyType) {
            this.keyType = keyType;
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

        /**
         * The cache value type, default java.lang.Object. The option is a
         * java.lang.String type.
         */
        public T valueType(Class<Object> valueType) {
            this.valueType = valueType;
            return (T) this;
        }

        public String getCacheName() {
            return cacheName;
        }

        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        public Boolean getCreateCacheIfNotExist() {
            return createCacheIfNotExist;
        }

        public void setCreateCacheIfNotExist(Boolean createCacheIfNotExist) {
            this.createCacheIfNotExist = createCacheIfNotExist;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Class<Object> getKeyType() {
            return keyType;
        }

        public void setKeyType(Class<Object> keyType) {
            this.keyType = keyType;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }

        public Class<Object> getValueType() {
            return valueType;
        }

        public void setValueType(Class<Object> valueType) {
            this.valueType = valueType;
        }
    }

    public static class CaffeineLoadCacheConsumer
            extends
                CaffeineLoadCacheCommon<CaffeineLoadCacheConsumer> {
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
        public CaffeineLoadCacheConsumer bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
            return (CaffeineLoadCacheConsumer) this;
        }

        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public CaffeineLoadCacheConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
            return (CaffeineLoadCacheConsumer) this;
        }

        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public CaffeineLoadCacheConsumer exchangePattern(
                ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
            return (CaffeineLoadCacheConsumer) this;
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

    public static class CaffeineLoadCacheProducer
            extends
                CaffeineLoadCacheCommon<CaffeineLoadCacheProducer> {
        private String action;
        private Object cache;
        private Object cacheLoader;
        private EvictionType evictionType;
        private Integer expireAfterAccessTime;
        private Integer expireAfterWriteTime;
        private Integer initialCapacity;
        private Object key;
        private Integer maximumSize;
        private Object removalListener;
        private Object statsCounter;
        private Boolean statsEnabled;

        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * The option is a java.lang.String type.
         */
        public CaffeineLoadCacheProducer action(String action) {
            this.action = action;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * To configure an already instantiated cache to be used. The option is
         * a com.github.benmanes.caffeine.cache.Cache type.
         */
        public CaffeineLoadCacheProducer cache(Object cache) {
            this.cache = cache;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * To configure a CacheLoader in case of a LoadCache use. The option is
         * a com.github.benmanes.caffeine.cache.CacheLoader type.
         */
        public CaffeineLoadCacheProducer cacheLoader(Object cacheLoader) {
            this.cacheLoader = cacheLoader;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * Set the eviction Type for this cache. The option is a
         * org.apache.camel.component.caffeine.EvictionType type.
         */
        public CaffeineLoadCacheProducer evictionType(EvictionType evictionType) {
            this.evictionType = evictionType;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds). The option is a int type.
         */
        public CaffeineLoadCacheProducer expireAfterAccessTime(
                int expireAfterAccessTime) {
            this.expireAfterAccessTime = expireAfterAccessTime;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds). The option is a int type.
         */
        public CaffeineLoadCacheProducer expireAfterWriteTime(
                int expireAfterWriteTime) {
            this.expireAfterWriteTime = expireAfterWriteTime;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * Set the initial Capacity for the cache. The option is a int type.
         */
        public CaffeineLoadCacheProducer initialCapacity(int initialCapacity) {
            this.initialCapacity = initialCapacity;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence. The option is
         * a java.lang.Object type.
         */
        public CaffeineLoadCacheProducer key(Object key) {
            this.key = key;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * Set the maximum size for the cache. The option is a int type.
         */
        public CaffeineLoadCacheProducer maximumSize(int maximumSize) {
            this.maximumSize = maximumSize;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * Set a specific removal Listener for the cache. The option is a
         * com.github.benmanes.caffeine.cache.RemovalListener type.
         */
        public CaffeineLoadCacheProducer removalListener(Object removalListener) {
            this.removalListener = removalListener;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * Set a specific Stats Counter for the cache stats. The option is a
         * com.github.benmanes.caffeine.cache.stats.StatsCounter type.
         */
        public CaffeineLoadCacheProducer statsCounter(Object statsCounter) {
            this.statsCounter = statsCounter;
            return (CaffeineLoadCacheProducer) this;
        }

        /**
         * To enable stats on the cache. The option is a boolean type.
         */
        public CaffeineLoadCacheProducer statsEnabled(boolean statsEnabled) {
            this.statsEnabled = statsEnabled;
            return (CaffeineLoadCacheProducer) this;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Object getCache() {
            return cache;
        }

        public void setCache(Object cache) {
            this.cache = cache;
        }

        public Object getCacheLoader() {
            return cacheLoader;
        }

        public void setCacheLoader(Object cacheLoader) {
            this.cacheLoader = cacheLoader;
        }

        public EvictionType getEvictionType() {
            return evictionType;
        }

        public void setEvictionType(EvictionType evictionType) {
            this.evictionType = evictionType;
        }

        public Integer getExpireAfterAccessTime() {
            return expireAfterAccessTime;
        }

        public void setExpireAfterAccessTime(Integer expireAfterAccessTime) {
            this.expireAfterAccessTime = expireAfterAccessTime;
        }

        public Integer getExpireAfterWriteTime() {
            return expireAfterWriteTime;
        }

        public void setExpireAfterWriteTime(Integer expireAfterWriteTime) {
            this.expireAfterWriteTime = expireAfterWriteTime;
        }

        public Integer getInitialCapacity() {
            return initialCapacity;
        }

        public void setInitialCapacity(Integer initialCapacity) {
            this.initialCapacity = initialCapacity;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public Integer getMaximumSize() {
            return maximumSize;
        }

        public void setMaximumSize(Integer maximumSize) {
            this.maximumSize = maximumSize;
        }

        public Object getRemovalListener() {
            return removalListener;
        }

        public void setRemovalListener(Object removalListener) {
            this.removalListener = removalListener;
        }

        public Object getStatsCounter() {
            return statsCounter;
        }

        public void setStatsCounter(Object statsCounter) {
            this.statsCounter = statsCounter;
        }

        public Boolean getStatsEnabled() {
            return statsEnabled;
        }

        public void setStatsEnabled(Boolean statsEnabled) {
            this.statsEnabled = statsEnabled;
        }
    }

    public static enum EvictionType {
        SIZE_BASED, TIME_BASED;
    }
}