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

package com.ibm.cloud.platform_services.iam_identity.v1.model;

import com.ibm.cloud.platform_services.iam_identity.v1.model.ListAccountSettingsTemplatesOptions;
import com.ibm.cloud.platform_services.iam_identity.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListAccountSettingsTemplatesOptions model.
 */
public class ListAccountSettingsTemplatesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListAccountSettingsTemplatesOptions() throws Throwable {
    ListAccountSettingsTemplatesOptions listAccountSettingsTemplatesOptionsModel = new ListAccountSettingsTemplatesOptions.Builder()
      .accountId("testString")
      .limit("20")
      .pagetoken("testString")
      .sort("created_at")
      .order("asc")
      .includeHistory("false")
      .build();
    assertEquals(listAccountSettingsTemplatesOptionsModel.accountId(), "testString");
    assertEquals(listAccountSettingsTemplatesOptionsModel.limit(), "20");
    assertEquals(listAccountSettingsTemplatesOptionsModel.pagetoken(), "testString");
    assertEquals(listAccountSettingsTemplatesOptionsModel.sort(), "created_at");
    assertEquals(listAccountSettingsTemplatesOptionsModel.order(), "asc");
    assertEquals(listAccountSettingsTemplatesOptionsModel.includeHistory(), "false");
  }
}