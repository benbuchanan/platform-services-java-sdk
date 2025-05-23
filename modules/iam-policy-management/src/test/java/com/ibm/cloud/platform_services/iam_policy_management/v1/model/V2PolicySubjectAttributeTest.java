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

import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicySubjectAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the V2PolicySubjectAttribute model.
 */
public class V2PolicySubjectAttributeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testV2PolicySubjectAttribute() throws Throwable {
    V2PolicySubjectAttribute v2PolicySubjectAttributeModel = new V2PolicySubjectAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();
    assertEquals(v2PolicySubjectAttributeModel.key(), "testString");
    assertEquals(v2PolicySubjectAttributeModel.operator(), "stringEquals");
    assertEquals(v2PolicySubjectAttributeModel.value(), "testString");

    String json = TestUtilities.serialize(v2PolicySubjectAttributeModel);

    V2PolicySubjectAttribute v2PolicySubjectAttributeModelNew = TestUtilities.deserialize(json, V2PolicySubjectAttribute.class);
    assertTrue(v2PolicySubjectAttributeModelNew instanceof V2PolicySubjectAttribute);
    assertEquals(v2PolicySubjectAttributeModelNew.key(), "testString");
    assertEquals(v2PolicySubjectAttributeModelNew.operator(), "stringEquals");
    assertEquals(v2PolicySubjectAttributeModelNew.value(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testV2PolicySubjectAttributeError() throws Throwable {
    new V2PolicySubjectAttribute.Builder().build();
  }

}