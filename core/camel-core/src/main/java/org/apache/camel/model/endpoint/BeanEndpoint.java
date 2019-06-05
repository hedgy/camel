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

import java.util.Map;
import javax.annotation.Generated;

/**
 * The bean component is for invoking Java beans from Camel.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class BeanEndpoint {


    public static class BeanCommon extends EndpointConfiguration {
        /**
         * Sets the name of the bean to invoke. The option is a java.lang.String
         * type.
         */
        private String beanName;
        /**
         * Sets the name of the method to invoke on the bean. The option is a
         * java.lang.String type.
         */
        private String method;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private boolean basicPropertyBinding;
        /**
         * If enabled, Camel will cache the result of the first Registry
         * look-up. Cache can be enabled if the bean in the Registry is defined
         * as a singleton scope. The option is a java.lang.Boolean type.
         */
        private Boolean cache;
        /**
         * Used for configuring additional properties on the bean. The option is
         * a java.util.Map<java.lang.String,java.lang.Object> type.
         */
        private Map<String, Object> parameters;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private boolean synchronous;

        public String getBeanName() {
            return beanName;
        }

        public void setBeanName(String beanName) {
            this.beanName = beanName;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Boolean getCache() {
            return cache;
        }

        public void setCache(Boolean cache) {
            this.cache = cache;
        }

        public Map<String, Object> getParameters() {
            return parameters;
        }

        public void setParameters(Map<String, Object> parameters) {
            this.parameters = parameters;
        }

        public boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(boolean synchronous) {
            this.synchronous = synchronous;
        }
    }

    public static class BeanConsumer extends BeanCommon {
    }

    public static class BeanProducer extends BeanCommon {
    }
}