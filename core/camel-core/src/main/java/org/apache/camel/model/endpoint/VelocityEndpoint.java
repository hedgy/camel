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
 * Transforms the message using a Velocity template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class VelocityEndpoint {


    public static class VelocityCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String resourceUri;
        private Boolean contentCache;
        private String encoding;
        private Boolean loaderCache;
        private String propertiesFile;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;

        /**
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod. The option is a java.lang.String type.
         */
        public T resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            return (T) this;
        }

        /**
         * Sets whether to use resource content cache or not. The option is a
         * boolean type.
         */
        public T contentCache(boolean contentCache) {
            this.contentCache = contentCache;
            return (T) this;
        }

        /**
         * Character encoding of the resource content. The option is a
         * java.lang.String type.
         */
        public T encoding(String encoding) {
            this.encoding = encoding;
            return (T) this;
        }

        /**
         * Enables / disables the velocity resource loader cache which is
         * enabled by default. The option is a boolean type.
         */
        public T loaderCache(boolean loaderCache) {
            this.loaderCache = loaderCache;
            return (T) this;
        }

        /**
         * The URI of the properties file which is used for VelocityEngine
         * initialization. The option is a java.lang.String type.
         */
        public T propertiesFile(String propertiesFile) {
            this.propertiesFile = propertiesFile;
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

        public String getResourceUri() {
            return resourceUri;
        }

        public void setResourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
        }

        public Boolean getContentCache() {
            return contentCache;
        }

        public void setContentCache(Boolean contentCache) {
            this.contentCache = contentCache;
        }

        public String getEncoding() {
            return encoding;
        }

        public void setEncoding(String encoding) {
            this.encoding = encoding;
        }

        public Boolean getLoaderCache() {
            return loaderCache;
        }

        public void setLoaderCache(Boolean loaderCache) {
            this.loaderCache = loaderCache;
        }

        public String getPropertiesFile() {
            return propertiesFile;
        }

        public void setPropertiesFile(String propertiesFile) {
            this.propertiesFile = propertiesFile;
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

    public static class VelocityConsumer
            extends
                VelocityCommon<VelocityConsumer> {
    }

    public static class VelocityProducer
            extends
                VelocityCommon<VelocityProducer> {
    }
}