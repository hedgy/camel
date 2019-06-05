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
 * The yammer component allows you to interact with the Yammer enterprise social
 * network.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class YammerEndpoint {


    public static class YammerCommon extends EndpointConfiguration {
        /**
         * The function to use. The option is a
         * org.apache.camel.component.yammer.YammerFunctionType type.
         */
        private YammerFunctionType function;
        /**
         * Set to true if you want to use raw JSON rather than converting to
         * POJOs. The option is a boolean type.
         */
        private boolean useJson;
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
         * The access token. The option is a java.lang.String type.
         */
        private String accessToken;
        /**
         * The consumer key. The option is a java.lang.String type.
         */
        private String consumerKey;
        /**
         * The consumer secret. The option is a java.lang.String type.
         */
        private String consumerSecret;

        public YammerFunctionType getFunction() {
            return function;
        }

        public void setFunction(YammerFunctionType function) {
            this.function = function;
        }

        public boolean getUseJson() {
            return useJson;
        }

        public void setUseJson(boolean useJson) {
            this.useJson = useJson;
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

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getConsumerKey() {
            return consumerKey;
        }

        public void setConsumerKey(String consumerKey) {
            this.consumerKey = consumerKey;
        }

        public String getConsumerSecret() {
            return consumerSecret;
        }

        public void setConsumerSecret(String consumerSecret) {
            this.consumerSecret = consumerSecret;
        }
    }

    public static class YammerConsumer extends YammerCommon {
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
         * Delay between polling in millis. The option is a long type.
         */
        private long delay;
        /**
         * Return only the specified number of messages. Works for threaded=true
         * and threaded=extended. The option is a int type.
         */
        private int limit;
        /**
         * Returns messages newer than the message ID specified as a numeric
         * string. This should be used when polling for new messages. If you're
         * looking at messages, and the most recent message returned is 3516,
         * you can make a request with the parameter newerThan=3516 to ensure
         * that you do not get duplicate copies of messages already on your
         * page. The option is a long type.
         */
        private long newerThan;
        /**
         * Returns messages older than the message ID specified as a numeric
         * string. This is useful for paginating messages. For example, if
         * you're currently viewing 20 messages and the oldest is number 2912,
         * you could append olderThan=2912 to your request to get the 20
         * messages prior to those you're seeing. The option is a long type.
         */
        private long olderThan;
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        private boolean sendEmptyMessageWhenIdle;
        /**
         * threaded=true will only return the first message in each thread. This
         * parameter is intended for apps which display message threads
         * collapsed. threaded=extended will return the thread starter messages
         * in order of most recently active as well as the two most recent
         * messages, as they are viewed in the default view on the Yammer web
         * interface. The option is a java.lang.String type.
         */
        private String threaded;
        /**
         * The user id. The option is a java.lang.String type.
         */
        private String userId;
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
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        private PollingConsumerPollStrategy pollStrategy;
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        private int backoffErrorThreshold;
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        private int backoffIdleThreshold;
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        private int backoffMultiplier;
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        private boolean greedy;
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        private long initialDelay;
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        private LoggingLevel runLoggingLevel;
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        private ScheduledExecutorService scheduledExecutorService;
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        private ScheduledPollConsumerScheduler scheduler;
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        private Map<String, Object> schedulerProperties;
        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        private boolean startScheduler;
        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        private TimeUnit timeUnit;
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        private boolean useFixedDelay;

        public boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public long getDelay() {
            return delay;
        }

        public void setDelay(long delay) {
            this.delay = delay;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public long getNewerThan() {
            return newerThan;
        }

        public void setNewerThan(long newerThan) {
            this.newerThan = newerThan;
        }

        public long getOlderThan() {
            return olderThan;
        }

        public void setOlderThan(long olderThan) {
            this.olderThan = olderThan;
        }

        public boolean getSendEmptyMessageWhenIdle() {
            return sendEmptyMessageWhenIdle;
        }

        public void setSendEmptyMessageWhenIdle(boolean sendEmptyMessageWhenIdle) {
            this.sendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
        }

        public String getThreaded() {
            return threaded;
        }

        public void setThreaded(String threaded) {
            this.threaded = threaded;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
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

        public int getBackoffErrorThreshold() {
            return backoffErrorThreshold;
        }

        public void setBackoffErrorThreshold(int backoffErrorThreshold) {
            this.backoffErrorThreshold = backoffErrorThreshold;
        }

        public int getBackoffIdleThreshold() {
            return backoffIdleThreshold;
        }

        public void setBackoffIdleThreshold(int backoffIdleThreshold) {
            this.backoffIdleThreshold = backoffIdleThreshold;
        }

        public int getBackoffMultiplier() {
            return backoffMultiplier;
        }

        public void setBackoffMultiplier(int backoffMultiplier) {
            this.backoffMultiplier = backoffMultiplier;
        }

        public boolean getGreedy() {
            return greedy;
        }

        public void setGreedy(boolean greedy) {
            this.greedy = greedy;
        }

        public long getInitialDelay() {
            return initialDelay;
        }

        public void setInitialDelay(long initialDelay) {
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

        public boolean getStartScheduler() {
            return startScheduler;
        }

        public void setStartScheduler(boolean startScheduler) {
            this.startScheduler = startScheduler;
        }

        public TimeUnit getTimeUnit() {
            return timeUnit;
        }

        public void setTimeUnit(TimeUnit timeUnit) {
            this.timeUnit = timeUnit;
        }

        public boolean getUseFixedDelay() {
            return useFixedDelay;
        }

        public void setUseFixedDelay(boolean useFixedDelay) {
            this.useFixedDelay = useFixedDelay;
        }
    }

    public static class YammerProducer extends YammerCommon {
    }

    public static enum YammerFunctionType {
        MESSAGES, MY_FEED, ALGO, FOLLOWING, SENT, PRIVATE, RECEIVED, USERS, CURRENT;
    }
}