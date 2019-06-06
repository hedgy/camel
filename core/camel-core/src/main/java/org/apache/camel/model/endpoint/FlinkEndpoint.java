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
 * The flink component can be used to send DataSet jobs to Apache Flink cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class FlinkEndpoint {


    public static class FlinkCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private EndpointType endpointType;
        private Boolean collect;
        private Object dataSet;
        private Object dataSetCallback;
        private Object dataStream;
        private Object dataStreamCallback;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;

        /**
         * Type of the endpoint (dataset, datastream). The option is a
         * org.apache.camel.component.flink.EndpointType type.
         */
        public T endpointType(EndpointType endpointType) {
            this.endpointType = endpointType;
            return (T) this;
        }

        /**
         * Indicates if results should be collected or counted. The option is a
         * boolean type.
         */
        public T collect(boolean collect) {
            this.collect = collect;
            return (T) this;
        }

        /**
         * DataSet to compute against. The option is a
         * org.apache.flink.api.java.DataSet type.
         */
        public T dataSet(Object dataSet) {
            this.dataSet = dataSet;
            return (T) this;
        }

        /**
         * Function performing action against a DataSet. The option is a
         * org.apache.camel.component.flink.DataSetCallback type.
         */
        public T dataSetCallback(Object dataSetCallback) {
            this.dataSetCallback = dataSetCallback;
            return (T) this;
        }

        /**
         * DataStream to compute against. The option is a
         * org.apache.flink.streaming.api.datastream.DataStream type.
         */
        public T dataStream(Object dataStream) {
            this.dataStream = dataStream;
            return (T) this;
        }

        /**
         * Function performing action against a DataStream. The option is a
         * org.apache.camel.component.flink.DataStreamCallback type.
         */
        public T dataStreamCallback(Object dataStreamCallback) {
            this.dataStreamCallback = dataStreamCallback;
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

        public EndpointType getEndpointType() {
            return endpointType;
        }

        public void setEndpointType(EndpointType endpointType) {
            this.endpointType = endpointType;
        }

        public Boolean getCollect() {
            return collect;
        }

        public void setCollect(Boolean collect) {
            this.collect = collect;
        }

        public Object getDataSet() {
            return dataSet;
        }

        public void setDataSet(Object dataSet) {
            this.dataSet = dataSet;
        }

        public Object getDataSetCallback() {
            return dataSetCallback;
        }

        public void setDataSetCallback(Object dataSetCallback) {
            this.dataSetCallback = dataSetCallback;
        }

        public Object getDataStream() {
            return dataStream;
        }

        public void setDataStream(Object dataStream) {
            this.dataStream = dataStream;
        }

        public Object getDataStreamCallback() {
            return dataStreamCallback;
        }

        public void setDataStreamCallback(Object dataStreamCallback) {
            this.dataStreamCallback = dataStreamCallback;
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

    public static class FlinkConsumer extends FlinkCommon<FlinkConsumer> {
    }

    public static class FlinkProducer extends FlinkCommon<FlinkProducer> {
    }

    public static enum EndpointType {
        dataset, datastream;
    }
}