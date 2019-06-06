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
import javax.annotation.Generated;

/**
 * The aws-cw component is used for sending metrics to an Amazon CloudWatch.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class CwEndpoint {


    public static class CwCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String namespace;
        private Object amazonCwClient;
        private String name;
        private String proxyHost;
        private Integer proxyPort;
        private String region;
        private Date timestamp;
        private String unit;
        private Double value;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;
        private String accessKey;
        private String secretKey;

        /**
         * The metric namespace. The option is a java.lang.String type.
         */
        public T namespace(String namespace) {
            this.namespace = namespace;
            return (T) this;
        }

        /**
         * To use the AmazonCloudWatch as the client. The option is a
         * com.amazonaws.services.cloudwatch.AmazonCloudWatch type.
         */
        public T amazonCwClient(Object amazonCwClient) {
            this.amazonCwClient = amazonCwClient;
            return (T) this;
        }

        /**
         * The metric name. The option is a java.lang.String type.
         */
        public T name(String name) {
            this.name = name;
            return (T) this;
        }

        /**
         * To define a proxy host when instantiating the CW client. The option
         * is a java.lang.String type.
         */
        public T proxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
            return (T) this;
        }

        /**
         * To define a proxy port when instantiating the CW client. The option
         * is a java.lang.Integer type.
         */
        public T proxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
            return (T) this;
        }

        /**
         * The region in which CW client needs to work. The option is a
         * java.lang.String type.
         */
        public T region(String region) {
            this.region = region;
            return (T) this;
        }

        /**
         * The metric timestamp. The option is a java.util.Date type.
         */
        public T timestamp(Date timestamp) {
            this.timestamp = timestamp;
            return (T) this;
        }

        /**
         * The metric unit. The option is a java.lang.String type.
         */
        public T unit(String unit) {
            this.unit = unit;
            return (T) this;
        }

        /**
         * The metric value. The option is a java.lang.Double type.
         */
        public T value(Double value) {
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

        public String getNamespace() {
            return namespace;
        }

        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public Object getAmazonCwClient() {
            return amazonCwClient;
        }

        public void setAmazonCwClient(Object amazonCwClient) {
            this.amazonCwClient = amazonCwClient;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Date getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Date timestamp) {
            this.timestamp = timestamp;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
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

    public static class CwConsumer extends CwCommon<CwConsumer> {
    }

    public static class CwProducer extends CwCommon<CwProducer> {
    }
}