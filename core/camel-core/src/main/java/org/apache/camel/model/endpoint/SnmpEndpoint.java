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
 * The snmp component gives you the ability to poll SNMP capable devices or
 * receiving traps.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class SnmpEndpoint {


    public static class SnmpCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String host;
        private Integer port;
        private Object oids;
        private String protocol;
        private Integer retries;
        private String snmpCommunity;
        private String snmpContextEngineId;
        private String snmpContextName;
        private Integer snmpVersion;
        private Integer timeout;
        private SnmpActionType type;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;
        private String authenticationPassphrase;
        private String authenticationProtocol;
        private String privacyPassphrase;
        private String privacyProtocol;
        private Integer securityLevel;
        private String securityName;

        /**
         * Hostname of the SNMP enabled device. The option is a java.lang.String
         * type.
         */
        public T host(String host) {
            this.host = host;
            return (T) this;
        }

        /**
         * Port number of the SNMP enabled device. The option is a
         * java.lang.Integer type.
         */
        public T port(Integer port) {
            this.port = port;
            return (T) this;
        }

        /**
         * Defines which values you are interested in. Please have a look at the
         * Wikipedia to get a better understanding. You may provide a single OID
         * or a coma separated list of OIDs. Example:
         * oids=1.3.6.1.2.1.1.3.0,1.3.6.1.2.1.25.3.2.1.5.1,1.3.6.1.2.1.25.3.5.1.1.1,1.3.6.1.2.1.43.5.1.1.11.1. The option is a java.lang.String type.
         */
        public T oids(Object oids) {
            this.oids = oids;
            return (T) this;
        }

        /**
         * Here you can select which protocol to use. You can use either udp or
         * tcp. The option is a java.lang.String type.
         */
        public T protocol(String protocol) {
            this.protocol = protocol;
            return (T) this;
        }

        /**
         * Defines how often a retry is made before canceling the request. The
         * option is a int type.
         */
        public T retries(int retries) {
            this.retries = retries;
            return (T) this;
        }

        /**
         * Sets the community octet string for the snmp request. The option is a
         * java.lang.String type.
         */
        public T snmpCommunity(String snmpCommunity) {
            this.snmpCommunity = snmpCommunity;
            return (T) this;
        }

        /**
         * Sets the context engine ID field of the scoped PDU. The option is a
         * java.lang.String type.
         */
        public T snmpContextEngineId(String snmpContextEngineId) {
            this.snmpContextEngineId = snmpContextEngineId;
            return (T) this;
        }

        /**
         * Sets the context name field of this scoped PDU. The option is a
         * java.lang.String type.
         */
        public T snmpContextName(String snmpContextName) {
            this.snmpContextName = snmpContextName;
            return (T) this;
        }

        /**
         * Sets the snmp version for the request. The value 0 means SNMPv1, 1
         * means SNMPv2c, and the value 3 means SNMPv3. The option is a int
         * type.
         */
        public T snmpVersion(int snmpVersion) {
            this.snmpVersion = snmpVersion;
            return (T) this;
        }

        /**
         * Sets the timeout value for the request in millis. The option is a int
         * type.
         */
        public T timeout(int timeout) {
            this.timeout = timeout;
            return (T) this;
        }

        /**
         * Which operation to perform such as poll, trap, etc. The option is a
         * org.apache.camel.component.snmp.SnmpActionType type.
         */
        public T type(SnmpActionType type) {
            this.type = type;
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
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.synchronous = synchronous;
            return (T) this;
        }

        /**
         * The authentication passphrase. If not null, authenticationProtocol
         * must also be not null. RFC3414 11.2 requires passphrases to have a
         * minimum length of 8 bytes. If the length of authenticationPassphrase
         * is less than 8 bytes an IllegalArgumentException is thrown. The
         * option is a java.lang.String type.
         */
        public T authenticationPassphrase(String authenticationPassphrase) {
            this.authenticationPassphrase = authenticationPassphrase;
            return (T) this;
        }

        /**
         * Authentication protocol to use if security level is set to enable
         * authentication The possible values are: MD5, SHA1. The option is a
         * java.lang.String type.
         */
        public T authenticationProtocol(String authenticationProtocol) {
            this.authenticationProtocol = authenticationProtocol;
            return (T) this;
        }

        /**
         * The privacy passphrase. If not null, privacyProtocol must also be not
         * null. RFC3414 11.2 requires passphrases to have a minimum length of 8
         * bytes. If the length of authenticationPassphrase is less than 8 bytes
         * an IllegalArgumentException is thrown. The option is a
         * java.lang.String type.
         */
        public T privacyPassphrase(String privacyPassphrase) {
            this.privacyPassphrase = privacyPassphrase;
            return (T) this;
        }

        /**
         * The privacy protocol ID to be associated with this user. If set to
         * null, this user only supports unencrypted messages. The option is a
         * java.lang.String type.
         */
        public T privacyProtocol(String privacyProtocol) {
            this.privacyProtocol = privacyProtocol;
            return (T) this;
        }

        /**
         * Sets the security level for this target. The supplied security level
         * must be supported by the security model dependent information
         * associated with the security name set for this target. The value 1
         * means: No authentication and no encryption. Anyone can create and
         * read messages with this security level The value 2 means:
         * Authentication and no encryption. Only the one with the right
         * authentication key can create messages with this security level, but
         * anyone can read the contents of the message. The value 3 means:
         * Authentication and encryption. Only the one with the right
         * authentication key can create messages with this security level, and
         * only the one with the right encryption/decryption key can read the
         * contents of the message. The option is a int type.
         */
        public T securityLevel(int securityLevel) {
            this.securityLevel = securityLevel;
            return (T) this;
        }

        /**
         * Sets the security name to be used with this target. The option is a
         * java.lang.String type.
         */
        public T securityName(String securityName) {
            this.securityName = securityName;
            return (T) this;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Object getOids() {
            return oids;
        }

        public void setOids(Object oids) {
            this.oids = oids;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public Integer getRetries() {
            return retries;
        }

        public void setRetries(Integer retries) {
            this.retries = retries;
        }

        public String getSnmpCommunity() {
            return snmpCommunity;
        }

        public void setSnmpCommunity(String snmpCommunity) {
            this.snmpCommunity = snmpCommunity;
        }

        public String getSnmpContextEngineId() {
            return snmpContextEngineId;
        }

        public void setSnmpContextEngineId(String snmpContextEngineId) {
            this.snmpContextEngineId = snmpContextEngineId;
        }

        public String getSnmpContextName() {
            return snmpContextName;
        }

        public void setSnmpContextName(String snmpContextName) {
            this.snmpContextName = snmpContextName;
        }

        public Integer getSnmpVersion() {
            return snmpVersion;
        }

        public void setSnmpVersion(Integer snmpVersion) {
            this.snmpVersion = snmpVersion;
        }

        public Integer getTimeout() {
            return timeout;
        }

        public void setTimeout(Integer timeout) {
            this.timeout = timeout;
        }

        public SnmpActionType getType() {
            return type;
        }

        public void setType(SnmpActionType type) {
            this.type = type;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }

        public String getAuthenticationPassphrase() {
            return authenticationPassphrase;
        }

        public void setAuthenticationPassphrase(String authenticationPassphrase) {
            this.authenticationPassphrase = authenticationPassphrase;
        }

        public String getAuthenticationProtocol() {
            return authenticationProtocol;
        }

        public void setAuthenticationProtocol(String authenticationProtocol) {
            this.authenticationProtocol = authenticationProtocol;
        }

        public String getPrivacyPassphrase() {
            return privacyPassphrase;
        }

        public void setPrivacyPassphrase(String privacyPassphrase) {
            this.privacyPassphrase = privacyPassphrase;
        }

        public String getPrivacyProtocol() {
            return privacyProtocol;
        }

        public void setPrivacyProtocol(String privacyProtocol) {
            this.privacyProtocol = privacyProtocol;
        }

        public Integer getSecurityLevel() {
            return securityLevel;
        }

        public void setSecurityLevel(Integer securityLevel) {
            this.securityLevel = securityLevel;
        }

        public String getSecurityName() {
            return securityName;
        }

        public void setSecurityName(String securityName) {
            this.securityName = securityName;
        }
    }

    public static class SnmpConsumer extends SnmpCommon<SnmpConsumer> {
        private Boolean bridgeErrorHandler;
        private Long delay;
        private Boolean sendEmptyMessageWhenIdle;
        private Boolean treeList;
        private ExceptionHandler exceptionHandler;
        private ExchangePattern exchangePattern;
        private PollingConsumerPollStrategy pollStrategy;
        private Integer backoffErrorThreshold;
        private Integer backoffIdleThreshold;
        private Integer backoffMultiplier;
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
        public SnmpConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
            return (SnmpConsumer) this;
        }

        /**
         * Sets update rate in seconds. The option is a long type.
         */
        public SnmpConsumer delay(long delay) {
            this.delay = delay;
            return (SnmpConsumer) this;
        }

        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        public SnmpConsumer sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.sendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
            return (SnmpConsumer) this;
        }

        /**
         * Sets the flag whether the scoped PDU will be displayed as the list if
         * it has child elements in its tree. The option is a boolean type.
         */
        public SnmpConsumer treeList(boolean treeList) {
            this.treeList = treeList;
            return (SnmpConsumer) this;
        }

        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public SnmpConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
            return (SnmpConsumer) this;
        }

        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public SnmpConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
            return (SnmpConsumer) this;
        }

        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public SnmpConsumer pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.pollStrategy = pollStrategy;
            return (SnmpConsumer) this;
        }

        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        public SnmpConsumer backoffErrorThreshold(int backoffErrorThreshold) {
            this.backoffErrorThreshold = backoffErrorThreshold;
            return (SnmpConsumer) this;
        }

        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        public SnmpConsumer backoffIdleThreshold(int backoffIdleThreshold) {
            this.backoffIdleThreshold = backoffIdleThreshold;
            return (SnmpConsumer) this;
        }

        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        public SnmpConsumer backoffMultiplier(int backoffMultiplier) {
            this.backoffMultiplier = backoffMultiplier;
            return (SnmpConsumer) this;
        }

        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        public SnmpConsumer greedy(boolean greedy) {
            this.greedy = greedy;
            return (SnmpConsumer) this;
        }

        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public SnmpConsumer initialDelay(long initialDelay) {
            this.initialDelay = initialDelay;
            return (SnmpConsumer) this;
        }

        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        public SnmpConsumer runLoggingLevel(LoggingLevel runLoggingLevel) {
            this.runLoggingLevel = runLoggingLevel;
            return (SnmpConsumer) this;
        }

        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        public SnmpConsumer scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.scheduledExecutorService = scheduledExecutorService;
            return (SnmpConsumer) this;
        }

        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public SnmpConsumer scheduler(ScheduledPollConsumerScheduler scheduler) {
            this.scheduler = scheduler;
            return (SnmpConsumer) this;
        }

        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public SnmpConsumer schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.schedulerProperties = schedulerProperties;
            return (SnmpConsumer) this;
        }

        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        public SnmpConsumer startScheduler(boolean startScheduler) {
            this.startScheduler = startScheduler;
            return (SnmpConsumer) this;
        }

        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        public SnmpConsumer timeUnit(TimeUnit timeUnit) {
            this.timeUnit = timeUnit;
            return (SnmpConsumer) this;
        }

        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        public SnmpConsumer useFixedDelay(boolean useFixedDelay) {
            this.useFixedDelay = useFixedDelay;
            return (SnmpConsumer) this;
        }

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public Long getDelay() {
            return delay;
        }

        public void setDelay(Long delay) {
            this.delay = delay;
        }

        public Boolean getSendEmptyMessageWhenIdle() {
            return sendEmptyMessageWhenIdle;
        }

        public void setSendEmptyMessageWhenIdle(Boolean sendEmptyMessageWhenIdle) {
            this.sendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
        }

        public Boolean getTreeList() {
            return treeList;
        }

        public void setTreeList(Boolean treeList) {
            this.treeList = treeList;
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

    public static class SnmpProducer extends SnmpCommon<SnmpProducer> {
    }

    public static enum SnmpActionType {
        TRAP, POLL, GET_NEXT;
    }
}