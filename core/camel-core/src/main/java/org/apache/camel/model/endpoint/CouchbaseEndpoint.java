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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * Represents a Couchbase endpoint that can query Views with a Poll strategy
 * and/or produce various type of operations.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class CouchbaseEndpoint {


    public static class CouchbaseCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String protocol;
        private String hostname;
        private Integer port;
        private String bucket;
        private String key;
        private String additionalHosts;
        private Boolean basicPropertyBinding;
        private Long maxReconnectDelay;
        private Long obsPollInterval;
        private Long obsTimeout;
        private Long opQueueMaxBlockTime;
        private Long opTimeOut;
        private Integer readBufferSize;
        private Boolean shouldOptimize;
        private Boolean synchronous;
        private Integer timeoutExceptionThreshold;
        private String password;
        private String username;

        /**
         * The protocol to use. The option is a java.lang.String type.
         */
        public T protocol(String protocol) {
            this.protocol = protocol;
            return (T) this;
        }

        /**
         * The hostname to use. The option is a java.lang.String type.
         */
        public T hostname(String hostname) {
            this.hostname = hostname;
            return (T) this;
        }

        /**
         * The port number to use. The option is a int type.
         */
        public T port(int port) {
            this.port = port;
            return (T) this;
        }

        /**
         * The bucket to use. The option is a java.lang.String type.
         */
        public T bucket(String bucket) {
            this.bucket = bucket;
            return (T) this;
        }

        /**
         * The key to use. The option is a java.lang.String type.
         */
        public T key(String key) {
            this.key = key;
            return (T) this;
        }

        /**
         * The additional hosts. The option is a java.lang.String type.
         */
        public T additionalHosts(String additionalHosts) {
            this.additionalHosts = additionalHosts;
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
         * Define the max delay during a reconnection. The option is a long
         * type.
         */
        public T maxReconnectDelay(long maxReconnectDelay) {
            this.maxReconnectDelay = maxReconnectDelay;
            return (T) this;
        }

        /**
         * Define the observation polling interval. The option is a long type.
         */
        public T obsPollInterval(long obsPollInterval) {
            this.obsPollInterval = obsPollInterval;
            return (T) this;
        }

        /**
         * Define the observation timeout. The option is a long type.
         */
        public T obsTimeout(long obsTimeout) {
            this.obsTimeout = obsTimeout;
            return (T) this;
        }

        /**
         * Define the max time an operation can be in queue blocked. The option
         * is a long type.
         */
        public T opQueueMaxBlockTime(long opQueueMaxBlockTime) {
            this.opQueueMaxBlockTime = opQueueMaxBlockTime;
            return (T) this;
        }

        /**
         * Define the operation timeout. The option is a long type.
         */
        public T opTimeOut(long opTimeOut) {
            this.opTimeOut = opTimeOut;
            return (T) this;
        }

        /**
         * Define the buffer size. The option is a int type.
         */
        public T readBufferSize(int readBufferSize) {
            this.readBufferSize = readBufferSize;
            return (T) this;
        }

        /**
         * Define if we want to use optimization or not where possible. The
         * option is a boolean type.
         */
        public T shouldOptimize(boolean shouldOptimize) {
            this.shouldOptimize = shouldOptimize;
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
         * Define the threshold for throwing a timeout Exception. The option is
         * a int type.
         */
        public T timeoutExceptionThreshold(int timeoutExceptionThreshold) {
            this.timeoutExceptionThreshold = timeoutExceptionThreshold;
            return (T) this;
        }

        /**
         * The password to use. The option is a java.lang.String type.
         */
        public T password(String password) {
            this.password = password;
            return (T) this;
        }

        /**
         * The username to use. The option is a java.lang.String type.
         */
        public T username(String username) {
            this.username = username;
            return (T) this;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getHostname() {
            return hostname;
        }

        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getBucket() {
            return bucket;
        }

        public void setBucket(String bucket) {
            this.bucket = bucket;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getAdditionalHosts() {
            return additionalHosts;
        }

        public void setAdditionalHosts(String additionalHosts) {
            this.additionalHosts = additionalHosts;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Long getMaxReconnectDelay() {
            return maxReconnectDelay;
        }

        public void setMaxReconnectDelay(Long maxReconnectDelay) {
            this.maxReconnectDelay = maxReconnectDelay;
        }

        public Long getObsPollInterval() {
            return obsPollInterval;
        }

        public void setObsPollInterval(Long obsPollInterval) {
            this.obsPollInterval = obsPollInterval;
        }

        public Long getObsTimeout() {
            return obsTimeout;
        }

        public void setObsTimeout(Long obsTimeout) {
            this.obsTimeout = obsTimeout;
        }

        public Long getOpQueueMaxBlockTime() {
            return opQueueMaxBlockTime;
        }

        public void setOpQueueMaxBlockTime(Long opQueueMaxBlockTime) {
            this.opQueueMaxBlockTime = opQueueMaxBlockTime;
        }

        public Long getOpTimeOut() {
            return opTimeOut;
        }

        public void setOpTimeOut(Long opTimeOut) {
            this.opTimeOut = opTimeOut;
        }

        public Integer getReadBufferSize() {
            return readBufferSize;
        }

        public void setReadBufferSize(Integer readBufferSize) {
            this.readBufferSize = readBufferSize;
        }

        public Boolean getShouldOptimize() {
            return shouldOptimize;
        }

        public void setShouldOptimize(Boolean shouldOptimize) {
            this.shouldOptimize = shouldOptimize;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }

        public Integer getTimeoutExceptionThreshold() {
            return timeoutExceptionThreshold;
        }

        public void setTimeoutExceptionThreshold(
                Integer timeoutExceptionThreshold) {
            this.timeoutExceptionThreshold = timeoutExceptionThreshold;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    public static class CouchbaseConsumer
            extends
                CouchbaseCommon<CouchbaseConsumer> {
        private Boolean bridgeErrorHandler;
        private String consumerProcessedStrategy;
        private Boolean descending;
        private String designDocumentName;
        private Integer limit;
        private String rangeEndKey;
        private String rangeStartKey;
        private Boolean sendEmptyMessageWhenIdle;
        private Integer skip;
        private String viewName;
        private ExceptionHandler exceptionHandler;
        private ExchangePattern exchangePattern;
        private PollingConsumerPollStrategy pollStrategy;
        private Integer backoffErrorThreshold;
        private Integer backoffIdleThreshold;
        private Integer backoffMultiplier;
        private Long delay;
        private Boolean greedy;
        private Long initialDelay;
        private LoggingLevel runLoggingLevel;
        private ScheduledExecutorService scheduledExecutorService;
        private ScheduledPollConsumerScheduler scheduler;
        private Map<String, Object> schedulerProperties;
        private Boolean startScheduler;
        private TimeUnit timeUnit;
        private Boolean useFixedDelay;

        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public CouchbaseConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
            return (CouchbaseConsumer) this;
        }

        /**
         * Define the consumer Processed strategy to use. The option is a
         * java.lang.String type.
         */
        public CouchbaseConsumer consumerProcessedStrategy(
                String consumerProcessedStrategy) {
            this.consumerProcessedStrategy = consumerProcessedStrategy;
            return (CouchbaseConsumer) this;
        }

        /**
         * Define if this operation is descending or not. The option is a
         * boolean type.
         */
        public CouchbaseConsumer descending(boolean descending) {
            this.descending = descending;
            return (CouchbaseConsumer) this;
        }

        /**
         * The design document name to use. The option is a java.lang.String
         * type.
         */
        public CouchbaseConsumer designDocumentName(String designDocumentName) {
            this.designDocumentName = designDocumentName;
            return (CouchbaseConsumer) this;
        }

        /**
         * The output limit to use. The option is a int type.
         */
        public CouchbaseConsumer limit(int limit) {
            this.limit = limit;
            return (CouchbaseConsumer) this;
        }

        /**
         * Define a range for the end key. The option is a java.lang.String
         * type.
         */
        public CouchbaseConsumer rangeEndKey(String rangeEndKey) {
            this.rangeEndKey = rangeEndKey;
            return (CouchbaseConsumer) this;
        }

        /**
         * Define a range for the start key. The option is a java.lang.String
         * type.
         */
        public CouchbaseConsumer rangeStartKey(String rangeStartKey) {
            this.rangeStartKey = rangeStartKey;
            return (CouchbaseConsumer) this;
        }

        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        public CouchbaseConsumer sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.sendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
            return (CouchbaseConsumer) this;
        }

        /**
         * Define the skip to use. The option is a int type.
         */
        public CouchbaseConsumer skip(int skip) {
            this.skip = skip;
            return (CouchbaseConsumer) this;
        }

        /**
         * The view name to use. The option is a java.lang.String type.
         */
        public CouchbaseConsumer viewName(String viewName) {
            this.viewName = viewName;
            return (CouchbaseConsumer) this;
        }

        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public CouchbaseConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
            return (CouchbaseConsumer) this;
        }

        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public CouchbaseConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
            return (CouchbaseConsumer) this;
        }

        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public CouchbaseConsumer pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.pollStrategy = pollStrategy;
            return (CouchbaseConsumer) this;
        }

        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        public CouchbaseConsumer backoffErrorThreshold(int backoffErrorThreshold) {
            this.backoffErrorThreshold = backoffErrorThreshold;
            return (CouchbaseConsumer) this;
        }

        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        public CouchbaseConsumer backoffIdleThreshold(int backoffIdleThreshold) {
            this.backoffIdleThreshold = backoffIdleThreshold;
            return (CouchbaseConsumer) this;
        }

        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        public CouchbaseConsumer backoffMultiplier(int backoffMultiplier) {
            this.backoffMultiplier = backoffMultiplier;
            return (CouchbaseConsumer) this;
        }

        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public CouchbaseConsumer delay(long delay) {
            this.delay = delay;
            return (CouchbaseConsumer) this;
        }

        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        public CouchbaseConsumer greedy(boolean greedy) {
            this.greedy = greedy;
            return (CouchbaseConsumer) this;
        }

        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public CouchbaseConsumer initialDelay(long initialDelay) {
            this.initialDelay = initialDelay;
            return (CouchbaseConsumer) this;
        }

        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        public CouchbaseConsumer runLoggingLevel(LoggingLevel runLoggingLevel) {
            this.runLoggingLevel = runLoggingLevel;
            return (CouchbaseConsumer) this;
        }

        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        public CouchbaseConsumer scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.scheduledExecutorService = scheduledExecutorService;
            return (CouchbaseConsumer) this;
        }

        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public CouchbaseConsumer scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.scheduler = scheduler;
            return (CouchbaseConsumer) this;
        }

        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public CouchbaseConsumer schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.schedulerProperties = schedulerProperties;
            return (CouchbaseConsumer) this;
        }

        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        public CouchbaseConsumer startScheduler(boolean startScheduler) {
            this.startScheduler = startScheduler;
            return (CouchbaseConsumer) this;
        }

        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        public CouchbaseConsumer timeUnit(TimeUnit timeUnit) {
            this.timeUnit = timeUnit;
            return (CouchbaseConsumer) this;
        }

        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        public CouchbaseConsumer useFixedDelay(boolean useFixedDelay) {
            this.useFixedDelay = useFixedDelay;
            return (CouchbaseConsumer) this;
        }

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public String getConsumerProcessedStrategy() {
            return consumerProcessedStrategy;
        }

        public void setConsumerProcessedStrategy(
                String consumerProcessedStrategy) {
            this.consumerProcessedStrategy = consumerProcessedStrategy;
        }

        public Boolean getDescending() {
            return descending;
        }

        public void setDescending(Boolean descending) {
            this.descending = descending;
        }

        public String getDesignDocumentName() {
            return designDocumentName;
        }

        public void setDesignDocumentName(String designDocumentName) {
            this.designDocumentName = designDocumentName;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public String getRangeEndKey() {
            return rangeEndKey;
        }

        public void setRangeEndKey(String rangeEndKey) {
            this.rangeEndKey = rangeEndKey;
        }

        public String getRangeStartKey() {
            return rangeStartKey;
        }

        public void setRangeStartKey(String rangeStartKey) {
            this.rangeStartKey = rangeStartKey;
        }

        public Boolean getSendEmptyMessageWhenIdle() {
            return sendEmptyMessageWhenIdle;
        }

        public void setSendEmptyMessageWhenIdle(Boolean sendEmptyMessageWhenIdle) {
            this.sendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
        }

        public Integer getSkip() {
            return skip;
        }

        public void setSkip(Integer skip) {
            this.skip = skip;
        }

        public String getViewName() {
            return viewName;
        }

        public void setViewName(String viewName) {
            this.viewName = viewName;
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

        public PollingConsumerPollStrategy getPollStrategy() {
            return pollStrategy;
        }

        public void setPollStrategy(PollingConsumerPollStrategy pollStrategy) {
            this.pollStrategy = pollStrategy;
        }

        public Integer getBackoffErrorThreshold() {
            return backoffErrorThreshold;
        }

        public void setBackoffErrorThreshold(Integer backoffErrorThreshold) {
            this.backoffErrorThreshold = backoffErrorThreshold;
        }

        public Integer getBackoffIdleThreshold() {
            return backoffIdleThreshold;
        }

        public void setBackoffIdleThreshold(Integer backoffIdleThreshold) {
            this.backoffIdleThreshold = backoffIdleThreshold;
        }

        public Integer getBackoffMultiplier() {
            return backoffMultiplier;
        }

        public void setBackoffMultiplier(Integer backoffMultiplier) {
            this.backoffMultiplier = backoffMultiplier;
        }

        public Long getDelay() {
            return delay;
        }

        public void setDelay(Long delay) {
            this.delay = delay;
        }

        public Boolean getGreedy() {
            return greedy;
        }

        public void setGreedy(Boolean greedy) {
            this.greedy = greedy;
        }

        public Long getInitialDelay() {
            return initialDelay;
        }

        public void setInitialDelay(Long initialDelay) {
            this.initialDelay = initialDelay;
        }

        public LoggingLevel getRunLoggingLevel() {
            return runLoggingLevel;
        }

        public void setRunLoggingLevel(LoggingLevel runLoggingLevel) {
            this.runLoggingLevel = runLoggingLevel;
        }

        public ScheduledExecutorService getScheduledExecutorService() {
            return scheduledExecutorService;
        }

        public void setScheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.scheduledExecutorService = scheduledExecutorService;
        }

        public ScheduledPollConsumerScheduler getScheduler() {
            return scheduler;
        }

        public void setScheduler(ScheduledPollConsumerScheduler scheduler) {
            this.scheduler = scheduler;
        }

        public Map<String, Object> getSchedulerProperties() {
            return schedulerProperties;
        }

        public void setSchedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.schedulerProperties = schedulerProperties;
        }

        public Boolean getStartScheduler() {
            return startScheduler;
        }

        public void setStartScheduler(Boolean startScheduler) {
            this.startScheduler = startScheduler;
        }

        public TimeUnit getTimeUnit() {
            return timeUnit;
        }

        public void setTimeUnit(TimeUnit timeUnit) {
            this.timeUnit = timeUnit;
        }

        public Boolean getUseFixedDelay() {
            return useFixedDelay;
        }

        public void setUseFixedDelay(Boolean useFixedDelay) {
            this.useFixedDelay = useFixedDelay;
        }
    }

    public static class CouchbaseProducer
            extends
                CouchbaseCommon<CouchbaseProducer> {
        private Boolean autoStartIdForInserts;
        private String operation;
        private Integer persistTo;
        private Integer producerRetryAttempts;
        private Integer producerRetryPause;
        private Integer replicateTo;
        private Long startingIdForInsertsFrom;

        /**
         * Define if we want an autostart Id when we are doing an insert
         * operation. The option is a boolean type.
         */
        public CouchbaseProducer autoStartIdForInserts(
                boolean autoStartIdForInserts) {
            this.autoStartIdForInserts = autoStartIdForInserts;
            return (CouchbaseProducer) this;
        }

        /**
         * The operation to do. The option is a java.lang.String type.
         */
        public CouchbaseProducer operation(String operation) {
            this.operation = operation;
            return (CouchbaseProducer) this;
        }

        /**
         * Where to persist the data. The option is a int type.
         */
        public CouchbaseProducer persistTo(int persistTo) {
            this.persistTo = persistTo;
            return (CouchbaseProducer) this;
        }

        /**
         * Define the number of retry attempts. The option is a int type.
         */
        public CouchbaseProducer producerRetryAttempts(int producerRetryAttempts) {
            this.producerRetryAttempts = producerRetryAttempts;
            return (CouchbaseProducer) this;
        }

        /**
         * Define the retry pause between different attempts. The option is a
         * int type.
         */
        public CouchbaseProducer producerRetryPause(int producerRetryPause) {
            this.producerRetryPause = producerRetryPause;
            return (CouchbaseProducer) this;
        }

        /**
         * Where to replicate the data. The option is a int type.
         */
        public CouchbaseProducer replicateTo(int replicateTo) {
            this.replicateTo = replicateTo;
            return (CouchbaseProducer) this;
        }

        /**
         * Define the starting Id where we are doing an insert operation. The
         * option is a long type.
         */
        public CouchbaseProducer startingIdForInsertsFrom(
                long startingIdForInsertsFrom) {
            this.startingIdForInsertsFrom = startingIdForInsertsFrom;
            return (CouchbaseProducer) this;
        }

        public Boolean getAutoStartIdForInserts() {
            return autoStartIdForInserts;
        }

        public void setAutoStartIdForInserts(Boolean autoStartIdForInserts) {
            this.autoStartIdForInserts = autoStartIdForInserts;
        }

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public Integer getPersistTo() {
            return persistTo;
        }

        public void setPersistTo(Integer persistTo) {
            this.persistTo = persistTo;
        }

        public Integer getProducerRetryAttempts() {
            return producerRetryAttempts;
        }

        public void setProducerRetryAttempts(Integer producerRetryAttempts) {
            this.producerRetryAttempts = producerRetryAttempts;
        }

        public Integer getProducerRetryPause() {
            return producerRetryPause;
        }

        public void setProducerRetryPause(Integer producerRetryPause) {
            this.producerRetryPause = producerRetryPause;
        }

        public Integer getReplicateTo() {
            return replicateTo;
        }

        public void setReplicateTo(Integer replicateTo) {
            this.replicateTo = replicateTo;
        }

        public Long getStartingIdForInsertsFrom() {
            return startingIdForInsertsFrom;
        }

        public void setStartingIdForInsertsFrom(Long startingIdForInsertsFrom) {
            this.startingIdForInsertsFrom = startingIdForInsertsFrom;
        }
    }
}