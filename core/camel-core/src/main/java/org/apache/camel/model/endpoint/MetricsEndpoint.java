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
 * To collect various metrics directly from Camel routes using the DropWizard
 * metrics library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class MetricsEndpoint {


    public static class MetricsCommon extends EndpointConfiguration {
        /**
         * Type of metrics. The option is a
         * org.apache.camel.component.metrics.MetricsType type.
         */
        private MetricsType metricsType;
        /**
         * Name of metrics. The option is a java.lang.String type.
         */
        private String metricsName;
        /**
         * Action when using timer type. The option is a
         * org.apache.camel.component.metrics.MetricsTimerAction type.
         */
        private MetricsTimerAction action;
        /**
         * Decrement value when using counter type. The option is a
         * java.lang.Long type.
         */
        private Long decrement;
        /**
         * Increment value when using counter type. The option is a
         * java.lang.Long type.
         */
        private Long increment;
        /**
         * Mark when using meter type. The option is a java.lang.Long type.
         */
        private Long mark;
        /**
         * Subject value when using gauge type. The option is a java.lang.Object
         * type.
         */
        private Object subject;
        /**
         * Value value when using histogram type. The option is a java.lang.Long
         * type.
         */
        private Long value;
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

        public MetricsType getMetricsType() {
            return metricsType;
        }

        public void setMetricsType(MetricsType metricsType) {
            this.metricsType = metricsType;
        }

        public String getMetricsName() {
            return metricsName;
        }

        public void setMetricsName(String metricsName) {
            this.metricsName = metricsName;
        }

        public MetricsTimerAction getAction() {
            return action;
        }

        public void setAction(MetricsTimerAction action) {
            this.action = action;
        }

        public Long getDecrement() {
            return decrement;
        }

        public void setDecrement(Long decrement) {
            this.decrement = decrement;
        }

        public Long getIncrement() {
            return increment;
        }

        public void setIncrement(Long increment) {
            this.increment = increment;
        }

        public Long getMark() {
            return mark;
        }

        public void setMark(Long mark) {
            this.mark = mark;
        }

        public Object getSubject() {
            return subject;
        }

        public void setSubject(Object subject) {
            this.subject = subject;
        }

        public Long getValue() {
            return value;
        }

        public void setValue(Long value) {
            this.value = value;
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
    }

    public static class MetricsConsumer extends MetricsCommon {
    }

    public static class MetricsProducer extends MetricsCommon {
    }

    public static enum MetricsType {
        GAUGE, COUNTER, HISTOGRAM, METER, TIMER;
    }

    public static enum MetricsTimerAction {
        start, stop;
    }
}