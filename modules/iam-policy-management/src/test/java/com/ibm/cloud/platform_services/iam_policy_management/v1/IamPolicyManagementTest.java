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

package com.ibm.cloud.platform_services.iam_policy_management.v1;

import com.ibm.cloud.platform_services.iam_policy_management.v1.IamPolicyManagement;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.AccountSettingsAccessManagement;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignment;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignmentCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignmentResource;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignmentResourceActionControl;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignmentResourceCreated;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignmentTemplate;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignmentsPager;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplate;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplateCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplateVersionsCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplateVersionsPager;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplatesPager;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.AssignmentResourceCreated;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.AssignmentTargetDetails;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.AssignmentTemplateDetails;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CommitActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CommitPolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ConflictsWith;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Control;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ControlResponse;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ControlResponseControl;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ControlResponseControlWithEnrichedRoles;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreateActionControlTemplateAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreateActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreateActionControlTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreatePolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreatePolicyTemplateAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreatePolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreatePolicyTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreateRoleOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreateV2PolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CustomRole;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeleteActionControlAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeleteActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeleteActionControlTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeletePolicyAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeletePolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeletePolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeletePolicyTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeleteRoleOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeleteV2PolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.EnrichedRoles;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ErrorDetails;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ErrorObject;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ErrorResponse;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ExternalAccountIdentityInteraction;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ExternalAccountIdentityInteractionPatch;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.First;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetActionControlAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetActionControlTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetPolicyAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetPolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetPolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetPolicyTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetRoleOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetSettingsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetV2PolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Grant;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GrantWithEnrichedRoles;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.IdentityTypes;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.IdentityTypesBase;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.IdentityTypesPatch;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.LimitData;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListActionControlAssignmentsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListActionControlTemplateVersionsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListActionControlTemplatesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPoliciesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPolicyAssignmentsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPolicyTemplateVersionsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPolicyTemplatesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListRolesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListV2PoliciesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.NestedCondition;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.NestedConditionRuleAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.NestedConditionRuleWithConditions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Next;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PoliciesPager;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Policy;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentResourcePolicy;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentResources;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentV1;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentV1Collection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentV1Resources;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentV1Subject;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentsPager;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyResource;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyRole;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicySubject;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplate;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateAssignmentCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateAssignmentItems;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateAssignmentItemsPolicyAssignment;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateAssignmentItemsPolicyAssignmentV1;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateLimitData;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateMetaData;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateVersionsCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateVersionsPager;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplatesPager;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Previous;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplaceActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplacePolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplacePolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplaceRoleOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplaceV2PolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ResourceAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ResourceTag;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Role;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.RoleAction;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.RoleCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Roles;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.RuleAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.SubjectAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.TemplateActionControl;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.TemplateCountData;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.TemplateMetadata;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.TemplatePolicy;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdateActionControlAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdatePolicyAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdatePolicyStateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdateSettingsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PoliciesPager;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2Policy;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyResource;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyResourceAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyResourceTag;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyRule;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyRuleRuleAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyRuleRuleWithNestedConditions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicySubject;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicySubjectAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyTemplateMetaData;
import com.ibm.cloud.platform_services.iam_policy_management.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IamPolicyManagement service.
 */
public class IamPolicyManagementTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected IamPolicyManagement iamPolicyManagementService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new IamPolicyManagement(serviceName, null);
  }

  // Test the listPolicies operation with a valid options model parameter
  @Test
  public void testListPoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 1, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"previous\": {\"href\": \"href\", \"start\": \"start\"}, \"policies\": [{\"id\": \"id\", \"type\": \"type\", \"description\": \"description\", \"subjects\": [{\"attributes\": [{\"name\": \"name\", \"value\": \"value\"}]}], \"roles\": [{\"role_id\": \"roleId\", \"display_name\": \"displayName\", \"description\": \"description\"}], \"resources\": [{\"attributes\": [{\"name\": \"name\", \"value\": \"value\", \"operator\": \"operator\"}], \"tags\": [{\"name\": \"name\", \"value\": \"value\", \"operator\": \"operator\"}]}], \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"state\": \"active\", \"template\": {\"id\": \"id\", \"version\": \"version\", \"assignment_id\": \"assignmentId\", \"root_id\": \"rootId\", \"root_version\": \"rootVersion\"}}]}";
    String listPoliciesPath = "/v1/policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPoliciesOptions model
    ListPoliciesOptions listPoliciesOptionsModel = new ListPoliciesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .iamId("testString")
      .accessGroupId("testString")
      .type("access")
      .serviceType("service")
      .tagName("testString")
      .tagValue("testString")
      .sort("id")
      .format("include_last_permit")
      .state("active")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listPolicies() with a valid options model and verify the result
    Response<PolicyCollection> response = iamPolicyManagementService.listPolicies(listPoliciesOptionsModel).execute();
    assertNotNull(response);
    PolicyCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPoliciesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("account_id"), "testString");
    assertEquals(query.get("iam_id"), "testString");
    assertEquals(query.get("access_group_id"), "testString");
    assertEquals(query.get("type"), "access");
    assertEquals(query.get("service_type"), "service");
    assertEquals(query.get("tag_name"), "testString");
    assertEquals(query.get("tag_value"), "testString");
    assertEquals(query.get("sort"), "id");
    assertEquals(query.get("format"), "include_last_permit");
    assertEquals(query.get("state"), "active");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listPolicies operation with and without retries enabled
  @Test
  public void testListPoliciesWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testListPoliciesWOptions();

    iamPolicyManagementService.disableRetries();
    testListPoliciesWOptions();
  }

  // Test the listPolicies operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPoliciesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.listPolicies(null).execute();
  }

  // Test the listPolicies operation using the PoliciesPager.getNext() method
  @Test
  public void testListPoliciesWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"policies\":[{\"id\":\"id\",\"type\":\"type\",\"description\":\"description\",\"subjects\":[{\"attributes\":[{\"name\":\"name\",\"value\":\"value\"}]}],\"roles\":[{\"role_id\":\"roleId\",\"display_name\":\"displayName\",\"description\":\"description\"}],\"resources\":[{\"attributes\":[{\"name\":\"name\",\"value\":\"value\",\"operator\":\"operator\"}],\"tags\":[{\"name\":\"name\",\"value\":\"value\",\"operator\":\"operator\"}]}],\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"state\":\"active\",\"template\":{\"id\":\"id\",\"version\":\"version\",\"assignment_id\":\"assignmentId\",\"root_id\":\"rootId\",\"root_version\":\"rootVersion\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"policies\":[{\"id\":\"id\",\"type\":\"type\",\"description\":\"description\",\"subjects\":[{\"attributes\":[{\"name\":\"name\",\"value\":\"value\"}]}],\"roles\":[{\"role_id\":\"roleId\",\"display_name\":\"displayName\",\"description\":\"description\"}],\"resources\":[{\"attributes\":[{\"name\":\"name\",\"value\":\"value\",\"operator\":\"operator\"}],\"tags\":[{\"name\":\"name\",\"value\":\"value\",\"operator\":\"operator\"}]}],\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"state\":\"active\",\"template\":{\"id\":\"id\",\"version\":\"version\",\"assignment_id\":\"assignmentId\",\"root_id\":\"rootId\",\"root_version\":\"rootVersion\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListPoliciesOptions listPoliciesOptions = new ListPoliciesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .iamId("testString")
      .accessGroupId("testString")
      .type("access")
      .serviceType("service")
      .tagName("testString")
      .tagValue("testString")
      .sort("id")
      .format("include_last_permit")
      .state("active")
      .limit(Long.valueOf("10"))
      .build();

    List<PolicyTemplateMetaData> allResults = new ArrayList<>();
    PoliciesPager pager = new PoliciesPager(iamPolicyManagementService, listPoliciesOptions);
    while (pager.hasNext()) {
      List<PolicyTemplateMetaData> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listPolicies operation using the PoliciesPager.getAll() method
  @Test
  public void testListPoliciesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"policies\":[{\"id\":\"id\",\"type\":\"type\",\"description\":\"description\",\"subjects\":[{\"attributes\":[{\"name\":\"name\",\"value\":\"value\"}]}],\"roles\":[{\"role_id\":\"roleId\",\"display_name\":\"displayName\",\"description\":\"description\"}],\"resources\":[{\"attributes\":[{\"name\":\"name\",\"value\":\"value\",\"operator\":\"operator\"}],\"tags\":[{\"name\":\"name\",\"value\":\"value\",\"operator\":\"operator\"}]}],\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"state\":\"active\",\"template\":{\"id\":\"id\",\"version\":\"version\",\"assignment_id\":\"assignmentId\",\"root_id\":\"rootId\",\"root_version\":\"rootVersion\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"policies\":[{\"id\":\"id\",\"type\":\"type\",\"description\":\"description\",\"subjects\":[{\"attributes\":[{\"name\":\"name\",\"value\":\"value\"}]}],\"roles\":[{\"role_id\":\"roleId\",\"display_name\":\"displayName\",\"description\":\"description\"}],\"resources\":[{\"attributes\":[{\"name\":\"name\",\"value\":\"value\",\"operator\":\"operator\"}],\"tags\":[{\"name\":\"name\",\"value\":\"value\",\"operator\":\"operator\"}]}],\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"state\":\"active\",\"template\":{\"id\":\"id\",\"version\":\"version\",\"assignment_id\":\"assignmentId\",\"root_id\":\"rootId\",\"root_version\":\"rootVersion\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListPoliciesOptions listPoliciesOptions = new ListPoliciesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .iamId("testString")
      .accessGroupId("testString")
      .type("access")
      .serviceType("service")
      .tagName("testString")
      .tagValue("testString")
      .sort("id")
      .format("include_last_permit")
      .state("active")
      .limit(Long.valueOf("10"))
      .build();

    PoliciesPager pager = new PoliciesPager(iamPolicyManagementService, listPoliciesOptions);
    List<PolicyTemplateMetaData> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createPolicy operation with a valid options model parameter
  @Test
  public void testCreatePolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"type\": \"type\", \"description\": \"description\", \"subjects\": [{\"attributes\": [{\"name\": \"name\", \"value\": \"value\"}]}], \"roles\": [{\"role_id\": \"roleId\", \"display_name\": \"displayName\", \"description\": \"description\"}], \"resources\": [{\"attributes\": [{\"name\": \"name\", \"value\": \"value\", \"operator\": \"operator\"}], \"tags\": [{\"name\": \"name\", \"value\": \"value\", \"operator\": \"operator\"}]}], \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"state\": \"active\"}";
    String createPolicyPath = "/v1/policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SubjectAttribute model
    SubjectAttribute subjectAttributeModel = new SubjectAttribute.Builder()
      .name("testString")
      .value("testString")
      .build();

    // Construct an instance of the PolicySubject model
    PolicySubject policySubjectModel = new PolicySubject.Builder()
      .attributes(java.util.Arrays.asList(subjectAttributeModel))
      .build();

    // Construct an instance of the PolicyRole model
    PolicyRole policyRoleModel = new PolicyRole.Builder()
      .roleId("testString")
      .build();

    // Construct an instance of the ResourceAttribute model
    ResourceAttribute resourceAttributeModel = new ResourceAttribute.Builder()
      .name("testString")
      .value("testString")
      .operator("testString")
      .build();

    // Construct an instance of the ResourceTag model
    ResourceTag resourceTagModel = new ResourceTag.Builder()
      .name("testString")
      .value("testString")
      .operator("testString")
      .build();

    // Construct an instance of the PolicyResource model
    PolicyResource policyResourceModel = new PolicyResource.Builder()
      .attributes(java.util.Arrays.asList(resourceAttributeModel))
      .tags(java.util.Arrays.asList(resourceTagModel))
      .build();

    // Construct an instance of the CreatePolicyOptions model
    CreatePolicyOptions createPolicyOptionsModel = new CreatePolicyOptions.Builder()
      .type("testString")
      .subjects(java.util.Arrays.asList(policySubjectModel))
      .roles(java.util.Arrays.asList(policyRoleModel))
      .resources(java.util.Arrays.asList(policyResourceModel))
      .description("testString")
      .acceptLanguage("default")
      .build();

    // Invoke createPolicy() with a valid options model and verify the result
    Response<Policy> response = iamPolicyManagementService.createPolicy(createPolicyOptionsModel).execute();
    assertNotNull(response);
    Policy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPolicy operation with and without retries enabled
  @Test
  public void testCreatePolicyWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCreatePolicyWOptions();

    iamPolicyManagementService.disableRetries();
    testCreatePolicyWOptions();
  }

  // Test the createPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.createPolicy(null).execute();
  }

  // Test the replacePolicy operation with a valid options model parameter
  @Test
  public void testReplacePolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"type\": \"type\", \"description\": \"description\", \"subjects\": [{\"attributes\": [{\"name\": \"name\", \"value\": \"value\"}]}], \"roles\": [{\"role_id\": \"roleId\", \"display_name\": \"displayName\", \"description\": \"description\"}], \"resources\": [{\"attributes\": [{\"name\": \"name\", \"value\": \"value\", \"operator\": \"operator\"}], \"tags\": [{\"name\": \"name\", \"value\": \"value\", \"operator\": \"operator\"}]}], \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"state\": \"active\"}";
    String replacePolicyPath = "/v1/policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SubjectAttribute model
    SubjectAttribute subjectAttributeModel = new SubjectAttribute.Builder()
      .name("testString")
      .value("testString")
      .build();

    // Construct an instance of the PolicySubject model
    PolicySubject policySubjectModel = new PolicySubject.Builder()
      .attributes(java.util.Arrays.asList(subjectAttributeModel))
      .build();

    // Construct an instance of the PolicyRole model
    PolicyRole policyRoleModel = new PolicyRole.Builder()
      .roleId("testString")
      .build();

    // Construct an instance of the ResourceAttribute model
    ResourceAttribute resourceAttributeModel = new ResourceAttribute.Builder()
      .name("testString")
      .value("testString")
      .operator("testString")
      .build();

    // Construct an instance of the ResourceTag model
    ResourceTag resourceTagModel = new ResourceTag.Builder()
      .name("testString")
      .value("testString")
      .operator("testString")
      .build();

    // Construct an instance of the PolicyResource model
    PolicyResource policyResourceModel = new PolicyResource.Builder()
      .attributes(java.util.Arrays.asList(resourceAttributeModel))
      .tags(java.util.Arrays.asList(resourceTagModel))
      .build();

    // Construct an instance of the ReplacePolicyOptions model
    ReplacePolicyOptions replacePolicyOptionsModel = new ReplacePolicyOptions.Builder()
      .policyId("testString")
      .ifMatch("testString")
      .type("testString")
      .subjects(java.util.Arrays.asList(policySubjectModel))
      .roles(java.util.Arrays.asList(policyRoleModel))
      .resources(java.util.Arrays.asList(policyResourceModel))
      .description("testString")
      .build();

    // Invoke replacePolicy() with a valid options model and verify the result
    Response<Policy> response = iamPolicyManagementService.replacePolicy(replacePolicyOptionsModel).execute();
    assertNotNull(response);
    Policy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replacePolicyPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replacePolicy operation with and without retries enabled
  @Test
  public void testReplacePolicyWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testReplacePolicyWOptions();

    iamPolicyManagementService.disableRetries();
    testReplacePolicyWOptions();
  }

  // Test the replacePolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplacePolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.replacePolicy(null).execute();
  }

  // Test the getPolicy operation with a valid options model parameter
  @Test
  public void testGetPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"type\": \"type\", \"description\": \"description\", \"subjects\": [{\"attributes\": [{\"name\": \"name\", \"value\": \"value\"}]}], \"roles\": [{\"role_id\": \"roleId\", \"display_name\": \"displayName\", \"description\": \"description\"}], \"resources\": [{\"attributes\": [{\"name\": \"name\", \"value\": \"value\", \"operator\": \"operator\"}], \"tags\": [{\"name\": \"name\", \"value\": \"value\", \"operator\": \"operator\"}]}], \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"state\": \"active\", \"template\": {\"id\": \"id\", \"version\": \"version\", \"assignment_id\": \"assignmentId\", \"root_id\": \"rootId\", \"root_version\": \"rootVersion\"}}";
    String getPolicyPath = "/v1/policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPolicyOptions model
    GetPolicyOptions getPolicyOptionsModel = new GetPolicyOptions.Builder()
      .policyId("testString")
      .build();

    // Invoke getPolicy() with a valid options model and verify the result
    Response<PolicyTemplateMetaData> response = iamPolicyManagementService.getPolicy(getPolicyOptionsModel).execute();
    assertNotNull(response);
    PolicyTemplateMetaData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPolicy operation with and without retries enabled
  @Test
  public void testGetPolicyWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testGetPolicyWOptions();

    iamPolicyManagementService.disableRetries();
    testGetPolicyWOptions();
  }

  // Test the getPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.getPolicy(null).execute();
  }

  // Test the deletePolicy operation with a valid options model parameter
  @Test
  public void testDeletePolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePolicyPath = "/v1/policies/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePolicyOptions model
    DeletePolicyOptions deletePolicyOptionsModel = new DeletePolicyOptions.Builder()
      .policyId("testString")
      .build();

    // Invoke deletePolicy() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.deletePolicy(deletePolicyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deletePolicy operation with and without retries enabled
  @Test
  public void testDeletePolicyWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testDeletePolicyWOptions();

    iamPolicyManagementService.disableRetries();
    testDeletePolicyWOptions();
  }

  // Test the deletePolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.deletePolicy(null).execute();
  }

  // Test the updatePolicyState operation with a valid options model parameter
  @Test
  public void testUpdatePolicyStateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"type\": \"type\", \"description\": \"description\", \"subjects\": [{\"attributes\": [{\"name\": \"name\", \"value\": \"value\"}]}], \"roles\": [{\"role_id\": \"roleId\", \"display_name\": \"displayName\", \"description\": \"description\"}], \"resources\": [{\"attributes\": [{\"name\": \"name\", \"value\": \"value\", \"operator\": \"operator\"}], \"tags\": [{\"name\": \"name\", \"value\": \"value\", \"operator\": \"operator\"}]}], \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"state\": \"active\"}";
    String updatePolicyStatePath = "/v1/policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdatePolicyStateOptions model
    UpdatePolicyStateOptions updatePolicyStateOptionsModel = new UpdatePolicyStateOptions.Builder()
      .policyId("testString")
      .ifMatch("testString")
      .state("active")
      .build();

    // Invoke updatePolicyState() with a valid options model and verify the result
    Response<Policy> response = iamPolicyManagementService.updatePolicyState(updatePolicyStateOptionsModel).execute();
    assertNotNull(response);
    Policy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePolicyStatePath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePolicyState operation with and without retries enabled
  @Test
  public void testUpdatePolicyStateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testUpdatePolicyStateWOptions();

    iamPolicyManagementService.disableRetries();
    testUpdatePolicyStateWOptions();
  }

  // Test the updatePolicyState operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePolicyStateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.updatePolicyState(null).execute();
  }

  // Test the listRoles operation with a valid options model parameter
  @Test
  public void testListRolesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"custom_roles\": [{\"id\": \"id\", \"display_name\": \"displayName\", \"description\": \"description\", \"actions\": [\"actions\"], \"crn\": \"crn\", \"name\": \"Developer\", \"account_id\": \"accountId\", \"service_name\": \"iam-groups\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"href\": \"href\"}], \"service_roles\": [{\"display_name\": \"displayName\", \"description\": \"description\", \"actions\": [\"actions\"], \"crn\": \"crn\"}], \"system_roles\": [{\"display_name\": \"displayName\", \"description\": \"description\", \"actions\": [\"actions\"], \"crn\": \"crn\"}]}";
    String listRolesPath = "/v2/roles";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListRolesOptions model
    ListRolesOptions listRolesOptionsModel = new ListRolesOptions.Builder()
      .acceptLanguage("default")
      .accountId("testString")
      .serviceName("iam-groups")
      .sourceServiceName("iam-groups")
      .policyType("authorization")
      .serviceGroupId("IAM")
      .build();

    // Invoke listRoles() with a valid options model and verify the result
    Response<RoleCollection> response = iamPolicyManagementService.listRoles(listRolesOptionsModel).execute();
    assertNotNull(response);
    RoleCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listRolesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("account_id"), "testString");
    assertEquals(query.get("service_name"), "iam-groups");
    assertEquals(query.get("source_service_name"), "iam-groups");
    assertEquals(query.get("policy_type"), "authorization");
    assertEquals(query.get("service_group_id"), "IAM");
  }

  // Test the listRoles operation with and without retries enabled
  @Test
  public void testListRolesWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testListRolesWOptions();

    iamPolicyManagementService.disableRetries();
    testListRolesWOptions();
  }

  // Test the createRole operation with a valid options model parameter
  @Test
  public void testCreateRoleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"display_name\": \"displayName\", \"description\": \"description\", \"actions\": [\"actions\"], \"crn\": \"crn\", \"name\": \"Developer\", \"account_id\": \"accountId\", \"service_name\": \"iam-groups\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"href\": \"href\"}";
    String createRolePath = "/v2/roles";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateRoleOptions model
    CreateRoleOptions createRoleOptionsModel = new CreateRoleOptions.Builder()
      .displayName("testString")
      .actions(java.util.Arrays.asList("testString"))
      .name("Developer")
      .accountId("testString")
      .serviceName("iam-groups")
      .description("testString")
      .acceptLanguage("default")
      .build();

    // Invoke createRole() with a valid options model and verify the result
    Response<CustomRole> response = iamPolicyManagementService.createRole(createRoleOptionsModel).execute();
    assertNotNull(response);
    CustomRole responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createRolePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createRole operation with and without retries enabled
  @Test
  public void testCreateRoleWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCreateRoleWOptions();

    iamPolicyManagementService.disableRetries();
    testCreateRoleWOptions();
  }

  // Test the createRole operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateRoleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.createRole(null).execute();
  }

  // Test the replaceRole operation with a valid options model parameter
  @Test
  public void testReplaceRoleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"display_name\": \"displayName\", \"description\": \"description\", \"actions\": [\"actions\"], \"crn\": \"crn\", \"name\": \"Developer\", \"account_id\": \"accountId\", \"service_name\": \"iam-groups\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"href\": \"href\"}";
    String replaceRolePath = "/v2/roles/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ReplaceRoleOptions model
    ReplaceRoleOptions replaceRoleOptionsModel = new ReplaceRoleOptions.Builder()
      .roleId("testString")
      .ifMatch("testString")
      .displayName("testString")
      .actions(java.util.Arrays.asList("testString"))
      .description("testString")
      .build();

    // Invoke replaceRole() with a valid options model and verify the result
    Response<CustomRole> response = iamPolicyManagementService.replaceRole(replaceRoleOptionsModel).execute();
    assertNotNull(response);
    CustomRole responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceRolePath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceRole operation with and without retries enabled
  @Test
  public void testReplaceRoleWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testReplaceRoleWOptions();

    iamPolicyManagementService.disableRetries();
    testReplaceRoleWOptions();
  }

  // Test the replaceRole operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceRoleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.replaceRole(null).execute();
  }

  // Test the getRole operation with a valid options model parameter
  @Test
  public void testGetRoleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"display_name\": \"displayName\", \"description\": \"description\", \"actions\": [\"actions\"], \"crn\": \"crn\", \"name\": \"Developer\", \"account_id\": \"accountId\", \"service_name\": \"iam-groups\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"href\": \"href\"}";
    String getRolePath = "/v2/roles/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetRoleOptions model
    GetRoleOptions getRoleOptionsModel = new GetRoleOptions.Builder()
      .roleId("testString")
      .build();

    // Invoke getRole() with a valid options model and verify the result
    Response<CustomRole> response = iamPolicyManagementService.getRole(getRoleOptionsModel).execute();
    assertNotNull(response);
    CustomRole responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getRolePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getRole operation with and without retries enabled
  @Test
  public void testGetRoleWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testGetRoleWOptions();

    iamPolicyManagementService.disableRetries();
    testGetRoleWOptions();
  }

  // Test the getRole operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetRoleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.getRole(null).execute();
  }

  // Test the deleteRole operation with a valid options model parameter
  @Test
  public void testDeleteRoleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteRolePath = "/v2/roles/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteRoleOptions model
    DeleteRoleOptions deleteRoleOptionsModel = new DeleteRoleOptions.Builder()
      .roleId("testString")
      .build();

    // Invoke deleteRole() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.deleteRole(deleteRoleOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteRolePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteRole operation with and without retries enabled
  @Test
  public void testDeleteRoleWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testDeleteRoleWOptions();

    iamPolicyManagementService.disableRetries();
    testDeleteRoleWOptions();
  }

  // Test the deleteRole operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteRoleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.deleteRole(null).execute();
  }

  // Test the listV2Policies operation with a valid options model parameter
  @Test
  public void testListV2PoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 1, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"previous\": {\"href\": \"href\", \"start\": \"start\"}, \"policies\": [{\"type\": \"access\", \"description\": \"description\", \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"id\": \"id\", \"href\": \"href\", \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"state\": \"active\", \"last_permit_at\": \"lastPermitAt\", \"last_permit_frequency\": 19, \"template\": {\"id\": \"id\", \"version\": \"version\", \"assignment_id\": \"assignmentId\", \"root_id\": \"rootId\", \"root_version\": \"rootVersion\"}}]}";
    String listV2PoliciesPath = "/v2/policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListV2PoliciesOptions model
    ListV2PoliciesOptions listV2PoliciesOptionsModel = new ListV2PoliciesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .iamId("testString")
      .accessGroupId("testString")
      .type("access")
      .serviceType("service")
      .serviceName("testString")
      .serviceGroupId("testString")
      .sort("testString")
      .format("include_last_permit")
      .state("active")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listV2Policies() with a valid options model and verify the result
    Response<V2PolicyCollection> response = iamPolicyManagementService.listV2Policies(listV2PoliciesOptionsModel).execute();
    assertNotNull(response);
    V2PolicyCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listV2PoliciesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("account_id"), "testString");
    assertEquals(query.get("iam_id"), "testString");
    assertEquals(query.get("access_group_id"), "testString");
    assertEquals(query.get("type"), "access");
    assertEquals(query.get("service_type"), "service");
    assertEquals(query.get("service_name"), "testString");
    assertEquals(query.get("service_group_id"), "testString");
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("format"), "include_last_permit");
    assertEquals(query.get("state"), "active");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listV2Policies operation with and without retries enabled
  @Test
  public void testListV2PoliciesWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testListV2PoliciesWOptions();

    iamPolicyManagementService.disableRetries();
    testListV2PoliciesWOptions();
  }

  // Test the listV2Policies operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListV2PoliciesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.listV2Policies(null).execute();
  }

  // Test the listV2Policies operation using the V2PoliciesPager.getNext() method
  @Test
  public void testListV2PoliciesWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"policies\":[{\"type\":\"access\",\"description\":\"description\",\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"id\":\"id\",\"href\":\"href\",\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"state\":\"active\",\"last_permit_at\":\"lastPermitAt\",\"last_permit_frequency\":19,\"template\":{\"id\":\"id\",\"version\":\"version\",\"assignment_id\":\"assignmentId\",\"root_id\":\"rootId\",\"root_version\":\"rootVersion\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"policies\":[{\"type\":\"access\",\"description\":\"description\",\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"id\":\"id\",\"href\":\"href\",\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"state\":\"active\",\"last_permit_at\":\"lastPermitAt\",\"last_permit_frequency\":19,\"template\":{\"id\":\"id\",\"version\":\"version\",\"assignment_id\":\"assignmentId\",\"root_id\":\"rootId\",\"root_version\":\"rootVersion\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListV2PoliciesOptions listV2PoliciesOptions = new ListV2PoliciesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .iamId("testString")
      .accessGroupId("testString")
      .type("access")
      .serviceType("service")
      .serviceName("testString")
      .serviceGroupId("testString")
      .sort("testString")
      .format("include_last_permit")
      .state("active")
      .limit(Long.valueOf("10"))
      .build();

    List<V2PolicyTemplateMetaData> allResults = new ArrayList<>();
    V2PoliciesPager pager = new V2PoliciesPager(iamPolicyManagementService, listV2PoliciesOptions);
    while (pager.hasNext()) {
      List<V2PolicyTemplateMetaData> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listV2Policies operation using the V2PoliciesPager.getAll() method
  @Test
  public void testListV2PoliciesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"policies\":[{\"type\":\"access\",\"description\":\"description\",\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"id\":\"id\",\"href\":\"href\",\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"state\":\"active\",\"last_permit_at\":\"lastPermitAt\",\"last_permit_frequency\":19,\"template\":{\"id\":\"id\",\"version\":\"version\",\"assignment_id\":\"assignmentId\",\"root_id\":\"rootId\",\"root_version\":\"rootVersion\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"policies\":[{\"type\":\"access\",\"description\":\"description\",\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"id\":\"id\",\"href\":\"href\",\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"state\":\"active\",\"last_permit_at\":\"lastPermitAt\",\"last_permit_frequency\":19,\"template\":{\"id\":\"id\",\"version\":\"version\",\"assignment_id\":\"assignmentId\",\"root_id\":\"rootId\",\"root_version\":\"rootVersion\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListV2PoliciesOptions listV2PoliciesOptions = new ListV2PoliciesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .iamId("testString")
      .accessGroupId("testString")
      .type("access")
      .serviceType("service")
      .serviceName("testString")
      .serviceGroupId("testString")
      .sort("testString")
      .format("include_last_permit")
      .state("active")
      .limit(Long.valueOf("10"))
      .build();

    V2PoliciesPager pager = new V2PoliciesPager(iamPolicyManagementService, listV2PoliciesOptions);
    List<V2PolicyTemplateMetaData> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createV2Policy operation with a valid options model parameter
  @Test
  public void testCreateV2PolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"type\": \"access\", \"description\": \"description\", \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"id\": \"id\", \"href\": \"href\", \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"state\": \"active\", \"last_permit_at\": \"lastPermitAt\", \"last_permit_frequency\": 19}";
    String createV2PolicyPath = "/v2/policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .roleId("testString")
      .build();

    // Construct an instance of the Grant model
    Grant grantModel = new Grant.Builder()
      .roles(java.util.Arrays.asList(rolesModel))
      .build();

    // Construct an instance of the Control model
    Control controlModel = new Control.Builder()
      .grant(grantModel)
      .build();

    // Construct an instance of the V2PolicySubjectAttribute model
    V2PolicySubjectAttribute v2PolicySubjectAttributeModel = new V2PolicySubjectAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the V2PolicySubject model
    V2PolicySubject v2PolicySubjectModel = new V2PolicySubject.Builder()
      .attributes(java.util.Arrays.asList(v2PolicySubjectAttributeModel))
      .build();

    // Construct an instance of the V2PolicyResourceAttribute model
    V2PolicyResourceAttribute v2PolicyResourceAttributeModel = new V2PolicyResourceAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the V2PolicyResourceTag model
    V2PolicyResourceTag v2PolicyResourceTagModel = new V2PolicyResourceTag.Builder()
      .key("testString")
      .value("testString")
      .operator("stringEquals")
      .build();

    // Construct an instance of the V2PolicyResource model
    V2PolicyResource v2PolicyResourceModel = new V2PolicyResource.Builder()
      .attributes(java.util.Arrays.asList(v2PolicyResourceAttributeModel))
      .tags(java.util.Arrays.asList(v2PolicyResourceTagModel))
      .build();

    // Construct an instance of the V2PolicyRuleRuleAttribute model
    V2PolicyRuleRuleAttribute v2PolicyRuleModel = new V2PolicyRuleRuleAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the CreateV2PolicyOptions model
    CreateV2PolicyOptions createV2PolicyOptionsModel = new CreateV2PolicyOptions.Builder()
      .control(controlModel)
      .type("access")
      .description("testString")
      .subject(v2PolicySubjectModel)
      .resource(v2PolicyResourceModel)
      .pattern("testString")
      .rule(v2PolicyRuleModel)
      .acceptLanguage("default")
      .build();

    // Invoke createV2Policy() with a valid options model and verify the result
    Response<V2Policy> response = iamPolicyManagementService.createV2Policy(createV2PolicyOptionsModel).execute();
    assertNotNull(response);
    V2Policy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createV2PolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createV2Policy operation with and without retries enabled
  @Test
  public void testCreateV2PolicyWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCreateV2PolicyWOptions();

    iamPolicyManagementService.disableRetries();
    testCreateV2PolicyWOptions();
  }

  // Test the createV2Policy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateV2PolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.createV2Policy(null).execute();
  }

  // Test the replaceV2Policy operation with a valid options model parameter
  @Test
  public void testReplaceV2PolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"type\": \"access\", \"description\": \"description\", \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"id\": \"id\", \"href\": \"href\", \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"state\": \"active\", \"last_permit_at\": \"lastPermitAt\", \"last_permit_frequency\": 19}";
    String replaceV2PolicyPath = "/v2/policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .roleId("testString")
      .build();

    // Construct an instance of the Grant model
    Grant grantModel = new Grant.Builder()
      .roles(java.util.Arrays.asList(rolesModel))
      .build();

    // Construct an instance of the Control model
    Control controlModel = new Control.Builder()
      .grant(grantModel)
      .build();

    // Construct an instance of the V2PolicySubjectAttribute model
    V2PolicySubjectAttribute v2PolicySubjectAttributeModel = new V2PolicySubjectAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the V2PolicySubject model
    V2PolicySubject v2PolicySubjectModel = new V2PolicySubject.Builder()
      .attributes(java.util.Arrays.asList(v2PolicySubjectAttributeModel))
      .build();

    // Construct an instance of the V2PolicyResourceAttribute model
    V2PolicyResourceAttribute v2PolicyResourceAttributeModel = new V2PolicyResourceAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the V2PolicyResourceTag model
    V2PolicyResourceTag v2PolicyResourceTagModel = new V2PolicyResourceTag.Builder()
      .key("testString")
      .value("testString")
      .operator("stringEquals")
      .build();

    // Construct an instance of the V2PolicyResource model
    V2PolicyResource v2PolicyResourceModel = new V2PolicyResource.Builder()
      .attributes(java.util.Arrays.asList(v2PolicyResourceAttributeModel))
      .tags(java.util.Arrays.asList(v2PolicyResourceTagModel))
      .build();

    // Construct an instance of the V2PolicyRuleRuleAttribute model
    V2PolicyRuleRuleAttribute v2PolicyRuleModel = new V2PolicyRuleRuleAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the ReplaceV2PolicyOptions model
    ReplaceV2PolicyOptions replaceV2PolicyOptionsModel = new ReplaceV2PolicyOptions.Builder()
      .id("testString")
      .ifMatch("testString")
      .control(controlModel)
      .type("access")
      .description("testString")
      .subject(v2PolicySubjectModel)
      .resource(v2PolicyResourceModel)
      .pattern("testString")
      .rule(v2PolicyRuleModel)
      .build();

    // Invoke replaceV2Policy() with a valid options model and verify the result
    Response<V2Policy> response = iamPolicyManagementService.replaceV2Policy(replaceV2PolicyOptionsModel).execute();
    assertNotNull(response);
    V2Policy responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceV2PolicyPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceV2Policy operation with and without retries enabled
  @Test
  public void testReplaceV2PolicyWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testReplaceV2PolicyWOptions();

    iamPolicyManagementService.disableRetries();
    testReplaceV2PolicyWOptions();
  }

  // Test the replaceV2Policy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceV2PolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.replaceV2Policy(null).execute();
  }

  // Test the getV2Policy operation with a valid options model parameter
  @Test
  public void testGetV2PolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"type\": \"access\", \"description\": \"description\", \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"id\": \"id\", \"href\": \"href\", \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"state\": \"active\", \"last_permit_at\": \"lastPermitAt\", \"last_permit_frequency\": 19, \"template\": {\"id\": \"id\", \"version\": \"version\", \"assignment_id\": \"assignmentId\", \"root_id\": \"rootId\", \"root_version\": \"rootVersion\"}}";
    String getV2PolicyPath = "/v2/policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetV2PolicyOptions model
    GetV2PolicyOptions getV2PolicyOptionsModel = new GetV2PolicyOptions.Builder()
      .id("testString")
      .format("include_last_permit")
      .build();

    // Invoke getV2Policy() with a valid options model and verify the result
    Response<V2PolicyTemplateMetaData> response = iamPolicyManagementService.getV2Policy(getV2PolicyOptionsModel).execute();
    assertNotNull(response);
    V2PolicyTemplateMetaData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getV2PolicyPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("format"), "include_last_permit");
  }

  // Test the getV2Policy operation with and without retries enabled
  @Test
  public void testGetV2PolicyWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testGetV2PolicyWOptions();

    iamPolicyManagementService.disableRetries();
    testGetV2PolicyWOptions();
  }

  // Test the getV2Policy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetV2PolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.getV2Policy(null).execute();
  }

  // Test the deleteV2Policy operation with a valid options model parameter
  @Test
  public void testDeleteV2PolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteV2PolicyPath = "/v2/policies/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteV2PolicyOptions model
    DeleteV2PolicyOptions deleteV2PolicyOptionsModel = new DeleteV2PolicyOptions.Builder()
      .id("testString")
      .build();

    // Invoke deleteV2Policy() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.deleteV2Policy(deleteV2PolicyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteV2PolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteV2Policy operation with and without retries enabled
  @Test
  public void testDeleteV2PolicyWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testDeleteV2PolicyWOptions();

    iamPolicyManagementService.disableRetries();
    testDeleteV2PolicyWOptions();
  }

  // Test the deleteV2Policy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteV2PolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.deleteV2Policy(null).execute();
  }

  // Test the listPolicyTemplates operation with a valid options model parameter
  @Test
  public void testListPolicyTemplatesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 1, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"previous\": {\"href\": \"href\", \"start\": \"start\"}, \"policy_templates\": [{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"version\": \"version\", \"committed\": false, \"policy\": {\"type\": \"access\", \"description\": \"description\", \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}}, \"state\": \"active\", \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\"}]}";
    String listPolicyTemplatesPath = "/v1/policy_templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPolicyTemplatesOptions model
    ListPolicyTemplatesOptions listPolicyTemplatesOptionsModel = new ListPolicyTemplatesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .state("active")
      .name("testString")
      .policyServiceType("service")
      .policyServiceName("testString")
      .policyServiceGroupId("testString")
      .policyType("access")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listPolicyTemplates() with a valid options model and verify the result
    Response<PolicyTemplateCollection> response = iamPolicyManagementService.listPolicyTemplates(listPolicyTemplatesOptionsModel).execute();
    assertNotNull(response);
    PolicyTemplateCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPolicyTemplatesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("account_id"), "testString");
    assertEquals(query.get("state"), "active");
    assertEquals(query.get("name"), "testString");
    assertEquals(query.get("policy_service_type"), "service");
    assertEquals(query.get("policy_service_name"), "testString");
    assertEquals(query.get("policy_service_group_id"), "testString");
    assertEquals(query.get("policy_type"), "access");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listPolicyTemplates operation with and without retries enabled
  @Test
  public void testListPolicyTemplatesWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testListPolicyTemplatesWOptions();

    iamPolicyManagementService.disableRetries();
    testListPolicyTemplatesWOptions();
  }

  // Test the listPolicyTemplates operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPolicyTemplatesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.listPolicyTemplates(null).execute();
  }

  // Test the listPolicyTemplates operation using the PolicyTemplatesPager.getNext() method
  @Test
  public void testListPolicyTemplatesWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"policy_templates\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"version\":\"version\",\"committed\":false,\"policy\":{\"type\":\"access\",\"description\":\"description\",\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}}},\"state\":\"active\",\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"policy_templates\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"version\":\"version\",\"committed\":false,\"policy\":{\"type\":\"access\",\"description\":\"description\",\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}}},\"state\":\"active\",\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListPolicyTemplatesOptions listPolicyTemplatesOptions = new ListPolicyTemplatesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .state("active")
      .name("testString")
      .policyServiceType("service")
      .policyServiceName("testString")
      .policyServiceGroupId("testString")
      .policyType("access")
      .limit(Long.valueOf("10"))
      .build();

    List<PolicyTemplate> allResults = new ArrayList<>();
    PolicyTemplatesPager pager = new PolicyTemplatesPager(iamPolicyManagementService, listPolicyTemplatesOptions);
    while (pager.hasNext()) {
      List<PolicyTemplate> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listPolicyTemplates operation using the PolicyTemplatesPager.getAll() method
  @Test
  public void testListPolicyTemplatesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"policy_templates\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"version\":\"version\",\"committed\":false,\"policy\":{\"type\":\"access\",\"description\":\"description\",\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}}},\"state\":\"active\",\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"policy_templates\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"version\":\"version\",\"committed\":false,\"policy\":{\"type\":\"access\",\"description\":\"description\",\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}}},\"state\":\"active\",\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListPolicyTemplatesOptions listPolicyTemplatesOptions = new ListPolicyTemplatesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .state("active")
      .name("testString")
      .policyServiceType("service")
      .policyServiceName("testString")
      .policyServiceGroupId("testString")
      .policyType("access")
      .limit(Long.valueOf("10"))
      .build();

    PolicyTemplatesPager pager = new PolicyTemplatesPager(iamPolicyManagementService, listPolicyTemplatesOptions);
    List<PolicyTemplate> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createPolicyTemplate operation with a valid options model parameter
  @Test
  public void testCreatePolicyTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"version\": \"version\", \"committed\": false, \"policy\": {\"type\": \"access\", \"description\": \"description\", \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}}, \"state\": \"active\", \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"counts\": {\"template\": {\"current\": 7, \"limit\": 5}, \"version\": {\"current\": 7, \"limit\": 5}}}";
    String createPolicyTemplatePath = "/v1/policy_templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the V2PolicyResourceAttribute model
    V2PolicyResourceAttribute v2PolicyResourceAttributeModel = new V2PolicyResourceAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the V2PolicyResourceTag model
    V2PolicyResourceTag v2PolicyResourceTagModel = new V2PolicyResourceTag.Builder()
      .key("testString")
      .value("testString")
      .operator("stringEquals")
      .build();

    // Construct an instance of the V2PolicyResource model
    V2PolicyResource v2PolicyResourceModel = new V2PolicyResource.Builder()
      .attributes(java.util.Arrays.asList(v2PolicyResourceAttributeModel))
      .tags(java.util.Arrays.asList(v2PolicyResourceTagModel))
      .build();

    // Construct an instance of the V2PolicySubjectAttribute model
    V2PolicySubjectAttribute v2PolicySubjectAttributeModel = new V2PolicySubjectAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the V2PolicySubject model
    V2PolicySubject v2PolicySubjectModel = new V2PolicySubject.Builder()
      .attributes(java.util.Arrays.asList(v2PolicySubjectAttributeModel))
      .build();

    // Construct an instance of the V2PolicyRuleRuleAttribute model
    V2PolicyRuleRuleAttribute v2PolicyRuleModel = new V2PolicyRuleRuleAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .roleId("testString")
      .build();

    // Construct an instance of the Grant model
    Grant grantModel = new Grant.Builder()
      .roles(java.util.Arrays.asList(rolesModel))
      .build();

    // Construct an instance of the Control model
    Control controlModel = new Control.Builder()
      .grant(grantModel)
      .build();

    // Construct an instance of the TemplatePolicy model
    TemplatePolicy templatePolicyModel = new TemplatePolicy.Builder()
      .type("access")
      .description("testString")
      .resource(v2PolicyResourceModel)
      .subject(v2PolicySubjectModel)
      .pattern("testString")
      .rule(v2PolicyRuleModel)
      .control(controlModel)
      .build();

    // Construct an instance of the CreatePolicyTemplateOptions model
    CreatePolicyTemplateOptions createPolicyTemplateOptionsModel = new CreatePolicyTemplateOptions.Builder()
      .name("testString")
      .accountId("testString")
      .policy(templatePolicyModel)
      .description("testString")
      .committed(true)
      .acceptLanguage("default")
      .build();

    // Invoke createPolicyTemplate() with a valid options model and verify the result
    Response<PolicyTemplateLimitData> response = iamPolicyManagementService.createPolicyTemplate(createPolicyTemplateOptionsModel).execute();
    assertNotNull(response);
    PolicyTemplateLimitData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPolicyTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPolicyTemplate operation with and without retries enabled
  @Test
  public void testCreatePolicyTemplateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCreatePolicyTemplateWOptions();

    iamPolicyManagementService.disableRetries();
    testCreatePolicyTemplateWOptions();
  }

  // Test the createPolicyTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePolicyTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.createPolicyTemplate(null).execute();
  }

  // Test the getPolicyTemplate operation with a valid options model parameter
  @Test
  public void testGetPolicyTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"version\": \"version\", \"committed\": false, \"policy\": {\"type\": \"access\", \"description\": \"description\", \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}}, \"state\": \"active\", \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\"}";
    String getPolicyTemplatePath = "/v1/policy_templates/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPolicyTemplateOptions model
    GetPolicyTemplateOptions getPolicyTemplateOptionsModel = new GetPolicyTemplateOptions.Builder()
      .policyTemplateId("testString")
      .state("active")
      .build();

    // Invoke getPolicyTemplate() with a valid options model and verify the result
    Response<PolicyTemplate> response = iamPolicyManagementService.getPolicyTemplate(getPolicyTemplateOptionsModel).execute();
    assertNotNull(response);
    PolicyTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPolicyTemplatePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("state"), "active");
  }

  // Test the getPolicyTemplate operation with and without retries enabled
  @Test
  public void testGetPolicyTemplateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testGetPolicyTemplateWOptions();

    iamPolicyManagementService.disableRetries();
    testGetPolicyTemplateWOptions();
  }

  // Test the getPolicyTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPolicyTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.getPolicyTemplate(null).execute();
  }

  // Test the deletePolicyTemplate operation with a valid options model parameter
  @Test
  public void testDeletePolicyTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePolicyTemplatePath = "/v1/policy_templates/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePolicyTemplateOptions model
    DeletePolicyTemplateOptions deletePolicyTemplateOptionsModel = new DeletePolicyTemplateOptions.Builder()
      .policyTemplateId("testString")
      .build();

    // Invoke deletePolicyTemplate() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.deletePolicyTemplate(deletePolicyTemplateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePolicyTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deletePolicyTemplate operation with and without retries enabled
  @Test
  public void testDeletePolicyTemplateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testDeletePolicyTemplateWOptions();

    iamPolicyManagementService.disableRetries();
    testDeletePolicyTemplateWOptions();
  }

  // Test the deletePolicyTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePolicyTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.deletePolicyTemplate(null).execute();
  }

  // Test the createPolicyTemplateVersion operation with a valid options model parameter
  @Test
  public void testCreatePolicyTemplateVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"version\": \"version\", \"committed\": false, \"policy\": {\"type\": \"access\", \"description\": \"description\", \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}}, \"state\": \"active\", \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"counts\": {\"template\": {\"current\": 7, \"limit\": 5}, \"version\": {\"current\": 7, \"limit\": 5}}}";
    String createPolicyTemplateVersionPath = "/v1/policy_templates/testString/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the V2PolicyResourceAttribute model
    V2PolicyResourceAttribute v2PolicyResourceAttributeModel = new V2PolicyResourceAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the V2PolicyResourceTag model
    V2PolicyResourceTag v2PolicyResourceTagModel = new V2PolicyResourceTag.Builder()
      .key("testString")
      .value("testString")
      .operator("stringEquals")
      .build();

    // Construct an instance of the V2PolicyResource model
    V2PolicyResource v2PolicyResourceModel = new V2PolicyResource.Builder()
      .attributes(java.util.Arrays.asList(v2PolicyResourceAttributeModel))
      .tags(java.util.Arrays.asList(v2PolicyResourceTagModel))
      .build();

    // Construct an instance of the V2PolicySubjectAttribute model
    V2PolicySubjectAttribute v2PolicySubjectAttributeModel = new V2PolicySubjectAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the V2PolicySubject model
    V2PolicySubject v2PolicySubjectModel = new V2PolicySubject.Builder()
      .attributes(java.util.Arrays.asList(v2PolicySubjectAttributeModel))
      .build();

    // Construct an instance of the V2PolicyRuleRuleAttribute model
    V2PolicyRuleRuleAttribute v2PolicyRuleModel = new V2PolicyRuleRuleAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .roleId("testString")
      .build();

    // Construct an instance of the Grant model
    Grant grantModel = new Grant.Builder()
      .roles(java.util.Arrays.asList(rolesModel))
      .build();

    // Construct an instance of the Control model
    Control controlModel = new Control.Builder()
      .grant(grantModel)
      .build();

    // Construct an instance of the TemplatePolicy model
    TemplatePolicy templatePolicyModel = new TemplatePolicy.Builder()
      .type("access")
      .description("testString")
      .resource(v2PolicyResourceModel)
      .subject(v2PolicySubjectModel)
      .pattern("testString")
      .rule(v2PolicyRuleModel)
      .control(controlModel)
      .build();

    // Construct an instance of the CreatePolicyTemplateVersionOptions model
    CreatePolicyTemplateVersionOptions createPolicyTemplateVersionOptionsModel = new CreatePolicyTemplateVersionOptions.Builder()
      .policyTemplateId("testString")
      .policy(templatePolicyModel)
      .name("testString")
      .description("testString")
      .committed(true)
      .build();

    // Invoke createPolicyTemplateVersion() with a valid options model and verify the result
    Response<PolicyTemplateLimitData> response = iamPolicyManagementService.createPolicyTemplateVersion(createPolicyTemplateVersionOptionsModel).execute();
    assertNotNull(response);
    PolicyTemplateLimitData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPolicyTemplateVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPolicyTemplateVersion operation with and without retries enabled
  @Test
  public void testCreatePolicyTemplateVersionWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCreatePolicyTemplateVersionWOptions();

    iamPolicyManagementService.disableRetries();
    testCreatePolicyTemplateVersionWOptions();
  }

  // Test the createPolicyTemplateVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePolicyTemplateVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.createPolicyTemplateVersion(null).execute();
  }

  // Test the listPolicyTemplateVersions operation with a valid options model parameter
  @Test
  public void testListPolicyTemplateVersionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 1, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"previous\": {\"href\": \"href\", \"start\": \"start\"}, \"versions\": [{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"version\": \"version\", \"committed\": false, \"policy\": {\"type\": \"access\", \"description\": \"description\", \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}}, \"state\": \"active\", \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\"}]}";
    String listPolicyTemplateVersionsPath = "/v1/policy_templates/testString/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPolicyTemplateVersionsOptions model
    ListPolicyTemplateVersionsOptions listPolicyTemplateVersionsOptionsModel = new ListPolicyTemplateVersionsOptions.Builder()
      .policyTemplateId("testString")
      .state("active")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listPolicyTemplateVersions() with a valid options model and verify the result
    Response<PolicyTemplateVersionsCollection> response = iamPolicyManagementService.listPolicyTemplateVersions(listPolicyTemplateVersionsOptionsModel).execute();
    assertNotNull(response);
    PolicyTemplateVersionsCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPolicyTemplateVersionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("state"), "active");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listPolicyTemplateVersions operation with and without retries enabled
  @Test
  public void testListPolicyTemplateVersionsWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testListPolicyTemplateVersionsWOptions();

    iamPolicyManagementService.disableRetries();
    testListPolicyTemplateVersionsWOptions();
  }

  // Test the listPolicyTemplateVersions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPolicyTemplateVersionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.listPolicyTemplateVersions(null).execute();
  }

  // Test the listPolicyTemplateVersions operation using the PolicyTemplateVersionsPager.getNext() method
  @Test
  public void testListPolicyTemplateVersionsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"versions\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"version\":\"version\",\"committed\":false,\"policy\":{\"type\":\"access\",\"description\":\"description\",\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}}},\"state\":\"active\",\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"versions\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"version\":\"version\",\"committed\":false,\"policy\":{\"type\":\"access\",\"description\":\"description\",\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}}},\"state\":\"active\",\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListPolicyTemplateVersionsOptions listPolicyTemplateVersionsOptions = new ListPolicyTemplateVersionsOptions.Builder()
      .policyTemplateId("testString")
      .state("active")
      .limit(Long.valueOf("10"))
      .build();

    List<PolicyTemplate> allResults = new ArrayList<>();
    PolicyTemplateVersionsPager pager = new PolicyTemplateVersionsPager(iamPolicyManagementService, listPolicyTemplateVersionsOptions);
    while (pager.hasNext()) {
      List<PolicyTemplate> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listPolicyTemplateVersions operation using the PolicyTemplateVersionsPager.getAll() method
  @Test
  public void testListPolicyTemplateVersionsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"versions\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"version\":\"version\",\"committed\":false,\"policy\":{\"type\":\"access\",\"description\":\"description\",\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}}},\"state\":\"active\",\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"versions\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"version\":\"version\",\"committed\":false,\"policy\":{\"type\":\"access\",\"description\":\"description\",\"resource\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}],\"tags\":[{\"key\":\"key\",\"value\":\"value\",\"operator\":\"stringEquals\"}]},\"subject\":{\"attributes\":[{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"}]},\"pattern\":\"pattern\",\"rule\":{\"key\":\"key\",\"operator\":\"stringEquals\",\"value\":\"anyValue\"},\"control\":{\"grant\":{\"roles\":[{\"role_id\":\"roleId\"}]}}},\"state\":\"active\",\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListPolicyTemplateVersionsOptions listPolicyTemplateVersionsOptions = new ListPolicyTemplateVersionsOptions.Builder()
      .policyTemplateId("testString")
      .state("active")
      .limit(Long.valueOf("10"))
      .build();

    PolicyTemplateVersionsPager pager = new PolicyTemplateVersionsPager(iamPolicyManagementService, listPolicyTemplateVersionsOptions);
    List<PolicyTemplate> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the replacePolicyTemplate operation with a valid options model parameter
  @Test
  public void testReplacePolicyTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"version\": \"version\", \"committed\": false, \"policy\": {\"type\": \"access\", \"description\": \"description\", \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}}, \"state\": \"active\", \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\"}";
    String replacePolicyTemplatePath = "/v1/policy_templates/testString/versions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the V2PolicyResourceAttribute model
    V2PolicyResourceAttribute v2PolicyResourceAttributeModel = new V2PolicyResourceAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the V2PolicyResourceTag model
    V2PolicyResourceTag v2PolicyResourceTagModel = new V2PolicyResourceTag.Builder()
      .key("testString")
      .value("testString")
      .operator("stringEquals")
      .build();

    // Construct an instance of the V2PolicyResource model
    V2PolicyResource v2PolicyResourceModel = new V2PolicyResource.Builder()
      .attributes(java.util.Arrays.asList(v2PolicyResourceAttributeModel))
      .tags(java.util.Arrays.asList(v2PolicyResourceTagModel))
      .build();

    // Construct an instance of the V2PolicySubjectAttribute model
    V2PolicySubjectAttribute v2PolicySubjectAttributeModel = new V2PolicySubjectAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the V2PolicySubject model
    V2PolicySubject v2PolicySubjectModel = new V2PolicySubject.Builder()
      .attributes(java.util.Arrays.asList(v2PolicySubjectAttributeModel))
      .build();

    // Construct an instance of the V2PolicyRuleRuleAttribute model
    V2PolicyRuleRuleAttribute v2PolicyRuleModel = new V2PolicyRuleRuleAttribute.Builder()
      .key("testString")
      .operator("stringEquals")
      .value("testString")
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .roleId("testString")
      .build();

    // Construct an instance of the Grant model
    Grant grantModel = new Grant.Builder()
      .roles(java.util.Arrays.asList(rolesModel))
      .build();

    // Construct an instance of the Control model
    Control controlModel = new Control.Builder()
      .grant(grantModel)
      .build();

    // Construct an instance of the TemplatePolicy model
    TemplatePolicy templatePolicyModel = new TemplatePolicy.Builder()
      .type("access")
      .description("testString")
      .resource(v2PolicyResourceModel)
      .subject(v2PolicySubjectModel)
      .pattern("testString")
      .rule(v2PolicyRuleModel)
      .control(controlModel)
      .build();

    // Construct an instance of the ReplacePolicyTemplateOptions model
    ReplacePolicyTemplateOptions replacePolicyTemplateOptionsModel = new ReplacePolicyTemplateOptions.Builder()
      .policyTemplateId("testString")
      .version("testString")
      .ifMatch("testString")
      .policy(templatePolicyModel)
      .name("testString")
      .description("testString")
      .committed(true)
      .build();

    // Invoke replacePolicyTemplate() with a valid options model and verify the result
    Response<PolicyTemplate> response = iamPolicyManagementService.replacePolicyTemplate(replacePolicyTemplateOptionsModel).execute();
    assertNotNull(response);
    PolicyTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replacePolicyTemplatePath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replacePolicyTemplate operation with and without retries enabled
  @Test
  public void testReplacePolicyTemplateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testReplacePolicyTemplateWOptions();

    iamPolicyManagementService.disableRetries();
    testReplacePolicyTemplateWOptions();
  }

  // Test the replacePolicyTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplacePolicyTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.replacePolicyTemplate(null).execute();
  }

  // Test the deletePolicyTemplateVersion operation with a valid options model parameter
  @Test
  public void testDeletePolicyTemplateVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePolicyTemplateVersionPath = "/v1/policy_templates/testString/versions/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePolicyTemplateVersionOptions model
    DeletePolicyTemplateVersionOptions deletePolicyTemplateVersionOptionsModel = new DeletePolicyTemplateVersionOptions.Builder()
      .policyTemplateId("testString")
      .version("testString")
      .build();

    // Invoke deletePolicyTemplateVersion() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.deletePolicyTemplateVersion(deletePolicyTemplateVersionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePolicyTemplateVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deletePolicyTemplateVersion operation with and without retries enabled
  @Test
  public void testDeletePolicyTemplateVersionWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testDeletePolicyTemplateVersionWOptions();

    iamPolicyManagementService.disableRetries();
    testDeletePolicyTemplateVersionWOptions();
  }

  // Test the deletePolicyTemplateVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePolicyTemplateVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.deletePolicyTemplateVersion(null).execute();
  }

  // Test the getPolicyTemplateVersion operation with a valid options model parameter
  @Test
  public void testGetPolicyTemplateVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"version\": \"version\", \"committed\": false, \"policy\": {\"type\": \"access\", \"description\": \"description\", \"resource\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}], \"tags\": [{\"key\": \"key\", \"value\": \"value\", \"operator\": \"stringEquals\"}]}, \"subject\": {\"attributes\": [{\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}]}, \"pattern\": \"pattern\", \"rule\": {\"key\": \"key\", \"operator\": \"stringEquals\", \"value\": \"anyValue\"}, \"control\": {\"grant\": {\"roles\": [{\"role_id\": \"roleId\"}]}}}, \"state\": \"active\", \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\"}";
    String getPolicyTemplateVersionPath = "/v1/policy_templates/testString/versions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPolicyTemplateVersionOptions model
    GetPolicyTemplateVersionOptions getPolicyTemplateVersionOptionsModel = new GetPolicyTemplateVersionOptions.Builder()
      .policyTemplateId("testString")
      .version("testString")
      .build();

    // Invoke getPolicyTemplateVersion() with a valid options model and verify the result
    Response<PolicyTemplate> response = iamPolicyManagementService.getPolicyTemplateVersion(getPolicyTemplateVersionOptionsModel).execute();
    assertNotNull(response);
    PolicyTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPolicyTemplateVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPolicyTemplateVersion operation with and without retries enabled
  @Test
  public void testGetPolicyTemplateVersionWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testGetPolicyTemplateVersionWOptions();

    iamPolicyManagementService.disableRetries();
    testGetPolicyTemplateVersionWOptions();
  }

  // Test the getPolicyTemplateVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPolicyTemplateVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.getPolicyTemplateVersion(null).execute();
  }

  // Test the commitPolicyTemplate operation with a valid options model parameter
  @Test
  public void testCommitPolicyTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String commitPolicyTemplatePath = "/v1/policy_templates/testString/versions/testString/commit";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the CommitPolicyTemplateOptions model
    CommitPolicyTemplateOptions commitPolicyTemplateOptionsModel = new CommitPolicyTemplateOptions.Builder()
      .policyTemplateId("testString")
      .version("testString")
      .build();

    // Invoke commitPolicyTemplate() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.commitPolicyTemplate(commitPolicyTemplateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, commitPolicyTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the commitPolicyTemplate operation with and without retries enabled
  @Test
  public void testCommitPolicyTemplateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCommitPolicyTemplateWOptions();

    iamPolicyManagementService.disableRetries();
    testCommitPolicyTemplateWOptions();
  }

  // Test the commitPolicyTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCommitPolicyTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.commitPolicyTemplate(null).execute();
  }

  // Test the listPolicyAssignments operation with a valid options model parameter
  @Test
  public void testListPolicyAssignmentsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 1, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"previous\": {\"href\": \"href\", \"start\": \"start\"}, \"assignments\": [{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"id\": \"id\", \"account_id\": \"accountId\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"resources\": [{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"policy\": {\"resource_created\": {\"id\": \"id\"}, \"status\": \"status\", \"error_message\": {\"trace\": \"trace\", \"errors\": [{\"code\": \"insufficent_permissions\", \"message\": \"message\", \"details\": {\"conflicts_with\": {\"etag\": \"etag\", \"role\": \"role\", \"policy\": \"policy\"}}, \"more_info\": \"moreInfo\"}], \"status_code\": 0}}}], \"subject\": {\"id\": \"id\", \"type\": \"iam_id\"}, \"template\": {\"id\": \"id\", \"version\": \"version\"}, \"status\": \"in_progress\"}]}";
    String listPolicyAssignmentsPath = "/v1/policy_assignments";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPolicyAssignmentsOptions model
    ListPolicyAssignmentsOptions listPolicyAssignmentsOptionsModel = new ListPolicyAssignmentsOptions.Builder()
      .version("1.0")
      .accountId("testString")
      .acceptLanguage("default")
      .templateId("testString")
      .templateVersion("testString")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listPolicyAssignments() with a valid options model and verify the result
    Response<PolicyTemplateAssignmentCollection> response = iamPolicyManagementService.listPolicyAssignments(listPolicyAssignmentsOptionsModel).execute();
    assertNotNull(response);
    PolicyTemplateAssignmentCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPolicyAssignmentsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "1.0");
    assertEquals(query.get("account_id"), "testString");
    assertEquals(query.get("template_id"), "testString");
    assertEquals(query.get("template_version"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listPolicyAssignments operation with and without retries enabled
  @Test
  public void testListPolicyAssignmentsWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testListPolicyAssignmentsWOptions();

    iamPolicyManagementService.disableRetries();
    testListPolicyAssignmentsWOptions();
  }

  // Test the listPolicyAssignments operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPolicyAssignmentsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.listPolicyAssignments(null).execute();
  }

  // Test the listPolicyAssignments operation using the PolicyAssignmentsPager.getNext() method
  @Test
  public void testListPolicyAssignmentsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"assignments\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"id\":\"id\",\"account_id\":\"accountId\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"resources\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"policy\":{\"resource_created\":{\"id\":\"id\"},\"status\":\"status\",\"error_message\":{\"trace\":\"trace\",\"errors\":[{\"code\":\"insufficent_permissions\",\"message\":\"message\",\"details\":{\"conflicts_with\":{\"etag\":\"etag\",\"role\":\"role\",\"policy\":\"policy\"}},\"more_info\":\"moreInfo\"}],\"status_code\":0}}}],\"subject\":{\"id\":\"id\",\"type\":\"iam_id\"},\"template\":{\"id\":\"id\",\"version\":\"version\"},\"status\":\"in_progress\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"assignments\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"id\":\"id\",\"account_id\":\"accountId\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"resources\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"policy\":{\"resource_created\":{\"id\":\"id\"},\"status\":\"status\",\"error_message\":{\"trace\":\"trace\",\"errors\":[{\"code\":\"insufficent_permissions\",\"message\":\"message\",\"details\":{\"conflicts_with\":{\"etag\":\"etag\",\"role\":\"role\",\"policy\":\"policy\"}},\"more_info\":\"moreInfo\"}],\"status_code\":0}}}],\"subject\":{\"id\":\"id\",\"type\":\"iam_id\"},\"template\":{\"id\":\"id\",\"version\":\"version\"},\"status\":\"in_progress\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListPolicyAssignmentsOptions listPolicyAssignmentsOptions = new ListPolicyAssignmentsOptions.Builder()
      .version("1.0")
      .accountId("testString")
      .acceptLanguage("default")
      .templateId("testString")
      .templateVersion("testString")
      .limit(Long.valueOf("10"))
      .build();

    List<PolicyTemplateAssignmentItems> allResults = new ArrayList<>();
    PolicyAssignmentsPager pager = new PolicyAssignmentsPager(iamPolicyManagementService, listPolicyAssignmentsOptions);
    while (pager.hasNext()) {
      List<PolicyTemplateAssignmentItems> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listPolicyAssignments operation using the PolicyAssignmentsPager.getAll() method
  @Test
  public void testListPolicyAssignmentsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"assignments\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"id\":\"id\",\"account_id\":\"accountId\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"resources\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"policy\":{\"resource_created\":{\"id\":\"id\"},\"status\":\"status\",\"error_message\":{\"trace\":\"trace\",\"errors\":[{\"code\":\"insufficent_permissions\",\"message\":\"message\",\"details\":{\"conflicts_with\":{\"etag\":\"etag\",\"role\":\"role\",\"policy\":\"policy\"}},\"more_info\":\"moreInfo\"}],\"status_code\":0}}}],\"subject\":{\"id\":\"id\",\"type\":\"iam_id\"},\"template\":{\"id\":\"id\",\"version\":\"version\"},\"status\":\"in_progress\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"assignments\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"id\":\"id\",\"account_id\":\"accountId\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"resources\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"policy\":{\"resource_created\":{\"id\":\"id\"},\"status\":\"status\",\"error_message\":{\"trace\":\"trace\",\"errors\":[{\"code\":\"insufficent_permissions\",\"message\":\"message\",\"details\":{\"conflicts_with\":{\"etag\":\"etag\",\"role\":\"role\",\"policy\":\"policy\"}},\"more_info\":\"moreInfo\"}],\"status_code\":0}}}],\"subject\":{\"id\":\"id\",\"type\":\"iam_id\"},\"template\":{\"id\":\"id\",\"version\":\"version\"},\"status\":\"in_progress\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListPolicyAssignmentsOptions listPolicyAssignmentsOptions = new ListPolicyAssignmentsOptions.Builder()
      .version("1.0")
      .accountId("testString")
      .acceptLanguage("default")
      .templateId("testString")
      .templateVersion("testString")
      .limit(Long.valueOf("10"))
      .build();

    PolicyAssignmentsPager pager = new PolicyAssignmentsPager(iamPolicyManagementService, listPolicyAssignmentsOptions);
    List<PolicyTemplateAssignmentItems> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createPolicyTemplateAssignment operation with a valid options model parameter
  @Test
  public void testCreatePolicyTemplateAssignmentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 1, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"previous\": {\"href\": \"href\", \"start\": \"start\"}, \"assignments\": [{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"id\": \"id\", \"account_id\": \"accountId\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"resources\": [{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"policy\": {\"resource_created\": {\"id\": \"id\"}, \"status\": \"status\", \"error_message\": {\"trace\": \"trace\", \"errors\": [{\"code\": \"insufficent_permissions\", \"message\": \"message\", \"details\": {\"conflicts_with\": {\"etag\": \"etag\", \"role\": \"role\", \"policy\": \"policy\"}}, \"more_info\": \"moreInfo\"}], \"status_code\": 0}}}], \"subject\": {\"id\": \"id\", \"type\": \"iam_id\"}, \"template\": {\"id\": \"id\", \"version\": \"version\"}, \"status\": \"in_progress\"}]}";
    String createPolicyTemplateAssignmentPath = "/v1/policy_assignments";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AssignmentTargetDetails model
    AssignmentTargetDetails assignmentTargetDetailsModel = new AssignmentTargetDetails.Builder()
      .type("Account")
      .id("testString")
      .build();

    // Construct an instance of the AssignmentTemplateDetails model
    AssignmentTemplateDetails assignmentTemplateDetailsModel = new AssignmentTemplateDetails.Builder()
      .id("testString")
      .version("testString")
      .build();

    // Construct an instance of the CreatePolicyTemplateAssignmentOptions model
    CreatePolicyTemplateAssignmentOptions createPolicyTemplateAssignmentOptionsModel = new CreatePolicyTemplateAssignmentOptions.Builder()
      .version("1.0")
      .target(assignmentTargetDetailsModel)
      .templates(java.util.Arrays.asList(assignmentTemplateDetailsModel))
      .acceptLanguage("default")
      .build();

    // Invoke createPolicyTemplateAssignment() with a valid options model and verify the result
    Response<PolicyAssignmentV1Collection> response = iamPolicyManagementService.createPolicyTemplateAssignment(createPolicyTemplateAssignmentOptionsModel).execute();
    assertNotNull(response);
    PolicyAssignmentV1Collection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPolicyTemplateAssignmentPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "1.0");
  }

  // Test the createPolicyTemplateAssignment operation with and without retries enabled
  @Test
  public void testCreatePolicyTemplateAssignmentWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCreatePolicyTemplateAssignmentWOptions();

    iamPolicyManagementService.disableRetries();
    testCreatePolicyTemplateAssignmentWOptions();
  }

  // Test the createPolicyTemplateAssignment operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePolicyTemplateAssignmentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.createPolicyTemplateAssignment(null).execute();
  }

  // Test the getPolicyAssignment operation with a valid options model parameter
  @Test
  public void testGetPolicyAssignmentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"id\": \"id\", \"account_id\": \"accountId\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"resources\": [{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"policy\": {\"resource_created\": {\"id\": \"id\"}, \"status\": \"status\", \"error_message\": {\"trace\": \"trace\", \"errors\": [{\"code\": \"insufficent_permissions\", \"message\": \"message\", \"details\": {\"conflicts_with\": {\"etag\": \"etag\", \"role\": \"role\", \"policy\": \"policy\"}}, \"more_info\": \"moreInfo\"}], \"status_code\": 0}}}], \"subject\": {\"id\": \"id\", \"type\": \"iam_id\"}, \"template\": {\"id\": \"id\", \"version\": \"version\"}, \"status\": \"in_progress\"}";
    String getPolicyAssignmentPath = "/v1/policy_assignments/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPolicyAssignmentOptions model
    GetPolicyAssignmentOptions getPolicyAssignmentOptionsModel = new GetPolicyAssignmentOptions.Builder()
      .assignmentId("testString")
      .version("1.0")
      .build();

    // Invoke getPolicyAssignment() with a valid options model and verify the result
    Response<PolicyTemplateAssignmentItems> response = iamPolicyManagementService.getPolicyAssignment(getPolicyAssignmentOptionsModel).execute();
    assertNotNull(response);
    PolicyTemplateAssignmentItems responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPolicyAssignmentPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "1.0");
  }

  // Test the getPolicyAssignment operation with and without retries enabled
  @Test
  public void testGetPolicyAssignmentWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testGetPolicyAssignmentWOptions();

    iamPolicyManagementService.disableRetries();
    testGetPolicyAssignmentWOptions();
  }

  // Test the getPolicyAssignment operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPolicyAssignmentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.getPolicyAssignment(null).execute();
  }

  // Test the updatePolicyAssignment operation with a valid options model parameter
  @Test
  public void testUpdatePolicyAssignmentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"id\": \"id\", \"account_id\": \"accountId\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"resources\": [{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"policy\": {\"resource_created\": {\"id\": \"id\"}, \"status\": \"status\", \"error_message\": {\"trace\": \"trace\", \"errors\": [{\"code\": \"insufficent_permissions\", \"message\": \"message\", \"details\": {\"conflicts_with\": {\"etag\": \"etag\", \"role\": \"role\", \"policy\": \"policy\"}}, \"more_info\": \"moreInfo\"}], \"status_code\": 0}}}], \"subject\": {\"id\": \"id\", \"type\": \"iam_id\"}, \"template\": {\"id\": \"id\", \"version\": \"version\"}, \"status\": \"in_progress\"}";
    String updatePolicyAssignmentPath = "/v1/policy_assignments/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdatePolicyAssignmentOptions model
    UpdatePolicyAssignmentOptions updatePolicyAssignmentOptionsModel = new UpdatePolicyAssignmentOptions.Builder()
      .assignmentId("testString")
      .version("1.0")
      .ifMatch("testString")
      .templateVersion("testString")
      .build();

    // Invoke updatePolicyAssignment() with a valid options model and verify the result
    Response<PolicyAssignmentV1> response = iamPolicyManagementService.updatePolicyAssignment(updatePolicyAssignmentOptionsModel).execute();
    assertNotNull(response);
    PolicyAssignmentV1 responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePolicyAssignmentPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "1.0");
  }

  // Test the updatePolicyAssignment operation with and without retries enabled
  @Test
  public void testUpdatePolicyAssignmentWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testUpdatePolicyAssignmentWOptions();

    iamPolicyManagementService.disableRetries();
    testUpdatePolicyAssignmentWOptions();
  }

  // Test the updatePolicyAssignment operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePolicyAssignmentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.updatePolicyAssignment(null).execute();
  }

  // Test the deletePolicyAssignment operation with a valid options model parameter
  @Test
  public void testDeletePolicyAssignmentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePolicyAssignmentPath = "/v1/policy_assignments/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePolicyAssignmentOptions model
    DeletePolicyAssignmentOptions deletePolicyAssignmentOptionsModel = new DeletePolicyAssignmentOptions.Builder()
      .assignmentId("testString")
      .build();

    // Invoke deletePolicyAssignment() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.deletePolicyAssignment(deletePolicyAssignmentOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePolicyAssignmentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deletePolicyAssignment operation with and without retries enabled
  @Test
  public void testDeletePolicyAssignmentWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testDeletePolicyAssignmentWOptions();

    iamPolicyManagementService.disableRetries();
    testDeletePolicyAssignmentWOptions();
  }

  // Test the deletePolicyAssignment operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePolicyAssignmentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.deletePolicyAssignment(null).execute();
  }

  // Test the getSettings operation with a valid options model parameter
  @Test
  public void testGetSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"external_account_identity_interaction\": {\"identity_types\": {\"user\": {\"state\": \"enabled\", \"external_allowed_accounts\": [\"externalAllowedAccounts\"]}, \"service_id\": {\"state\": \"enabled\", \"external_allowed_accounts\": [\"externalAllowedAccounts\"]}, \"service\": {\"state\": \"enabled\", \"external_allowed_accounts\": [\"externalAllowedAccounts\"]}}}}";
    String getSettingsPath = "/v1/accounts/testString/settings/access_management";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSettingsOptions model
    GetSettingsOptions getSettingsOptionsModel = new GetSettingsOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .build();

    // Invoke getSettings() with a valid options model and verify the result
    Response<AccountSettingsAccessManagement> response = iamPolicyManagementService.getSettings(getSettingsOptionsModel).execute();
    assertNotNull(response);
    AccountSettingsAccessManagement responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSettingsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSettings operation with and without retries enabled
  @Test
  public void testGetSettingsWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testGetSettingsWOptions();

    iamPolicyManagementService.disableRetries();
    testGetSettingsWOptions();
  }

  // Test the getSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.getSettings(null).execute();
  }

  // Test the updateSettings operation with a valid options model parameter
  @Test
  public void testUpdateSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"external_account_identity_interaction\": {\"identity_types\": {\"user\": {\"state\": \"enabled\", \"external_allowed_accounts\": [\"externalAllowedAccounts\"]}, \"service_id\": {\"state\": \"enabled\", \"external_allowed_accounts\": [\"externalAllowedAccounts\"]}, \"service\": {\"state\": \"enabled\", \"external_allowed_accounts\": [\"externalAllowedAccounts\"]}}}}";
    String updateSettingsPath = "/v1/accounts/testString/settings/access_management";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the IdentityTypesBase model
    IdentityTypesBase identityTypesBaseModel = new IdentityTypesBase.Builder()
      .state("enabled")
      .externalAllowedAccounts(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the IdentityTypesPatch model
    IdentityTypesPatch identityTypesPatchModel = new IdentityTypesPatch.Builder()
      .user(identityTypesBaseModel)
      .serviceId(identityTypesBaseModel)
      .service(identityTypesBaseModel)
      .build();

    // Construct an instance of the ExternalAccountIdentityInteractionPatch model
    ExternalAccountIdentityInteractionPatch externalAccountIdentityInteractionPatchModel = new ExternalAccountIdentityInteractionPatch.Builder()
      .identityTypes(identityTypesPatchModel)
      .build();

    // Construct an instance of the UpdateSettingsOptions model
    UpdateSettingsOptions updateSettingsOptionsModel = new UpdateSettingsOptions.Builder()
      .accountId("testString")
      .ifMatch("testString")
      .externalAccountIdentityInteraction(externalAccountIdentityInteractionPatchModel)
      .acceptLanguage("default")
      .build();

    // Invoke updateSettings() with a valid options model and verify the result
    Response<AccountSettingsAccessManagement> response = iamPolicyManagementService.updateSettings(updateSettingsOptionsModel).execute();
    assertNotNull(response);
    AccountSettingsAccessManagement responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSettingsPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSettings operation with and without retries enabled
  @Test
  public void testUpdateSettingsWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testUpdateSettingsWOptions();

    iamPolicyManagementService.disableRetries();
    testUpdateSettingsWOptions();
  }

  // Test the updateSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.updateSettings(null).execute();
  }

  // Test the listActionControlTemplates operation with a valid options model parameter
  @Test
  public void testListActionControlTemplatesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 1, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"previous\": {\"href\": \"href\", \"start\": \"start\"}, \"action_control_templates\": [{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"committed\": false, \"action_control\": {\"service_name\": \"serviceName\", \"description\": \"description\", \"actions\": [\"actions\"]}, \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"version\": \"version\", \"state\": \"active\"}]}";
    String listActionControlTemplatesPath = "/v1/action_control_templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListActionControlTemplatesOptions model
    ListActionControlTemplatesOptions listActionControlTemplatesOptionsModel = new ListActionControlTemplatesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listActionControlTemplates() with a valid options model and verify the result
    Response<ActionControlTemplateCollection> response = iamPolicyManagementService.listActionControlTemplates(listActionControlTemplatesOptionsModel).execute();
    assertNotNull(response);
    ActionControlTemplateCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listActionControlTemplatesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("account_id"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listActionControlTemplates operation with and without retries enabled
  @Test
  public void testListActionControlTemplatesWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testListActionControlTemplatesWOptions();

    iamPolicyManagementService.disableRetries();
    testListActionControlTemplatesWOptions();
  }

  // Test the listActionControlTemplates operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListActionControlTemplatesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.listActionControlTemplates(null).execute();
  }

  // Test the listActionControlTemplates operation using the ActionControlTemplatesPager.getNext() method
  @Test
  public void testListActionControlTemplatesWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"action_control_templates\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"committed\":false,\"action_control\":{\"service_name\":\"serviceName\",\"description\":\"description\",\"actions\":[\"actions\"]},\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"version\":\"version\",\"state\":\"active\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"action_control_templates\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"committed\":false,\"action_control\":{\"service_name\":\"serviceName\",\"description\":\"description\",\"actions\":[\"actions\"]},\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"version\":\"version\",\"state\":\"active\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListActionControlTemplatesOptions listActionControlTemplatesOptions = new ListActionControlTemplatesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .limit(Long.valueOf("10"))
      .build();

    List<ActionControlTemplate> allResults = new ArrayList<>();
    ActionControlTemplatesPager pager = new ActionControlTemplatesPager(iamPolicyManagementService, listActionControlTemplatesOptions);
    while (pager.hasNext()) {
      List<ActionControlTemplate> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listActionControlTemplates operation using the ActionControlTemplatesPager.getAll() method
  @Test
  public void testListActionControlTemplatesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"action_control_templates\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"committed\":false,\"action_control\":{\"service_name\":\"serviceName\",\"description\":\"description\",\"actions\":[\"actions\"]},\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"version\":\"version\",\"state\":\"active\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"action_control_templates\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"committed\":false,\"action_control\":{\"service_name\":\"serviceName\",\"description\":\"description\",\"actions\":[\"actions\"]},\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"version\":\"version\",\"state\":\"active\"}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListActionControlTemplatesOptions listActionControlTemplatesOptions = new ListActionControlTemplatesOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .limit(Long.valueOf("10"))
      .build();

    ActionControlTemplatesPager pager = new ActionControlTemplatesPager(iamPolicyManagementService, listActionControlTemplatesOptions);
    List<ActionControlTemplate> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createActionControlTemplate operation with a valid options model parameter
  @Test
  public void testCreateActionControlTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"committed\": false, \"action_control\": {\"service_name\": \"serviceName\", \"description\": \"description\", \"actions\": [\"actions\"]}, \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"version\": \"version\", \"state\": \"active\"}";
    String createActionControlTemplatePath = "/v1/action_control_templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the TemplateActionControl model
    TemplateActionControl templateActionControlModel = new TemplateActionControl.Builder()
      .serviceName("testString")
      .description("testString")
      .actions(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the CreateActionControlTemplateOptions model
    CreateActionControlTemplateOptions createActionControlTemplateOptionsModel = new CreateActionControlTemplateOptions.Builder()
      .name("testString")
      .accountId("testString")
      .description("testString")
      .committed(true)
      .actionControl(templateActionControlModel)
      .acceptLanguage("default")
      .build();

    // Invoke createActionControlTemplate() with a valid options model and verify the result
    Response<ActionControlTemplate> response = iamPolicyManagementService.createActionControlTemplate(createActionControlTemplateOptionsModel).execute();
    assertNotNull(response);
    ActionControlTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createActionControlTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createActionControlTemplate operation with and without retries enabled
  @Test
  public void testCreateActionControlTemplateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCreateActionControlTemplateWOptions();

    iamPolicyManagementService.disableRetries();
    testCreateActionControlTemplateWOptions();
  }

  // Test the createActionControlTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateActionControlTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.createActionControlTemplate(null).execute();
  }

  // Test the getActionControlTemplate operation with a valid options model parameter
  @Test
  public void testGetActionControlTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"committed\": false, \"action_control\": {\"service_name\": \"serviceName\", \"description\": \"description\", \"actions\": [\"actions\"]}, \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"version\": \"version\", \"state\": \"active\"}";
    String getActionControlTemplatePath = "/v1/action_control_templates/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetActionControlTemplateOptions model
    GetActionControlTemplateOptions getActionControlTemplateOptionsModel = new GetActionControlTemplateOptions.Builder()
      .actionControlTemplateId("testString")
      .state("active")
      .build();

    // Invoke getActionControlTemplate() with a valid options model and verify the result
    Response<ActionControlTemplate> response = iamPolicyManagementService.getActionControlTemplate(getActionControlTemplateOptionsModel).execute();
    assertNotNull(response);
    ActionControlTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getActionControlTemplatePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("state"), "active");
  }

  // Test the getActionControlTemplate operation with and without retries enabled
  @Test
  public void testGetActionControlTemplateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testGetActionControlTemplateWOptions();

    iamPolicyManagementService.disableRetries();
    testGetActionControlTemplateWOptions();
  }

  // Test the getActionControlTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetActionControlTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.getActionControlTemplate(null).execute();
  }

  // Test the deleteActionControlTemplate operation with a valid options model parameter
  @Test
  public void testDeleteActionControlTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteActionControlTemplatePath = "/v1/action_control_templates/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteActionControlTemplateOptions model
    DeleteActionControlTemplateOptions deleteActionControlTemplateOptionsModel = new DeleteActionControlTemplateOptions.Builder()
      .actionControlTemplateId("testString")
      .build();

    // Invoke deleteActionControlTemplate() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.deleteActionControlTemplate(deleteActionControlTemplateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteActionControlTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteActionControlTemplate operation with and without retries enabled
  @Test
  public void testDeleteActionControlTemplateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testDeleteActionControlTemplateWOptions();

    iamPolicyManagementService.disableRetries();
    testDeleteActionControlTemplateWOptions();
  }

  // Test the deleteActionControlTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteActionControlTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.deleteActionControlTemplate(null).execute();
  }

  // Test the createActionControlTemplateVersion operation with a valid options model parameter
  @Test
  public void testCreateActionControlTemplateVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"committed\": false, \"action_control\": {\"service_name\": \"serviceName\", \"description\": \"description\", \"actions\": [\"actions\"]}, \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"version\": \"version\", \"state\": \"active\"}";
    String createActionControlTemplateVersionPath = "/v1/action_control_templates/testString/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the TemplateActionControl model
    TemplateActionControl templateActionControlModel = new TemplateActionControl.Builder()
      .serviceName("testString")
      .description("testString")
      .actions(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the CreateActionControlTemplateVersionOptions model
    CreateActionControlTemplateVersionOptions createActionControlTemplateVersionOptionsModel = new CreateActionControlTemplateVersionOptions.Builder()
      .actionControlTemplateId("testString")
      .name("testString")
      .description("testString")
      .actionControl(templateActionControlModel)
      .committed(true)
      .build();

    // Invoke createActionControlTemplateVersion() with a valid options model and verify the result
    Response<ActionControlTemplate> response = iamPolicyManagementService.createActionControlTemplateVersion(createActionControlTemplateVersionOptionsModel).execute();
    assertNotNull(response);
    ActionControlTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createActionControlTemplateVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createActionControlTemplateVersion operation with and without retries enabled
  @Test
  public void testCreateActionControlTemplateVersionWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCreateActionControlTemplateVersionWOptions();

    iamPolicyManagementService.disableRetries();
    testCreateActionControlTemplateVersionWOptions();
  }

  // Test the createActionControlTemplateVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateActionControlTemplateVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.createActionControlTemplateVersion(null).execute();
  }

  // Test the listActionControlTemplateVersions operation with a valid options model parameter
  @Test
  public void testListActionControlTemplateVersionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 1, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"previous\": {\"href\": \"href\", \"start\": \"start\"}, \"versions\": [{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"committed\": false, \"action_control\": {\"service_name\": \"serviceName\", \"description\": \"description\", \"actions\": [\"actions\"]}, \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"version\": \"version\", \"state\": \"active\"}]}";
    String listActionControlTemplateVersionsPath = "/v1/action_control_templates/testString/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListActionControlTemplateVersionsOptions model
    ListActionControlTemplateVersionsOptions listActionControlTemplateVersionsOptionsModel = new ListActionControlTemplateVersionsOptions.Builder()
      .actionControlTemplateId("testString")
      .state("active")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listActionControlTemplateVersions() with a valid options model and verify the result
    Response<ActionControlTemplateVersionsCollection> response = iamPolicyManagementService.listActionControlTemplateVersions(listActionControlTemplateVersionsOptionsModel).execute();
    assertNotNull(response);
    ActionControlTemplateVersionsCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listActionControlTemplateVersionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("state"), "active");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listActionControlTemplateVersions operation with and without retries enabled
  @Test
  public void testListActionControlTemplateVersionsWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testListActionControlTemplateVersionsWOptions();

    iamPolicyManagementService.disableRetries();
    testListActionControlTemplateVersionsWOptions();
  }

  // Test the listActionControlTemplateVersions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListActionControlTemplateVersionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.listActionControlTemplateVersions(null).execute();
  }

  // Test the listActionControlTemplateVersions operation using the ActionControlTemplateVersionsPager.getNext() method
  @Test
  public void testListActionControlTemplateVersionsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"versions\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"committed\":false,\"action_control\":{\"service_name\":\"serviceName\",\"description\":\"description\",\"actions\":[\"actions\"]},\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"version\":\"version\",\"state\":\"active\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"versions\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"committed\":false,\"action_control\":{\"service_name\":\"serviceName\",\"description\":\"description\",\"actions\":[\"actions\"]},\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"version\":\"version\",\"state\":\"active\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListActionControlTemplateVersionsOptions listActionControlTemplateVersionsOptions = new ListActionControlTemplateVersionsOptions.Builder()
      .actionControlTemplateId("testString")
      .state("active")
      .limit(Long.valueOf("10"))
      .build();

    List<ActionControlTemplate> allResults = new ArrayList<>();
    ActionControlTemplateVersionsPager pager = new ActionControlTemplateVersionsPager(iamPolicyManagementService, listActionControlTemplateVersionsOptions);
    while (pager.hasNext()) {
      List<ActionControlTemplate> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listActionControlTemplateVersions operation using the ActionControlTemplateVersionsPager.getAll() method
  @Test
  public void testListActionControlTemplateVersionsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"versions\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"committed\":false,\"action_control\":{\"service_name\":\"serviceName\",\"description\":\"description\",\"actions\":[\"actions\"]},\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"version\":\"version\",\"state\":\"active\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"versions\":[{\"name\":\"name\",\"description\":\"description\",\"account_id\":\"accountId\",\"committed\":false,\"action_control\":{\"service_name\":\"serviceName\",\"description\":\"description\",\"actions\":[\"actions\"]},\"id\":\"id\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"version\":\"version\",\"state\":\"active\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListActionControlTemplateVersionsOptions listActionControlTemplateVersionsOptions = new ListActionControlTemplateVersionsOptions.Builder()
      .actionControlTemplateId("testString")
      .state("active")
      .limit(Long.valueOf("10"))
      .build();

    ActionControlTemplateVersionsPager pager = new ActionControlTemplateVersionsPager(iamPolicyManagementService, listActionControlTemplateVersionsOptions);
    List<ActionControlTemplate> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the replaceActionControlTemplate operation with a valid options model parameter
  @Test
  public void testReplaceActionControlTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"committed\": false, \"action_control\": {\"service_name\": \"serviceName\", \"description\": \"description\", \"actions\": [\"actions\"]}, \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"version\": \"version\", \"state\": \"active\"}";
    String replaceActionControlTemplatePath = "/v1/action_control_templates/testString/versions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the TemplateActionControl model
    TemplateActionControl templateActionControlModel = new TemplateActionControl.Builder()
      .serviceName("testString")
      .description("testString")
      .actions(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ReplaceActionControlTemplateOptions model
    ReplaceActionControlTemplateOptions replaceActionControlTemplateOptionsModel = new ReplaceActionControlTemplateOptions.Builder()
      .actionControlTemplateId("testString")
      .version("testString")
      .ifMatch("testString")
      .name("testString")
      .description("testString")
      .actionControl(templateActionControlModel)
      .committed(true)
      .build();

    // Invoke replaceActionControlTemplate() with a valid options model and verify the result
    Response<ActionControlTemplate> response = iamPolicyManagementService.replaceActionControlTemplate(replaceActionControlTemplateOptionsModel).execute();
    assertNotNull(response);
    ActionControlTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceActionControlTemplatePath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceActionControlTemplate operation with and without retries enabled
  @Test
  public void testReplaceActionControlTemplateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testReplaceActionControlTemplateWOptions();

    iamPolicyManagementService.disableRetries();
    testReplaceActionControlTemplateWOptions();
  }

  // Test the replaceActionControlTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceActionControlTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.replaceActionControlTemplate(null).execute();
  }

  // Test the deleteActionControlTemplateVersion operation with a valid options model parameter
  @Test
  public void testDeleteActionControlTemplateVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteActionControlTemplateVersionPath = "/v1/action_control_templates/testString/versions/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteActionControlTemplateVersionOptions model
    DeleteActionControlTemplateVersionOptions deleteActionControlTemplateVersionOptionsModel = new DeleteActionControlTemplateVersionOptions.Builder()
      .actionControlTemplateId("testString")
      .version("testString")
      .build();

    // Invoke deleteActionControlTemplateVersion() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.deleteActionControlTemplateVersion(deleteActionControlTemplateVersionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteActionControlTemplateVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteActionControlTemplateVersion operation with and without retries enabled
  @Test
  public void testDeleteActionControlTemplateVersionWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testDeleteActionControlTemplateVersionWOptions();

    iamPolicyManagementService.disableRetries();
    testDeleteActionControlTemplateVersionWOptions();
  }

  // Test the deleteActionControlTemplateVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteActionControlTemplateVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.deleteActionControlTemplateVersion(null).execute();
  }

  // Test the getActionControlTemplateVersion operation with a valid options model parameter
  @Test
  public void testGetActionControlTemplateVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"account_id\": \"accountId\", \"committed\": false, \"action_control\": {\"service_name\": \"serviceName\", \"description\": \"description\", \"actions\": [\"actions\"]}, \"id\": \"id\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"version\": \"version\", \"state\": \"active\"}";
    String getActionControlTemplateVersionPath = "/v1/action_control_templates/testString/versions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetActionControlTemplateVersionOptions model
    GetActionControlTemplateVersionOptions getActionControlTemplateVersionOptionsModel = new GetActionControlTemplateVersionOptions.Builder()
      .actionControlTemplateId("testString")
      .version("testString")
      .build();

    // Invoke getActionControlTemplateVersion() with a valid options model and verify the result
    Response<ActionControlTemplate> response = iamPolicyManagementService.getActionControlTemplateVersion(getActionControlTemplateVersionOptionsModel).execute();
    assertNotNull(response);
    ActionControlTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getActionControlTemplateVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getActionControlTemplateVersion operation with and without retries enabled
  @Test
  public void testGetActionControlTemplateVersionWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testGetActionControlTemplateVersionWOptions();

    iamPolicyManagementService.disableRetries();
    testGetActionControlTemplateVersionWOptions();
  }

  // Test the getActionControlTemplateVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetActionControlTemplateVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.getActionControlTemplateVersion(null).execute();
  }

  // Test the commitActionControlTemplate operation with a valid options model parameter
  @Test
  public void testCommitActionControlTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String commitActionControlTemplatePath = "/v1/action_control_templates/testString/versions/testString/commit";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the CommitActionControlTemplateOptions model
    CommitActionControlTemplateOptions commitActionControlTemplateOptionsModel = new CommitActionControlTemplateOptions.Builder()
      .actionControlTemplateId("testString")
      .version("testString")
      .build();

    // Invoke commitActionControlTemplate() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.commitActionControlTemplate(commitActionControlTemplateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, commitActionControlTemplatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the commitActionControlTemplate operation with and without retries enabled
  @Test
  public void testCommitActionControlTemplateWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCommitActionControlTemplateWOptions();

    iamPolicyManagementService.disableRetries();
    testCommitActionControlTemplateWOptions();
  }

  // Test the commitActionControlTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCommitActionControlTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.commitActionControlTemplate(null).execute();
  }

  // Test the listActionControlAssignments operation with a valid options model parameter
  @Test
  public void testListActionControlAssignmentsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 1, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"previous\": {\"href\": \"href\", \"start\": \"start\"}, \"assignments\": [{\"id\": \"id\", \"account_id\": \"accountId\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"operation\": \"create\", \"resources\": [{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"action_control\": {\"resource_created\": {\"id\": \"id\"}, \"error_message\": {\"trace\": \"trace\", \"errors\": [{\"code\": \"insufficent_permissions\", \"message\": \"message\", \"details\": {\"conflicts_with\": {\"etag\": \"etag\", \"role\": \"role\", \"policy\": \"policy\"}}, \"more_info\": \"moreInfo\"}], \"status_code\": 0}}}], \"template\": {\"id\": \"id\", \"version\": \"version\"}, \"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"status\": \"accepted\"}]}";
    String listActionControlAssignmentsPath = "/v1/action_control_assignments";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListActionControlAssignmentsOptions model
    ListActionControlAssignmentsOptions listActionControlAssignmentsOptionsModel = new ListActionControlAssignmentsOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .templateId("testString")
      .templateVersion("testString")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listActionControlAssignments() with a valid options model and verify the result
    Response<ActionControlAssignmentCollection> response = iamPolicyManagementService.listActionControlAssignments(listActionControlAssignmentsOptionsModel).execute();
    assertNotNull(response);
    ActionControlAssignmentCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listActionControlAssignmentsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("account_id"), "testString");
    assertEquals(query.get("template_id"), "testString");
    assertEquals(query.get("template_version"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listActionControlAssignments operation with and without retries enabled
  @Test
  public void testListActionControlAssignmentsWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testListActionControlAssignmentsWOptions();

    iamPolicyManagementService.disableRetries();
    testListActionControlAssignmentsWOptions();
  }

  // Test the listActionControlAssignments operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListActionControlAssignmentsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.listActionControlAssignments(null).execute();
  }

  // Test the listActionControlAssignments operation using the ActionControlAssignmentsPager.getNext() method
  @Test
  public void testListActionControlAssignmentsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"assignments\":[{\"id\":\"id\",\"account_id\":\"accountId\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"operation\":\"create\",\"resources\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"action_control\":{\"resource_created\":{\"id\":\"id\"},\"error_message\":{\"trace\":\"trace\",\"errors\":[{\"code\":\"insufficent_permissions\",\"message\":\"message\",\"details\":{\"conflicts_with\":{\"etag\":\"etag\",\"role\":\"role\",\"policy\":\"policy\"}},\"more_info\":\"moreInfo\"}],\"status_code\":0}}}],\"template\":{\"id\":\"id\",\"version\":\"version\"},\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"status\":\"accepted\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"assignments\":[{\"id\":\"id\",\"account_id\":\"accountId\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"operation\":\"create\",\"resources\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"action_control\":{\"resource_created\":{\"id\":\"id\"},\"error_message\":{\"trace\":\"trace\",\"errors\":[{\"code\":\"insufficent_permissions\",\"message\":\"message\",\"details\":{\"conflicts_with\":{\"etag\":\"etag\",\"role\":\"role\",\"policy\":\"policy\"}},\"more_info\":\"moreInfo\"}],\"status_code\":0}}}],\"template\":{\"id\":\"id\",\"version\":\"version\"},\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"status\":\"accepted\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListActionControlAssignmentsOptions listActionControlAssignmentsOptions = new ListActionControlAssignmentsOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .templateId("testString")
      .templateVersion("testString")
      .limit(Long.valueOf("10"))
      .build();

    List<ActionControlAssignment> allResults = new ArrayList<>();
    ActionControlAssignmentsPager pager = new ActionControlAssignmentsPager(iamPolicyManagementService, listActionControlAssignmentsOptions);
    while (pager.hasNext()) {
      List<ActionControlAssignment> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listActionControlAssignments operation using the ActionControlAssignmentsPager.getAll() method
  @Test
  public void testListActionControlAssignmentsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"assignments\":[{\"id\":\"id\",\"account_id\":\"accountId\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"operation\":\"create\",\"resources\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"action_control\":{\"resource_created\":{\"id\":\"id\"},\"error_message\":{\"trace\":\"trace\",\"errors\":[{\"code\":\"insufficent_permissions\",\"message\":\"message\",\"details\":{\"conflicts_with\":{\"etag\":\"etag\",\"role\":\"role\",\"policy\":\"policy\"}},\"more_info\":\"moreInfo\"}],\"status_code\":0}}}],\"template\":{\"id\":\"id\",\"version\":\"version\"},\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"status\":\"accepted\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"assignments\":[{\"id\":\"id\",\"account_id\":\"accountId\",\"href\":\"href\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"created_by_id\":\"createdById\",\"last_modified_at\":\"2019-01-01T12:00:00.000Z\",\"last_modified_by_id\":\"lastModifiedById\",\"operation\":\"create\",\"resources\":[{\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"action_control\":{\"resource_created\":{\"id\":\"id\"},\"error_message\":{\"trace\":\"trace\",\"errors\":[{\"code\":\"insufficent_permissions\",\"message\":\"message\",\"details\":{\"conflicts_with\":{\"etag\":\"etag\",\"role\":\"role\",\"policy\":\"policy\"}},\"more_info\":\"moreInfo\"}],\"status_code\":0}}}],\"template\":{\"id\":\"id\",\"version\":\"version\"},\"target\":{\"type\":\"Account\",\"id\":\"id\"},\"status\":\"accepted\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListActionControlAssignmentsOptions listActionControlAssignmentsOptions = new ListActionControlAssignmentsOptions.Builder()
      .accountId("testString")
      .acceptLanguage("default")
      .templateId("testString")
      .templateVersion("testString")
      .limit(Long.valueOf("10"))
      .build();

    ActionControlAssignmentsPager pager = new ActionControlAssignmentsPager(iamPolicyManagementService, listActionControlAssignmentsOptions);
    List<ActionControlAssignment> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createActionControlTemplateAssignment operation with a valid options model parameter
  @Test
  public void testCreateActionControlTemplateAssignmentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 1, \"first\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\", \"start\": \"start\"}, \"previous\": {\"href\": \"href\", \"start\": \"start\"}, \"assignments\": [{\"id\": \"id\", \"account_id\": \"accountId\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"operation\": \"create\", \"resources\": [{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"action_control\": {\"resource_created\": {\"id\": \"id\"}, \"error_message\": {\"trace\": \"trace\", \"errors\": [{\"code\": \"insufficent_permissions\", \"message\": \"message\", \"details\": {\"conflicts_with\": {\"etag\": \"etag\", \"role\": \"role\", \"policy\": \"policy\"}}, \"more_info\": \"moreInfo\"}], \"status_code\": 0}}}], \"template\": {\"id\": \"id\", \"version\": \"version\"}, \"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"status\": \"accepted\"}]}";
    String createActionControlTemplateAssignmentPath = "/v1/action_control_assignments";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AssignmentTargetDetails model
    AssignmentTargetDetails assignmentTargetDetailsModel = new AssignmentTargetDetails.Builder()
      .type("Account")
      .id("testString")
      .build();

    // Construct an instance of the ActionControlAssignmentTemplate model
    ActionControlAssignmentTemplate actionControlAssignmentTemplateModel = new ActionControlAssignmentTemplate.Builder()
      .id("testString")
      .version("testString")
      .build();

    // Construct an instance of the CreateActionControlTemplateAssignmentOptions model
    CreateActionControlTemplateAssignmentOptions createActionControlTemplateAssignmentOptionsModel = new CreateActionControlTemplateAssignmentOptions.Builder()
      .target(assignmentTargetDetailsModel)
      .templates(java.util.Arrays.asList(actionControlAssignmentTemplateModel))
      .acceptLanguage("default")
      .build();

    // Invoke createActionControlTemplateAssignment() with a valid options model and verify the result
    Response<ActionControlAssignmentCollection> response = iamPolicyManagementService.createActionControlTemplateAssignment(createActionControlTemplateAssignmentOptionsModel).execute();
    assertNotNull(response);
    ActionControlAssignmentCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createActionControlTemplateAssignmentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createActionControlTemplateAssignment operation with and without retries enabled
  @Test
  public void testCreateActionControlTemplateAssignmentWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testCreateActionControlTemplateAssignmentWOptions();

    iamPolicyManagementService.disableRetries();
    testCreateActionControlTemplateAssignmentWOptions();
  }

  // Test the createActionControlTemplateAssignment operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateActionControlTemplateAssignmentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.createActionControlTemplateAssignment(null).execute();
  }

  // Test the getActionControlAssignment operation with a valid options model parameter
  @Test
  public void testGetActionControlAssignmentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"account_id\": \"accountId\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"operation\": \"create\", \"resources\": [{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"action_control\": {\"resource_created\": {\"id\": \"id\"}, \"error_message\": {\"trace\": \"trace\", \"errors\": [{\"code\": \"insufficent_permissions\", \"message\": \"message\", \"details\": {\"conflicts_with\": {\"etag\": \"etag\", \"role\": \"role\", \"policy\": \"policy\"}}, \"more_info\": \"moreInfo\"}], \"status_code\": 0}}}], \"template\": {\"id\": \"id\", \"version\": \"version\"}, \"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"status\": \"accepted\"}";
    String getActionControlAssignmentPath = "/v1/action_control_assignments/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetActionControlAssignmentOptions model
    GetActionControlAssignmentOptions getActionControlAssignmentOptionsModel = new GetActionControlAssignmentOptions.Builder()
      .assignmentId("testString")
      .build();

    // Invoke getActionControlAssignment() with a valid options model and verify the result
    Response<ActionControlAssignment> response = iamPolicyManagementService.getActionControlAssignment(getActionControlAssignmentOptionsModel).execute();
    assertNotNull(response);
    ActionControlAssignment responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getActionControlAssignmentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getActionControlAssignment operation with and without retries enabled
  @Test
  public void testGetActionControlAssignmentWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testGetActionControlAssignmentWOptions();

    iamPolicyManagementService.disableRetries();
    testGetActionControlAssignmentWOptions();
  }

  // Test the getActionControlAssignment operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetActionControlAssignmentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.getActionControlAssignment(null).execute();
  }

  // Test the updateActionControlAssignment operation with a valid options model parameter
  @Test
  public void testUpdateActionControlAssignmentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"account_id\": \"accountId\", \"href\": \"href\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by_id\": \"createdById\", \"last_modified_at\": \"2019-01-01T12:00:00.000Z\", \"last_modified_by_id\": \"lastModifiedById\", \"operation\": \"create\", \"resources\": [{\"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"action_control\": {\"resource_created\": {\"id\": \"id\"}, \"error_message\": {\"trace\": \"trace\", \"errors\": [{\"code\": \"insufficent_permissions\", \"message\": \"message\", \"details\": {\"conflicts_with\": {\"etag\": \"etag\", \"role\": \"role\", \"policy\": \"policy\"}}, \"more_info\": \"moreInfo\"}], \"status_code\": 0}}}], \"template\": {\"id\": \"id\", \"version\": \"version\"}, \"target\": {\"type\": \"Account\", \"id\": \"id\"}, \"status\": \"accepted\"}";
    String updateActionControlAssignmentPath = "/v1/action_control_assignments/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateActionControlAssignmentOptions model
    UpdateActionControlAssignmentOptions updateActionControlAssignmentOptionsModel = new UpdateActionControlAssignmentOptions.Builder()
      .assignmentId("testString")
      .ifMatch("testString")
      .templateVersion("testString")
      .build();

    // Invoke updateActionControlAssignment() with a valid options model and verify the result
    Response<ActionControlAssignment> response = iamPolicyManagementService.updateActionControlAssignment(updateActionControlAssignmentOptionsModel).execute();
    assertNotNull(response);
    ActionControlAssignment responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateActionControlAssignmentPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "testString");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateActionControlAssignment operation with and without retries enabled
  @Test
  public void testUpdateActionControlAssignmentWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testUpdateActionControlAssignmentWOptions();

    iamPolicyManagementService.disableRetries();
    testUpdateActionControlAssignmentWOptions();
  }

  // Test the updateActionControlAssignment operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateActionControlAssignmentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.updateActionControlAssignment(null).execute();
  }

  // Test the deleteActionControlAssignment operation with a valid options model parameter
  @Test
  public void testDeleteActionControlAssignmentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteActionControlAssignmentPath = "/v1/action_control_assignments/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteActionControlAssignmentOptions model
    DeleteActionControlAssignmentOptions deleteActionControlAssignmentOptionsModel = new DeleteActionControlAssignmentOptions.Builder()
      .assignmentId("testString")
      .build();

    // Invoke deleteActionControlAssignment() with a valid options model and verify the result
    Response<Void> response = iamPolicyManagementService.deleteActionControlAssignment(deleteActionControlAssignmentOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteActionControlAssignmentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteActionControlAssignment operation with and without retries enabled
  @Test
  public void testDeleteActionControlAssignmentWRetries() throws Throwable {
    iamPolicyManagementService.enableRetries(4, 30);
    testDeleteActionControlAssignmentWOptions();

    iamPolicyManagementService.disableRetries();
    testDeleteActionControlAssignmentWOptions();
  }

  // Test the deleteActionControlAssignment operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteActionControlAssignmentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    iamPolicyManagementService.deleteActionControlAssignment(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    iamPolicyManagementService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    iamPolicyManagementService = IamPolicyManagement.newInstance(serviceName);
    String url = server.url("/").toString();
    iamPolicyManagementService.setServiceUrl(url);
  }
}