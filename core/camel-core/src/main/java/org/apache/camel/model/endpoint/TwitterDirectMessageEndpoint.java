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
 * The Twitter Direct Message Component consumes/produces user's direct
 * messages.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class TwitterDirectMessageEndpoint {


    public static class TwitterDirectMessageCommon
            extends
                EndpointConfiguration {
        /**
         * The user name to send a direct message. This will be ignored for
         * consumer. The option is a java.lang.String type.
         */
        private String user;
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
         * The http proxy host which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead. The option is a
         * java.lang.String type.
         */
        private String httpProxyHost;
        /**
         * The http proxy password which can be used for the camel-twitter. Can
         * also be configured on the TwitterComponent level instead. The option
         * is a java.lang.String type.
         */
        private String httpProxyPassword;
        /**
         * The http proxy port which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead. The option is a
         * java.lang.Integer type.
         */
        private Integer httpProxyPort;
        /**
         * The http proxy user which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead. The option is a
         * java.lang.String type.
         */
        private String httpProxyUser;
        /**
         * The access token. Can also be configured on the TwitterComponent
         * level instead. The option is a java.lang.String type.
         */
        private String accessToken;
        /**
         * The access secret. Can also be configured on the TwitterComponent
         * level instead. The option is a java.lang.String type.
         */
        private String accessTokenSecret;
        /**
         * The consumer key. Can also be configured on the TwitterComponent
         * level instead. The option is a java.lang.String type.
         */
        private String consumerKey;
        /**
         * The consumer secret. Can also be configured on the TwitterComponent
         * level instead. The option is a java.lang.String type.
         */
        private String consumerSecret;

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
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

        public String getHttpProxyHost() {
            return httpProxyHost;
        }

        public void setHttpProxyHost(String httpProxyHost) {
            this.httpProxyHost = httpProxyHost;
        }

        public String getHttpProxyPassword() {
            return httpProxyPassword;
        }

        public void setHttpProxyPassword(String httpProxyPassword) {
            this.httpProxyPassword = httpProxyPassword;
        }

        public Integer getHttpProxyPort() {
            return httpProxyPort;
        }

        public void setHttpProxyPort(Integer httpProxyPort) {
            this.httpProxyPort = httpProxyPort;
        }

        public String getHttpProxyUser() {
            return httpProxyUser;
        }

        public void setHttpProxyUser(String httpProxyUser) {
            this.httpProxyUser = httpProxyUser;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getAccessTokenSecret() {
            return accessTokenSecret;
        }

        public void setAccessTokenSecret(String accessTokenSecret) {
            this.accessTokenSecret = accessTokenSecret;
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

    public static class TwitterDirectMessageConsumer
            extends
                TwitterDirectMessageCommon {
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
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        private boolean sendEmptyMessageWhenIdle;
        /**
         * Endpoint type to use. Only streaming supports event type. The option
         * is a org.apache.camel.component.twitter.data.EndpointType type.
         */
        private EndpointType type;
        /**
         * Used by the non-stream geography search, to search by radius using
         * the configured metrics. The unit can either be mi for miles, or km
         * for kilometers. You need to configure all the following options:
         * longitude, latitude, radius, and distanceMetric. The option is a
         * java.lang.String type.
         */
        private String distanceMetric;
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
         * Used for enabling full text from twitter (eg receive tweets that
         * contains more than 140 characters). The option is a boolean type.
         */
        private boolean extendedMode;
        /**
         * Used by the non-stream geography search to search by latitude. You
         * need to configure all the following options: longitude, latitude,
         * radius, and distanceMetric. The option is a java.lang.Double type.
         */
        private Double latitude;
        /**
         * Bounding boxes, created by pairs of lat/lons. Can be used for
         * streaming/filter. A pair is defined as lat,lon. And multiple paris
         * can be separated by semi colon. The option is a java.lang.String
         * type.
         */
        private String locations;
        /**
         * Used by the non-stream geography search to search by longitude. You
         * need to configure all the following options: longitude, latitude,
         * radius, and distanceMetric. The option is a java.lang.Double type.
         */
        private Double longitude;
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        private PollingConsumerPollStrategy pollStrategy;
        /**
         * Used by the non-stream geography search to search by radius. You need
         * to configure all the following options: longitude, latitude, radius,
         * and distanceMetric. The option is a java.lang.Double type.
         */
        private Double radius;
        /**
         * To use a custom instance of TwitterStream. The option is a
         * twitter4j.TwitterStream type.
         */
        private Object twitterStream;
        /**
         * Limiting number of results per page. The option is a
         * java.lang.Integer type.
         */
        private Integer count;
        /**
         * Filter out old tweets, that has previously been polled. This state is
         * stored in memory only, and based on last tweet id. The option is a
         * boolean type.
         */
        private boolean filterOld;
        /**
         * The lang string ISO_639-1 which will be used for searching. The
         * option is a java.lang.String type.
         */
        private String lang;
        /**
         * The number of pages result which you want camel-twitter to consume.
         * The option is a java.lang.Integer type.
         */
        private Integer numberOfPages;
        /**
         * The last tweet id which will be used for pulling the tweets. It is
         * useful when the camel route is restarted after a long running. The
         * option is a long type.
         */
        private long sinceId;
        /**
         * To filter by user ids for streaming/filter. Multiple values can be
         * separated by comma. The option is a java.lang.String type.
         */
        private String userIds;
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
         * Milliseconds before the next poll. The option is a long type.
         */
        private long delay;
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
        /**
         * Sorts by id, so the oldest are first, and newest last. The option is
         * a boolean type.
         */
        private boolean sortById;

        public boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public boolean getSendEmptyMessageWhenIdle() {
            return sendEmptyMessageWhenIdle;
        }

        public void setSendEmptyMessageWhenIdle(boolean sendEmptyMessageWhenIdle) {
            this.sendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
        }

        public EndpointType getType() {
            return type;
        }

        public void setType(EndpointType type) {
            this.type = type;
        }

        public String getDistanceMetric() {
            return distanceMetric;
        }

        public void setDistanceMetric(String distanceMetric) {
            this.distanceMetric = distanceMetric;
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

        public boolean getExtendedMode() {
            return extendedMode;
        }

        public void setExtendedMode(boolean extendedMode) {
            this.extendedMode = extendedMode;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public String getLocations() {
            return locations;
        }

        public void setLocations(String locations) {
            this.locations = locations;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public PollingConsumerPollStrategy getPollStrategy() {
            return pollStrategy;
        }

        public void setPollStrategy(PollingConsumerPollStrategy pollStrategy) {
            this.pollStrategy = pollStrategy;
        }

        public Double getRadius() {
            return radius;
        }

        public void setRadius(Double radius) {
            this.radius = radius;
        }

        public Object getTwitterStream() {
            return twitterStream;
        }

        public void setTwitterStream(Object twitterStream) {
            this.twitterStream = twitterStream;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public boolean getFilterOld() {
            return filterOld;
        }

        public void setFilterOld(boolean filterOld) {
            this.filterOld = filterOld;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public Integer getNumberOfPages() {
            return numberOfPages;
        }

        public void setNumberOfPages(Integer numberOfPages) {
            this.numberOfPages = numberOfPages;
        }

        public long getSinceId() {
            return sinceId;
        }

        public void setSinceId(long sinceId) {
            this.sinceId = sinceId;
        }

        public String getUserIds() {
            return userIds;
        }

        public void setUserIds(String userIds) {
            this.userIds = userIds;
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

        public long getDelay() {
            return delay;
        }

        public void setDelay(long delay) {
            this.delay = delay;
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

        public boolean getSortById() {
            return sortById;
        }

        public void setSortById(boolean sortById) {
            this.sortById = sortById;
        }
    }

    public static class TwitterDirectMessageProducer
            extends
                TwitterDirectMessageCommon {
    }

    public static enum EndpointType {
        polling, direct, event;
    }
}