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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The action control assignment resources and target where the template is assigned.
 */
public class ActionControlAssignmentResource extends GenericModel {

  protected AssignmentTargetDetails target;
  @SerializedName("action_control")
  protected ActionControlAssignmentResourceActionControl actionControl;

  protected ActionControlAssignmentResource() { }

  /**
   * Gets the target.
   *
   * assignment target account and type.
   *
   * @return the target
   */
  public AssignmentTargetDetails getTarget() {
    return target;
  }

  /**
   * Gets the actionControl.
   *
   * Set of properties of the assigned resource or error message if assignment failed.
   *
   * @return the actionControl
   */
  public ActionControlAssignmentResourceActionControl getActionControl() {
    return actionControl;
  }
}

