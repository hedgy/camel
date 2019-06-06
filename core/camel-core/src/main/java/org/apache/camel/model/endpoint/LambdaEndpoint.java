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
 * The aws-lambda is used for managing and invoking functions from Amazon
 * Lambda.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class LambdaEndpoint {


    public static class LambdaCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String function;
        private LambdaOperations operation;
        private Object awsLambdaClient;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;
        private String proxyHost;
        private Integer proxyPort;
        private String accessKey;
        private String secretKey;

        /**
         * Name of the Lambda function. The option is a java.lang.String type.
         */
        public T function(String function) {
            this.function = function;
            return (T) this;
        }

        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction. The option is a
         * org.apache.camel.component.aws.lambda.LambdaOperations type.
         */
        public T operation(LambdaOperations operation) {
            this.operation = operation;
            return (T) this;
        }

        /**
         * To use a existing configured AwsLambdaClient as client. The option is
         * a com.amazonaws.services.lambda.AWSLambda type.
         */
        public T awsLambdaClient(Object awsLambdaClient) {
            this.awsLambdaClient = awsLambdaClient;
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
         * To define a proxy host when instantiating the Lambda client. The
         * option is a java.lang.String type.
         */
        public T proxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
            return (T) this;
        }

        /**
         * To define a proxy port when instantiating the Lambda client. The
         * option is a java.lang.Integer type.
         */
        public T proxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
            return (T) this;
        }

        /**
         * Amazon AWS Access Key. The option is a java.lang.String type.
         */
        public T accessKey(String accessKey) {
            this.accessKey = accessKey;
            return (T) this;
        }

        /**
         * Amazon AWS Secret Key. The option is a java.lang.String type.
         */
        public T secretKey(String secretKey) {
            this.secretKey = secretKey;
            return (T) this;
        }

        public String getFunction() {
            return function;
        }

        public void setFunction(String function) {
            this.function = function;
        }

        public LambdaOperations getOperation() {
            return operation;
        }

        public void setOperation(LambdaOperations operation) {
            this.operation = operation;
        }

        public Object getAwsLambdaClient() {
            return awsLambdaClient;
        }

        public void setAwsLambdaClient(Object awsLambdaClient) {
            this.awsLambdaClient = awsLambdaClient;
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

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }
    }

    public static class LambdaConsumer extends LambdaCommon<LambdaConsumer> {
    }

    public static class LambdaProducer extends LambdaCommon<LambdaProducer> {
        private String region;

        /**
         * Amazon AWS Region. The option is a java.lang.String type.
         */
        public LambdaProducer region(String region) {
            this.region = region;
            return (LambdaProducer) this;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }

    public static enum LambdaOperations {
        listFunctions, getFunction, createFunction, deleteFunction, invokeFunction, updateFunction, createEventSourceMapping, deleteEventSourceMapping, listEventSourceMapping, listTags, tagResource, untagResource, publishVersion, listVersions;
    }
}