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
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Provides a scheduled delivery of messages using the Quartz 2.x scheduler.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class QuartzEndpoint {


    public static class QuartzCommon extends EndpointConfiguration {
        /**
         * The quartz group name to use. The combination of group name and timer
         * name should be unique. The option is a java.lang.String type.
         */
        private String groupName;
        /**
         * The quartz timer name to use. The combination of group name and timer
         * name should be unique. The option is a java.lang.String type.
         */
        private String triggerName;
        /**
         * Specifies a cron expression to define when to trigger. The option is
         * a java.lang.String type.
         */
        private String cron;
        /**
         * If set to true, then the trigger automatically delete when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true. The option is a boolean type.
         */
        private boolean deleteJob;
        /**
         * Whether or not the job should remain stored after it is orphaned (no
         * triggers point to it). The option is a boolean type.
         */
        private boolean durableJob;
        /**
         * If set to true, then the trigger automatically pauses when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true. The option is a boolean type.
         */
        private boolean pauseJob;
        /**
         * Instructs the scheduler whether or not the job should be re-executed
         * if a 'recovery' or 'fail-over' situation is encountered. The option
         * is a boolean type.
         */
        private boolean recoverableJob;
        /**
         * Uses a Quartz PersistJobDataAfterExecution and
         * DisallowConcurrentExecution instead of the default job. The option is
         * a boolean type.
         */
        private boolean stateful;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private boolean basicPropertyBinding;
        /**
         * Specifies a custom calendar to avoid specific range of date. The
         * option is a org.quartz.Calendar type.
         */
        private Object customCalendar;
        /**
         * To configure additional options on the job. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        private Map<String, Object> jobParameters;
        /**
         * Whether the job name should be prefixed with endpoint id. The option
         * is a boolean type.
         */
        private boolean prefixJobNameWithEndpointId;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private boolean synchronous;
        /**
         * To configure additional options on the trigger. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        private Map<String, Object> triggerParameters;
        /**
         * If it is true, JobDataMap uses the CamelContext name directly to
         * reference the CamelContext, if it is false, JobDataMap uses use the
         * CamelContext management name which could be changed during the deploy
         * time. The option is a boolean type.
         */
        private boolean usingFixedCamelContextName;
        /**
         * Whether or not the scheduler should be auto started. The option is a
         * boolean type.
         */
        private boolean autoStartScheduler;
        /**
         * If it is true will fire the trigger when the route is start when
         * using SimpleTrigger. The option is a boolean type.
         */
        private boolean fireNow;
        /**
         * Seconds to wait before starting the quartz scheduler. The option is a
         * int type.
         */
        private int startDelayedSeconds;
        /**
         * In case of scheduler has already started, we want the trigger start
         * slightly after current time to ensure endpoint is fully started
         * before the job kicks in. The option is a long type.
         */
        private long triggerStartDelay;

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public String getTriggerName() {
            return triggerName;
        }

        public void setTriggerName(String triggerName) {
            this.triggerName = triggerName;
        }

        public String getCron() {
            return cron;
        }

        public void setCron(String cron) {
            this.cron = cron;
        }

        public boolean getDeleteJob() {
            return deleteJob;
        }

        public void setDeleteJob(boolean deleteJob) {
            this.deleteJob = deleteJob;
        }

        public boolean getDurableJob() {
            return durableJob;
        }

        public void setDurableJob(boolean durableJob) {
            this.durableJob = durableJob;
        }

        public boolean getPauseJob() {
            return pauseJob;
        }

        public void setPauseJob(boolean pauseJob) {
            this.pauseJob = pauseJob;
        }

        public boolean getRecoverableJob() {
            return recoverableJob;
        }

        public void setRecoverableJob(boolean recoverableJob) {
            this.recoverableJob = recoverableJob;
        }

        public boolean getStateful() {
            return stateful;
        }

        public void setStateful(boolean stateful) {
            this.stateful = stateful;
        }

        public boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Object getCustomCalendar() {
            return customCalendar;
        }

        public void setCustomCalendar(Object customCalendar) {
            this.customCalendar = customCalendar;
        }

        public Map<String, Object> getJobParameters() {
            return jobParameters;
        }

        public void setJobParameters(Map<String, Object> jobParameters) {
            this.jobParameters = jobParameters;
        }

        public boolean getPrefixJobNameWithEndpointId() {
            return prefixJobNameWithEndpointId;
        }

        public void setPrefixJobNameWithEndpointId(
                boolean prefixJobNameWithEndpointId) {
            this.prefixJobNameWithEndpointId = prefixJobNameWithEndpointId;
        }

        public boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(boolean synchronous) {
            this.synchronous = synchronous;
        }

        public Map<String, Object> getTriggerParameters() {
            return triggerParameters;
        }

        public void setTriggerParameters(Map<String, Object> triggerParameters) {
            this.triggerParameters = triggerParameters;
        }

        public boolean getUsingFixedCamelContextName() {
            return usingFixedCamelContextName;
        }

        public void setUsingFixedCamelContextName(
                boolean usingFixedCamelContextName) {
            this.usingFixedCamelContextName = usingFixedCamelContextName;
        }

        public boolean getAutoStartScheduler() {
            return autoStartScheduler;
        }

        public void setAutoStartScheduler(boolean autoStartScheduler) {
            this.autoStartScheduler = autoStartScheduler;
        }

        public boolean getFireNow() {
            return fireNow;
        }

        public void setFireNow(boolean fireNow) {
            this.fireNow = fireNow;
        }

        public int getStartDelayedSeconds() {
            return startDelayedSeconds;
        }

        public void setStartDelayedSeconds(int startDelayedSeconds) {
            this.startDelayedSeconds = startDelayedSeconds;
        }

        public long getTriggerStartDelay() {
            return triggerStartDelay;
        }

        public void setTriggerStartDelay(long triggerStartDelay) {
            this.triggerStartDelay = triggerStartDelay;
        }
    }

    public static class QuartzConsumer extends QuartzCommon {
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

    public static class QuartzProducer extends QuartzCommon {
    }
}