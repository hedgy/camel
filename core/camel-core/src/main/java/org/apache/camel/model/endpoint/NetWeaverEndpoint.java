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
 * The sap-netweaver component integrates with the SAP NetWeaver Gateway using
 * HTTP transports.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class NetWeaverEndpoint {


    public static class NetWeaverCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String url;
        private Boolean flatternMap;
        private Boolean json;
        private Boolean jsonAsMap;
        private String password;
        private String username;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;

        /**
         * Url to the SAP net-weaver gateway server. The option is a
         * java.lang.String type.
         */
        public T url(String url) {
            this.url = url;
            return (T) this;
        }

        /**
         * If the JSON Map contains only a single entry, then flattern by
         * storing that single entry value as the message body. The option is a
         * boolean type.
         */
        public T flatternMap(boolean flatternMap) {
            this.flatternMap = flatternMap;
            return (T) this;
        }

        /**
         * Whether to return data in JSON format. If this option is false, then
         * XML is returned in Atom format. The option is a boolean type.
         */
        public T json(boolean json) {
            this.json = json;
            return (T) this;
        }

        /**
         * To transform the JSON from a String to a Map in the message body. The
         * option is a boolean type.
         */
        public T jsonAsMap(boolean jsonAsMap) {
            this.jsonAsMap = jsonAsMap;
            return (T) this;
        }

        /**
         * Password for account. The option is a java.lang.String type.
         */
        public T password(String password) {
            this.password = password;
            return (T) this;
        }

        /**
         * Username for account. The option is a java.lang.String type.
         */
        public T username(String username) {
            this.username = username;
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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Boolean getFlatternMap() {
            return flatternMap;
        }

        public void setFlatternMap(Boolean flatternMap) {
            this.flatternMap = flatternMap;
        }

        public Boolean getJson() {
            return json;
        }

        public void setJson(Boolean json) {
            this.json = json;
        }

        public Boolean getJsonAsMap() {
            return jsonAsMap;
        }

        public void setJsonAsMap(Boolean jsonAsMap) {
            this.jsonAsMap = jsonAsMap;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
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

    public static class NetWeaverConsumer
            extends
                NetWeaverCommon<NetWeaverConsumer> {
    }

    public static class NetWeaverProducer
            extends
                NetWeaverCommon<NetWeaverProducer> {
    }
}