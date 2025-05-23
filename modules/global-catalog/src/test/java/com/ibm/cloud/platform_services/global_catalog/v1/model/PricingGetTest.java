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
import com.ibm.cloud.platform_services.global_catalog.v1.model.PricingGet;
import com.ibm.cloud.platform_services.global_catalog.v1.model.StartingPrice;
import com.ibm.cloud.platform_services.global_catalog.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PricingGet model.
 */
public class PricingGetTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPricingGet() throws Throwable {
    PricingGet pricingGetModel = new PricingGet();
    assertNull(pricingGetModel.getDeploymentId());
    assertNull(pricingGetModel.getDeploymentLocation());
    assertNull(pricingGetModel.getDeploymentRegion());
    assertNull(pricingGetModel.isDeploymentLocationNoPriceAvailable());
    assertNull(pricingGetModel.getType());
    assertNull(pricingGetModel.getOrigin());
    assertNull(pricingGetModel.getStartingPrice());
    assertNull(pricingGetModel.getMetrics());
    assertNull(pricingGetModel.getDeploymentRegions());
    assertNull(pricingGetModel.getEffectiveFrom());
    assertNull(pricingGetModel.getEffectiveUntil());
    assertNull(pricingGetModel.isRequireLogin());
    assertNull(pricingGetModel.getPricingCatalogUrl());
    assertNull(pricingGetModel.getSalesAvenue());
  }
}