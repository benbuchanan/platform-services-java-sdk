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

import com.ibm.cloud.platform_services.global_catalog.v1.model.Amount;
import com.ibm.cloud.platform_services.global_catalog.v1.model.Metrics;
import com.ibm.cloud.platform_services.global_catalog.v1.model.Price;
import com.ibm.cloud.platform_services.global_catalog.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Metrics model.
 */
public class MetricsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMetrics() throws Throwable {
    Metrics metricsModel = new Metrics();
    assertNull(metricsModel.getPartRef());
    assertNull(metricsModel.getMetricId());
    assertNull(metricsModel.getTierModel());
    assertNull(metricsModel.getChargeUnit());
    assertNull(metricsModel.getChargeUnitName());
    assertNull(metricsModel.getChargeUnitQuantity());
    assertNull(metricsModel.getResourceDisplayName());
    assertNull(metricsModel.getChargeUnitDisplayName());
    assertNull(metricsModel.getUsageCapQty());
    assertNull(metricsModel.getDisplayCap());
    assertNull(metricsModel.getEffectiveFrom());
    assertNull(metricsModel.getEffectiveUntil());
    assertNull(metricsModel.getAmounts());
    assertNull(metricsModel.getAdditionalProperties());
  }
}