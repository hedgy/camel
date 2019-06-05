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
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The zookeeper component allows interaction with a ZooKeeper cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class ZooKeeperEndpoint {


    public static class ZooKeeperCommon extends EndpointConfiguration {
        /**
         * The zookeeper server hosts (multiple servers can be separated by
         * comma). The option is a java.lang.String type.
         */
        private String serverUrls;
        /**
         * The node in the ZooKeeper server (aka znode). The option is a
         * java.lang.String type.
         */
        private String path;
        /**
         * Not in use. The option is a boolean type.
         */
        @Deprecated
        private boolean awaitExistence;
        /**
         * Whether the children of the node should be listed. The option is a
         * boolean type.
         */
        private boolean listChildren;
        /**
         * The time interval to wait on connection before timing out. The option
         * is a int type.
         */
        private int timeout;
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

        public String getServerUrls() {
            return serverUrls;
        }

        public void setServerUrls(String serverUrls) {
            this.serverUrls = serverUrls;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        @Deprecated
        public boolean getAwaitExistence() {
            return awaitExistence;
        }

        @Deprecated
        public void setAwaitExistence(boolean awaitExistence) {
            this.awaitExistence = awaitExistence;
        }

        public boolean getListChildren() {
            return listChildren;
        }

        public void setListChildren(boolean listChildren) {
            this.listChildren = listChildren;
        }

        public int getTimeout() {
            return timeout;
        }

        public void setTimeout(int timeout) {
            this.timeout = timeout;
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

    public static class ZooKeeperConsumer extends ZooKeeperCommon {
        /**
         * The time interval to backoff for after an error before retrying. The
         * option is a long type.
         */
        private long backoff;
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        private boolean bridgeErrorHandler;
        /**
         * Should changes to the znode be 'watched' and repeatedly processed.
         * The option is a boolean type.
         */
        private boolean repeat;
        /**
         * Upon the delete of a znode, should an empty message be send to the
         * consumer. The option is a boolean type.
         */
        private boolean sendEmptyMessageOnDelete;
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        private ExceptionHandler exceptionHandler;
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        private ExchangePattern exchangePattern;

        public long getBackoff() {
            return backoff;
        }

        public void setBackoff(long backoff) {
            this.backoff = backoff;
        }

        public boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public boolean getRepeat() {
            return repeat;
        }

        public void setRepeat(boolean repeat) {
            this.repeat = repeat;
        }

        public boolean getSendEmptyMessageOnDelete() {
            return sendEmptyMessageOnDelete;
        }

        public void setSendEmptyMessageOnDelete(boolean sendEmptyMessageOnDelete) {
            this.sendEmptyMessageOnDelete = sendEmptyMessageOnDelete;
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

    public static class ZooKeeperProducer extends ZooKeeperCommon {
        /**
         * Should the endpoint create the node if it does not currently exist.
         * The option is a boolean type.
         */
        private boolean create;
        /**
         * The create mode that should be used for the newly created node. The
         * option is a java.lang.String type.
         */
        private String createMode;

        public boolean getCreate() {
            return create;
        }

        public void setCreate(boolean create) {
            this.create = create;
        }

        public String getCreateMode() {
            return createMode;
        }

        public void setCreateMode(String createMode) {
            this.createMode = createMode;
        }
    }
}