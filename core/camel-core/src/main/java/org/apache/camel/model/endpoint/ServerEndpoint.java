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

import java.util.TimeZone;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * IEC 60870 component used for telecontrol (supervisory control and data
 * acquisition) such as controlling electric power transmission grids and other
 * geographically widespread control systems.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class ServerEndpoint {


    public static class ServerCommon extends EndpointConfiguration {
        /**
         * The object information address. The option is a
         * org.apache.camel.component.iec60870.ObjectAddress type.
         */
        private Object uriPath;
        /**
         * Data module options. The option is a DataModuleOptions type.
         */
        private Object dataModuleOptions;
        /**
         * Filter out all requests which don't have the execute bit set. The
         * option is a boolean type.
         */
        private boolean filterNonExecute;
        /**
         * Protocol options. The option is a ProtocolOptions type.
         */
        private Object protocolOptions;
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
        /**
         * Parameter W - Acknowledgment window. The option is a short type.
         */
        private short acknowledgeWindow;
        /**
         * The common ASDU address size. May be either SIZE_1 or SIZE_2. The
         * option is a org.eclipse.neoscada.protocol.iec60870.ASDUAddressType
         * type.
         */
        private ASDUAddressType adsuAddressType;
        /**
         * The cause of transmission type. May be either SIZE_1 or SIZE_2. The
         * option is a
         * org.eclipse.neoscada.protocol.iec60870.CauseOfTransmissionType type.
         */
        private CauseOfTransmissionType causeOfTransmissionType;
        /**
         * The information address size. May be either SIZE_1, SIZE_2 or SIZE_3.
         * The option is a
         * org.eclipse.neoscada.protocol.iec60870.InformationObjectAddressType
         * type.
         */
        private InformationObjectAddressType informationObjectAddressType;
        /**
         * Parameter K - Maximum number of un-acknowledged messages. The option
         * is a short type.
         */
        private short maxUnacknowledged;
        /**
         * Timeout T1 in milliseconds. The option is a int type.
         */
        private int timeout1;
        /**
         * Timeout T2 in milliseconds. The option is a int type.
         */
        private int timeout2;
        /**
         * Timeout T3 in milliseconds. The option is a int type.
         */
        private int timeout3;
        /**
         * Whether to include the source address. The option is a boolean type.
         */
        private boolean causeSourceAddress;
        /**
         * Whether background scan transmissions should be ignored. The option
         * is a boolean type.
         */
        private boolean ignoreBackgroundScan;
        /**
         * Whether to ignore or respect DST. The option is a boolean type.
         */
        private boolean ignoreDaylightSavingTime;
        /**
         * The timezone to use. May be any Java time zone string. The option is
         * a java.util.TimeZone type.
         */
        private TimeZone timeZone;
        /**
         * An identifier grouping connection instances. The option is a
         * java.lang.String type.
         */
        private String connectionId;

        public Object getUriPath() {
            return uriPath;
        }

        public void setUriPath(Object uriPath) {
            this.uriPath = uriPath;
        }

        public Object getDataModuleOptions() {
            return dataModuleOptions;
        }

        public void setDataModuleOptions(Object dataModuleOptions) {
            this.dataModuleOptions = dataModuleOptions;
        }

        public boolean getFilterNonExecute() {
            return filterNonExecute;
        }

        public void setFilterNonExecute(boolean filterNonExecute) {
            this.filterNonExecute = filterNonExecute;
        }

        public Object getProtocolOptions() {
            return protocolOptions;
        }

        public void setProtocolOptions(Object protocolOptions) {
            this.protocolOptions = protocolOptions;
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

        public short getAcknowledgeWindow() {
            return acknowledgeWindow;
        }

        public void setAcknowledgeWindow(short acknowledgeWindow) {
            this.acknowledgeWindow = acknowledgeWindow;
        }

        public ASDUAddressType getAdsuAddressType() {
            return adsuAddressType;
        }

        public void setAdsuAddressType(ASDUAddressType adsuAddressType) {
            this.adsuAddressType = adsuAddressType;
        }

        public CauseOfTransmissionType getCauseOfTransmissionType() {
            return causeOfTransmissionType;
        }

        public void setCauseOfTransmissionType(
                CauseOfTransmissionType causeOfTransmissionType) {
            this.causeOfTransmissionType = causeOfTransmissionType;
        }

        public InformationObjectAddressType getInformationObjectAddressType() {
            return informationObjectAddressType;
        }

        public void setInformationObjectAddressType(
                InformationObjectAddressType informationObjectAddressType) {
            this.informationObjectAddressType = informationObjectAddressType;
        }

        public short getMaxUnacknowledged() {
            return maxUnacknowledged;
        }

        public void setMaxUnacknowledged(short maxUnacknowledged) {
            this.maxUnacknowledged = maxUnacknowledged;
        }

        public int getTimeout1() {
            return timeout1;
        }

        public void setTimeout1(int timeout1) {
            this.timeout1 = timeout1;
        }

        public int getTimeout2() {
            return timeout2;
        }

        public void setTimeout2(int timeout2) {
            this.timeout2 = timeout2;
        }

        public int getTimeout3() {
            return timeout3;
        }

        public void setTimeout3(int timeout3) {
            this.timeout3 = timeout3;
        }

        public boolean getCauseSourceAddress() {
            return causeSourceAddress;
        }

        public void setCauseSourceAddress(boolean causeSourceAddress) {
            this.causeSourceAddress = causeSourceAddress;
        }

        public boolean getIgnoreBackgroundScan() {
            return ignoreBackgroundScan;
        }

        public void setIgnoreBackgroundScan(boolean ignoreBackgroundScan) {
            this.ignoreBackgroundScan = ignoreBackgroundScan;
        }

        public boolean getIgnoreDaylightSavingTime() {
            return ignoreDaylightSavingTime;
        }

        public void setIgnoreDaylightSavingTime(boolean ignoreDaylightSavingTime) {
            this.ignoreDaylightSavingTime = ignoreDaylightSavingTime;
        }

        public TimeZone getTimeZone() {
            return timeZone;
        }

        public void setTimeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
        }

        public String getConnectionId() {
            return connectionId;
        }

        public void setConnectionId(String connectionId) {
            this.connectionId = connectionId;
        }
    }

    public static class ServerConsumer extends ServerCommon {
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

    public static class ServerProducer extends ServerCommon {
    }

    public static enum ASDUAddressType {
        SIZE_1,  SIZE_2;
    }

    public static enum CauseOfTransmissionType {
        SIZE_1,  SIZE_2;
    }

    public static enum InformationObjectAddressType {
        SIZE_1,  SIZE_2,  SIZE_3;
    }
}