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

package com.ibm.cloud.platform_services.global_catalog.v1.model;

import com.ibm.cloud.platform_services.global_catalog.v1.model.Image;
import com.ibm.cloud.platform_services.global_catalog.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Image model.
 */
public class ImageTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImage() throws Throwable {
    Image imageModel = new Image.Builder()
      .image("testString")
      .smallImage("testString")
      .mediumImage("testString")
      .featureImage("testString")
      .build();
    assertEquals(imageModel.image(), "testString");
    assertEquals(imageModel.smallImage(), "testString");
    assertEquals(imageModel.mediumImage(), "testString");
    assertEquals(imageModel.featureImage(), "testString");

    String json = TestUtilities.serialize(imageModel);

    Image imageModelNew = TestUtilities.deserialize(json, Image.class);
    assertTrue(imageModelNew instanceof Image);
    assertEquals(imageModelNew.image(), "testString");
    assertEquals(imageModelNew.smallImage(), "testString");
    assertEquals(imageModelNew.mediumImage(), "testString");
    assertEquals(imageModelNew.featureImage(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImageError() throws Throwable {
    new Image.Builder().build();
  }

}