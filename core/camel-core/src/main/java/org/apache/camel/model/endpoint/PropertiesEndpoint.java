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

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The properties component is used for using property placeholders in endpoint
 * uris.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class PropertiesEndpoint {


    public static class PropertiesCommon<T extends EndpointConfiguration>
            extends
                EndpointConfiguration<T> {
        private String key;
        private Boolean ignoreMissingLocation;
        private List<Object> locations;
        private Boolean basicPropertyBinding;
        private Boolean synchronous;

        /**
         * Property key to use as placeholder. The option is a java.lang.String
         * type.
         */
        public T key(String key) {
            this.key = key;
            return (T) this;
        }

        /**
         * Whether to silently ignore if a location cannot be located, such as a
         * properties file not found. The option is a boolean type.
         */
        public T ignoreMissingLocation(boolean ignoreMissingLocation) {
            this.ignoreMissingLocation = ignoreMissingLocation;
            return (T) this;
        }

        /**
         * A list of locations to load properties. You can use comma to separate
         * multiple locations. This option will override any default locations
         * and only use the locations from this option. The option is a
         * java.lang.String type.
         */
        public T locations(List<Object> locations) {
            this.locations = locations;
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

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Boolean getIgnoreMissingLocation() {
            return ignoreMissingLocation;
        }

        public void setIgnoreMissingLocation(Boolean ignoreMissingLocation) {
            this.ignoreMissingLocation = ignoreMissingLocation;
        }

        public List<Object> getLocations() {
            return locations;
        }

        public void setLocations(List<Object> locations) {
            this.locations = locations;
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

    public static class PropertiesConsumer
            extends
                PropertiesCommon<PropertiesConsumer> {
        private Boolean bridgeErrorHandler;
        private ExceptionHandler exceptionHandler;
        private ExchangePattern exchangePattern;

        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public PropertiesConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
            return (PropertiesConsumer) this;
        }

        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public PropertiesConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
            return (PropertiesConsumer) this;
        }

        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public PropertiesConsumer exchangePattern(
                ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
            return (PropertiesConsumer) this;
        }

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public ExceptionHandler getExceptionHandler() {
            return exceptionHandler;
        }

        public void setExceptionHandler(ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
        }

        public ExchangePattern getExchangePattern() {
            return exchangePattern;
        }

        public void setExchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
        }
    }

    public static class PropertiesProducer
            extends
                PropertiesCommon<PropertiesProducer> {
    }
}