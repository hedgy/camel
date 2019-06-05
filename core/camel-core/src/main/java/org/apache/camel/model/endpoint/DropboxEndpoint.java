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
 * For uploading, downloading and managing files, folders, groups,
 * collaborations, etc on dropbox DOT com.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class DropboxEndpoint {


    public static class DropboxCommon extends EndpointConfiguration {
        /**
         * The specific action (typically is a CRUD action) to perform on
         * Dropbox remote folder. The option is a
         * org.apache.camel.component.dropbox.util.DropboxOperation type.
         */
        private DropboxOperation operation;
        /**
         * The access token to make API requests for a specific Dropbox user.
         * The option is a java.lang.String type.
         */
        private String accessToken;
        /**
         * To use an existing DbxClient instance as DropBox client. The option
         * is a com.dropbox.core.v2.DbxClientV2 type.
         */
        private Object client;
        /**
         * Name of the app registered to make API requests. The option is a
         * java.lang.String type.
         */
        private String clientIdentifier;
        /**
         * Optional folder or file to upload on Dropbox from the local
         * filesystem. If this option has not been configured then the message
         * body is used as the content to upload. The option is a
         * java.lang.String type.
         */
        private String localPath;
        /**
         * Destination file or folder. The option is a java.lang.String type.
         */
        private String newRemotePath;
        /**
         * A space-separated list of sub-strings to search for. A file matches
         * only if it contains all the sub-strings. If this option is not set,
         * all files will be matched. The option is a java.lang.String type.
         */
        private String query;
        /**
         * Original file or folder to move. The option is a java.lang.String
         * type.
         */
        private String remotePath;
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten. The option is a
         * org.apache.camel.component.dropbox.util.DropboxUploadMode type.
         */
        private DropboxUploadMode uploadMode;
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

        public DropboxOperation getOperation() {
            return operation;
        }

        public void setOperation(DropboxOperation operation) {
            this.operation = operation;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public Object getClient() {
            return client;
        }

        public void setClient(Object client) {
            this.client = client;
        }

        public String getClientIdentifier() {
            return clientIdentifier;
        }

        public void setClientIdentifier(String clientIdentifier) {
            this.clientIdentifier = clientIdentifier;
        }

        public String getLocalPath() {
            return localPath;
        }

        public void setLocalPath(String localPath) {
            this.localPath = localPath;
        }

        public String getNewRemotePath() {
            return newRemotePath;
        }

        public void setNewRemotePath(String newRemotePath) {
            this.newRemotePath = newRemotePath;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getRemotePath() {
            return remotePath;
        }

        public void setRemotePath(String remotePath) {
            this.remotePath = remotePath;
        }

        public DropboxUploadMode getUploadMode() {
            return uploadMode;
        }

        public void setUploadMode(DropboxUploadMode uploadMode) {
            this.uploadMode = uploadMode;
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

    public static class DropboxConsumer extends DropboxCommon {
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

        public boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(boolean bridgeErrorHandler) {
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

    public static class DropboxProducer extends DropboxCommon {
    }

    public static enum DropboxOperation {
        put, del, search, get, move;
    }

    public static enum DropboxUploadMode {
        add, force;
    }
}