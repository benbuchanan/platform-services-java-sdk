/*
 * (C) Copyright IBM Corp. 2025.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.platform_services.iam_policy_management.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of conflicting resource.
 */
public class ConflictsWith extends GenericModel {

  protected String etag;
  protected String role;
  protected String policy;

  protected ConflictsWith() { }

  /**
   * Gets the etag.
   *
   * The revision number of the resource.
   *
   * @return the etag
   */
  public String getEtag() {
    return etag;
  }

  /**
   * Gets the role.
   *
   * The conflicting role of ID.
   *
   * @return the role
   */
  public String getRole() {
    return role;
  }

  /**
   * Gets the policy.
   *
   * The conflicting policy ID.
   *
   * @return the policy
   */
  public String getPolicy() {
    return policy;
  }
}

