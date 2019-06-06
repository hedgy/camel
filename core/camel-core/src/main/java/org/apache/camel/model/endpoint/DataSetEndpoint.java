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
 * The dataset component provides a mechanism to easily perform load & soak
 * testing of your system.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class DataSetEndpoint {


    public static class DataSetCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private Object name;
        private String dataSetIndex;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;

        /**
         * Name of DataSet to lookup in the registry. The option is a
         * org.apache.camel.component.dataset.DataSet type.
         */
        public T name(Object name) {
            this.name = name;
            return (T) this;
        }

        /**
         * Controls the behaviour of the CamelDataSetIndex header. For
         * Consumers: - off = the header will not be set - strict/lenient = the
         * header will be set For Producers: - off = the header value will not
         * be verified, and will not be set if it is not present = strict = the
         * header value must be present and will be verified = lenient = the
         * header value will be verified if it is present, and will be set if it
         * is not present. The option is a java.lang.String type.
         */
        public T dataSetIndex(String dataSetIndex) {
            this.dataSetIndex = dataSetIndex;
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

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public String getDataSetIndex() {
            return dataSetIndex;
        }

        public void setDataSetIndex(String dataSetIndex) {
            this.dataSetIndex = dataSetIndex;
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
    }

    public static class DataSetConsumer
            extends
                DataSetCommon<DataSetConsumer> {
        private Long initialDelay;
        private Integer minRate;
        private Long preloadSize;
        private Long produceDelay;

        /**
         * Time period in millis to wait before starting sending messages. The
         * option is a long type.
         */
        public DataSetConsumer initialDelay(long initialDelay) {
            this.initialDelay = initialDelay;
            return (DataSetConsumer) this;
        }

        /**
         * Wait until the DataSet contains at least this number of messages. The
         * option is a int type.
         */
        public DataSetConsumer minRate(int minRate) {
            this.minRate = minRate;
            return (DataSetConsumer) this;
        }

        /**
         * Sets how many messages should be preloaded (sent) before the route
         * completes its initialization. The option is a long type.
         */
        public DataSetConsumer preloadSize(long preloadSize) {
            this.preloadSize = preloadSize;
            return (DataSetConsumer) this;
        }

        /**
         * Allows a delay to be specified which causes a delay when a message is
         * sent by the consumer (to simulate slow processing). The option is a
         * long type.
         */
        public DataSetConsumer produceDelay(long produceDelay) {
            this.produceDelay = produceDelay;
            return (DataSetConsumer) this;
        }

        public Long getInitialDelay() {
            return initialDelay;
        }

        public void setInitialDelay(Long initialDelay) {
            this.initialDelay = initialDelay;
        }

        public Integer getMinRate() {
            return minRate;
        }

        public void setMinRate(Integer minRate) {
            this.minRate = minRate;
        }

        public Long getPreloadSize() {
            return preloadSize;
        }

        public void setPreloadSize(Long preloadSize) {
            this.preloadSize = preloadSize;
        }

        public Long getProduceDelay() {
            return produceDelay;
        }

        public void setProduceDelay(Long produceDelay) {
            this.produceDelay = produceDelay;
        }
    }

    public static class DataSetProducer
            extends
                DataSetCommon<DataSetProducer> {
        private Long consumeDelay;
        private Long assertPeriod;
        private Integer expectedCount;
        private Integer reportGroup;
        private Long resultMinimumWaitTime;
        private Long resultWaitTime;
        private Integer retainFirst;
        private Integer retainLast;
        private Long sleepForEmptyTest;
        private Boolean copyOnExchange;

        /**
         * Allows a delay to be specified which causes a delay when a message is
         * consumed by the producer (to simulate slow processing). The option is
         * a long type.
         */
        public DataSetProducer consumeDelay(long consumeDelay) {
            this.consumeDelay = consumeDelay;
            return (DataSetProducer) this;
        }

        /**
         * Sets a grace period after which the mock endpoint will re-assert to
         * ensure the preliminary assertion is still valid. This is used for
         * example to assert that exactly a number of messages arrives. For
         * example if expectedMessageCount(int) was set to 5, then the assertion
         * is satisfied when 5 or more message arrives. To ensure that exactly 5
         * messages arrives, then you would need to wait a little period to
         * ensure no further message arrives. This is what you can use this
         * method for. By default this period is disabled. The option is a long
         * type.
         */
        public DataSetProducer assertPeriod(long assertPeriod) {
            this.assertPeriod = assertPeriod;
            return (DataSetProducer) this;
        }

        /**
         * Specifies the expected number of message exchanges that should be
         * received by this endpoint. Beware: If you want to expect that 0
         * messages, then take extra care, as 0 matches when the tests starts,
         * so you need to set a assert period time to let the test run for a
         * while to make sure there are still no messages arrived; for that use
         * setAssertPeriod(long). An alternative is to use NotifyBuilder, and
         * use the notifier to know when Camel is done routing some messages,
         * before you call the assertIsSatisfied() method on the mocks. This
         * allows you to not use a fixed assert period, to speedup testing
         * times. If you want to assert that exactly n'th message arrives to
         * this mock endpoint, then see also the setAssertPeriod(long) method
         * for further details. The option is a int type.
         */
        public DataSetProducer expectedCount(int expectedCount) {
            this.expectedCount = expectedCount;
            return (DataSetProducer) this;
        }

        /**
         * A number that is used to turn on throughput logging based on groups
         * of the size. The option is a int type.
         */
        public DataSetProducer reportGroup(int reportGroup) {
            this.reportGroup = reportGroup;
            return (DataSetProducer) this;
        }

        /**
         * Sets the minimum expected amount of time (in millis) the
         * assertIsSatisfied() will wait on a latch until it is satisfied. The
         * option is a long type.
         */
        public DataSetProducer resultMinimumWaitTime(long resultMinimumWaitTime) {
            this.resultMinimumWaitTime = resultMinimumWaitTime;
            return (DataSetProducer) this;
        }

        /**
         * Sets the maximum amount of time (in millis) the assertIsSatisfied()
         * will wait on a latch until it is satisfied. The option is a long
         * type.
         */
        public DataSetProducer resultWaitTime(long resultWaitTime) {
            this.resultWaitTime = resultWaitTime;
            return (DataSetProducer) this;
        }

        /**
         * Specifies to only retain the first n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the first 10 Exchanges, then the getReceivedCounter()
         * will still return 5000 but there is only the first 10 Exchanges in
         * the getExchanges() and getReceivedExchanges() methods. When using
         * this method, then some of the other expectation methods is not
         * supported, for example the expectedBodiesReceived(Object...) sets a
         * expectation on the first number of bodies received. You can configure
         * both setRetainFirst(int) and setRetainLast(int) methods, to limit
         * both the first and last received. The option is a int type.
         */
        public DataSetProducer retainFirst(int retainFirst) {
            this.retainFirst = retainFirst;
            return (DataSetProducer) this;
        }

        /**
         * Specifies to only retain the last n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the last 20 Exchanges, then the getReceivedCounter() will
         * still return 5000 but there is only the last 20 Exchanges in the
         * getExchanges() and getReceivedExchanges() methods. When using this
         * method, then some of the other expectation methods is not supported,
         * for example the expectedBodiesReceived(Object...) sets a expectation
         * on the first number of bodies received. You can configure both
         * setRetainFirst(int) and setRetainLast(int) methods, to limit both the
         * first and last received. The option is a int type.
         */
        public DataSetProducer retainLast(int retainLast) {
            this.retainLast = retainLast;
            return (DataSetProducer) this;
        }

        /**
         * Allows a sleep to be specified to wait to check that this endpoint
         * really is empty when expectedMessageCount(int) is called with zero.
         * The option is a long type.
         */
        public DataSetProducer sleepForEmptyTest(long sleepForEmptyTest) {
            this.sleepForEmptyTest = sleepForEmptyTest;
            return (DataSetProducer) this;
        }

        /**
         * Sets whether to make a deep copy of the incoming Exchange when
         * received at this mock endpoint. Is by default true. The option is a
         * boolean type.
         */
        public DataSetProducer copyOnExchange(boolean copyOnExchange) {
            this.copyOnExchange = copyOnExchange;
            return (DataSetProducer) this;
        }

        public Long getConsumeDelay() {
            return consumeDelay;
        }

        public void setConsumeDelay(Long consumeDelay) {
            this.consumeDelay = consumeDelay;
        }

        public Long getAssertPeriod() {
            return assertPeriod;
        }

        public void setAssertPeriod(Long assertPeriod) {
            this.assertPeriod = assertPeriod;
        }

        public Integer getExpectedCount() {
            return expectedCount;
        }

        public void setExpectedCount(Integer expectedCount) {
            this.expectedCount = expectedCount;
        }

        public Integer getReportGroup() {
            return reportGroup;
        }

        public void setReportGroup(Integer reportGroup) {
            this.reportGroup = reportGroup;
        }

        public Long getResultMinimumWaitTime() {
            return resultMinimumWaitTime;
        }

        public void setResultMinimumWaitTime(Long resultMinimumWaitTime) {
            this.resultMinimumWaitTime = resultMinimumWaitTime;
        }

        public Long getResultWaitTime() {
            return resultWaitTime;
        }

        public void setResultWaitTime(Long resultWaitTime) {
            this.resultWaitTime = resultWaitTime;
        }

        public Integer getRetainFirst() {
            return retainFirst;
        }

        public void setRetainFirst(Integer retainFirst) {
            this.retainFirst = retainFirst;
        }

        public Integer getRetainLast() {
            return retainLast;
        }

        public void setRetainLast(Integer retainLast) {
            this.retainLast = retainLast;
        }

        public Long getSleepForEmptyTest() {
            return sleepForEmptyTest;
        }

        public void setSleepForEmptyTest(Long sleepForEmptyTest) {
            this.sleepForEmptyTest = sleepForEmptyTest;
        }

        public Boolean getCopyOnExchange() {
            return copyOnExchange;
        }

        public void setCopyOnExchange(Boolean copyOnExchange) {
            this.copyOnExchange = copyOnExchange;
        }
    }
}