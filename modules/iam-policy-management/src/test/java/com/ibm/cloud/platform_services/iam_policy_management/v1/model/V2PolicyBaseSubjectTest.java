/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyBaseSubject;
import com.ibm.cloud.platform_services.iam_policy_management.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the V2PolicyBaseSubject model.
 */
public class V2PolicyBaseSubjectTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testV2PolicyBaseSubject() throws Throwable {
    V2PolicyAttribute v2PolicyAttributeModel = new V2PolicyAttribute.Builder()
      .key("testString")
      .operator("testString")
      .value("testString")
      .build();
    assertEquals(v2PolicyAttributeModel.key(), "testString");
    assertEquals(v2PolicyAttributeModel.operator(), "testString");
    assertEquals(v2PolicyAttributeModel.value(), "testString");

    V2PolicyBaseSubject v2PolicyBaseSubjectModel = new V2PolicyBaseSubject.Builder()
      .attributes(java.util.Arrays.asList(v2PolicyAttributeModel))
      .build();
    assertEquals(v2PolicyBaseSubjectModel.attributes(), java.util.Arrays.asList(v2PolicyAttributeModel));

    String json = TestUtilities.serialize(v2PolicyBaseSubjectModel);

    V2PolicyBaseSubject v2PolicyBaseSubjectModelNew = TestUtilities.deserialize(json, V2PolicyBaseSubject.class);
    assertTrue(v2PolicyBaseSubjectModelNew instanceof V2PolicyBaseSubject);
  }
}