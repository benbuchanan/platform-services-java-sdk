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

import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetPolicyAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetPolicyAssignmentOptions model.
 */
public class GetPolicyAssignmentOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetPolicyAssignmentOptions() throws Throwable {
    GetPolicyAssignmentOptions getPolicyAssignmentOptionsModel = new GetPolicyAssignmentOptions.Builder()
      .assignmentId("testString")
      .version("1.0")
      .build();
    assertEquals(getPolicyAssignmentOptionsModel.assignmentId(), "testString");
    assertEquals(getPolicyAssignmentOptionsModel.version(), "1.0");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPolicyAssignmentOptionsError() throws Throwable {
    new GetPolicyAssignmentOptions.Builder().build();
  }

}