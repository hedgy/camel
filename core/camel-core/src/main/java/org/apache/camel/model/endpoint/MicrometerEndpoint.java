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
 * To collect various metrics directly from Camel routes using the Micrometer
 * library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class MicrometerEndpoint {


    public static class MicrometerCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private Object metricsType;
        private String metricsName;
        private Iterable<Object> tags;
        private String action;
        private String decrement;
        private String increment;
        private String value;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;

        /**
         * Type of metrics. The option is a
         * io.micrometer.core.instrument.Meter.Type type.
         */
        public T metricsType(Object metricsType) {
            this.metricsType = metricsType;
            return (T) this;
        }

        /**
         * Name of metrics. The option is a java.lang.String type.
         */
        public T metricsName(String metricsName) {
            this.metricsName = metricsName;
            return (T) this;
        }

        /**
         * Tags of metrics. The option is a
         * java.lang.Iterable<io.micrometer.core.instrument.Tag> type.
         */
        public T tags(Iterable<Object> tags) {
            this.tags = tags;
            return (T) this;
        }

        /**
         * Action expression when using timer type. The option is a
         * java.lang.String type.
         */
        public T action(String action) {
            this.action = action;
            return (T) this;
        }

        /**
         * Decrement value expression when using counter type. The option is a
         * java.lang.String type.
         */
        public T decrement(String decrement) {
            this.decrement = decrement;
            return (T) this;
        }

        /**
         * Increment value expression when using counter type. The option is a
         * java.lang.String type.
         */
        public T increment(String increment) {
            this.increment = increment;
            return (T) this;
        }

        /**
         * Value expression when using histogram type. The option is a
         * java.lang.String type.
         */
        public T value(String value) {
            this.value = value;
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

        public Object getMetricsType() {
            return metricsType;
        }

        public void setMetricsType(Object metricsType) {
            this.metricsType = metricsType;
        }

        public String getMetricsName() {
            return metricsName;
        }

        public void setMetricsName(String metricsName) {
            this.metricsName = metricsName;
        }

        public Iterable<Object> getTags() {
            return tags;
        }

        public void setTags(Iterable<Object> tags) {
            this.tags = tags;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getDecrement() {
            return decrement;
        }

        public void setDecrement(String decrement) {
            this.decrement = decrement;
        }

        public String getIncrement() {
            return increment;
        }

        public void setIncrement(String increment) {
            this.increment = increment;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
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

    public static class MicrometerConsumer
            extends
                MicrometerCommon<MicrometerConsumer> {
    }

    public static class MicrometerProducer
            extends
                MicrometerCommon<MicrometerProducer> {
    }
}