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
 * The Ignite Compute endpoint is one of camel-ignite endpoints which allows you
 * to run compute operations on the cluster by passing in an IgniteCallable, an
 * IgniteRunnable, an IgniteClosure, or collections of them, along with their
 * parameters if necessary.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class IgniteComputeEndpoint {


    public static class IgniteComputeCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String endpointId;
        private Boolean propagateIncomingBodyIfNoReturnValue;
        private Boolean treatCollectionsAsCacheObjects;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;

        /**
         * The endpoint ID (not used). The option is a java.lang.String type.
         */
        public T endpointId(String endpointId) {
            this.endpointId = endpointId;
            return (T) this;
        }

        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void. The option is a boolean type.
         */
        public T propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            this.propagateIncomingBodyIfNoReturnValue = propagateIncomingBodyIfNoReturnValue;
            return (T) this;
        }

        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc. The option is a boolean type.
         */
        public T treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            this.treatCollectionsAsCacheObjects = treatCollectionsAsCacheObjects;
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

        public String getEndpointId() {
            return endpointId;
        }

        public void setEndpointId(String endpointId) {
            this.endpointId = endpointId;
        }

        public Boolean getPropagateIncomingBodyIfNoReturnValue() {
            return propagateIncomingBodyIfNoReturnValue;
        }

        public void setPropagateIncomingBodyIfNoReturnValue(
                Boolean propagateIncomingBodyIfNoReturnValue) {
            this.propagateIncomingBodyIfNoReturnValue = propagateIncomingBodyIfNoReturnValue;
        }

        public Boolean getTreatCollectionsAsCacheObjects() {
            return treatCollectionsAsCacheObjects;
        }

        public void setTreatCollectionsAsCacheObjects(
                Boolean treatCollectionsAsCacheObjects) {
            this.treatCollectionsAsCacheObjects = treatCollectionsAsCacheObjects;
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

    public static class IgniteComputeConsumer
            extends
                IgniteComputeCommon<IgniteComputeConsumer> {
    }

    public static class IgniteComputeProducer
            extends
                IgniteComputeCommon<IgniteComputeProducer> {
        private Object clusterGroupExpression;
        private String computeName;
        private IgniteComputeExecutionType executionType;
        private String taskName;
        private Long timeoutMillis;

        /**
         * An expression that returns the Cluster Group for the IgniteCompute
         * instance. The option is a
         * org.apache.camel.component.ignite.ClusterGroupExpression type.
         */
        public IgniteComputeProducer clusterGroupExpression(
                Object clusterGroupExpression) {
            this.clusterGroupExpression = clusterGroupExpression;
            return (IgniteComputeProducer) this;
        }

        /**
         * The name of the compute job, which will be set via
         * IgniteCompute#withName(String). The option is a java.lang.String
         * type.
         */
        public IgniteComputeProducer computeName(String computeName) {
            this.computeName = computeName;
            return (IgniteComputeProducer) this;
        }

        /**
         * The compute operation to perform. Possible values: CALL, BROADCAST,
         * APPLY, EXECUTE, RUN, AFFINITY_CALL, AFFINITY_RUN. The component
         * expects different payload types depending on the operation. The
         * option is a
         * org.apache.camel.component.ignite.compute.IgniteComputeExecutionType
         * type.
         */
        public IgniteComputeProducer executionType(
                IgniteComputeExecutionType executionType) {
            this.executionType = executionType;
            return (IgniteComputeProducer) this;
        }

        /**
         * The task name, only applicable if using the
         * IgniteComputeExecutionType#EXECUTE execution type. The option is a
         * java.lang.String type.
         */
        public IgniteComputeProducer taskName(String taskName) {
            this.taskName = taskName;
            return (IgniteComputeProducer) this;
        }

        /**
         * The timeout interval for triggered jobs, in milliseconds, which will
         * be set via IgniteCompute#withTimeout(long). The option is a
         * java.lang.Long type.
         */
        public IgniteComputeProducer timeoutMillis(Long timeoutMillis) {
            this.timeoutMillis = timeoutMillis;
            return (IgniteComputeProducer) this;
        }

        public Object getClusterGroupExpression() {
            return clusterGroupExpression;
        }

        public void setClusterGroupExpression(Object clusterGroupExpression) {
            this.clusterGroupExpression = clusterGroupExpression;
        }

        public String getComputeName() {
            return computeName;
        }

        public void setComputeName(String computeName) {
            this.computeName = computeName;
        }

        public IgniteComputeExecutionType getExecutionType() {
            return executionType;
        }

        public void setExecutionType(IgniteComputeExecutionType executionType) {
            this.executionType = executionType;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public Long getTimeoutMillis() {
            return timeoutMillis;
        }

        public void setTimeoutMillis(Long timeoutMillis) {
            this.timeoutMillis = timeoutMillis;
        }
    }

    public static enum IgniteComputeExecutionType {
        CALL, BROADCAST, APPLY, EXECUTE, RUN, AFFINITY_CALL, AFFINITY_RUN;
    }
}