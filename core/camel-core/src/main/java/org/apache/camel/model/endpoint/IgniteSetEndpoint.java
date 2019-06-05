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
 * The Ignite Sets endpoint is one of camel-ignite endpoints which allows you to
 * interact with Ignite Set data structures.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class IgniteSetEndpoint {


    public static class IgniteSetCommon extends EndpointConfiguration {
        /**
         * The set name. The option is a java.lang.String type.
         */
        private String name;
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void. The option is a boolean type.
         */
        private boolean propagateIncomingBodyIfNoReturnValue;
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc. The option is a boolean type.
         */
        private boolean treatCollectionsAsCacheObjects;
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean getPropagateIncomingBodyIfNoReturnValue() {
            return propagateIncomingBodyIfNoReturnValue;
        }

        public void setPropagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            this.propagateIncomingBodyIfNoReturnValue = propagateIncomingBodyIfNoReturnValue;
        }

        public boolean getTreatCollectionsAsCacheObjects() {
            return treatCollectionsAsCacheObjects;
        }

        public void setTreatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            this.treatCollectionsAsCacheObjects = treatCollectionsAsCacheObjects;
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

    public static class IgniteSetConsumer extends IgniteSetCommon {
    }

    public static class IgniteSetProducer extends IgniteSetCommon {
        /**
         * The collection configuration. Default: empty configuration. You can
         * also conveniently set inner properties by using configuration.xyz=123
         * options. The option is a
         * org.apache.ignite.configuration.CollectionConfiguration type.
         */
        private Object configuration;
        /**
         * The operation to invoke on the Ignite Set. Superseded by the
         * IgniteConstants.IGNITE_SETS_OPERATION header in the IN message.
         * Possible values: CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR,
         * RETAIN_ALL, ARRAY.The set operation to perform. The option is a
         * org.apache.camel.component.ignite.set.IgniteSetOperation type.
         */
        private IgniteSetOperation operation;

        public Object getConfiguration() {
            return configuration;
        }

        public void setConfiguration(Object configuration) {
            this.configuration = configuration;
        }

        public IgniteSetOperation getOperation() {
            return operation;
        }

        public void setOperation(IgniteSetOperation operation) {
            this.operation = operation;
        }
    }

    public static enum IgniteSetOperation {
        CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR, RETAIN_ALL, ARRAY;
    }
}