/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.platform_services.iam_policy_management.v1.model.AccountSettingsAccessManagement;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreatePolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreateRoleOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CustomRole;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeletePolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeleteRoleOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ExternalAccountIdentityInteractionPatch;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetPolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetRoleOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetSettingsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.IdentityTypesBase;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.IdentityTypesPatch;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPoliciesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateAssignmentCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateAssignmentItems;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdatePolicyStateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListRolesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Policy;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyResource;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyRole;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicySubject;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.RoleCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ResourceAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ResourceTag;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.SubjectAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplacePolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplaceRoleOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreateV2PolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeleteV2PolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetV2PolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListV2PoliciesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdateSettingsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2Policy;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicySubjectAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyTemplateMetaData;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyResourceAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyResourceTag;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.NestedCondition;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.NestedConditionRuleAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Control;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Grant;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyResource;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyRuleRuleWithNestedConditions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicySubject;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplaceV2PolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Roles;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentV1;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentResourcePolicy;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentV1Resources;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplate;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateLimitData;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateMetaData;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateVersionsCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.TemplatePolicy;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreatePolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeletePolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetPolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPolicyTemplatesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplacePolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreatePolicyTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeletePolicyTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetPolicyTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPolicyTemplateVersionsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.AssignmentResourceCreated;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CommitPolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentV1Collection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetPolicyAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPolicyAssignmentsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.AssignmentTargetDetails;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.AssignmentTemplateDetails;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreatePolicyTemplateAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdatePolicyAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeletePolicyAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeleteActionControlTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeleteActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.DeleteActionControlAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignment;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetActionControlAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignmentCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListActionControlAssignmentsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplaceActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplate;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplateCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.TemplateActionControl;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdateActionControlAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignmentTemplate;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreateActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreateActionControlTemplateAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListActionControlTemplatesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CreateActionControlTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListActionControlTemplateVersionsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplateVersionsCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.GetActionControlTemplateVersionOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CommitActionControlTemplateOptions;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

import java.util.Collections;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//
// This file provides an example of how to use the IAM Policy Management service.
//
// The following configuration properties are assumed to be defined:
//
// IAM_POLICY_MANAGEMENT_URL=<service url>
// IAM_POLICY_MANAGEMENT_AUTH_TYPE=iam
// IAM_POLICY_MANAGEMENT_AUTH_URL=<IAM token service URL - omit this if using the production environment>
// IAM_POLICY_MANAGEMENT_APIKEY=<YOUR_APIKEY>
// IAM_POLICY_MANAGEMENT_TEST_ACCOUNT_ID=<YOUR_ACCOUNT_ID>
//
// These configuration properties can be exported as environment variables, or stored
// in a configuration file and then:
// export IBM_CREDENTIALS_FILE=<name of config file>
//

public class IamPolicyManagementExamples {
  private static final Logger logger = LoggerFactory.getLogger(IamPolicyManagementExamples.class);
  protected IamPolicyManagementExamples() { }

  private static final String EXAMPLE_USER_ID = "IBMid-user1";
  private static final String EXAMPLE_SERVICE_NAME = "iam-groups";
  private static String exampleAccountId = null;
  private static String exampleTargetAccountId = null;
  private static String examplePolicyId = null;
  private static String examplePolicyEtag = null;
  private static String exampleV2PolicyId = null;
  private static String exampleV2PolicyEtag = null;
  private static String exampleCustomRoleId = null;
  private static String exampleCustomRoleEtag = null;
  private static String exampleTemplateId = null;
  private static String exampleTemplateEtag = null;
  private static String exampleTemplateVersion = null;
  private static String exampleBaseTemplateVersion = null;
  private static String exampleAssignmentId = null;
  private static String exampleAssignmentPolicyId = null;
  private static String exampleAssignmentETag = null;
  private static String exampleAccountSettingsETag = null;
  private static String exampleActionControlTemplateId = null;
  private static String exampleActionControlTemplateEtag = null;
  private static String exampleActionControlTemplateVersion = null;
  private static String exampleBaseActionControlTemplateVersion = null;
  private static String exampleActionControlAssignmentId = null;
  private static String exampleActionControlAssignmentETag = null;

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../iam_policy_management.env");
  }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    IamPolicyManagement service = IamPolicyManagement.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> config = CredentialUtils.getServiceProperties(IamPolicyManagement.DEFAULT_SERVICE_NAME);
    exampleAccountId = config.get("TEST_ACCOUNT_ID");
    exampleTargetAccountId = config.get("TEST_TARGET_ACCOUNT_ID");

    try {
      System.out.println("createPolicy() result:");

      // begin-create_policy

      SubjectAttribute subjectAttribute = new SubjectAttribute.Builder()
              .name("iam_id")
              .value(EXAMPLE_USER_ID)
              .build();

      PolicySubject policySubjects = new PolicySubject.Builder()
              .addAttributes(subjectAttribute)
              .build();

      PolicyRole policyRoles = new PolicyRole.Builder()
              .roleId("crn:v1:bluemix:public:iam::::role:Viewer")
              .build();

      ResourceAttribute accountIdResourceAttribute = new ResourceAttribute.Builder()
              .name("accountId")
              .value(exampleAccountId)
              .operator("stringEquals")
              .build();

      ResourceAttribute serviceNameResourceAttribute = new ResourceAttribute.Builder()
              .name("serviceType")
              .value("service")
              .operator("stringEquals")
              .build();

      ResourceTag policyResourceTag = new ResourceTag.Builder()
              .name("project")
              .value("prototype")
              .operator("stringEquals")
              .build();

      PolicyResource policyResources = new PolicyResource.Builder()
              .addAttributes(accountIdResourceAttribute)
              .addAttributes(serviceNameResourceAttribute)
              .addTags(policyResourceTag)
              .build();

      CreatePolicyOptions options = new CreatePolicyOptions.Builder()
              .type("access")
              .subjects(Arrays.asList(policySubjects))
              .roles(Arrays.asList(policyRoles))
              .resources(Arrays.asList(policyResources))
              .build();

      Response<Policy> response = service.createPolicy(options).execute();
      Policy policy = response.getResult();

      examplePolicyId = policy.getId();

      System.out.println(policy);

      // end-create_policy

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPolicy() result:");

      // begin-get_policy

      GetPolicyOptions options = new GetPolicyOptions.Builder()
              .policyId(examplePolicyId)
              .build();

      Response<PolicyTemplateMetaData> response = service.getPolicy(options).execute();
      PolicyTemplateMetaData policy = response.getResult();

      examplePolicyEtag = response.getHeaders().values("Etag").get(0);

      System.out.println(policy);

      // end-get_policy

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updatePolicy() result:");

      // begin-replace_policy

      SubjectAttribute subjectAttribute = new SubjectAttribute.Builder()
              .name("iam_id")
              .value(EXAMPLE_USER_ID)
              .build();

      PolicySubject policySubjects = new PolicySubject.Builder()
              .addAttributes(subjectAttribute)
              .build();

      ResourceAttribute accountIdResourceAttribute = new ResourceAttribute.Builder()
              .name("accountId")
              .value(exampleAccountId)
              .operator("stringEquals")
              .build();

      ResourceAttribute serviceNameResourceAttribute = new ResourceAttribute.Builder()
              .name("serviceType")
              .value("service")
              .operator("stringEquals")
              .build();

      ResourceTag policyResourceTag = new ResourceTag.Builder()
              .name("project")
              .value("prototype")
              .operator("stringEquals")
              .build();

      PolicyResource policyResources = new PolicyResource.Builder()
              .addAttributes(accountIdResourceAttribute)
              .addAttributes(serviceNameResourceAttribute)
              .addTags(policyResourceTag)
              .build();

      PolicyRole updatedPolicyRole = new PolicyRole.Builder()
              .roleId("crn:v1:bluemix:public:iam::::role:Editor")
              .build();

      ReplacePolicyOptions options = new ReplacePolicyOptions.Builder()
              .type("access")
              .policyId(examplePolicyId)
              .ifMatch(examplePolicyEtag)
              .subjects(new ArrayList<PolicySubject>(Arrays.asList(policySubjects)))
              .roles(new ArrayList<PolicyRole>(Arrays.asList(updatedPolicyRole)))
              .resources(new ArrayList<PolicyResource>(Arrays.asList(policyResources)))
              .build();

      Response<Policy> response = service.replacePolicy(options).execute();
      Policy policy = response.getResult();

      examplePolicyEtag = response.getHeaders().values("Etag").get(0);

      System.out.println(policy);

      // end-replace_policy

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("patchPolicy() result:");

      // begin-update_policy_state

      UpdatePolicyStateOptions updatePolicyStateOptions = new UpdatePolicyStateOptions.Builder()
              .policyId(examplePolicyId)
              .ifMatch(examplePolicyEtag)
              .state("active")
              .build();

      Response<Policy> response = service.updatePolicyState(updatePolicyStateOptions).execute();
      Policy policy = response.getResult();

      System.out.println(policy);

      // end-update_policy_state

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listPolicies() result:");

      // begin-list_policies

      ListPoliciesOptions options = new ListPoliciesOptions.Builder()
              .accountId(exampleAccountId)
              .iamId(EXAMPLE_USER_ID)
              .format("include_last_permit")
              .build();

      Response<PolicyCollection> response = service.listPolicies(options).execute();
      PolicyCollection policyCollection = response.getResult();

      System.out.println(policyCollection);

      // end-list_policies

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_policy

      DeletePolicyOptions options = new DeletePolicyOptions.Builder()
              .policyId(examplePolicyId)
              .build();

      Response<Void> response = service.deletePolicy(options).execute();

      // end-delete_policy

      System.out.printf("deletePolicy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createV2Policy() result:");

      // begin-create_v2_policy

      V2PolicySubjectAttribute subjectAttribute = new V2PolicySubjectAttribute.Builder()
              .key("iam_id")
              .value(EXAMPLE_USER_ID)
              .operator("stringEquals")
              .build();

      V2PolicySubject policySubject = new V2PolicySubject.Builder()
              .addAttributes(subjectAttribute)
              .build();

      V2PolicyResourceAttribute accountIdResourceAttribute = new V2PolicyResourceAttribute.Builder()
              .key("accountId")
              .value(exampleAccountId)
              .operator("stringEquals")
              .build();

      V2PolicyResourceAttribute serviceNameResourceAttribute = new V2PolicyResourceAttribute.Builder()
              .key("serviceType")
              .value("service")
              .operator("stringEquals")
              .build();

      V2PolicyResourceTag policyResourceTag = new V2PolicyResourceTag.Builder()
              .key("project")
              .value("prototype")
              .operator("stringEquals")
              .build();

      V2PolicyResource policyResource = new V2PolicyResource.Builder()
              .addAttributes(accountIdResourceAttribute)
              .addAttributes(serviceNameResourceAttribute)
              .addTags(policyResourceTag)
              .build();

      Roles policyRoles = new Roles.Builder()
              .roleId("crn:v1:bluemix:public:iam::::role:Viewer")
              .build();

      Grant policyGrant = new Grant.Builder()
              .roles(Arrays.asList(policyRoles))
              .build();

      Control control = new Control.Builder()
              .grant(policyGrant)
              .build();

      NestedConditionRuleAttribute weeklyConditionAttribute = new NestedConditionRuleAttribute.Builder()
              .key("{{environment.attributes.day_of_week}}")
              .value(new ArrayList<String>(Arrays.asList("1+00:00", "2+00:00", "3+00:00", "4+00:00", "5+00:00")))
              .operator("dayOfWeekAnyOf")
              .build();

      NestedConditionRuleAttribute startConditionAttribute = new NestedConditionRuleAttribute.Builder()
              .key("{{environment.attributes.current_time}}")
              .value("09:00:00+00:00")
              .operator("timeGreaterThanOrEquals")
              .build();

      NestedConditionRuleAttribute endConditionAttribute = new NestedConditionRuleAttribute.Builder()
              .key("{{environment.attributes.current_time}}")
              .value("17:00:00+00:00")
              .operator("timeLessThanOrEquals")
              .build();

      V2PolicyRuleRuleWithNestedConditions policyRule = new V2PolicyRuleRuleWithNestedConditions.Builder()
              .operator("and")
              .conditions(new ArrayList<NestedCondition>(Arrays.asList(weeklyConditionAttribute, startConditionAttribute, endConditionAttribute)))
              .build();

      CreateV2PolicyOptions options = new CreateV2PolicyOptions.Builder()
              .type("access")
              .subject(policySubject)
              .control(control)
              .resource(policyResource)
              .rule(policyRule)
              .pattern("time-based-conditions:weekly:custom-hours")
              .build();

      Response<V2Policy> response = service.createV2Policy(options).execute();
      V2Policy policy = response.getResult();

      exampleV2PolicyId = policy.getId();

      System.out.println(policy);

      // end-create_v2_policy

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getV2Policy() result:");

      // begin-get_v2_policy

      GetV2PolicyOptions options = new GetV2PolicyOptions.Builder()
              .id(exampleV2PolicyId)
              .build();

      Response<V2PolicyTemplateMetaData> response = service.getV2Policy(options).execute();
      V2PolicyTemplateMetaData policy = response.getResult();

      exampleV2PolicyEtag = response.getHeaders().values("Etag").get(0);

      System.out.println(policy);

      // end-get_v2_policy

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceV2Policy() result:");

      // begin-replace_v2_policy

      V2PolicySubjectAttribute subjectAttribute = new V2PolicySubjectAttribute.Builder()
              .key("iam_id")
              .value(EXAMPLE_USER_ID)
              .operator("stringEquals")
              .build();

      V2PolicySubject policySubject = new V2PolicySubject.Builder()
              .addAttributes(subjectAttribute)
              .build();

      V2PolicyResourceAttribute accountIdResourceAttribute = new V2PolicyResourceAttribute.Builder()
              .key("accountId")
              .value(exampleAccountId)
              .operator("stringEquals")
              .build();

      V2PolicyResourceAttribute serviceNameResourceAttribute = new V2PolicyResourceAttribute.Builder()
              .key("serviceType")
              .value("service")
              .operator("stringEquals")
              .build();

      V2PolicyResourceTag policyResourceTag = new V2PolicyResourceTag.Builder()
              .key("project")
              .value("prototype")
              .operator("stringEquals")
              .build();

      V2PolicyResource policyResource = new V2PolicyResource.Builder()
              .addAttributes(accountIdResourceAttribute)
              .addAttributes(serviceNameResourceAttribute)
              .addTags(policyResourceTag)
              .build();

      Roles updatedPolicyRole = new Roles.Builder()
              .roleId("crn:v1:bluemix:public:iam::::role:Editor")
              .build();
      Grant policyGrant = new Grant.Builder()
              .roles(Arrays.asList(updatedPolicyRole))
              .build();

      Control policyControl = new Control.Builder()
              .grant(policyGrant)
              .build();

      NestedConditionRuleAttribute weeklyConditionAttribute = new NestedConditionRuleAttribute.Builder()
              .key("{{environment.attributes.day_of_week}}")
              .value(new ArrayList<String>(Arrays.asList("1+00:00", "2+00:00", "3+00:00", "4+00:00", "5+00:00")))
              .operator("dayOfWeekAnyOf")
              .build();

      NestedConditionRuleAttribute startConditionAttribute = new NestedConditionRuleAttribute.Builder()
              .key("{{environment.attributes.current_time}}")
              .value("09:00:00+00:00")
              .operator("timeGreaterThanOrEquals")
              .build();

      NestedConditionRuleAttribute endConditionAttribute = new NestedConditionRuleAttribute.Builder()
              .key("{{environment.attributes.current_time}}")
              .value("17:00:00+00:00")
              .operator("timeLessThanOrEquals")
              .build();

      V2PolicyRuleRuleWithNestedConditions policyRule = new V2PolicyRuleRuleWithNestedConditions.Builder()
              .operator("and")
              .conditions(new ArrayList<NestedCondition>(Arrays.asList(weeklyConditionAttribute, startConditionAttribute, endConditionAttribute)))
              .build();

      ReplaceV2PolicyOptions options = new ReplaceV2PolicyOptions.Builder()
              .type("access")
              .id(exampleV2PolicyId)
              .ifMatch(exampleV2PolicyEtag)
              .subject(policySubject)
              .control(policyControl)
              .resource(policyResource)
              .rule(policyRule)
              .pattern("time-based-conditions:weekly:custom-hours")
              .build();

      Response<V2Policy> response = service.replaceV2Policy(options).execute();
      V2Policy policy = response.getResult();

      exampleV2PolicyEtag = response.getHeaders().values("Etag").get(0);

      System.out.println(policy);

      // end-replace_v2_policy

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listV2Policies() result:");

      // begin-list_v2_policies

      ListV2PoliciesOptions options = new ListV2PoliciesOptions.Builder()
              .accountId(exampleAccountId)
              .iamId(EXAMPLE_USER_ID)
              .format("include_last_permit")
              .build();

      Response<V2PolicyCollection> response = service.listV2Policies(options).execute();
      V2PolicyCollection policyCollection = response.getResult();

      System.out.println(policyCollection);

      // end-list_v2_policies

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-v2_delete_policy

      DeleteV2PolicyOptions options = new DeleteV2PolicyOptions.Builder()
              .id(exampleV2PolicyId)
              .build();
      Response<Void> response = service.deleteV2Policy(options).execute();

      // end-v2_delete_policy

      System.out.printf("deleteV2Policy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createRole() result:");

      // begin-create_role

      CreateRoleOptions options = new CreateRoleOptions.Builder()
              .displayName("IAM Groups read access")
              .actions(Arrays.asList("iam-groups.groups.read"))
              .name("ExampleRoleIAMGroups")
              .accountId(exampleAccountId)
              .serviceName(EXAMPLE_SERVICE_NAME)
              .build();

      Response<CustomRole> response = service.createRole(options).execute();
      CustomRole customRole = response.getResult();

      exampleCustomRoleId = customRole.getId();

      System.out.println(customRole);

      // end-create_role

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getRole() result:");

      // begin-get_role

      GetRoleOptions options = new GetRoleOptions.Builder()
              .roleId(exampleCustomRoleId)
              .build();

      Response<CustomRole> response = service.getRole(options).execute();
      CustomRole customRole = response.getResult();

      exampleCustomRoleEtag = response.getHeaders().values("Etag").get(0);

      System.out.println(customRole);

      // end-get_role

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateRole() result:");

      // begin-replace_role

      List<String> updatedRoleActions = Arrays.asList("iam-groups.groups.read", "iam-groups.groups.list");
      ReplaceRoleOptions options = new ReplaceRoleOptions.Builder()
              .roleId(exampleCustomRoleId)
              .ifMatch(exampleCustomRoleEtag)
              .displayName("IAM Groups read access")
              .actions(updatedRoleActions)
              .build();

      Response<CustomRole> response = service.replaceRole(options).execute();
      CustomRole customRole = response.getResult();

      System.out.println(customRole);

      // end-replace_role

    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listRoles() result:");

      // begin-list_roles

      ListRolesOptions options = new ListRolesOptions.Builder()
              .accountId(exampleAccountId)
              .build();

      Response<RoleCollection> response = service.listRoles(options).execute();
      RoleCollection roleCollection = response.getResult();

      System.out.println(roleCollection);

      // end-list_roles

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_role

      DeleteRoleOptions options = new DeleteRoleOptions.Builder()
        .roleId(exampleCustomRoleId)
        .build();

      Response<Void> response = service.deleteRole(options).execute();

      // end-delete_role

      System.out.printf("deleteRole() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createPolicyTemplate() result:");
      // begin-create_policy_template
      V2PolicyResourceAttribute v2PolicyResourceAttributeModel = new V2PolicyResourceAttribute.Builder()
        .key("serviceName")
        .value("cloud-object-storage")
        .operator("stringEquals")
        .build();
      V2PolicyResource v2PolicyResourceModel = new V2PolicyResource.Builder()
        .attributes(java.util.Arrays.asList(v2PolicyResourceAttributeModel))
        .build();
      Roles rolesModel = new Roles.Builder()
        .roleId("crn:v1:bluemix:public:iam::::serviceRole:Writer")
        .build();
      Grant grantModel = new Grant.Builder()
        .roles(java.util.Arrays.asList(rolesModel))
        .build();
      Control controlModel = new Control.Builder()
        .grant(grantModel)
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
        .resource(v2PolicyResourceModel)
        .subject(policySubjectModel)
        .control(controlModel)
        .build();
      CreatePolicyTemplateOptions createPolicyTemplateOptions = new CreatePolicyTemplateOptions.Builder()
        .name("SDKS2SExamplesTest")
        .accountId(exampleAccountId)
        .policy(templatePolicyModel)
        .build();

      Response<PolicyTemplateLimitData> response = service.createPolicyTemplate(createPolicyTemplateOptions).execute();
      PolicyTemplateLimitData policyTemplate = response.getResult();

      exampleTemplateId = policyTemplate.getId();
      exampleBaseTemplateVersion = policyTemplate.getVersion();

      System.out.println(policyTemplate);
      // end-create_policy_template

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPolicyTemplate() result:");
      // begin-get_policy_template
      GetPolicyTemplateOptions getPolicyTemplateOptions = new GetPolicyTemplateOptions.Builder()
        .policyTemplateId(exampleTemplateId)
        .build();

      Response<PolicyTemplate> response = service.getPolicyTemplate(getPolicyTemplateOptions).execute();
      PolicyTemplate policyTemplate = response.getResult();

      exampleTemplateEtag = response.getHeaders().values("Etag").get(0);

      System.out.println(policyTemplate);
      // end-get_policy_template

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replacePolicyTemplate() result:");
      // begin-replace_policy_template
      V2PolicyResourceAttribute v2PolicyResourceAttributeModel = new V2PolicyResourceAttribute.Builder()
        .key("serviceName")
        .operator("stringEquals")
        .value("kms")
        .build();
      V2PolicyResource v2PolicyResourceModel = new V2PolicyResource.Builder()
        .attributes(java.util.Arrays.asList(v2PolicyResourceAttributeModel))
        .build();
      Roles rolesModel = new Roles.Builder()
        .roleId("crn:v1:bluemix:public:iam::::serviceRole:Reader")
        .build();
      Grant grantModel = new Grant.Builder()
        .roles(java.util.Arrays.asList(rolesModel))
        .build();
      Control controlModel = new Control.Builder()
        .grant(grantModel)
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
        .resource(v2PolicyResourceModel)
        .subject(policySubjectModel)
        .control(controlModel)
        .build();
      ReplacePolicyTemplateOptions replacePolicyTemplateOptions = new ReplacePolicyTemplateOptions.Builder()
        .policyTemplateId(exampleTemplateId)
        .version(exampleBaseTemplateVersion)
        .ifMatch(exampleTemplateEtag)
        .policy(templatePolicyModel)
        .build();

      Response<PolicyTemplate> response = service.replacePolicyTemplate(replacePolicyTemplateOptions).execute();
      PolicyTemplate policyTemplate = response.getResult();

      System.out.println(policyTemplate);
      // end-replace_policy_template
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listPolicyTemplates() result:");
      // begin-list_policy_templates
      ListPolicyTemplatesOptions listPolicyTemplatesOptions = new ListPolicyTemplatesOptions.Builder()
        .accountId(exampleAccountId)
        .build();

      Response<PolicyTemplateCollection> response = service.listPolicyTemplates(listPolicyTemplatesOptions).execute();
      PolicyTemplateCollection policyTemplateCollection = response.getResult();

      System.out.println(policyTemplateCollection);
      // end-list_policy_templates
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createPolicyTemplateVersion() result:");
      // begin-create_policy_template_version
      V2PolicyResourceAttribute v2PolicyResourceAttributeModel = new V2PolicyResourceAttribute.Builder()
        .key("serviceName")
        .operator("stringEquals")
        .value("appid")
        .build();
      V2PolicyResource v2PolicyResourceModel = new V2PolicyResource.Builder()
        .attributes(java.util.Arrays.asList(v2PolicyResourceAttributeModel))
        .build();
      Roles rolesModel = new Roles.Builder()
        .roleId("crn:v1:bluemix:public:iam::::role:Viewer")
        .build();
      Grant grantModel = new Grant.Builder()
        .roles(java.util.Arrays.asList(rolesModel))
        .build();
      Control controlModel = new Control.Builder()
        .grant(grantModel)
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
        .resource(v2PolicyResourceModel)
        .subject(policySubjectModel)
        .control(controlModel)
        .build();
      CreatePolicyTemplateVersionOptions createPolicyTemplateVersionOptions = new CreatePolicyTemplateVersionOptions.Builder()
        .policyTemplateId(exampleTemplateId)
        .policy(templatePolicyModel)
        .committed(true)
        .build();

      Response<PolicyTemplateLimitData> response = service.createPolicyTemplateVersion(createPolicyTemplateVersionOptions).execute();
      PolicyTemplateLimitData policyTemplate = response.getResult();
      exampleTemplateVersion = policyTemplate.getVersion();
      System.out.println(policyTemplate);
      // end-create_policy_template_version

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listPolicyTemplateVersions() result:");
      // begin-list_policy_template_versions
      ListPolicyTemplateVersionsOptions listPolicyTemplateVersionsOptions = new ListPolicyTemplateVersionsOptions.Builder()
        .policyTemplateId(exampleTemplateId)
        .build();

      Response<PolicyTemplateVersionsCollection> response = service.listPolicyTemplateVersions(listPolicyTemplateVersionsOptions).execute();
      PolicyTemplateVersionsCollection policyTemplateVersionsCollection = response.getResult();

      System.out.println(policyTemplateVersionsCollection);
      // end-list_policy_template_versions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPolicyTemplateVersion() result:");
      // begin-get_policy_template_version
      GetPolicyTemplateVersionOptions getPolicyTemplateVersionOptions = new GetPolicyTemplateVersionOptions.Builder()
        .policyTemplateId(exampleTemplateId)
        .version(exampleTemplateVersion)
        .build();

      Response<PolicyTemplate> response = service.getPolicyTemplateVersion(getPolicyTemplateVersionOptions).execute();
      PolicyTemplate policyTemplate = response.getResult();

      exampleTemplateEtag = response.getHeaders().values("Etag").get(0);

      System.out.println(policyTemplate);
      // end-get_policy_template_version

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-commit_policy_template
      CommitPolicyTemplateOptions commitPolicyTemplateOptions = new CommitPolicyTemplateOptions.Builder()
        .policyTemplateId(exampleTemplateId)
        .version(exampleBaseTemplateVersion)
        .build();

      Response<Void> response = service.commitPolicyTemplate(commitPolicyTemplateOptions).execute();
      // end-commit_policy_template
      System.out.printf("commitPolicyTemplate() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createPolicyTemplateAssignment() result:");
      // begin-create_policy_template_assignment
      AssignmentTargetDetails assignmentTargetDetails = new AssignmentTargetDetails.Builder()
        .type("Account")
        .id(exampleTargetAccountId)
        .build();

      AssignmentTemplateDetails assignmentTemplateDetails = new AssignmentTemplateDetails.Builder()
        .id(exampleTemplateId)
        .version(exampleBaseTemplateVersion)
        .build();

      CreatePolicyTemplateAssignmentOptions createPolicyAssignmentOptions = new CreatePolicyTemplateAssignmentOptions.Builder()
        .version("1.0")
        .target(assignmentTargetDetails)
        .templates(new ArrayList<AssignmentTemplateDetails>(Arrays.asList(assignmentTemplateDetails)))
        .build();

      Response<PolicyAssignmentV1Collection> response = service.createPolicyTemplateAssignment(createPolicyAssignmentOptions).execute();

      PolicyAssignmentV1Collection result = response.getResult();
      PolicyAssignmentV1 assignment = result.getAssignments().get(0);
      exampleAssignmentId = assignment.getId();
      PolicyAssignmentV1Resources resource = assignment.getResources().get(0);
      PolicyAssignmentResourcePolicy policy = resource.getPolicy();
      AssignmentResourceCreated resourceCreated = policy.getResourceCreated();
      exampleAssignmentPolicyId = resourceCreated.getId();
      List<String> values = response.getHeaders().values("ETag");
        exampleAssignmentETag = values.get(0);

      System.out.println(result);
      // end-create_policy_template_assignment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updatePolicyAssignment() result:");
      // begin-update_policy_assignment
      UpdatePolicyAssignmentOptions updatePolicyAssignmentOptions = new UpdatePolicyAssignmentOptions.Builder()
        .assignmentId(exampleAssignmentId)
        .version("1.0")
        .templateVersion(exampleTemplateVersion)
        .ifMatch(exampleAssignmentETag)
        .build();

      Response<PolicyAssignmentV1> response = service.updatePolicyAssignment(updatePolicyAssignmentOptions).execute();

      PolicyAssignmentV1 policyAssignmentRecord = response.getResult();

      System.out.println(policyAssignmentRecord);
      // end-update_policy_assignment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listPolicyAssignments() result:");
      // begin-list_policy_assignments
      ListPolicyAssignmentsOptions listPolicyAssignmentsOptions = new ListPolicyAssignmentsOptions.Builder()
        .accountId(exampleAccountId)
        .version("1.0")
        .build();

      Response<PolicyTemplateAssignmentCollection> response = service.listPolicyAssignments(listPolicyAssignmentsOptions).execute();
      PolicyTemplateAssignmentCollection polcyTemplateAssignmentCollection = response.getResult();
      System.out.println(polcyTemplateAssignmentCollection);
      // end-list_policy_assignments

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPolicyAssignment() result:");
      // begin-get_policy_assignment
      GetPolicyAssignmentOptions getPolicyAssignmentOptions = new GetPolicyAssignmentOptions.Builder()
        .assignmentId(exampleAssignmentId)
        .version("1.0")
        .build();

      Response<PolicyTemplateAssignmentItems> response = service.getPolicyAssignment(getPolicyAssignmentOptions).execute();
      PolicyTemplateAssignmentItems policyAssignmentRecord = response.getResult();
      PolicyAssignmentV1Resources resource = policyAssignmentRecord.getResources().get(0);
      PolicyAssignmentResourcePolicy policy = resource.getPolicy();
      AssignmentResourceCreated resourceCreated = policy.getResourceCreated();
      exampleAssignmentPolicyId = resourceCreated.getId();

      System.out.println(policyAssignmentRecord);
      // end-get_policy_assignment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTemplateMetaDataV2AccessPolicy() result:");
      // begin-get_v2_policy

      GetV2PolicyOptions options = new GetV2PolicyOptions.Builder()
              .id(exampleAssignmentPolicyId)
              .build();

      Response<V2PolicyTemplateMetaData> response = service.getV2Policy(options).execute();
      V2PolicyTemplateMetaData policy = response.getResult();

      System.out.println(policy.getTemplate());

      // end-get_v2_policy
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s\nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deletePolicyAssignment() result:");
      // begin-delete_policy_assignment
      DeletePolicyAssignmentOptions deletePolicyAssignmentOptions = new DeletePolicyAssignmentOptions.Builder()
        .assignmentId(exampleAssignmentId)
        .build();

      Response<Void> response = service.deletePolicyAssignment(deletePolicyAssignmentOptions).execute();
      // end-delete_policy_assignment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_policy_template_version
      DeletePolicyTemplateVersionOptions deletePolicyTemplateVersionOptions = new DeletePolicyTemplateVersionOptions.Builder()
        .policyTemplateId(exampleTemplateId)
        .version(exampleTemplateVersion)
        .build();

      Response<Void> response = service.deletePolicyTemplateVersion(deletePolicyTemplateVersionOptions).execute();
      // end-delete_policy_template_version
      System.out.printf("deletePolicyTemplateVersion() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_policy_template
      DeletePolicyTemplateOptions deletePolicyTemplateOptions = new DeletePolicyTemplateOptions.Builder()
        .policyTemplateId(exampleTemplateId)
        .build();

      Response<Void> response = service.deletePolicyTemplate(deletePolicyTemplateOptions).execute();
      // end-delete_policy_template
      System.out.printf("deletePolicyTemplate() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_access_management_account_settings
      GetSettingsOptions getSettingsOptions = new GetSettingsOptions.Builder()
              .accountId(exampleAccountId)
              .acceptLanguage("default")
              .build();

      Response<AccountSettingsAccessManagement> response = service.getSettings(getSettingsOptions).execute();
      // end-get_access_management_account_settings
      System.out.printf("getSettings() response status code: %d%n", response.getStatusCode());
      List<String> values = response.getHeaders().values("ETag");
      exampleAccountSettingsETag = values.get(0);
      System.out.println(response.getResult());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_access_management_account_settings
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
              .accountId(exampleAccountId)
              .acceptLanguage("default")
              .externalAccountIdentityInteraction(externalAccountIdentityInteractionPatch)
              .ifMatch(exampleAccountSettingsETag)
              .build();
      Response<AccountSettingsAccessManagement> response = service.updateSettings(updateSettingsOptions).execute();
      // end-update_access_management_account_settings
      System.out.printf("updateSettings() response status code: %d%n", response.getStatusCode());
      System.out.println(response.getResult());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createActionControlTemplate() result:");
      // begin-create_action_control_template

      // Construct an instance of the TemplateActionControl model
      TemplateActionControl templateActionControlModel = new TemplateActionControl.Builder()
        .serviceName("am-test-service")
        .description("Test Java SDK integration testcases")
        .actions(java.util.Arrays.asList("am-test-service.test.delete"))
        .build();

      CreateActionControlTemplateOptions createActionControlTemplateOptions = new CreateActionControlTemplateOptions.Builder()
        .name("JavaSDKExampleTest")
        .accountId(exampleAccountId)
        .description("ActionControl SDK Test template")
        .actionControl(templateActionControlModel)
        .build();

      Response<ActionControlTemplate> response = service.createActionControlTemplate(createActionControlTemplateOptions).execute();
      ActionControlTemplate actionControlTemplate = response.getResult();

      exampleActionControlTemplateId = actionControlTemplate.getId();
      exampleBaseActionControlTemplateVersion = actionControlTemplate.getVersion();

      System.out.println(actionControlTemplate);
      // end-create_action_control_template

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getActionControlTemplate() result:");
      // begin-get_action_control_template
      GetActionControlTemplateOptions getActionControlTemplateOptions = new GetActionControlTemplateOptions.Builder()
        .actionControlTemplateId(exampleActionControlTemplateId)
        .build();

      Response<ActionControlTemplate> response = service.getActionControlTemplate(getActionControlTemplateOptions).execute();
      ActionControlTemplate actionControlTemplate = response.getResult();

      exampleActionControlTemplateEtag = response.getHeaders().values("Etag").get(0);

      System.out.println(actionControlTemplate);
      // end-get_action_control_template

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceActionControlTemplate() result:");
      // begin-replace_action_control_template
      // Construct an instance of the TemplateActionControl model
      TemplateActionControl templateActionControlModel = new TemplateActionControl.Builder()
        .serviceName("am-test-service")
        .description("Java SDK action control example testcase")
        .actions(java.util.Arrays.asList("am-test-service.test.delete"))
        .build();

      // Construct an instance of the ReplaceActionControlTemplateOptions model
      ReplaceActionControlTemplateOptions replaceActionControlTemplateOptions = new ReplaceActionControlTemplateOptions.Builder()
        .actionControlTemplateId(exampleActionControlTemplateId)
        .version(exampleBaseActionControlTemplateVersion)
        .ifMatch(exampleActionControlTemplateEtag)
        .actionControl(templateActionControlModel)
        .committed(true)
        .description("Updated Java SDK action control template")
        .build();

      Response<ActionControlTemplate> response = service.replaceActionControlTemplate(replaceActionControlTemplateOptions).execute();
      ActionControlTemplate actionControlTemplate = response.getResult();

      System.out.println(actionControlTemplate);
      // end-replace_action_control_template
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listActionControlTemplates() result:");
      // begin-list_action_control_templates
      ListActionControlTemplatesOptions listActionControlTemplatesOptions = new ListActionControlTemplatesOptions.Builder()
        .accountId(exampleAccountId)
        .build();

      Response<ActionControlTemplateCollection> response = service.listActionControlTemplates(listActionControlTemplatesOptions).execute();
      ActionControlTemplateCollection actionControlTemplateCollection = response.getResult();

      System.out.println(actionControlTemplateCollection);
      // end-list_action_control_templates
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createActionControlTemplateVersion() result:");
      // begin-create_action_control_template_version

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
      .actionControlTemplateId(exampleActionControlTemplateId)
      .build();

      // Invoke operation
      Response<ActionControlTemplate> response = service.createActionControlTemplateVersion(createActionControlTemplateVersionOptions).execute();
      ActionControlTemplate actionControlTemplate = response.getResult();
      exampleActionControlTemplateVersion = actionControlTemplate.getVersion();
      System.out.println(actionControlTemplate);
      // end-create_action_control_template_version

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listActionControlTemplateVersions() result:");
      // begin-list_action_control_template_versions
      ListActionControlTemplateVersionsOptions listActionControlTemplateVersionsOptions = new ListActionControlTemplateVersionsOptions.Builder()
        .actionControlTemplateId(exampleActionControlTemplateId)
        .build();

      Response<ActionControlTemplateVersionsCollection> response = service.listActionControlTemplateVersions(listActionControlTemplateVersionsOptions).execute();
      ActionControlTemplateVersionsCollection actionControlTemplateVersionsCollection = response.getResult();

      System.out.println(actionControlTemplateVersionsCollection);
      // end-list_action_control_template_versions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getActionControlTemplateVersion() result:");
      // begin-get_action_control_template_version
      GetActionControlTemplateVersionOptions getActionControlTemplateVersionOptions = new GetActionControlTemplateVersionOptions.Builder()
        .actionControlTemplateId(exampleActionControlTemplateId)
        .version(exampleActionControlTemplateVersion)
        .build();

      Response<ActionControlTemplate> response = service.getActionControlTemplateVersion(getActionControlTemplateVersionOptions).execute();
      ActionControlTemplate actionControlTemplate = response.getResult();

      exampleActionControlTemplateEtag = response.getHeaders().values("Etag").get(0);

      System.out.println(actionControlTemplate);
      // end-get_action_control_template_version

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-commit_action_control_template
      CommitActionControlTemplateOptions commitActionControlTemplateOptions = new CommitActionControlTemplateOptions.Builder()
        .actionControlTemplateId(exampleActionControlTemplateId)
        .version(exampleBaseActionControlTemplateVersion)
        .build();

      Response<Void> response = service.commitActionControlTemplate(commitActionControlTemplateOptions).execute();
      // end-commit_action_control_template
      System.out.printf("commitActionControlTemplate() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createActionControlTemplateAssignment() result:");
      // begin-create_action_control_template_assignment
      AssignmentTargetDetails assignmentTargetDetails = new AssignmentTargetDetails.Builder()
        .type("Account")
        .id(exampleTargetAccountId)
        .build();

      ActionControlAssignmentTemplate assignmentTemplateDetails = new ActionControlAssignmentTemplate.Builder()
        .id(exampleActionControlTemplateId)
        .version(exampleBaseActionControlTemplateVersion)
        .build();

      CreateActionControlTemplateAssignmentOptions createActionControlAssignmentOptions = new CreateActionControlTemplateAssignmentOptions.Builder()
        .target(assignmentTargetDetails)
        .templates(new ArrayList<ActionControlAssignmentTemplate>(Arrays.asList(assignmentTemplateDetails)))
        .build();

      Response<ActionControlAssignmentCollection> response = service.createActionControlTemplateAssignment(createActionControlAssignmentOptions).execute();

      ActionControlAssignmentCollection result = response.getResult();
      ActionControlAssignment assignment = result.getAssignments().get(0);
      exampleActionControlAssignmentId = assignment.getId();

      List<String> values = response.getHeaders().values("Etag");
      exampleActionControlAssignmentETag = values.get(0);

      System.out.println(result);
      // end-create_action_control_template_assignment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateActionControlAssignment() result:");
      // begin-update_action_control_assignment
      UpdateActionControlAssignmentOptions updateActionControlAssignmentOptions = new UpdateActionControlAssignmentOptions.Builder()
        .assignmentId(exampleActionControlAssignmentId)
        .templateVersion(exampleActionControlTemplateVersion)
        .ifMatch(exampleActionControlAssignmentETag)
        .build();

      Response<ActionControlAssignment> response = service.updateActionControlAssignment(updateActionControlAssignmentOptions).execute();
      ActionControlAssignment actionControlAssignmentRecord = response.getResult();

      System.out.println(actionControlAssignmentRecord);
      // end-update_action_control_assignment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listActionControlAssignments() result:");
      // begin-list_action_control_assignments

      ListActionControlAssignmentsOptions listActionControlAssignmentsOptions = new ListActionControlAssignmentsOptions.Builder()
      .accountId(exampleAccountId)
      .build();
      Response<ActionControlAssignmentCollection> response = service.listActionControlAssignments(listActionControlAssignmentsOptions).execute();
      ActionControlAssignmentCollection result = response.getResult();

      System.out.println(result);
      // end-list_action_control_assignments

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getActionControlAssignment() result:");
      // begin-get_action_control_assignment
      GetActionControlAssignmentOptions getActionControlAssignmentOptions = new GetActionControlAssignmentOptions.Builder()
        .assignmentId(exampleActionControlAssignmentId)
        .build();

      Response<ActionControlAssignment> response = service.getActionControlAssignment(getActionControlAssignmentOptions).execute();
      ActionControlAssignment assignmentRecord = response.getResult();
      System.out.println(assignmentRecord);
      // end-get_action_control_assignment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteActionControlAssignment() result:");
      // begin-delete_action_control_assignment
      DeleteActionControlAssignmentOptions deleteActionControlAssignmentOptions = new DeleteActionControlAssignmentOptions.Builder()
        .assignmentId(exampleActionControlAssignmentId)
        .build();

      Response<Void> response = service.deleteActionControlAssignment(deleteActionControlAssignmentOptions).execute();
      // end-delete_action_control_assignment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_action_control_template_version
      DeleteActionControlTemplateVersionOptions deleteActionControlTemplateVersionOptions = new DeleteActionControlTemplateVersionOptions.Builder()
        .actionControlTemplateId(exampleActionControlTemplateId)
        .version(exampleBaseActionControlTemplateVersion)
        .build();

      Response<Void> response = service.deleteActionControlTemplateVersion(deleteActionControlTemplateVersionOptions).execute();
      // end-delete_action_control_template_version
      System.out.printf("deleteActionControlTemplateVersion() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_action_control_template
      DeleteActionControlTemplateOptions deleteActionControlTemplateOptions = new DeleteActionControlTemplateOptions.Builder()
        .actionControlTemplateId(exampleActionControlTemplateId)
        .build();

      Response<Void> response = service.deleteActionControlTemplate(deleteActionControlTemplateOptions).execute();
      // end-delete_action_control_template
      System.out.printf("deleteActionControlTemplate() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
