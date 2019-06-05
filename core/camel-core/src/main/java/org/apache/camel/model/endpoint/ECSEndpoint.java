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
 * The aws-kms is used for managing Amazon ECS
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class ECSEndpoint {


    public static class ECSCommon extends EndpointConfiguration {
        /**
         * Logical name. The option is a java.lang.String type.
         */
        private String label;
        /**
         * The region in which ECS client needs to work. The option is a
         * java.lang.String type.
         */
        private String region;
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

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
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

    public static class ECSConsumer extends ECSCommon {
    }

    public static class ECSProducer extends ECSCommon {
        /**
         * Amazon AWS Access Key. The option is a java.lang.String type.
         */
        private String accessKey;
        /**
         * To use a existing configured AWS ECS as client. The option is a
         * com.amazonaws.services.ecs.AmazonECS type.
         */
        private Object ecsClient;
        /**
         * The operation to perform. The option is a
         * org.apache.camel.component.aws.ecs.ECSOperations type.
         */
        private ECSOperations operation;
        /**
         * To define a proxy host when instantiating the ECS client. The option
         * is a java.lang.String type.
         */
        private String proxyHost;
        /**
         * To define a proxy port when instantiating the ECS client. The option
         * is a java.lang.Integer type.
         */
        private Integer proxyPort;
        /**
         * Amazon AWS Secret Key. The option is a java.lang.String type.
         */
        private String secretKey;

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public Object getEcsClient() {
            return ecsClient;
        }

        public void setEcsClient(Object ecsClient) {
            this.ecsClient = ecsClient;
        }

        public ECSOperations getOperation() {
            return operation;
        }

        public void setOperation(ECSOperations operation) {
            this.operation = operation;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }
    }

    public static enum ECSOperations {
        listClusters, describeCluster, createCluster, deleteCluster;
    }
}