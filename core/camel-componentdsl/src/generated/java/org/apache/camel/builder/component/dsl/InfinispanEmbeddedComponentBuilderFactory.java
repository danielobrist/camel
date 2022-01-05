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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedComponent;

/**
 * Read and write from/to Infinispan distributed key/value store and data grid.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface InfinispanEmbeddedComponentBuilderFactory {

    /**
     * Infinispan Embedded (camel-infinispan-embedded)
     * Read and write from/to Infinispan distributed key/value store and data
     * grid.
     * 
     * Category: cache,datagrid,clustering
     * Since: 2.13
     * Maven coordinates: org.apache.camel:camel-infinispan-embedded
     * 
     * @return the dsl builder
     */
    static InfinispanEmbeddedComponentBuilder infinispanEmbedded() {
        return new InfinispanEmbeddedComponentBuilderImpl();
    }

    /**
     * Builder for the Infinispan Embedded component.
     */
    interface InfinispanEmbeddedComponentBuilder
            extends
                ComponentBuilder<InfinispanEmbeddedComponent> {
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder configuration(
                org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Specifies the query builder.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.infinispan.InfinispanQueryBuilder&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param queryBuilder the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder queryBuilder(
                org.apache.camel.component.infinispan.InfinispanQueryBuilder queryBuilder) {
            doSetProperty("queryBuilder", queryBuilder);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If true, the listener will be installed for the entire cluster.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param clusteredListener the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder clusteredListener(
                boolean clusteredListener) {
            doSetProperty("clusteredListener", clusteredListener);
            return this;
        }
        /**
         * Returns the custom listener in use, if provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param customListener the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder customListener(
                org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener customListener) {
            doSetProperty("customListener", customListener);
            return this;
        }
        /**
         * Specifies the set of event types to register by the consumer.Multiple
         * event can be separated by comma. &lt;p/&gt; The possible event types
         * are: CACHE_ENTRY_ACTIVATED, CACHE_ENTRY_PASSIVATED,
         * CACHE_ENTRY_VISITED, CACHE_ENTRY_LOADED, CACHE_ENTRY_EVICTED,
         * CACHE_ENTRY_CREATED, CACHE_ENTRY_REMOVED, CACHE_ENTRY_MODIFIED,
         * TRANSACTION_COMPLETED, TRANSACTION_REGISTERED,
         * CACHE_ENTRY_INVALIDATED, CACHE_ENTRY_EXPIRED, DATA_REHASHED,
         * TOPOLOGY_CHANGED, PARTITION_STATUS_CHANGED,
         * PERSISTENCE_AVAILABILITY_CHANGED.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param eventTypes the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder eventTypes(
                java.lang.String eventTypes) {
            doSetProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * If true, the consumer will receive notifications synchronously.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param sync the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder sync(boolean sync) {
            doSetProperty("sync", sync);
            return this;
        }
        /**
         * Set a specific default value for some producer operations.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param defaultValue the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder defaultValue(
                java.lang.Object defaultValue) {
            doSetProperty("defaultValue", defaultValue);
            return this;
        }
        /**
         * Set a specific key for producer operations.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param key the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder key(java.lang.Object key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set a specific old value for some producer operations.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param oldValue the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder oldValue(
                java.lang.Object oldValue) {
            doSetProperty("oldValue", oldValue);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.infinispan.InfinispanOperation&lt;/code&gt; type.
         * 
         * Default: PUT
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder operation(
                org.apache.camel.component.infinispan.InfinispanOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set a specific value for producer operations.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param value the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder value(java.lang.Object value) {
            doSetProperty("value", value);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Specifies the cache Container to connect.
         * 
         * The option is a:
         * &lt;code&gt;org.infinispan.manager.EmbeddedCacheManager&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param cacheContainer the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder cacheContainer(
                org.infinispan.manager.EmbeddedCacheManager cacheContainer) {
            doSetProperty("cacheContainer", cacheContainer);
            return this;
        }
        /**
         * The CacheContainer configuration. Used if the cacheContainer is not
         * defined.
         * 
         * The option is a:
         * &lt;code&gt;org.infinispan.configuration.cache.Configuration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param cacheContainerConfiguration the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder cacheContainerConfiguration(
                org.infinispan.configuration.cache.Configuration cacheContainerConfiguration) {
            doSetProperty("cacheContainerConfiguration", cacheContainerConfiguration);
            return this;
        }
        /**
         * An implementation specific URI for the CacheManager.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param configurationUri the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder configurationUri(
                java.lang.String configurationUri) {
            doSetProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * A comma separated list of org.infinispan.context.Flag to be applied
         * by default on each cache invocation.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param flags the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder flags(java.lang.String flags) {
            doSetProperty("flags", flags);
            return this;
        }
        /**
         * Set a specific remappingFunction to use in a compute operation.
         * 
         * The option is a:
         * &lt;code&gt;java.util.function.BiFunction&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param remappingFunction the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder remappingFunction(
                java.util.function.BiFunction remappingFunction) {
            doSetProperty("remappingFunction", remappingFunction);
            return this;
        }
        /**
         * Store the operation result in a header instead of the message body.
         * By default, resultHeader == null and the query result is stored in
         * the message body, any existing content in the message body is
         * discarded. If resultHeader is set, the value is used as the name of
         * the header to store the query result and the original message body is
         * preserved. This value can be overridden by an in message header
         * named: CamelInfinispanOperationResultHeader.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resultHeader the value to set
         * @return the dsl builder
         */
        default InfinispanEmbeddedComponentBuilder resultHeader(
                java.lang.String resultHeader) {
            doSetProperty("resultHeader", resultHeader);
            return this;
        }
    }

    class InfinispanEmbeddedComponentBuilderImpl
            extends
                AbstractComponentBuilder<InfinispanEmbeddedComponent>
            implements
                InfinispanEmbeddedComponentBuilder {
        @Override
        protected InfinispanEmbeddedComponent buildConcreteComponent() {
            return new InfinispanEmbeddedComponent();
        }
        private org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration getOrCreateConfiguration(
                org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((InfinispanEmbeddedComponent) component).setConfiguration((org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration) value); return true;
            case "queryBuilder": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setQueryBuilder((org.apache.camel.component.infinispan.InfinispanQueryBuilder) value); return true;
            case "bridgeErrorHandler": ((InfinispanEmbeddedComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "clusteredListener": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setClusteredListener((boolean) value); return true;
            case "customListener": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setCustomListener((org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedCustomListener) value); return true;
            case "eventTypes": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setEventTypes((java.lang.String) value); return true;
            case "sync": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setSync((boolean) value); return true;
            case "defaultValue": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setDefaultValue((java.lang.Object) value); return true;
            case "key": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setKey((java.lang.Object) value); return true;
            case "lazyStartProducer": ((InfinispanEmbeddedComponent) component).setLazyStartProducer((boolean) value); return true;
            case "oldValue": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setOldValue((java.lang.Object) value); return true;
            case "operation": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setOperation((org.apache.camel.component.infinispan.InfinispanOperation) value); return true;
            case "value": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setValue((java.lang.Object) value); return true;
            case "autowiredEnabled": ((InfinispanEmbeddedComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "cacheContainer": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setCacheContainer((org.infinispan.manager.EmbeddedCacheManager) value); return true;
            case "cacheContainerConfiguration": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setCacheContainerConfiguration((org.infinispan.configuration.cache.Configuration) value); return true;
            case "configurationUri": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setConfigurationUri((java.lang.String) value); return true;
            case "flags": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setFlags((java.lang.String) value); return true;
            case "remappingFunction": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setRemappingFunction((java.util.function.BiFunction) value); return true;
            case "resultHeader": getOrCreateConfiguration((InfinispanEmbeddedComponent) component).setResultHeader((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}