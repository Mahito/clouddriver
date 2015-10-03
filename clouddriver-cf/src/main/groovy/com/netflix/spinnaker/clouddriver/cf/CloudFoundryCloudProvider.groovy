/*
 * Copyright 2015 The original authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.clouddriver.cf

import com.netflix.spinnaker.clouddriver.core.CloudProvider
import org.springframework.stereotype.Component

import java.lang.annotation.Annotation

/**
 * Cloud Foundry declaration as a {@link CloudProvider}
 *
 * @author Greg Turnquist
 */
@Component
class CloudFoundryCloudProvider implements CloudProvider {
	final String id = "cf"
	final String displayName = "Cloud Foundry"
	final Class<Annotation> operationAnnotationType = CloudFoundryOperation.class
}