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
package org.apache.camel.processor;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.TestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.util.ProducerCache;

/**
 * @version $Revision: 1.1 $
 */
public class JoinRoutesTest extends TestSupport {
    protected CamelContext context = new DefaultCamelContext();
    protected Endpoint<Exchange> startEndpoint;
    protected MockEndpoint resultEndpoint;
    protected ProducerCache<Exchange> client = new ProducerCache<Exchange>();

    public void testMessagesThroughDifferentRoutes() throws Exception {
        resultEndpoint.expectedBodiesReceived("one", "two", "three");

        sendMessage("bar", "one");
        sendMessage("cheese", "two");
        sendMessage("somethingUndefined", "three");

        resultEndpoint.assertIsSatisfied();
    }

    protected void sendMessage(final Object headerValue, final Object body) throws Exception {
        client.send(startEndpoint, new Processor<Exchange>() {
            public void process(Exchange exchange) {
                // now lets fire in a message
                Message in = exchange.getIn();
                in.setBody(body);
                in.setHeader("foo", headerValue);
            }
        });
    }

    @Override
    protected void setUp() throws Exception {
        context.addRoutes(createRouteBuilder());

        startEndpoint = resolveMandatoryEndpoint(context, "queue:a");
        resultEndpoint = (MockEndpoint) resolveMandatoryEndpoint(context, "mock:result");

        context.start();
    }

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder<Exchange>() {
            public void configure() {
                from("queue:a").choice()
                        .when(header("foo").isEqualTo("bar")).to("queue:b")
                        .when(header("foo").isEqualTo("cheese")).to("queue:c")
                        .otherwise().to("queue:d");

                from("queue:b").to("mock:result");
                from("queue:c").to("mock:result");
                from("queue:d").to("mock:result");
            }
        };
    }

    @Override
    protected void tearDown() throws Exception {
        client.stop();
        context.stop();
    }
}
