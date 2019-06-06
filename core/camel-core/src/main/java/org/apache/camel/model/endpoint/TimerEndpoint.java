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

import java.util.Date;
import java.util.Timer;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The timer component is used for generating message exchanges when a timer
 * fires.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class TimerEndpoint {


    public static class TimerCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String timerName;
        private Long delay;
        private Boolean fixedRate;
        private Long period;
        private Long repeatCount;
        private Boolean basicPropertyBinding;
        private Boolean daemon;
        private String pattern;
        private Boolean synchronous;
        private Date time;
        private Timer timer;

        /**
         * The name of the timer. The option is a java.lang.String type.
         */
        public T timerName(String timerName) {
            this.timerName = timerName;
            return (T) this;
        }

        /**
         * The number of milliseconds to wait before the first event is
         * generated. Should not be used in conjunction with the time option.
         * The default value is 1000. You can also specify time values using
         * units, such as 60s (60 seconds), 5m30s (5 minutes and 30 seconds),
         * and 1h (1 hour). The option is a long type.
         */
        public T delay(long delay) {
            this.delay = delay;
            return (T) this;
        }

        /**
         * Events take place at approximately regular intervals, separated by
         * the specified period. The option is a boolean type.
         */
        public T fixedRate(boolean fixedRate) {
            this.fixedRate = fixedRate;
            return (T) this;
        }

        /**
         * If greater than 0, generate periodic events every period
         * milliseconds. The default value is 1000. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public T period(long period) {
            this.period = period;
            return (T) this;
        }

        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the timer will only fire once. If you set it to 5, it will only fire
         * five times. A value of zero or negative means fire forever. The
         * option is a long type.
         */
        public T repeatCount(long repeatCount) {
            this.repeatCount = repeatCount;
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
         * Specifies whether or not the thread associated with the timer
         * endpoint runs as a daemon. The default value is true. The option is a
         * boolean type.
         */
        public T daemon(boolean daemon) {
            this.daemon = daemon;
            return (T) this;
        }

        /**
         * Allows you to specify a custom Date pattern to use for setting the
         * time option using URI syntax. The option is a java.lang.String type.
         */
        public T pattern(String pattern) {
            this.pattern = pattern;
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
         * A java.util.Date the first event should be generated. If using the
         * URI, the pattern expected is: yyyy-MM-dd HH:mm:ss or
         * yyyy-MM-dd'T'HH:mm:ss. The option is a java.util.Date type.
         */
        public T time(Date time) {
            this.time = time;
            return (T) this;
        }

        /**
         * To use a custom Timer. The option is a java.util.Timer type.
         */
        public T timer(Timer timer) {
            this.timer = timer;
            return (T) this;
        }

        public String getTimerName() {
            return timerName;
        }

        public void setTimerName(String timerName) {
            this.timerName = timerName;
        }

        public Long getDelay() {
            return delay;
        }

        public void setDelay(Long delay) {
            this.delay = delay;
        }

        public Boolean getFixedRate() {
            return fixedRate;
        }

        public void setFixedRate(Boolean fixedRate) {
            this.fixedRate = fixedRate;
        }

        public Long getPeriod() {
            return period;
        }

        public void setPeriod(Long period) {
            this.period = period;
        }

        public Long getRepeatCount() {
            return repeatCount;
        }

        public void setRepeatCount(Long repeatCount) {
            this.repeatCount = repeatCount;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Boolean getDaemon() {
            return daemon;
        }

        public void setDaemon(Boolean daemon) {
            this.daemon = daemon;
        }

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

        public Timer getTimer() {
            return timer;
        }

        public void setTimer(Timer timer) {
            this.timer = timer;
        }
    }

    public static class TimerConsumer extends TimerCommon<TimerConsumer> {
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
        public TimerConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
            return (TimerConsumer) this;
        }

        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public TimerConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
            return (TimerConsumer) this;
        }

        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public TimerConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
            return (TimerConsumer) this;
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

    public static class TimerProducer extends TimerCommon<TimerProducer> {
    }
}