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
package org.apache.camel.api.management.mbean;

import java.util.Map;

import org.apache.camel.api.management.ManagedAttribute;
import org.apache.camel.api.management.ManagedOperation;

public interface ManagedComponentMBean {

    @ManagedAttribute(description = "Component Name")
    String getComponentName();

    @ManagedAttribute(description = "Component State")
    String getState();

    @ManagedAttribute(description = "Camel ID")
    String getCamelId();

    @ManagedAttribute(description = "Camel ManagementName")
    String getCamelManagementName();

    @ManagedAttribute(description = "Whether this component provides component specific health checks")
    boolean isHealthCheckSupported();

    @ManagedAttribute(description = "Used for enabling or disabling all health checks from this component")
    boolean isHealthCheckEnabled();

    @ManagedAttribute(description = "Used for enabling or disabling all consumer based health checks from this component")
    boolean isHealthCheckConsumerEnabled();

    @ManagedAttribute(description = "Used for enabling or disabling all producer based health checks from this component")
    boolean isHealthCheckProducerEnabled();

    @ManagedAttribute(description = "Whether this component support verification (parameters or connectivity)")
    boolean isVerifySupported();

    @ManagedOperation(description = "Verify options against a given scope")
    ComponentVerifierExtension.Result verify(String scope, Map<String, String> options);
}
