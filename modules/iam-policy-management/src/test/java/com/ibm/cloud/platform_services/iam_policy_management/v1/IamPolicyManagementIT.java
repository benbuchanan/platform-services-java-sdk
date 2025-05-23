/*
 * (C) Copyright IBM Corp. 2020.
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

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertNotNull;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;

import com.ibm.cloud.platform_services.iam_policy_management.v1.model.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.cloud.platform_services.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.exception.BadRequestException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

/**
 * Integration test class for the IamPolicyManagement service.
 */
public class IamPolicyManagementIT extends SdkIntegrationTestBase {

    IamPolicyManagement service = null;
    Random random = new Random();

    private final String TEST_UNIQUE_ID = String.valueOf(random.nextInt(100000));
    private static final String TEST_USER_PREFIX = "IBMid-SDKJava";
    private final String TEST_USER_ID = TEST_USER_PREFIX + TEST_UNIQUE_ID;
    private final String TEST_USER_ID_TWO = TEST_USER_ID + "2";
    private static final String HEADER_ETAG = "ETag";
    private static final String TEST_VIEW_ROLE_CRN = "crn:v1:bluemix:public:iam::::role:Viewer";
    private static final String TEST_EDITOR_ROLE_CRN = "crn:v1:bluemix:public:iam::::role:Editor";
    private static final String TEST_SERVICE_NAME = "iam-groups";
    private static final String POLICY_TYPE = "access";
    private static final	String TEST_SERVICE_ROLE_CRN = "crn:v1:bluemix:public:iam-identity::::serviceRole:ServiceIdCreator";

    String testAccountId = null;
    String testTargetAccountId = null;
    String testTargetEnterpriseAccountId = null;
    String testPolicyId = null;
    String testPolicyEtag = null;
    String testV2PolicyId = null;
    String testV2PolicyEtag = null;

    private static final String testCustomRoleNamePrefix = "TestJavaNode";
    private final String testCustomRoleName = testCustomRoleNamePrefix + TEST_UNIQUE_ID;
    private final String testCustomRoleDisplayName = "SDK " + testCustomRoleName;
    private final String testCustomRoleDescription = "SDK " + testCustomRoleName;
    private final List<String> testCustomRoleActions = Arrays.asList("iam-groups.groups.read");

    String testCustomRoleId = null;
    String testCustomRoleEtag = null;

    private static final String TEST_TEMPLATE_PREFIX = "SDKJava";
    private final String TEST_TEMPLATE_NAME = TEST_TEMPLATE_PREFIX + TEST_UNIQUE_ID;
    private final String TEST_ACTION_CONTROL_TEMPLATE_NAME = "ActionControl" + TEST_TEMPLATE_PREFIX + TEST_UNIQUE_ID;

    String testTemplateId = null;
    String testTemplateVersion = null;
    String testTemplateEtag = null;
    String testNewTemplateVersion = null;
    String testAssignmentId = null;
    String testAssignmentPolicyId = null;
    String testS2STemplateId = null;
    String testS2SBaseTemplateVersion = null;
    String testS2STemplateVersion = null;
    String testAssignmentETag = null;
    String testAccountSettingsETag = null;
    String testActionControlBaseTemplateId = null;
    String testActionControlBaseTemplateVersion = null;
    String testActionControlBaseTemplateETag = null;
    String testActionControlTemplateId = null;
    String testActionControlTemplateVersion = null;
    String testActionControlTemplateNewVersion = null;
    String testActionControlTemplateETag = null;
    String testActionControlAssignmentId = null;
    String testActionControlAssignmentETag = null;

    @Override
    public String getConfigFilename() {
        return "../../iam_policy_management.env";
    }

    @Override
    public boolean loggingEnabled() {
        return false;
    }

    /**
     * This method is invoked before any @Test-annotated methods, and is responsible for
     * creating the instance of the service that will be used by the rest of the test methods,
     * as well as any other required initialization.
     */
    @BeforeClass
    public void constructService() {
        // Ask super if we should skip the tests.
        if (skipTests()) {
            return;
        }

        // Load up the config properties for this service.
        Map<String, String> config = CredentialUtils.getServiceProperties(IamPolicyManagement.DEFAULT_SERVICE_NAME);

        // Retrieve our test-specific properties.
        testAccountId = config.get("TEST_ACCOUNT_ID");
        assertNotNull(testAccountId);
        testTargetAccountId = config.get("TEST_TARGET_ACCOUNT_ID");
        assertNotNull(testTargetAccountId);

        testTargetEnterpriseAccountId = config.get("TEST_TARGET_ENTERPRISE_ACCOUNT_ID");
        assertNotNull(testTargetEnterpriseAccountId);

        // Construct the service from our external configuration.
        service = IamPolicyManagement.newInstance();
        assertNotNull(service);
        assertNotNull(service.getServiceUrl());

        log("Using Account Id: " + testAccountId);
        log("Using Service URL: " + service.getServiceUrl());
        log("Using Child Account in Enterprise" + testTargetAccountId);
        log("Using  Enterprise Account" + testTargetEnterpriseAccountId);
    }

    @Test
    public void testCreateAccessPolicy() {

        ResourceAttribute resourceAttributeAccount = new ResourceAttribute.Builder()
          .name("accountId")
          .value(testAccountId)
          .operator("stringEquals")
          .build();

        ResourceAttribute resourceAttributeService = new ResourceAttribute.Builder()
          .name("serviceType")
          .value("service")
          .operator("stringEquals")
          .build();

        ResourceTag resourceAttributeTag = new ResourceTag.Builder()
                .name("project")
                .value("prototype")
                .operator("stringEquals")
                .build();

        SubjectAttribute subjectAttributeModel = new SubjectAttribute.Builder()
          .name("iam_id")
          .value(TEST_USER_ID)
          .build();

        PolicyResource policyResourceModel = new PolicyResource.Builder()
          .attributes(new ArrayList<ResourceAttribute>(Arrays.asList(resourceAttributeAccount,
            resourceAttributeService)))
          .tags(new ArrayList<ResourceTag>(Arrays.asList(resourceAttributeTag)))
          .build();

        PolicyRole policyRoleModel = new PolicyRole.Builder()
          .roleId(TEST_VIEW_ROLE_CRN)
          .build();

        PolicySubject policySubjectModel = new PolicySubject.Builder()
          .attributes(new ArrayList<SubjectAttribute>(Arrays.asList(subjectAttributeModel)))
          .build();

        CreatePolicyOptions options = new CreatePolicyOptions.Builder()
          .type(POLICY_TYPE)
          .subjects(Arrays.asList(policySubjectModel))
          .roles(Arrays.asList(policyRoleModel))
          .resources(Arrays.asList(policyResourceModel))
          .build();

        Response<Policy> response = service.createPolicy(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 201);

        Policy result = response.getResult();
        assertNotNull(result);
        assertEquals(result.getType(), POLICY_TYPE);
        assertEquals(result.getSubjects(), new ArrayList<PolicySubject>(Arrays.asList(policySubjectModel)));
        assertEquals(result.getResources(), new ArrayList<PolicyResource>(Arrays.asList(policyResourceModel)));
        assertEquals(result.getRoles().get(0).roleId(), policyRoleModel.roleId());

        testPolicyId = result.getId();
    }

    @Test(dependsOnMethods = {"testCreateAccessPolicy"})
    public void testGetAccessPolicy() {
        assertNotNull(testPolicyId);

        GetPolicyOptions options = new GetPolicyOptions.Builder()
                .policyId(testPolicyId)
                .build();

        Response<PolicyTemplateMetaData> response = service.getPolicy(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        PolicyTemplateMetaData result = response.getResult();
        assertNotNull(result);
        assertEquals(result.getId(), testPolicyId);


        List<String> values = response.getHeaders().values(HEADER_ETAG);
        assertNotNull(values);
        testPolicyEtag = values.get(0);
    }

    @Test(dependsOnMethods = {"testGetAccessPolicy"})
    public void testUpdateAccessPolicy() {
        assertNotNull(testPolicyId);
        assertNotNull(testPolicyEtag);

        ResourceAttribute resourceAttributeAccount = new ResourceAttribute.Builder()
          .name("accountId")
          .value(testAccountId)
          .operator("stringEquals")
          .build();

        ResourceAttribute resourceAttributeService = new ResourceAttribute.Builder()
          .name("serviceName")
          .value(TEST_SERVICE_NAME)
          .operator("stringEquals")
          .build();

        SubjectAttribute subjectAttributeModel = new SubjectAttribute.Builder()
          .name("iam_id")
          .value(TEST_USER_ID)
          .build();

        PolicyResource policyResourceModel = new PolicyResource.Builder()
          .attributes(new ArrayList<ResourceAttribute>(Arrays.asList(resourceAttributeAccount,
            resourceAttributeService)))
          .build();

        PolicyRole policyRoleModel = new PolicyRole.Builder()
          .roleId(TEST_EDITOR_ROLE_CRN)
          .build();

        PolicySubject policySubjectModel = new PolicySubject.Builder()
          .attributes(new ArrayList<SubjectAttribute>(Arrays.asList(subjectAttributeModel)))
          .build();

        ReplacePolicyOptions options = new ReplacePolicyOptions.Builder()
                .policyId(testPolicyId)
                .ifMatch(testPolicyEtag)
                .type(POLICY_TYPE)
                .subjects(new ArrayList<PolicySubject>(Arrays.asList(policySubjectModel)))
                .roles(new ArrayList<PolicyRole>(Arrays.asList(policyRoleModel)))
                .resources(new ArrayList<PolicyResource>(Arrays.asList(policyResourceModel)))
                .build();

        Response<Policy> response = service.replacePolicy(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        Policy result = response.getResult();
        assertNotNull(result);
        assertEquals(result.getId(), testPolicyId);
        assertEquals(result.getType(), POLICY_TYPE);
        assertEquals(result.getSubjects(), new ArrayList<PolicySubject>(Arrays.asList(policySubjectModel)));
        assertEquals(result.getResources(), new ArrayList<PolicyResource>(Arrays.asList(policyResourceModel)));
        assertEquals(result.getRoles().get(0).roleId(), policyRoleModel.roleId());

        List<String> values = response.getHeaders().values(HEADER_ETAG);
        assertNotNull(values);
        testPolicyEtag = values.get(0);
    }

    @Test(dependsOnMethods = {"testUpdateAccessPolicy"})
    public void testPatchPolicy() {
        assertNotNull(testPolicyId);
        assertNotNull(testPolicyEtag);

        UpdatePolicyStateOptions updatePolicyStateOptions = new UpdatePolicyStateOptions.Builder()
                .policyId(testPolicyId)
                .ifMatch(testPolicyEtag)
                .state("active")
                .build();

        Response<Policy> response = service.updatePolicyState(updatePolicyStateOptions).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        Policy policyResult = response.getResult();
        assertNotNull(policyResult);
        assertEquals(policyResult.getId(), testPolicyId);
        assertEquals(policyResult.getType(), POLICY_TYPE);
        assertEquals(policyResult.getState(), "active");
    }

    @Test(dependsOnMethods = {"testPatchPolicy"})
    public void testListAccessPolicies() throws Exception, InterruptedException {
        assertNotNull(testPolicyId);

        ListPoliciesOptions options = new ListPoliciesOptions.Builder()
                .accountId(testAccountId)
                .build();

        Response<PolicyCollection> response = service.listPolicies(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        PolicyCollection result = response.getResult();
        assertNotNull(result);

        // Confirm the test policy is present
        boolean foundTestPolicy = false;
        for (PolicyTemplateMetaData policy : result.getPolicies()) {
            if (testPolicyId.equals(policy.getId())) {
                foundTestPolicy = true;
                break;
            }
        }
        assertTrue(foundTestPolicy);
    }

    @Test
    public void testCreateV2AccessPolicy() {

        V2PolicyResourceAttribute resourceAttributeAccount = new V2PolicyResourceAttribute.Builder()
          .key("accountId")
          .value(testAccountId)
          .operator("stringEquals")
          .build();

        V2PolicyResourceAttribute resourceAttributeService = new V2PolicyResourceAttribute.Builder()
          .key("serviceType")
          .value("service")
          .operator("stringEquals")
          .build();
        
        V2PolicyResourceTag resourceAttributeTag = new V2PolicyResourceTag.Builder()
          .key("project")
          .value("prototype")
          .operator("stringEquals")
          .build();


        V2PolicySubjectAttribute subjectAttributeModel = new V2PolicySubjectAttribute.Builder()
          .key("iam_id")
          .value(TEST_USER_ID_TWO)
          .operator("stringEquals")
          .build();

        V2PolicyResource policyResourceModel = new V2PolicyResource.Builder()
          .attributes(new ArrayList<V2PolicyResourceAttribute>(Arrays.asList(resourceAttributeAccount,
            resourceAttributeService)))
          .tags(new ArrayList<V2PolicyResourceTag>(Arrays.asList(resourceAttributeTag)))
          .build();

        V2PolicySubject policySubjectModel = new V2PolicySubject.Builder()
          .attributes(new ArrayList<V2PolicySubjectAttribute>(Arrays.asList(subjectAttributeModel)))
          .build();

        Roles rolesModel = new Roles.Builder()
          .roleId(TEST_VIEW_ROLE_CRN)
          .build();
        
        Grant policyGrantModel = new Grant.Builder()
          .roles(Arrays.asList(rolesModel))
          .build();

        Control controlModel = new Control.Builder()
          .grant(policyGrantModel)
          .build();

        NestedConditionRuleAttribute weeklyConditionAttributeModel = new NestedConditionRuleAttribute.Builder()
          .key("{{environment.attributes.day_of_week}}")
          .value(new ArrayList<String>(Arrays.asList("1+00:00", "2+00:00", "3+00:00", "4+00:00", "5+00:00")))
          .operator("dayOfWeekAnyOf")
          .build();
        

        NestedConditionRuleAttribute startConditionAttributeModel = new NestedConditionRuleAttribute.Builder()
          .key("{{environment.attributes.current_time}}")
          .value("09:00:00+00:00")
          .operator("timeGreaterThanOrEquals")
          .build();

        NestedConditionRuleAttribute endConditionAttributeModel = new NestedConditionRuleAttribute.Builder()
          .key("{{environment.attributes.current_time}}")
          .value("17:00:00+00:00")
          .operator("timeLessThanOrEquals")
          .build();

        V2PolicyRuleRuleWithNestedConditions policyRuleModel = new V2PolicyRuleRuleWithNestedConditions.Builder()
          .operator("and")
          .conditions(new ArrayList<NestedCondition>(Arrays.asList(weeklyConditionAttributeModel,
            startConditionAttributeModel, endConditionAttributeModel)))
          .build();

        CreateV2PolicyOptions options = new CreateV2PolicyOptions.Builder()
          .type(POLICY_TYPE)
          .subject(policySubjectModel)
          .control(controlModel)
          .resource(policyResourceModel)
          .rule(policyRuleModel)
          .pattern("time-based-conditions:weekly:custom-hours")
          .build();

        Response<V2Policy> response = service.createV2Policy(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 201);

        V2Policy result = response.getResult();
        assertNotNull(result);
        assertEquals(result.getType(), POLICY_TYPE);
        assertEquals(result.getSubject(), policySubjectModel);
        assertEquals(result.getResource(), policyResourceModel);
        assertEquals(result.getControl().getGrant(), policyGrantModel);
        assertEquals(result.getRule().operator(), policyRuleModel.operator());
        assertEquals(result.getPattern(), "time-based-conditions:weekly:custom-hours");

        testV2PolicyId = result.getId();
    }

    @Test(dependsOnMethods = {"testCreateV2AccessPolicy"})
    public void testGetV2AccessPolicy() {
        assertNotNull(testV2PolicyId);

        GetV2PolicyOptions options = new GetV2PolicyOptions.Builder()
                .id(testV2PolicyId)
                .build();

        Response<V2PolicyTemplateMetaData> response = service.getV2Policy(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        V2PolicyTemplateMetaData result = response.getResult();
        assertNotNull(result);
        assertEquals(result.getId(), testV2PolicyId);


        List<String> values = response.getHeaders().values(HEADER_ETAG);
        assertNotNull(values);
        testV2PolicyEtag = values.get(0);
    }

    @Test(dependsOnMethods = {"testGetV2AccessPolicy"})
    public void testUpdateV2AccessPolicy() {
        assertNotNull(testV2PolicyId);
        assertNotNull(testV2PolicyEtag);

        V2PolicyResourceAttribute resourceAttributeAccount = new V2PolicyResourceAttribute.Builder()
          .key("accountId")
          .value(testAccountId)
          .operator("stringEquals")
          .build();

        V2PolicyResourceAttribute resourceAttributeService = new V2PolicyResourceAttribute.Builder()
          .key("serviceName")
          .value(TEST_SERVICE_NAME)
          .operator("stringEquals")
          .build();

        V2PolicySubjectAttribute subjectAttributeModel = new V2PolicySubjectAttribute.Builder()
          .key("iam_id")
          .value(TEST_USER_ID_TWO)
          .operator("stringEquals")
          .build();

        V2PolicyResource policyResourceModel = new V2PolicyResource.Builder()
          .attributes(new ArrayList<V2PolicyResourceAttribute>(Arrays.asList(resourceAttributeAccount,
            resourceAttributeService)))
          .build();

        V2PolicySubject policySubjectModel = new V2PolicySubject.Builder()
          .attributes(new ArrayList<V2PolicySubjectAttribute>(Arrays.asList(subjectAttributeModel)))
          .build();
        
        Roles rolesModel = new Roles.Builder()
          .roleId(TEST_EDITOR_ROLE_CRN)
          .build();

        Grant policyGrantModel = new Grant.Builder()
          .roles(Arrays.asList(rolesModel))
          .build();

        Control controlModel = new Control.Builder()
          .grant(policyGrantModel)
          .build();
        NestedConditionRuleAttribute weeklyConditionAttributeModel = new NestedConditionRuleAttribute.Builder()
          .key("{{environment.attributes.day_of_week}}")
          .value(new ArrayList<String>(Arrays.asList("1+00:00", "2+00:00", "3+00:00", "4+00:00", "5+00:00")))
          .operator("dayOfWeekAnyOf")
          .build();
        

        NestedConditionRuleAttribute startConditionAttributeModel = new NestedConditionRuleAttribute.Builder()
          .key("{{environment.attributes.current_time}}")
          .value("09:00:00+00:00")
          .operator("timeGreaterThanOrEquals")
          .build();

        NestedConditionRuleAttribute endConditionAttributeModel = new NestedConditionRuleAttribute.Builder()
          .key("{{environment.attributes.current_time}}")
          .value("17:00:00+00:00")
          .operator("timeLessThanOrEquals")
          .build();

        V2PolicyRuleRuleWithNestedConditions policyRuleModel = new V2PolicyRuleRuleWithNestedConditions.Builder()
          .operator("and")
          .conditions(new ArrayList<NestedCondition>(Arrays.asList(weeklyConditionAttributeModel,
            startConditionAttributeModel, endConditionAttributeModel)))
          .build();

        ReplaceV2PolicyOptions options = new ReplaceV2PolicyOptions.Builder()
                .id(testV2PolicyId)
                .ifMatch(testV2PolicyEtag)
                .type(POLICY_TYPE)
                .subject(policySubjectModel)
                .control(controlModel)
                .resource(policyResourceModel)
                .rule(policyRuleModel)
                .pattern("time-based-conditions:weekly:custom-hours")
                .build();

        Response<V2Policy> response = service.replaceV2Policy(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        V2Policy result = response.getResult();
        assertNotNull(result);
        assertEquals(result.getId(), testV2PolicyId);
        assertEquals(result.getType(), POLICY_TYPE);
        assertEquals(result.getSubject(), policySubjectModel);
        assertEquals(result.getResource(), policyResourceModel);
        assertEquals(result.getControl().getGrant(), policyGrantModel);
        assertEquals(result.getRule().operator(), policyRuleModel.operator());
        assertEquals(result.getPattern(), "time-based-conditions:weekly:custom-hours");

        List<String> values = response.getHeaders().values(HEADER_ETAG);
        assertNotNull(values);
        testV2PolicyEtag = values.get(0);
    }

    @Test(dependsOnMethods = {"testUpdateV2AccessPolicy"})
    public void testListV2AccessPolicies() throws Exception, InterruptedException {
        assertNotNull(testV2PolicyId);

        ListV2PoliciesOptions options = new ListV2PoliciesOptions.Builder()
                .accountId(testAccountId)
                .build();

        Response<V2PolicyCollection> response = service.listV2Policies(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        V2PolicyCollection result = response.getResult();
        assertNotNull(result);

        // Confirm the test policy is present
        boolean foundTestPolicy = false;
        for (V2PolicyTemplateMetaData policy : result.getPolicies()) {
            if (testV2PolicyId.equals(policy.getId())) {
                foundTestPolicy = true;
                break;
            }
        }
        assertTrue(foundTestPolicy);
    }

    @Test
    public void testCreateCustomRole() {

        CreateRoleOptions options = new CreateRoleOptions.Builder()
          .accountId(testAccountId)
          .name(testCustomRoleName)
          .displayName(testCustomRoleDisplayName)
          .description(testCustomRoleDescription)
          .serviceName(TEST_SERVICE_NAME)
          .actions(testCustomRoleActions)
          .build();

        Response<CustomRole> response = service.createRole(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 201);

        CustomRole result = response.getResult();
        assertNotNull(result);
        assertEquals(result.getAccountId(), testAccountId);
        assertEquals(result.getName(), testCustomRoleName);
        assertEquals(result.getDisplayName(), testCustomRoleDisplayName);
        assertEquals(result.getDescription(), testCustomRoleDescription);
        assertEquals(result.getServiceName(), TEST_SERVICE_NAME);
        assertEquals(result.getActions(), testCustomRoleActions);

        testCustomRoleId = result.getId();
    }

    @Test(dependsOnMethods = {"testCreateCustomRole"})
    public void testGetCustomRole() {
        assertNotNull(testCustomRoleId);

        GetRoleOptions options = new GetRoleOptions.Builder()
                .roleId(testCustomRoleId)
                .build();

        Response<CustomRole> response = service.getRole(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        CustomRole result = response.getResult();
        assertNotNull(result);
        assertEquals(result.getId(), testCustomRoleId);
        assertEquals(result.getAccountId(), testAccountId);
        assertEquals(result.getName(), testCustomRoleName);
        assertEquals(result.getDisplayName(), testCustomRoleDisplayName);
        assertEquals(result.getDescription(), testCustomRoleDescription);
        assertEquals(result.getServiceName(), TEST_SERVICE_NAME);
        assertEquals(result.getActions(), testCustomRoleActions);


        List<String> values = response.getHeaders().values(HEADER_ETAG);
        assertNotNull(values);
        testCustomRoleEtag = values.get(0);
    }

    @Test(dependsOnMethods = {"testGetCustomRole"})
    public void testUpdateCustomRole() {
        assertNotNull(testCustomRoleId);
        assertNotNull(testCustomRoleEtag);

        String updatedRoleDescription = "Updated description";
        ReplaceRoleOptions options = new ReplaceRoleOptions.Builder()
          .roleId(testCustomRoleId)
          .ifMatch(testCustomRoleEtag)
          .displayName(testCustomRoleDisplayName)
          .description(updatedRoleDescription)
          .actions(testCustomRoleActions)
          .build();

        Response<CustomRole> response = service.replaceRole(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        CustomRole result = response.getResult();
        assertNotNull(result);
        assertEquals(result.getAccountId(), testAccountId);
        assertEquals(result.getName(), testCustomRoleName);
        assertEquals(result.getDisplayName(), testCustomRoleDisplayName);
        assertEquals(result.getDescription(), updatedRoleDescription);
        assertEquals(result.getServiceName(), TEST_SERVICE_NAME);
        assertEquals(result.getActions(), testCustomRoleActions);
    }

    @Test(dependsOnMethods = {"testUpdateCustomRole"})
    public void testListRoles() throws Exception, InterruptedException {
        assertNotNull(testCustomRoleId);
        ListRolesOptions options = new ListRolesOptions.Builder()
                .accountId(testAccountId)
                .build();

        Response<RoleCollection> response = service.listRoles(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        RoleCollection result = response.getResult();
        assertNotNull(result);

        // Confirm the test role is present
        boolean foundTestRole = false;
        for (CustomRole role : result.getCustomRoles()) {
            if (testCustomRoleId.equals(role.getId())) {
                foundTestRole = true;
                break;
            }
        }
        assertTrue(foundTestRole);
    }

     public void testListV2Roles() {

        ListRolesOptions options = new ListRolesOptions.Builder()
                .accountId(testAccountId)
                .serviceGroupId("IAM")
                .build();
        
        Response<RoleCollection> response = service.listRoles(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        RoleCollection result = response.getResult();
        assertNotNull(result);

        // Confirm the test role is present
        boolean foundSystemRole = false;
        boolean foundServiceRole = false;
        for (Role role : result.getSystemRoles()) {
            if (TEST_VIEW_ROLE_CRN.equals(role.crn())) {
                foundSystemRole = true;
                break;
            }
        }
        for (Role role : result.getServiceRoles()) {
            if (TEST_SERVICE_ROLE_CRN.equals(role.crn())) {
                foundServiceRole = true;
                break;
            }
        }
        assertTrue(foundSystemRole);
        assertTrue(foundServiceRole);
    }

    @Test
    public void testCreatePolicyTemplate() throws Exception {
      V2PolicyResourceAttribute resourceAttributeService = new V2PolicyResourceAttribute.Builder()
        .key("serviceType")
        .value("service")
        .operator("stringEquals")
        .build();

      Roles rolesModel = new Roles.Builder()
        .roleId(TEST_VIEW_ROLE_CRN)
        .build();
      
      Grant policyGrantModel = new Grant.Builder()
        .roles(Arrays.asList(rolesModel))
        .build();

      Control controlModel = new Control.Builder()
        .grant(policyGrantModel)
        .build();

      V2PolicyResource policyResourceModel = new V2PolicyResource.Builder()
        .attributes(new ArrayList<V2PolicyResourceAttribute>(Arrays.asList(resourceAttributeService)))
        .build();

      TemplatePolicy templatePolicyModel = new TemplatePolicy.Builder()
        .type(POLICY_TYPE)
        .description("SDK Test Policy")
        .resource(policyResourceModel)
        .control(controlModel)
        .build();

      CreatePolicyTemplateOptions createPolicyTemplateOptions = new CreatePolicyTemplateOptions.Builder()
        .name(TEST_TEMPLATE_NAME)
        .accountId(testAccountId)
        .policy(templatePolicyModel)
        .description("SDK Test template with viewer role")
        .build();

      Response<PolicyTemplateLimitData> response = service.createPolicyTemplate(createPolicyTemplateOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PolicyTemplateLimitData result = response.getResult();

      assertNotNull(result);
      assertEquals(result.getPolicy(), templatePolicyModel);
      testTemplateId = result.getId();
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = {"testCreatePolicyTemplate"})
    public void testGetPolicyTemplate() {
      assertNotNull(testTemplateId);
      GetPolicyTemplateOptions getPolicyTemplateOptions = new GetPolicyTemplateOptions.Builder()
        .policyTemplateId(testTemplateId)
        .build();

      Response<PolicyTemplate> response = service.getPolicyTemplate(getPolicyTemplateOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyTemplate result = response.getResult();

      assertNotNull(result);
      assertEquals(result.getId(), testTemplateId);
      testTemplateVersion = result.getVersion();
      List<String> values = response.getHeaders().values(HEADER_ETAG);
      assertNotNull(values);
      testTemplateEtag = values.get(0);
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = {"testGetPolicyTemplate"})
    public void testReplacePolicyTemplate() {
      assertNotNull(testTemplateId);
      assertNotNull(testTemplateEtag);
      V2PolicyResourceAttribute resourceAttributeService = new V2PolicyResourceAttribute.Builder()
        .key("serviceType")
        .value("service")
        .operator("stringEquals")
        .build();

      Roles rolesModel = new Roles.Builder()
        .roleId(TEST_EDITOR_ROLE_CRN)
        .build();
      
      Grant policyGrantModel = new Grant.Builder()
        .roles(Arrays.asList(rolesModel))
        .build();

      Control controlModel = new Control.Builder()
        .grant(policyGrantModel)
        .build();

      V2PolicyResource policyResourceModel = new V2PolicyResource.Builder()
        .attributes(new ArrayList<V2PolicyResourceAttribute>(Arrays.asList(resourceAttributeService)))
        .build();

      TemplatePolicy templatePolicyModel = new TemplatePolicy.Builder()
        .type(POLICY_TYPE)
        .description("SDK test Template")
        .resource(policyResourceModel)
        .control(controlModel)
        .build();

      ReplacePolicyTemplateOptions replacePolicyTemplateOptions = new ReplacePolicyTemplateOptions.Builder()
        .policyTemplateId(testTemplateId)
        .version(testTemplateVersion)
        .ifMatch(testTemplateEtag)
        .policy(templatePolicyModel)
        .description("Updated SDK test template with editor role")
        .build();

      Response<PolicyTemplate> response = service.replacePolicyTemplate(replacePolicyTemplateOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyTemplate result = response.getResult();
      assertEquals(result.getPolicy(), templatePolicyModel);
      assertEquals(result.getDescription(), "Updated SDK test template with editor role");
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = {"testReplacePolicyTemplate"})
    public void testListPolicyTemplates() throws Exception, InterruptedException {
      assertNotNull(testTemplateId);

      ListPolicyTemplatesOptions listPolicyTemplatesOptions = new ListPolicyTemplatesOptions.Builder()
        .accountId(testAccountId)
        .acceptLanguage("default")
        .build();

      
      Response<PolicyTemplateCollection> response = service.listPolicyTemplates(listPolicyTemplatesOptions).execute();
      
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyTemplateCollection result = response.getResult();

      assertNotNull(result);
      // Confirm the test policy is present
      boolean foundTestPolicyTemplate = false;
      for (PolicyTemplate policyTemplate : result.getPolicyTemplates()) {
          if (testTemplateId.equals(policyTemplate.getId())) {
              foundTestPolicyTemplate = true;
              break;
          }
      }
      assertTrue(foundTestPolicyTemplate);
      assertEquals(result.getPolicyTemplates().get(0).getState(), "active");
    }

    @Test(dependsOnMethods = {"testListPolicyTemplates"})
    public void testCreatePolicyTemplateVersion() {
      assertNotNull(testTemplateId);

      V2PolicyResourceAttribute resourceAttributeService = new V2PolicyResourceAttribute.Builder()
        .key("serviceType")
        .value("service")
        .operator("stringEquals")
        .build();

      Roles rolesModel = new Roles.Builder()
        .roleId(TEST_VIEW_ROLE_CRN)
        .build();
      
      Grant policyGrantModel = new Grant.Builder()
        .roles(Arrays.asList(rolesModel))
        .build();

      Control controlModel = new Control.Builder()
        .grant(policyGrantModel)
        .build();

      V2PolicyResource policyResourceModel = new V2PolicyResource.Builder()
        .attributes(new ArrayList<V2PolicyResourceAttribute>(Arrays.asList(resourceAttributeService)))
        .build();

      TemplatePolicy templatePolicyModel = new TemplatePolicy.Builder()
        .type(POLICY_TYPE)
        .description("SDK Test Policy")
        .resource(policyResourceModel)
        .control(controlModel)
        .build();

      CreatePolicyTemplateVersionOptions createPolicyTemplateVersionOptions = new CreatePolicyTemplateVersionOptions.Builder()
        .policyTemplateId(testTemplateId)
        .policy(templatePolicyModel)
        .description("SDK Test template with viewer role")
        .build();

      // Invoke operation
      Response<PolicyTemplateLimitData> response = service.createPolicyTemplateVersion(createPolicyTemplateVersionOptions).execute();
      
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PolicyTemplateLimitData result = response.getResult();

      assertNotNull(result);
      testNewTemplateVersion = result.getVersion();
      assertEquals(result.getPolicy(), templatePolicyModel);
      assertTrue(Integer.parseInt(testNewTemplateVersion) > Integer.parseInt(testTemplateVersion));
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = {"testCreatePolicyTemplateVersion"})
    public void testGetPolicyTemplateVersion() {
      assertNotNull(testTemplateId);
      assertNotNull(testNewTemplateVersion);

      GetPolicyTemplateVersionOptions getPolicyTemplateVersionOptions = new GetPolicyTemplateVersionOptions.Builder()
        .policyTemplateId(testTemplateId)
        .version(testNewTemplateVersion)
        .build();

      Response<PolicyTemplate> response = service.getPolicyTemplateVersion(getPolicyTemplateVersionOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyTemplate result = response.getResult();
      assertNotNull(result);
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = { "testGetPolicyTemplateVersion" })
    public void testCommitPolicyTemplate() {
      assertNotNull(testTemplateId);
      assertNotNull(testTemplateEtag);
      CommitPolicyTemplateOptions commitPolicyTemplateOptions = new CommitPolicyTemplateOptions.Builder()
        .policyTemplateId(testTemplateId)
        .version(testTemplateVersion)
        .build();

      Response<Void> response = service.commitPolicyTemplate(commitPolicyTemplateOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      GetPolicyTemplateVersionOptions getPolicyTemplateVersionOptions = new GetPolicyTemplateVersionOptions.Builder()
        .policyTemplateId(testTemplateId)
        .version(testTemplateVersion)
        .build();

      Response<PolicyTemplate> getResponse = service.getPolicyTemplateVersion(getPolicyTemplateVersionOptions).execute();
      assertNotNull(getResponse);
      assertEquals(getResponse.getStatusCode(), 200);

      List<String> values = getResponse.getHeaders().values(HEADER_ETAG);
      assertNotNull(values);
      testTemplateEtag = values.get(0);

      // Once template is committed, it cannot be updated. Check that update template for first version fails
      try {
        V2PolicyResourceAttribute resourceAttributeService = new V2PolicyResourceAttribute.Builder()
          .key("serviceType")
          .value("service")
          .operator("stringEquals")
          .build();

        Roles rolesModel = new Roles.Builder()
          .roleId(TEST_EDITOR_ROLE_CRN)
          .build();
        
        Grant policyGrantModel = new Grant.Builder()
          .roles(Arrays.asList(rolesModel))
          .build();

        Control controlModel = new Control.Builder()
          .grant(policyGrantModel)
          .build();

        V2PolicyResource policyResourceModel = new V2PolicyResource.Builder()
          .attributes(new ArrayList<V2PolicyResourceAttribute>(Arrays.asList(resourceAttributeService)))
          .build();

        TemplatePolicy templatePolicyModel = new TemplatePolicy.Builder()
          .type(POLICY_TYPE)
          .description("SDK test Template")
          .resource(policyResourceModel)
          .control(controlModel)
          .build();

        ReplacePolicyTemplateOptions replacePolicyTemplateOptions = new ReplacePolicyTemplateOptions.Builder()
          .policyTemplateId(testTemplateId)
          .version(testTemplateVersion)
          .ifMatch(testTemplateEtag)
          .policy(templatePolicyModel)
          .description("Updated SDK test template with editor role")
          .build();

        Response<PolicyTemplate> updateResponse = service.replacePolicyTemplate(replacePolicyTemplateOptions).execute();
      } catch (ServiceResponseException e) {
        assertEquals(e.getMessage(), "Policy template id '" + testTemplateId + "' and version '" + testTemplateVersion + "' is committed and cannot be updated");
        assertEquals(e.getStatusCode(), 400);
      }
    }

    @Test(dependsOnMethods = {"testCommitPolicyTemplate"})
    public void testDeletePolicyTemplateVersion() {
      DeletePolicyTemplateVersionOptions deletePolicyTemplateVersionOptions = new DeletePolicyTemplateVersionOptions.Builder()
        .policyTemplateId(testTemplateId)
        .version(testTemplateVersion)
        .build();

      Response<Void> response = service.deletePolicyTemplateVersion(deletePolicyTemplateVersionOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    }

    @Test(dependsOnMethods = {"testDeletePolicyTemplateVersion"})
    public void testListPolicyTemplateVersions() {
      ListPolicyTemplateVersionsOptions listPolicyTemplateVersionsOptions = new ListPolicyTemplateVersionsOptions.Builder()
        .policyTemplateId(testTemplateId)
        .build();

      Response<PolicyTemplateVersionsCollection> response = service.listPolicyTemplateVersions(listPolicyTemplateVersionsOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyTemplateVersionsCollection result = response.getResult();
      assertNotNull(result);
      assertTrue(result.getVersions().size() == 1);
      // Confirm new test policy template version is present
      // and old version is not present
      boolean foundTestPolicyTemplateVersion = true;
      boolean foundNewTestPolicyTemplateVersion = false;
      for (PolicyTemplate policyTemplate : result.getVersions()) {
          if (testTemplateVersion.equals(policyTemplate.getVersion())) {
              foundTestPolicyTemplateVersion = false;
              break;
          }
          if (testNewTemplateVersion.equals(policyTemplate.getVersion())) {
              foundNewTestPolicyTemplateVersion = true;
          }
      }
      assertTrue(foundTestPolicyTemplateVersion);
      assertTrue(foundNewTestPolicyTemplateVersion);
    }

    @Test
    public void testCreateS2SPolicyTemplate() throws Exception {
      V2PolicyResourceAttribute resourceAttributeService = new V2PolicyResourceAttribute.Builder()
        .key("serviceName")
        .value("cloud-object-storage")
        .operator("stringEquals")
        .build();

      Roles rolesModel = new Roles.Builder()
        .roleId("crn:v1:bluemix:public:iam::::serviceRole:Writer")
        .build();
      
      Grant policyGrantModel = new Grant.Builder()
        .roles(Arrays.asList(rolesModel))
        .build();

      Control controlModel = new Control.Builder()
        .grant(policyGrantModel)
        .build();

      V2PolicyResource policyResourceModel = new V2PolicyResource.Builder()
        .attributes(new ArrayList<V2PolicyResourceAttribute>(Arrays.asList(resourceAttributeService)))
        .build();

      V2PolicySubjectAttribute subjectAttributeService = new V2PolicySubjectAttribute.Builder()
        .key("serviceName")
        .value("compliance")
        .operator("stringEquals")
        .build();

      V2PolicySubject policySubjectModel = new V2PolicySubject.Builder()
        .attributes(new ArrayList<V2PolicySubjectAttribute>(Arrays.asList(subjectAttributeService)))
        .build();

      TemplatePolicy templatePolicyModel = new TemplatePolicy.Builder()
        .type("authorization")
        .description("SDK S2S Test Policy Template")
        .resource(policyResourceModel)
        .subject(policySubjectModel)
        .control(controlModel)
        .build();

      CreatePolicyTemplateOptions createPolicyTemplateOptions = new CreatePolicyTemplateOptions.Builder()
        .name("S2STest")
        .accountId(testAccountId)
        .policy(templatePolicyModel)
        .description("SDK Test template with viewer role")
        .committed(true)
        .build();

      Response<PolicyTemplateLimitData> response = service.createPolicyTemplate(createPolicyTemplateOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PolicyTemplateLimitData result = response.getResult();

      assertNotNull(result);
      assertEquals(result.getPolicy(), templatePolicyModel);
      testS2STemplateId = result.getId();
      testS2SBaseTemplateVersion = result.getVersion();
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = {"testCreateS2SPolicyTemplate"})
    public void testCreatePolicyS2STemplateVersion() {
      assertNotNull(testS2STemplateId);

      V2PolicyResourceAttribute resourceAttributeService = new V2PolicyResourceAttribute.Builder()
        .key("serviceName")
        .value("kms")
        .operator("stringEquals")
        .build();

      Roles rolesModel = new Roles.Builder()
        .roleId("crn:v1:bluemix:public:iam::::serviceRole:Reader")
        .build();
      
      Grant policyGrantModel = new Grant.Builder()
        .roles(Arrays.asList(rolesModel))
        .build();

      Control controlModel = new Control.Builder()
        .grant(policyGrantModel)
        .build();

      V2PolicyResource policyResourceModel = new V2PolicyResource.Builder()
        .attributes(new ArrayList<V2PolicyResourceAttribute>(Arrays.asList(resourceAttributeService)))
        .build();

       V2PolicySubjectAttribute subjectAttributeService = new V2PolicySubjectAttribute.Builder()
        .key("serviceName")
        .value("compliance")
        .operator("stringEquals")
        .build();

      V2PolicySubject policySubjectModel = new V2PolicySubject.Builder()
        .attributes(new ArrayList<V2PolicySubjectAttribute>(Arrays.asList(subjectAttributeService)))
        .build();

      TemplatePolicy templatePolicyModel = new TemplatePolicy.Builder()
        .type("authorization")
        .description("SDK S2S Test Policy Template version")
        .resource(policyResourceModel)
        .subject(policySubjectModel)
        .control(controlModel)
        .build();

      CreatePolicyTemplateVersionOptions createPolicyTemplateVersionOptions = new CreatePolicyTemplateVersionOptions.Builder()
        .policyTemplateId(testS2STemplateId)
        .policy(templatePolicyModel)
        .description("SDK Test template with viewer role")
        .committed(true)
        .build();

      // Invoke operation
      Response<PolicyTemplateLimitData> response = service.createPolicyTemplateVersion(createPolicyTemplateVersionOptions).execute();
      
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PolicyTemplateLimitData result = response.getResult();

      assertNotNull(result);
      testS2STemplateVersion = result.getVersion();
      assertEquals(result.getPolicy(), templatePolicyModel);
      assertTrue(Integer.parseInt(testS2STemplateVersion) > Integer.parseInt(testS2SBaseTemplateVersion));
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = {"testListPolicyTemplateVersions"})
    public void testListPolicyAssignments() throws Exception {
      ListPolicyAssignmentsOptions listPolicyAssignmentsOptions = new ListPolicyAssignmentsOptions.Builder()
      .accountId(testAccountId)
      .version("1.0")
      .build();

      Response<PolicyTemplateAssignmentCollection> response = service.listPolicyAssignments(listPolicyAssignmentsOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
        PolicyTemplateAssignmentCollection result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.getAssignments());
      List<PolicyTemplateAssignmentItems> assignments = result.getAssignments();
      // As long there is one assignment in test account, then there should be one assignment to run next test.
      assertNotNull(assignments);
    }

    @Test(dependsOnMethods = { "testCreateS2SPolicyTemplate" })
    public void testCreatePolicyAssignment() throws Exception {

      AssignmentTargetDetails assignmentTargetDetails = new AssignmentTargetDetails.Builder()
        .type("Account")
        .id(testTargetAccountId)
        .build();

      AssignmentTemplateDetails assignmentTemplateDetails = new AssignmentTemplateDetails.Builder()
        .id(testS2STemplateId)
        .version(testS2SBaseTemplateVersion)
        .build();

      CreatePolicyTemplateAssignmentOptions createPolicyAssignmentOptions = new CreatePolicyTemplateAssignmentOptions.Builder()
        .version("1.0")
        .target(assignmentTargetDetails)
        .templates(new ArrayList<AssignmentTemplateDetails>(Arrays.asList(assignmentTemplateDetails)))
        .build();

      Response<PolicyAssignmentV1Collection> response = service.createPolicyTemplateAssignment(createPolicyAssignmentOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PolicyAssignmentV1Collection result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.getAssignments());
      PolicyAssignmentV1 assignment = result.getAssignments().get(0);
      testAssignmentId = assignment.getId();
      PolicyAssignmentV1Resources resource = assignment.getResources().get(0);
      PolicyAssignmentResourcePolicy policy = resource.getPolicy();
      AssignmentResourceCreated resource_created = policy.getResourceCreated();
      testAssignmentPolicyId = resource_created.getId();

      List<String> values = response.getHeaders().values(HEADER_ETAG);
        assertNotNull(values);
        testAssignmentETag = values.get(0);
    }

    @Test(dependsOnMethods = { "testCreatePolicyAssignment" })
      public void testUpdatePolicyAssignment() {
        assertNotNull(testAssignmentPolicyId);

        UpdatePolicyAssignmentOptions updatePolicyAssignmentOptions = new UpdatePolicyAssignmentOptions.Builder()
        .assignmentId(testAssignmentId)
        .version("1.0")
        .templateVersion(testS2STemplateVersion)
        .ifMatch(testAssignmentETag)
        .build();

      Response<PolicyAssignmentV1> response = service.updatePolicyAssignment(updatePolicyAssignmentOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyAssignmentV1 result = response.getResult();
      PolicyAssignmentV1Resources resource = result.getResources().get(0);
      PolicyAssignmentResourcePolicy policy = resource.getPolicy();
      AssignmentResourceCreated resource_created = policy.getResourceCreated();
      assertEquals(testAssignmentPolicyId, resource_created.getId());
    }

    @Test(dependsOnMethods = { "testUpdatePolicyAssignment" })
    public void testGetPolicyAssignment() throws Exception {
      assertNotNull(testAssignmentId);
      GetPolicyAssignmentOptions getPolicyAssignmentOptions = new GetPolicyAssignmentOptions.Builder()
        .assignmentId(testAssignmentId)
        .version("1.0")
        .build();

      Response<PolicyTemplateAssignmentItems> response = service.getPolicyAssignment(getPolicyAssignmentOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyTemplateAssignmentItems result = response.getResult();
      PolicyAssignmentV1Resources resource = result.getResources().get(0);
      PolicyAssignmentResourcePolicy policy = resource.getPolicy();
      AssignmentResourceCreated resource_created = policy.getResourceCreated();
      assertEquals(testAssignmentPolicyId, resource_created.getId());

      assertNotNull(result);
      assertEquals(result.getId(), testAssignmentId);
    }

    @Test(dependsOnMethods = { "testGetPolicyAssignment" })
      public void testGetTemplateMetaDataV2AccessPolicy() {
        assertNotNull(testAssignmentPolicyId);

        GetV2PolicyOptions options = new GetV2PolicyOptions.Builder()
                .id(testAssignmentPolicyId)
                .build();

        Response<V2PolicyTemplateMetaData> response = service.getV2Policy(options).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);

        V2PolicyTemplateMetaData result = response.getResult();
        assertNotNull(result);
        assertEquals(result.getId(), testAssignmentPolicyId);
        assertNotNull(result.getTemplate());
    }

    @Test(dependsOnMethods = {"testGetTemplateMetaDataV2AccessPolicy"})
    public void testDeletePolicyAssignment() {
      DeletePolicyAssignmentOptions deletePolicyAssignmentOptions = new DeletePolicyAssignmentOptions.Builder()
        .assignmentId(testAssignmentId)
        .build();

      Response<Void> response = service.deletePolicyAssignment(deletePolicyAssignmentOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    }

    @Test(dependsOnMethods = {"testDeletePolicyAssignment"})
    public void testDeletePolicyTemplate() {
      DeletePolicyTemplateOptions deletePolicyTemplateOptions = new DeletePolicyTemplateOptions.Builder()
        .policyTemplateId(testS2STemplateId)
        .build();

      Response<Void> response = service.deletePolicyTemplate(deletePolicyTemplateOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    }

    @Test
    public void testGetAccessManagementAccountSettings() {
        GetSettingsOptions getSettingsOptions = new GetSettingsOptions.Builder()
                .accountId(testAccountId)
                .acceptLanguage("default")
                .build();
        Response<AccountSettingsAccessManagement> response = service.getSettings(getSettingsOptions).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);
        AccountSettingsAccessManagement amAccountSettings = response.getResult();
        assertNotNull(amAccountSettings);
        ExternalAccountIdentityInteraction externalAccountIdentityInteraction = amAccountSettings.getExternalAccountIdentityInteraction();
        assertNotNull(externalAccountIdentityInteraction);
        IdentityTypes identityTypes = externalAccountIdentityInteraction.getIdentityTypes();
        assertNotNull(identityTypes);
        assertNotNull(identityTypes.getService());
        assertNotNull(identityTypes.getUser());
        assertNotNull(identityTypes.getServiceId());
        List<String> values = response.getHeaders().values(HEADER_ETAG);
        assertNotNull(values);
        testAccountSettingsETag = values.get(0);
    }

    @Test(dependsOnMethods = {"testGetAccessManagementAccountSettings"})
    public void testUpdateAccessManagementAccountSettings() {
        IdentityTypesBase.Builder monitorBuilder = new IdentityTypesBase.Builder()
                .state("monitor")
                .externalAllowedAccounts(Collections.emptyList());
        IdentityTypesPatch identityTypesPatch = new IdentityTypesPatch.Builder()
                .serviceId(monitorBuilder.build())
                .service(monitorBuilder.build())
                .user(monitorBuilder.build())
                .build();
        ExternalAccountIdentityInteractionPatch externalAccountIdentityInteractionPatch = new ExternalAccountIdentityInteractionPatch.Builder()
                .identityTypes(identityTypesPatch).build();
        UpdateSettingsOptions updateSettingsOptions = new UpdateSettingsOptions.Builder()
                .accountId(testAccountId)
                .acceptLanguage("default")
                .externalAccountIdentityInteraction(externalAccountIdentityInteractionPatch)
                .ifMatch(testAccountSettingsETag)
                .build();
        Response<AccountSettingsAccessManagement> response = service.updateSettings(updateSettingsOptions).execute();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);
        AccountSettingsAccessManagement amAccountSettings = response.getResult();
        assertNotNull(amAccountSettings);
        ExternalAccountIdentityInteraction externalAccountIdentityInteraction = amAccountSettings.getExternalAccountIdentityInteraction();
        assertNotNull(externalAccountIdentityInteraction);
        IdentityTypes identityTypes = externalAccountIdentityInteraction.getIdentityTypes();
        assertNotNull(identityTypes);
        assertNotNull(identityTypes.getService());
        assertEquals(identityTypes.getService().state(), "monitor");
        assertNotNull(identityTypes.getUser());
        assertEquals(identityTypes.getUser().state(), "monitor");
        assertNotNull(identityTypes.getServiceId());
        assertEquals(identityTypes.getServiceId().state(), "monitor");
    }

    @Test
    public void testCreateActionControlBasicTemplate() throws Exception {
      CreateActionControlTemplateOptions createActionControlTemplateOptions = new CreateActionControlTemplateOptions.Builder()
        .name(TEST_ACTION_CONTROL_TEMPLATE_NAME)
        .accountId(testAccountId)
        .description("ActionControl SDK Test template without actionControl")
        .build();

      Response<ActionControlTemplate> response = service.createActionControlTemplate(createActionControlTemplateOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ActionControlTemplate result = response.getResult();

      assertNotNull(result);
      testActionControlBaseTemplateId = result.getId();
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = {"testCreateActionControlBasicTemplate"})
    public void testGetActionControlBasicTemplate() {
      assertNotNull(testActionControlBaseTemplateId);
      GetActionControlTemplateOptions getActionControlTemplateOptions = new GetActionControlTemplateOptions.Builder()
        .actionControlTemplateId(testActionControlBaseTemplateId)
        .build();

      Response<ActionControlTemplate> response = service.getActionControlTemplate(getActionControlTemplateOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ActionControlTemplate result = response.getResult();

      assertNotNull(result);
      assertEquals(result.getId(), testActionControlBaseTemplateId);
      testActionControlBaseTemplateVersion = result.getVersion();
      List<String> values = response.getHeaders().values(HEADER_ETAG);
      assertNotNull(values);
      testActionControlBaseTemplateETag = values.get(0);
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = {"testGetActionControlBasicTemplate"})
    public void testReplaceActionControlBasicTemplate() {
      assertNotNull(testActionControlBaseTemplateId);
      assertNotNull(testActionControlBaseTemplateETag);
      
      // Construct an instance of the TemplateActionControl model
      TemplateActionControl templateActionControlModel = new TemplateActionControl.Builder()
        .serviceName("am-test-service")
        .description("Test Java SDK integration testcases")
        .actions(java.util.Arrays.asList("am-test-service.test.delete"))
        .build();

      // Construct an instance of the ReplaceActionControlTemplateOptions model
      ReplaceActionControlTemplateOptions replaceActionControlTemplateOptions = new ReplaceActionControlTemplateOptions.Builder()
        .actionControlTemplateId(testActionControlBaseTemplateId)
        .version(testActionControlBaseTemplateVersion)
        .ifMatch(testActionControlBaseTemplateETag)
        .actionControl(templateActionControlModel)
        .description("Updated SDK test action control template")
        .build();

      Response<ActionControlTemplate> response = service.replaceActionControlTemplate(replaceActionControlTemplateOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ActionControlTemplate result = response.getResult();
      assertEquals(result.getActionControl(), templateActionControlModel);
      assertEquals(result.getDescription(), "Updated SDK test action control template");
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = {"testReplaceActionControlBasicTemplate"})
    public void testListActionControlTemplates() throws Exception, InterruptedException {
      assertNotNull(testActionControlBaseTemplateId);

      ListActionControlTemplatesOptions listActionControlTemplatesOptions = new ListActionControlTemplatesOptions.Builder()
        .accountId(testAccountId)
        .acceptLanguage("default")
        .build();

      
      Response<ActionControlTemplateCollection> response = service.listActionControlTemplates(listActionControlTemplatesOptions).execute();
      
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ActionControlTemplateCollection result = response.getResult();

      assertNotNull(result);
      // Confirm the test action control is present
      boolean foundTestActionControlTemplate = false;
      for (ActionControlTemplate actionControlTemplate : result.getActionControlTemplates()) {
          if (testActionControlBaseTemplateId.equals(actionControlTemplate.getId())) {
              foundTestActionControlTemplate = true;
              break;
          }
      }
      assertTrue(foundTestActionControlTemplate);
      assertEquals(result.getActionControlTemplates().get(0).getState(), "active");
    }

    @Test(dependsOnMethods = {"testListActionControlTemplates"})
    public void testGetActionControlTemplateVersion() {
      assertNotNull(testActionControlBaseTemplateId);
      assertNotNull(testActionControlBaseTemplateVersion);

      GetActionControlTemplateVersionOptions getActionControlTemplateVersionOptions = new GetActionControlTemplateVersionOptions.Builder()
        .actionControlTemplateId(testActionControlBaseTemplateId)
        .version(testActionControlBaseTemplateVersion)
        .build();

      Response<ActionControlTemplate> response = service.getActionControlTemplateVersion(getActionControlTemplateVersionOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ActionControlTemplate result = response.getResult();
      assertNotNull(result);
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = { "testGetActionControlTemplateVersion" })
    public void testCommitActionControlTemplate() {
      assertNotNull(testActionControlBaseTemplateId);
      CommitActionControlTemplateOptions commitActionControlTemplateOptions = new CommitActionControlTemplateOptions.Builder()
        .actionControlTemplateId(testActionControlBaseTemplateId)
        .version(testActionControlBaseTemplateVersion)
        .build();

      Response<Void> response = service.commitActionControlTemplate(commitActionControlTemplateOptions).execute();

      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    }


    @Test(dependsOnMethods = {"testCommitActionControlTemplate"})
    public void testListActionControlTemplateVersions() {
      ListActionControlTemplateVersionsOptions listActionControlTemplateVersionsOptions = new ListActionControlTemplateVersionsOptions.Builder()
        .actionControlTemplateId(testActionControlBaseTemplateId)
        .build();

      Response<ActionControlTemplateVersionsCollection> response = service.listActionControlTemplateVersions(listActionControlTemplateVersionsOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ActionControlTemplateVersionsCollection result = response.getResult();
      assertNotNull(result);
      assertTrue(result.getVersions().size() == 1);
    }

    @Test(dependsOnMethods = {"testListActionControlTemplateVersions"})
    public void testDeleteActionControlTemplateVersion() {
      DeleteActionControlTemplateVersionOptions deleteActionControlTemplateVersionOptions = new DeleteActionControlTemplateVersionOptions.Builder()
        .actionControlTemplateId(testActionControlBaseTemplateId)
        .version(testActionControlBaseTemplateVersion)
        .build();

      Response<Void> response = service.deleteActionControlTemplateVersion(deleteActionControlTemplateVersionOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    }

    @Test(dependsOnMethods = {"testDeleteActionControlTemplateVersion"})
    public void testCreateActionControlTemplate() throws Exception {

      // Construct an instance of the TemplateActionControl model
      TemplateActionControl templateActionControlModel = new TemplateActionControl.Builder()
        .serviceName("am-test-service")
        .description("Test Java SDK integration testcases")
        .actions(java.util.Arrays.asList("am-test-service.test.delete"))
        .build();

      CreateActionControlTemplateOptions createActionControlTemplateOptions = new CreateActionControlTemplateOptions.Builder()
        .name(TEST_ACTION_CONTROL_TEMPLATE_NAME)
        .accountId(testAccountId)
        .description("ActionControl SDK Test template")
        .actionControl(templateActionControlModel)
        .committed(true)
        .build();

      Response<ActionControlTemplate> response = service.createActionControlTemplate(createActionControlTemplateOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ActionControlTemplate result = response.getResult();

      assertNotNull(result);
      testActionControlTemplateId = result.getId();
      testActionControlTemplateVersion = result.getVersion();
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = {"testCreateActionControlTemplate"})
    public void testCreateActionControlTemplateVersion() {
      assertNotNull(testActionControlTemplateId);
      assertNotNull(testActionControlTemplateVersion);
      
      // Construct an instance of the TemplateActionControl model
      TemplateActionControl templateActionControlModel = new TemplateActionControl.Builder()
        .serviceName("am-test-service")
        .description("Test Java SDK integration testcases")
        .actions(java.util.Arrays.asList("am-test-service.test.create"))
        .build();

      CreateActionControlTemplateVersionOptions createActionControlTemplateVersionOptions = new CreateActionControlTemplateVersionOptions.Builder()
      .description("ActionControl SDK Test template without actionControl")
      .actionControl(templateActionControlModel)
      .committed(true)
      .actionControlTemplateId(testActionControlTemplateId)
      .build();

      // Invoke operation
      Response<ActionControlTemplate> response = service.createActionControlTemplateVersion(createActionControlTemplateVersionOptions).execute();
      
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ActionControlTemplate result = response.getResult();

      assertNotNull(result);
      testActionControlTemplateNewVersion = result.getVersion();
      assertEquals(result.getActionControl(), templateActionControlModel);
      assertTrue(Integer.parseInt(testActionControlTemplateNewVersion) > Integer.parseInt(testActionControlTemplateVersion));
      assertEquals(result.getState(), "active");
    }

    @Test(dependsOnMethods = { "testCreateActionControlTemplateVersion" })
    public void testCreateActionControlAssignment() throws Exception {

      AssignmentTargetDetails assignmentTargetDetails = new AssignmentTargetDetails.Builder()
        .type("Account")
        .id(testTargetAccountId)
        .build();

      ActionControlAssignmentTemplate assignmentTemplateDetails = new ActionControlAssignmentTemplate.Builder()
        .id(testActionControlTemplateId)
        .version(testActionControlTemplateVersion)
        .build();

      CreateActionControlTemplateAssignmentOptions createActionControlAssignmentOptions = new CreateActionControlTemplateAssignmentOptions.Builder()
        .target(assignmentTargetDetails)
        .templates(new ArrayList<ActionControlAssignmentTemplate>(Arrays.asList(assignmentTemplateDetails)))
        .build();

      Response<ActionControlAssignmentCollection> response = service.createActionControlTemplateAssignment(createActionControlAssignmentOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ActionControlAssignmentCollection result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.getAssignments());
      ActionControlAssignment assignment = result.getAssignments().get(0);
      testActionControlAssignmentId = assignment.getId();

      List<String> values = response.getHeaders().values(HEADER_ETAG);
        assertNotNull(values);
        testActionControlAssignmentETag = values.get(0);
    }

    @Test(dependsOnMethods = { "testCreateActionControlAssignment" })
      public void testUpdateActionControlAssignment() {
        assertNotNull(testActionControlAssignmentId);

        UpdateActionControlAssignmentOptions updateActionControlAssignmentOptions = new UpdateActionControlAssignmentOptions.Builder()
        .assignmentId(testActionControlAssignmentId)
        .templateVersion(testActionControlTemplateNewVersion)
        .ifMatch(testActionControlAssignmentETag)
        .build();

      Response<ActionControlAssignment> response = service.updateActionControlAssignment(updateActionControlAssignmentOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    }

    @Test(dependsOnMethods = { "testUpdateActionControlAssignment" })
    public void testGetActionControlAssignment() throws Exception {
      assertNotNull(testActionControlAssignmentId);
      GetActionControlAssignmentOptions getActionControlAssignmentOptions = new GetActionControlAssignmentOptions.Builder()
        .assignmentId(testActionControlAssignmentId)
        .build();

      Response<ActionControlAssignment> response = service.getActionControlAssignment(getActionControlAssignmentOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ActionControlAssignment result = response.getResult();

      assertNotNull(result);
      assertEquals(result.getId(), testActionControlAssignmentId);
    }

    @Test(dependsOnMethods = {"testGetActionControlAssignment"})
    public void testListActionControlAssignments() throws Exception {
      ListActionControlAssignmentsOptions listActionControlAssignmentsOptions = new ListActionControlAssignmentsOptions.Builder()
      .accountId(testAccountId)
      .build();

      Response<ActionControlAssignmentCollection> response = service.listActionControlAssignments(listActionControlAssignmentsOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
      ActionControlAssignmentCollection result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.getAssignments());
      List<ActionControlAssignment> assignments = result.getAssignments();
      assertNotNull(assignments);
    }

    @Test(dependsOnMethods = {"testListActionControlAssignments"})
    public void testDeleteActionControlAssignment() {
      DeleteActionControlAssignmentOptions deleteActionControlAssignmentOptions = new DeleteActionControlAssignmentOptions.Builder()
        .assignmentId(testActionControlAssignmentId)
        .build();

      Response<Void> response = service.deleteActionControlAssignment(deleteActionControlAssignmentOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    }

    @Test(dependsOnMethods = {"testDeleteActionControlAssignment"})
    public void testDeleteActionControlTemplate() {
      DeleteActionControlTemplateOptions deleteActionControlTemplateOptions = new DeleteActionControlTemplateOptions.Builder()
        .actionControlTemplateId(testActionControlTemplateId)
        .build();

      Response<Void> response = service.deleteActionControlTemplate(deleteActionControlTemplateOptions).execute();
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    }

    @AfterClass
    public void tearDown() {
        // Delete all the access policies, roles, templates, and template assingments created during the test.

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date now = new Date();
        final int FIVE_MINUTES = 5 * 60 * 1000;
        long fiveMinutesAgo = now.getTime() - FIVE_MINUTES;

        // List all policies in the account
        ListPoliciesOptions policyOptions = new ListPoliciesOptions.Builder()
                .accountId(testAccountId)
                .build();

        Response<PolicyCollection> policyResponse = service.listPolicies(policyOptions).execute();
        assertNotNull(policyResponse);
        assertEquals(policyResponse.getStatusCode(), 200);

        // Iterate across the policies
        PolicyCollection policyList = policyResponse.getResult();
        assertNotNull(policyList);
        for (PolicyTemplateMetaData policy : policyList.getPolicies()) {

            // Delete the test policy or any test polcies older than 5 minutes
            if (policy.getSubjects().get(0).attributes().get(0).value().contains(TEST_USER_PREFIX)) {
                long createdAt = policy.getCreatedAt().getTime();

                // Delete v2 policy
                if (policy.getHref().contains("v2/policies")) {
                  if ((testV2PolicyId != null || testV2PolicyId.equals(policy.getId())) || createdAt < fiveMinutesAgo) {
                      DeleteV2PolicyOptions deleteOptions = new DeleteV2PolicyOptions.Builder()
                              .id(policy.getId()).build();
                      Response<Void> deleteResponse = service.deleteV2Policy(deleteOptions).execute();
                      assertNotNull(deleteResponse);
                      assertEquals(deleteResponse.getStatusCode(), 204);
                      log("Cleanup test policy id: " + policy.getId());
                  }
                } else {
                  // Delete v1 policy
                  if ((testPolicyId != null || testPolicyId.equals(policy.getId())) || createdAt < fiveMinutesAgo) {
                      DeletePolicyOptions deleteOptions = new DeletePolicyOptions.Builder()
                              .policyId(policy.getId()).build();
                      Response<Void> deleteResponse = service.deletePolicy(deleteOptions).execute();
                      assertNotNull(deleteResponse);
                      assertEquals(deleteResponse.getStatusCode(), 204);
                      log("Cleanup test policy id: " + policy.getId());
                  }
                }
            }
        }

        ListRolesOptions roleOptions = new ListRolesOptions.Builder()
                .accountId(testAccountId)
                .build();

        Response<RoleCollection> roleResponse = service.listRoles(roleOptions).execute();
        assertNotNull(roleResponse);
        assertEquals(roleResponse.getStatusCode(), 200);

        RoleCollection rolesList = roleResponse.getResult();
        assertNotNull(rolesList);

        // Iterate across the list of custom roles
        for (CustomRole role : rolesList.getCustomRoles()) {
          if (role.getName().contains(testCustomRoleNamePrefix)) {
              long createdAt = role.getCreatedAt().getTime();

              // delete the role or any test role older than 5 minutes
              if ((testCustomRoleId != null && testCustomRoleId.equals(role.getId())) || createdAt < fiveMinutesAgo) {
                  DeleteRoleOptions deleteOptions = new DeleteRoleOptions.Builder()
                    .roleId(role.getId()).build();

                  Response<Void> deleteResponse = service.deleteRole(deleteOptions).execute();
                  assertNotNull(deleteResponse);
                  assertEquals(deleteResponse.getStatusCode(), 204);
                  log("Cleanup test role id: " + role.getId());
              }
          }
        }

        // Delete policy template
        ListPolicyTemplatesOptions listPolicyTemplatesOptions = new ListPolicyTemplatesOptions.Builder()
        .accountId(testAccountId)
        .build();

        Response<PolicyTemplateCollection> templateResponse = service.listPolicyTemplates(listPolicyTemplatesOptions).execute();
        assertNotNull(templateResponse);
        assertEquals(templateResponse.getStatusCode(), 200);

        PolicyTemplateCollection policyTemplateCollectionResult = templateResponse.getResult();
        for (PolicyTemplate policyTemplate : policyTemplateCollectionResult.getPolicyTemplates()) {
          // Delete the test policy template or any test templates older than 5 minutes
          if (policyTemplate.getName().contains(TEST_TEMPLATE_PREFIX)) {
            long createdAt = policyTemplate.getCreatedAt().getTime();

            if ((testTemplateId != null || testTemplateId.equals(policyTemplate.getId())) || createdAt < fiveMinutesAgo) {
              DeletePolicyTemplateOptions deletePolicyTemplateOptions = new DeletePolicyTemplateOptions.Builder()
                .policyTemplateId(policyTemplate.getId())
                .build();

              Response<Void> response = service.deletePolicyTemplate(deletePolicyTemplateOptions).execute();
              assertNotNull(response);
              assertEquals(response.getStatusCode(), 204);
              log("Cleanup test template id: " + policyTemplate.getId());
            }
          }
        }
    }
}
