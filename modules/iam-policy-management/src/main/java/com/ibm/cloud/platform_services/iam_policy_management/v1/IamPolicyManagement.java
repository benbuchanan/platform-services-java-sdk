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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.103.0-e8b84313-20250402-201816
 */

package com.ibm.cloud.platform_services.iam_policy_management.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.platform_services.common.SdkCommon;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.AccountSettingsAccessManagement;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignment;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlAssignmentCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplate;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplateCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ActionControlTemplateVersionsCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CommitActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.CommitPolicyTemplateOptions;
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
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListActionControlAssignmentsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListActionControlTemplateVersionsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListActionControlTemplatesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPoliciesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPolicyAssignmentsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPolicyTemplateVersionsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPolicyTemplatesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListRolesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListV2PoliciesOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.Policy;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentV1;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyAssignmentV1Collection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplate;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateAssignmentCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateAssignmentItems;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateLimitData;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateMetaData;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyTemplateVersionsCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplaceActionControlTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplacePolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplacePolicyTemplateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplaceRoleOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ReplaceV2PolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.RoleCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdateActionControlAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdatePolicyAssignmentOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdatePolicyStateOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.UpdateSettingsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2Policy;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyCollection;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyTemplateMetaData;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * IAM Policy Management API.
 *
 * API Version: 1.0.1
 */
public class IamPolicyManagement extends BaseService {

  /**
   * Default service name used when configuring the `IamPolicyManagement` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "iam_policy_management";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://iam.cloud.ibm.com";

 /**
   * Class method which constructs an instance of the `IamPolicyManagement` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `IamPolicyManagement` client using external configuration
   */
  public static IamPolicyManagement newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `IamPolicyManagement` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `IamPolicyManagement` client using external configuration
   */
  public static IamPolicyManagement newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    IamPolicyManagement service = new IamPolicyManagement(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `IamPolicyManagement` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public IamPolicyManagement(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Get policies by attributes.
   *
   * Get policies and filter by attributes. While managing policies, you might want to retrieve policies in the account
   * and filter by attribute values. This can be done through query parameters. The following attributes are supported:
   * account_id, iam_id, access_group_id, type, service_type, sort, format and state. account_id is a required query
   * parameter. Only policies that have the specified attributes and that the caller has read access to are returned. If
   * the caller does not have read access to any policies an empty array is returned.
   *
   * @param listPoliciesOptions the {@link ListPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyCollection}
   */
  public ServiceCall<PolicyCollection> listPolicies(ListPoliciesOptions listPoliciesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPoliciesOptions,
      "listPoliciesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "listPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPoliciesOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", listPoliciesOptions.acceptLanguage());
    }
    builder.query("account_id", String.valueOf(listPoliciesOptions.accountId()));
    if (listPoliciesOptions.iamId() != null) {
      builder.query("iam_id", String.valueOf(listPoliciesOptions.iamId()));
    }
    if (listPoliciesOptions.accessGroupId() != null) {
      builder.query("access_group_id", String.valueOf(listPoliciesOptions.accessGroupId()));
    }
    if (listPoliciesOptions.type() != null) {
      builder.query("type", String.valueOf(listPoliciesOptions.type()));
    }
    if (listPoliciesOptions.serviceType() != null) {
      builder.query("service_type", String.valueOf(listPoliciesOptions.serviceType()));
    }
    if (listPoliciesOptions.tagName() != null) {
      builder.query("tag_name", String.valueOf(listPoliciesOptions.tagName()));
    }
    if (listPoliciesOptions.tagValue() != null) {
      builder.query("tag_value", String.valueOf(listPoliciesOptions.tagValue()));
    }
    if (listPoliciesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listPoliciesOptions.sort()));
    }
    if (listPoliciesOptions.format() != null) {
      builder.query("format", String.valueOf(listPoliciesOptions.format()));
    }
    if (listPoliciesOptions.state() != null) {
      builder.query("state", String.valueOf(listPoliciesOptions.state()));
    }
    if (listPoliciesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPoliciesOptions.limit()));
    }
    if (listPoliciesOptions.start() != null) {
      builder.query("start", String.valueOf(listPoliciesOptions.start()));
    }
    ResponseConverter<PolicyCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a policy.
   *
   * Creates a policy to grant access between a subject and a resource. There are two types of policies: **access** and
   * **authorization**. A policy administrator might want to create an access policy which grants access to a user,
   * service-id, or an access group. They might also want to create an authorization policy and setup access between
   * services.
   *
   * ### Access
   *
   * To create an access policy, use **`"type": "access"`** in the body. The possible subject attributes are
   * **`iam_id`** and **`access_group_id`**. Use the **`iam_id`** subject attribute for assigning access for a user or
   * service-id. Use the **`access_group_id`** subject attribute for assigning access for an access group. Assign roles
   * that are supported by the service or platform roles. For more information, see [IAM roles and
   * actions](/docs/account?topic=account-iam-service-roles-actions). Use only the resource attributes supported by the
   * service. To view a service's or the platform's supported attributes, check the [documentation](/docs?tab=all-docs).
   * The policy resource must include either the **`serviceType`**, **`serviceName`**, **`resourceGroupId`** or
   * **`service_group_id`** attribute and the **`accountId`** attribute. The IAM Services group (`IAM`) is a subset of
   * account management services that includes the IAM platform services IAM Identity, IAM Access Management, IAM Users
   * Management, IAM Groups, and future IAM services. If the subject is a locked service-id, the request will fail.
   *
   * ### Authorization
   *
   * Authorization policies are supported by services on a case by case basis. Refer to service documentation to verify
   * their support of authorization policies. To create an authorization policy, use **`"type": "authorization"`** in
   * the body. The subject attributes must match the supported authorization subjects of the resource. Multiple subject
   * attributes might be provided. The following attributes are supported:
   *   serviceName, serviceInstance, region, resourceType, resource, accountId, resourceGroupId Assign roles that are
   * supported by the service or platform roles. For more information, see [IAM roles and
   * actions](/docs/account?topic=account-iam-service-roles-actions). The user must also have the same level of access
   * or greater to the target resource in order to grant the role. Use only the resource attributes supported by the
   * service. To view a service's or the platform's supported attributes, check the [documentation](/docs?tab=all-docs).
   * Both the policy subject and the policy resource must include the **`accountId`** attributes. The policy subject
   * must include either **`serviceName`** or **`resourceGroupId`** (or both) attributes.
   *
   * ### Attribute Operators
   *
   * Currently, only the `stringEquals` and the `stringMatch` operators are available. Resource attributes may support
   * one or both operators. For more information, see [Assigning access by using wildcard
   * policies](https://cloud.ibm.com/docs/account?topic=account-wildcard).
   *
   * ### Attribute Validations
   *
   * Policy attribute values must be between 1 and 1,000 characters in length. If location related attributes like
   * geography, country, metro, region, satellite, and locationvalues are supported by the service, they are validated
   * against Global Catalog locations.
   *
   * @param createPolicyOptions the {@link CreatePolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Policy}
   */
  public ServiceCall<Policy> createPolicy(CreatePolicyOptions createPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPolicyOptions,
      "createPolicyOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "createPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPolicyOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", createPolicyOptions.acceptLanguage());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", createPolicyOptions.type());
    contentJson.add("subjects", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyOptions.subjects()));
    contentJson.add("roles", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyOptions.roles()));
    contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyOptions.resources()));
    if (createPolicyOptions.description() != null) {
      contentJson.addProperty("description", createPolicyOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Policy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Policy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a policy.
   *
   * Update a policy to grant access between a subject and a resource. A policy administrator might want to update an
   * existing policy. The policy type cannot be changed (You cannot change an access policy to an authorization policy).
   *
   * ### Access
   *
   * To update an access policy, use **`"type": "access"`** in the body. The possible subject attributes are
   * **`iam_id`** and **`access_group_id`**. Use the **`iam_id`** subject attribute for assigning access for a user or
   * service-id. Use the **`access_group_id`** subject attribute for assigning access for an access group. Assign roles
   * that are supported by the service or platform roles. For more information, see [IAM roles and
   * actions](/docs/account?topic=account-iam-service-roles-actions). Use only the resource attributes supported by the
   * service. To view a service's or the platform's supported attributes, check the [documentation](/docs?tab=all-docs).
   * The policy resource must include either the **`serviceType`**, **`serviceName`**,  or **`resourceGroupId`**
   * attribute and the **`accountId`** attribute.` If the subject is a locked service-id, the request will fail.
   *
   * ### Authorization
   *
   * To update an authorization policy, use **`"type": "authorization"`** in the body. The subject attributes must match
   * the supported authorization subjects of the resource. Multiple subject attributes might be provided. The following
   * attributes are supported:
   *   serviceName, serviceInstance, region, resourceType, resource, accountId, resourceGroupId Assign roles that are
   * supported by the service or platform roles. For more information, see [IAM roles and
   * actions](/docs/account?topic=account-iam-service-roles-actions). The user must also have the same level of access
   * or greater to the target resource in order to grant the role. Use only the resource attributes supported by the
   * service. To view a service's or the platform's supported attributes, check the [documentation](/docs?tab=all-docs).
   * Both the policy subject and the policy resource must include the **`accountId`** attributes. The policy subject
   * must include either **`serviceName`** or **`resourceGroupId`** (or both) attributes.
   *
   * ### Attribute Operators
   *
   * Currently, only the `stringEquals` and the `stringMatch` operators are available. Resource attributes might support
   * one or both operators. For more information, see [Assigning access by using wildcard
   * policies](https://cloud.ibm.com/docs/account?topic=account-wildcard).
   *
   * ### Attribute Validations
   *
   * Policy attribute values must be between 1 and 1,000 characters in length. If location related attributes like
   * geography, country, metro, region, satellite, and locationvalues are supported by the service, they are validated
   * against Global Catalog locations.
   *
   * @param replacePolicyOptions the {@link ReplacePolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Policy}
   */
  public ServiceCall<Policy> replacePolicy(ReplacePolicyOptions replacePolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replacePolicyOptions,
      "replacePolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_id", replacePolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "replacePolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", replacePolicyOptions.ifMatch());
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", replacePolicyOptions.type());
    contentJson.add("subjects", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replacePolicyOptions.subjects()));
    contentJson.add("roles", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replacePolicyOptions.roles()));
    contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replacePolicyOptions.resources()));
    if (replacePolicyOptions.description() != null) {
      contentJson.addProperty("description", replacePolicyOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Policy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Policy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a policy by ID.
   *
   * Retrieve a policy by providing a policy ID.
   *
   * @param getPolicyOptions the {@link GetPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyTemplateMetaData}
   */
  public ServiceCall<PolicyTemplateMetaData> getPolicy(GetPolicyOptions getPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPolicyOptions,
      "getPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_id", getPolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "getPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<PolicyTemplateMetaData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyTemplateMetaData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a policy by ID.
   *
   * Delete a policy by providing a policy ID. A policy cannot be deleted if the subject ID contains a locked service
   * ID. If the subject of the policy is a locked service-id, the request will fail.
   *
   * @param deletePolicyOptions the {@link DeletePolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePolicy(DeletePolicyOptions deletePolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePolicyOptions,
      "deletePolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_id", deletePolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "deletePolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Restore a deleted policy by ID.
   *
   * Restore a policy that has recently been deleted. A policy administrator might want to restore a deleted policy. To
   * restore a policy, use **`"state": "active"`** in the body.
   *
   * @param updatePolicyStateOptions the {@link UpdatePolicyStateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Policy}
   */
  public ServiceCall<Policy> updatePolicyState(UpdatePolicyStateOptions updatePolicyStateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePolicyStateOptions,
      "updatePolicyStateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_id", updatePolicyStateOptions.policyId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "updatePolicyState");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", updatePolicyStateOptions.ifMatch());
    final JsonObject contentJson = new JsonObject();
    if (updatePolicyStateOptions.state() != null) {
      contentJson.addProperty("state", updatePolicyStateOptions.state());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Policy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Policy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get roles by filters.
   *
   * Get roles based on the filters. While managing roles, you may want to retrieve roles and filter by usages. This can
   * be done through query parameters. Currently, we only support the following attributes: account_id, service_name,
   * service_group_id, source_service_name and policy_type. Both service_name and service_group_id attributes are
   * mutually exclusive. Only roles that match the filter and that the caller has read access to are returned. If the
   * caller does not have read access to any roles an empty array is returned.
   *
   * @param listRolesOptions the {@link ListRolesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RoleCollection}
   */
  public ServiceCall<RoleCollection> listRoles(ListRolesOptions listRolesOptions) {
    if (listRolesOptions == null) {
      listRolesOptions = new ListRolesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/roles"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "listRoles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listRolesOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", listRolesOptions.acceptLanguage());
    }
    if (listRolesOptions.accountId() != null) {
      builder.query("account_id", String.valueOf(listRolesOptions.accountId()));
    }
    if (listRolesOptions.serviceName() != null) {
      builder.query("service_name", String.valueOf(listRolesOptions.serviceName()));
    }
    if (listRolesOptions.sourceServiceName() != null) {
      builder.query("source_service_name", String.valueOf(listRolesOptions.sourceServiceName()));
    }
    if (listRolesOptions.policyType() != null) {
      builder.query("policy_type", String.valueOf(listRolesOptions.policyType()));
    }
    if (listRolesOptions.serviceGroupId() != null) {
      builder.query("service_group_id", String.valueOf(listRolesOptions.serviceGroupId()));
    }
    ResponseConverter<RoleCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RoleCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get roles by filters.
   *
   * Get roles based on the filters. While managing roles, you may want to retrieve roles and filter by usages. This can
   * be done through query parameters. Currently, we only support the following attributes: account_id, service_name,
   * service_group_id, source_service_name and policy_type. Both service_name and service_group_id attributes are
   * mutually exclusive. Only roles that match the filter and that the caller has read access to are returned. If the
   * caller does not have read access to any roles an empty array is returned.
   *
   * @return a {@link ServiceCall} with a result of type {@link RoleCollection}
   */
  public ServiceCall<RoleCollection> listRoles() {
    return listRoles(null);
  }

  /**
   * Create a role.
   *
   * Creates a custom role for a specific service within the account. An account owner or a user assigned the
   * Administrator role on the Role management service can create a custom role. Any number of actions for a single
   * service can be mapped to the new role, but there must be at least one service-defined action to successfully create
   * the new role.
   *
   * @param createRoleOptions the {@link CreateRoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomRole}
   */
  public ServiceCall<CustomRole> createRole(CreateRoleOptions createRoleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createRoleOptions,
      "createRoleOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/roles"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "createRole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createRoleOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", createRoleOptions.acceptLanguage());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("display_name", createRoleOptions.displayName());
    contentJson.add("actions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createRoleOptions.actions()));
    contentJson.addProperty("name", createRoleOptions.name());
    contentJson.addProperty("account_id", createRoleOptions.accountId());
    contentJson.addProperty("service_name", createRoleOptions.serviceName());
    if (createRoleOptions.description() != null) {
      contentJson.addProperty("description", createRoleOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CustomRole> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomRole>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a role.
   *
   * Update a custom role. A role administrator might want to update an existing role by updating the display name,
   * description, or the actions that are mapped to the role. The name, account_id, and service_name can't be changed.
   *
   * @param replaceRoleOptions the {@link ReplaceRoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomRole}
   */
  public ServiceCall<CustomRole> replaceRole(ReplaceRoleOptions replaceRoleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceRoleOptions,
      "replaceRoleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("role_id", replaceRoleOptions.roleId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/roles/{role_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "replaceRole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", replaceRoleOptions.ifMatch());
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("display_name", replaceRoleOptions.displayName());
    contentJson.add("actions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceRoleOptions.actions()));
    if (replaceRoleOptions.description() != null) {
      contentJson.addProperty("description", replaceRoleOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CustomRole> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomRole>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a role by ID.
   *
   * Retrieve a role by providing a role ID.
   *
   * @param getRoleOptions the {@link GetRoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomRole}
   */
  public ServiceCall<CustomRole> getRole(GetRoleOptions getRoleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getRoleOptions,
      "getRoleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("role_id", getRoleOptions.roleId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/roles/{role_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "getRole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CustomRole> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomRole>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a role by ID.
   *
   * Delete a role by providing a role ID.
   *
   * @param deleteRoleOptions the {@link DeleteRoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteRole(DeleteRoleOptions deleteRoleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteRoleOptions,
      "deleteRoleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("role_id", deleteRoleOptions.roleId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/roles/{role_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "deleteRole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get policies by attributes.
   *
   * Get policies and filter by attributes. While managing policies, you might want to retrieve policies in the account
   * and filter by attribute values. This can be done through query parameters. The following attributes are supported:
   * account_id, iam_id, access_group_id, type, service_type, sort, format and state. account_id is a required query
   * parameter. Only policies that have the specified attributes and that the caller has read access to are returned. If
   * the caller does not have read access to any policies an empty array is returned.
   *
   * @param listV2PoliciesOptions the {@link ListV2PoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link V2PolicyCollection}
   */
  public ServiceCall<V2PolicyCollection> listV2Policies(ListV2PoliciesOptions listV2PoliciesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listV2PoliciesOptions,
      "listV2PoliciesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "listV2Policies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listV2PoliciesOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", listV2PoliciesOptions.acceptLanguage());
    }
    builder.query("account_id", String.valueOf(listV2PoliciesOptions.accountId()));
    if (listV2PoliciesOptions.iamId() != null) {
      builder.query("iam_id", String.valueOf(listV2PoliciesOptions.iamId()));
    }
    if (listV2PoliciesOptions.accessGroupId() != null) {
      builder.query("access_group_id", String.valueOf(listV2PoliciesOptions.accessGroupId()));
    }
    if (listV2PoliciesOptions.type() != null) {
      builder.query("type", String.valueOf(listV2PoliciesOptions.type()));
    }
    if (listV2PoliciesOptions.serviceType() != null) {
      builder.query("service_type", String.valueOf(listV2PoliciesOptions.serviceType()));
    }
    if (listV2PoliciesOptions.serviceName() != null) {
      builder.query("service_name", String.valueOf(listV2PoliciesOptions.serviceName()));
    }
    if (listV2PoliciesOptions.serviceGroupId() != null) {
      builder.query("service_group_id", String.valueOf(listV2PoliciesOptions.serviceGroupId()));
    }
    if (listV2PoliciesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listV2PoliciesOptions.sort()));
    }
    if (listV2PoliciesOptions.format() != null) {
      builder.query("format", String.valueOf(listV2PoliciesOptions.format()));
    }
    if (listV2PoliciesOptions.state() != null) {
      builder.query("state", String.valueOf(listV2PoliciesOptions.state()));
    }
    if (listV2PoliciesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listV2PoliciesOptions.limit()));
    }
    if (listV2PoliciesOptions.start() != null) {
      builder.query("start", String.valueOf(listV2PoliciesOptions.start()));
    }
    ResponseConverter<V2PolicyCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<V2PolicyCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a policy.
   *
   * Creates a policy to grant access between a subject and a resource. Currently, there is one type of a v2/policy:
   * **access**. A policy administrator might want to create an access policy that grants access to a user, service-id,
   * or an access group.
   *
   * ### Access
   *
   * To create an access policy, use **`"type": "access"`** in the body. The supported subject attributes are
   * **`iam_id`** and **`access_group_id`**. Use the **`iam_id`** subject attribute to assign access to a user or
   * service-id. Use the **`access_group_id`** subject attribute to assign access to an access group. Assign roles that
   * are supported by the service or platform roles. For more information, see [IAM roles and
   * actions](/docs/account?topic=account-iam-service-roles-actions). Use only the resource attributes supported by the
   * service. To view a service's or the platform's supported attributes, check the [documentation](/docs?tab=all-docs).
   * The policy resource must include either the **`serviceType`**, **`serviceName`**, **`resourceGroupId`** or
   * **`service_group_id`** attribute and the **`accountId`** attribute. In the rule field, you can specify a single
   * condition by using **`key`**, **`value`**, and condition **`operator`**, or a set of **`conditions`** with a
   * combination **`operator`**. The possible combination operators are **`and`** and **`or`**.
   *
   * Currently, we support two types of patterns:
   *
   * 1. `time-based`: Used to specify a time-based restriction
   *
   * Combine conditions to specify a time-based restriction (e.g., access only during business hours, during the
   * Monday-Friday work week). For example, a policy can grant access Monday-Friday, 9:00am-5:00pm using the following
   * rule:
   * ```json
   *   "rule": {
   *     "operator": "and",
   *     "conditions": [{
   *       "key": "{{environment.attributes.day_of_week}}",
   *       "operator": "dayOfWeekAnyOf",
   *       "value": ["1+00:00", "2+00:00", "3+00:00", "4+00:00", "5+00:00"]
   *     },
   *       "key": "{{environment.attributes.current_time}}",
   *       "operator": "timeGreaterThanOrEquals",
   *       "value": "09:00:00+00:00"
   *     },
   *       "key": "{{environment.attributes.current_time}}",
   *       "operator": "timeLessThanOrEquals",
   *       "value": "17:00:00+00:00"
   *     }]
   *   }
   * ``` You can use the following operators in the **`key`** and **`value`** pair:
   * ```
   *   'timeLessThan', 'timeLessThanOrEquals', 'timeGreaterThan', 'timeGreaterThanOrEquals',
   *   'dateLessThan', 'dateLessThanOrEquals', 'dateGreaterThan', 'dateGreaterThanOrEquals',
   *   'dateTimeLessThan', 'dateTimeLessThanOrEquals', 'dateTimeGreaterThan', 'dateTimeGreaterThanOrEquals',
   *   'dayOfWeekEquals', 'dayOfWeekAnyOf'
   * ```
   *
   * The pattern field that matches the rule is required when rule is provided. For the business hour rule example
   * above, the **`pattern`** is **`"time-based-conditions:weekly"`**. For more information, see [Time-based conditions
   * operators](/docs/account?topic=account-iam-condition-properties&amp;interface=ui#policy-condition-properties) and
   * [Limiting access with time-based conditions](/docs/account?topic=account-iam-time-based&amp;interface=ui). If the
   * subject is a locked service-id, the request will fail.
   *
   * 2. `attribute-based`: Used to specify a combination of OR/AND based conditions applied on resource attributes.
   *
   * Combine conditions to specify an attribute-based condition using AND/OR-based operators.
   *
   * For example, a policy can grant access based on multiple conditions applied on the resource attributes below:
   * ```json
   *   "pattern": "attribute-based-condition:resource:literal-and-wildcard"
   *   "rule": {
   *       "operator": "or",
   *       "conditions": [
   *         {
   *           "operator": "and",
   *           "conditions": [
   *             {
   *               "key": "{{resource.attributes.prefix}}",
   *               "operator": "stringEquals",
   *               "value": "home/test"
   *             },
   *             {
   *               "key": "{{environment.attributes.delimiter}}",
   *               "operator": "stringEquals",
   *               "value": "/"
   *             }
   *           ]
   *         },
   *         {
   *           "key": "{{resource.attributes.path}}",
   *           "operator": "stringMatch",
   *           "value": "home/David/_*"
   *         }
   *       ]
   *   }
   * ```
   *
   * In addition to satisfying the `resources` section, the policy grants permission only if either the `path` begins
   * with `home/David/` **OR**  the `prefix` is `home/test` and the `delimiter` is `/`. This mechanism helps you
   * consolidate multiple policies in to a single policy,  making policies easier to administer and stay within the
   * policy limit for an account. View the list of operators that can be used in the condition
   * [here](/docs/account?topic=account-wildcard#string-comparisons).
   *
   * ### Authorization
   *
   * Authorization policies are supported by services on a case by case basis. Refer to service documentation to verify
   * their support of authorization policies. To create an authorization policy, use **`"type": "authorization"`** in
   * the body. The subject attributes must match the supported authorization subjects of the resource. Multiple subject
   * attributes might be provided. The following attributes are supported:
   *   serviceName, serviceInstance, region, resourceType, resource, accountId, resourceGroupId Assign roles that are
   * supported by the service or platform roles. For more information, see [IAM roles and
   * actions](/docs/account?topic=account-iam-service-roles-actions). The user must also have the same level of access
   * or greater to the target resource in order to grant the role. Use only the resource attributes supported by the
   * service. To view a service's or the platform's supported attributes, check the [documentation](/docs?tab=all-docs).
   * Both the policy subject and the policy resource must include the **`accountId`** attributes. The policy subject
   * must include either **`serviceName`** or **`resourceGroupId`** (or both) attributes.
   *
   * ### Attribute Operators
   *
   * Currently, only the `stringEquals`, `stringMatch`, and `stringEquals` operators are available. For more
   * information, see [Assigning access by using wildcard
   * policies](https://cloud.ibm.com/docs/account?topic=account-wildcard).
   *
   * ### Attribute Validations
   *
   * Policy attribute values must be between 1 and 1,000 characters in length. If location related attributes like
   * geography, country, metro, region, satellite, and locationvalues are supported by the service, they are validated
   * against Global Catalog locations.
   *
   * @param createV2PolicyOptions the {@link CreateV2PolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link V2Policy}
   */
  public ServiceCall<V2Policy> createV2Policy(CreateV2PolicyOptions createV2PolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createV2PolicyOptions,
      "createV2PolicyOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "createV2Policy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createV2PolicyOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", createV2PolicyOptions.acceptLanguage());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("control", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createV2PolicyOptions.control()));
    contentJson.addProperty("type", createV2PolicyOptions.type());
    if (createV2PolicyOptions.description() != null) {
      contentJson.addProperty("description", createV2PolicyOptions.description());
    }
    if (createV2PolicyOptions.subject() != null) {
      contentJson.add("subject", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createV2PolicyOptions.subject()));
    }
    if (createV2PolicyOptions.resource() != null) {
      contentJson.add("resource", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createV2PolicyOptions.resource()));
    }
    if (createV2PolicyOptions.pattern() != null) {
      contentJson.addProperty("pattern", createV2PolicyOptions.pattern());
    }
    if (createV2PolicyOptions.rule() != null) {
      contentJson.add("rule", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createV2PolicyOptions.rule()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<V2Policy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<V2Policy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a policy.
   *
   * Update a policy to grant access between a subject and a resource. A policy administrator might want to update an
   * existing policy.
   *
   * ### Access
   *
   * To update an access policy, use **`"type": "access"`** in the body. The supported subject attributes are
   * **`iam_id`** and **`access_group_id`**. Use the **`iam_id`** subject attribute to assign access to a user or
   * service-id. Use the **`access_group_id`** subject attribute to assign access to an access group. Assign roles that
   * are supported by the service or platform roles. For more information, see [IAM roles and
   * actions](/docs/account?topic=account-iam-service-roles-actions). Use only the resource attributes supported by the
   * service. To view a service's or the platform's supported attributes, check the [documentation](/docs?tab=all-docs).
   * The policy resource must include either the **`serviceType`**, **`serviceName`**, **`resourceGroupId`** or
   * **`service_group_id`** attribute and the **`accountId`** attribute. In the rule field, you can specify a single
   * condition by using **`key`**, **`value`**, and condition **`operator`**, or a set of **`conditions`** with a
   * combination **`operator`**. The possible combination operators are **`and`** and **`or`**.
   *
   * Currently, we support two types of patterns:
   *
   * 1. `time-based`: Used to specify a time-based restriction
   *
   * Combine conditions to specify a time-based restriction (e.g., access only during business hours, during the
   * Monday-Friday work week). For example, a policy can grant access Monday-Friday, 9:00am-5:00pm using the following
   * rule:
   * ```json
   *   "rule": {
   *     "operator": "and",
   *     "conditions": [{
   *       "key": "{{environment.attributes.day_of_week}}",
   *       "operator": "dayOfWeekAnyOf",
   *       "value": ["1+00:00", "2+00:00", "3+00:00", "4+00:00", "5+00:00"]
   *     },
   *       "key": "{{environment.attributes.current_time}}",
   *       "operator": "timeGreaterThanOrEquals",
   *       "value": "09:00:00+00:00"
   *     },
   *       "key": "{{environment.attributes.current_time}}",
   *       "operator": "timeLessThanOrEquals",
   *       "value": "17:00:00+00:00"
   *     }]
   *   }
   * ``` You can use the following operators in the **`key`** and **`value`** pair:
   * ```
   *   'timeLessThan', 'timeLessThanOrEquals', 'timeGreaterThan', 'timeGreaterThanOrEquals',
   *   'dateLessThan', 'dateLessThanOrEquals', 'dateGreaterThan', 'dateGreaterThanOrEquals',
   *   'dateTimeLessThan', 'dateTimeLessThanOrEquals', 'dateTimeGreaterThan', 'dateTimeGreaterThanOrEquals',
   *   'dayOfWeekEquals', 'dayOfWeekAnyOf'
   * ``` The pattern field that matches the rule is required when rule is provided. For the business hour rule example
   * above, the **`pattern`** is **`"time-based-conditions:weekly"`**. For more information, see [Time-based conditions
   * operators](/docs/account?topic=account-iam-condition-properties&amp;interface=ui#policy-condition-properties) and
   * [Limiting access with time-based conditions](/docs/account?topic=account-iam-time-based&amp;interface=ui). If the
   * subject is a locked service-id, the request will fail.
   *
   * 2. `attribute-based`: Used to specify a combination of OR/AND based conditions applied on resource attributes.
   *
   * Combine conditions to specify an attribute-based condition using AND/OR-based operators.
   *
   * For example, a policy can grant access based on multiple conditions applied on the resource attributes below:
   * ```json
   *   "pattern": "attribute-based-condition:resource:literal-and-wildcard"
   *   "rule": {
   *       "operator": "or",
   *       "conditions": [
   *         {
   *           "operator": "and",
   *           "conditions": [
   *             {
   *               "key": "{{resource.attributes.prefix}}",
   *               "operator": "stringEquals",
   *               "value": "home/test"
   *             },
   *             {
   *               "key": "{{environment.attributes.delimiter}}",
   *               "operator": "stringEquals",
   *               "value": "/"
   *             }
   *           ]
   *         },
   *         {
   *           "key": "{{resource.attributes.path}}",
   *           "operator": "stringMatch",
   *           "value": "home/David/_*"
   *         }
   *       ]
   *   }
   * ```
   *
   * In addition to satisfying the `resources` section, the policy grants permission only if either the `path` begins
   * with `home/David/` **OR**  the `prefix` is `home/test` and the `delimiter` is `/`. This mechanism helps you
   * consolidate multiple policies in to a single policy,  making policies easier to administer and stay within the
   * policy limit for an account. View the list of operators that can be used in the condition
   * [here](/docs/account?topic=account-wildcard#string-comparisons).
   *
   * ### Authorization
   *
   * To update an authorization policy, use **`"type": "authorization"`** in the body. The subject attributes must match
   * the supported authorization subjects of the resource. Multiple subject attributes might be provided. The following
   * attributes are supported:
   *   serviceName, serviceInstance, region, resourceType, resource, accountId, resourceGroupId Assign roles that are
   * supported by the service or platform roles. For more information, see [IAM roles and
   * actions](/docs/account?topic=account-iam-service-roles-actions). The user must also have the same level of access
   * or greater to the target resource in order to grant the role. Use only the resource attributes supported by the
   * service. To view a service's or the platform's supported attributes, check the [documentation](/docs?tab=all-docs).
   * Both the policy subject and the policy resource must include the **`accountId`** attributes. The policy subject
   * must include either **`serviceName`** or **`resourceGroupId`** (or both) attributes.
   *
   * ### Attribute Operators
   *
   * Currently, only the `stringEquals`, `stringMatch`, and `stringEquals` operators are available. For more
   * information, see [Assigning access by using wildcard
   * policies](https://cloud.ibm.com/docs/account?topic=account-wildcard).
   *
   * ### Attribute Validations
   *
   * Policy attribute values must be between 1 and 1,000 characters in length. If location related attributes like
   * geography, country, metro, region, satellite, and locationvalues are supported by the service, they are validated
   * against Global Catalog locations.
   *
   * @param replaceV2PolicyOptions the {@link ReplaceV2PolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link V2Policy}
   */
  public ServiceCall<V2Policy> replaceV2Policy(ReplaceV2PolicyOptions replaceV2PolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceV2PolicyOptions,
      "replaceV2PolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", replaceV2PolicyOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "replaceV2Policy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", replaceV2PolicyOptions.ifMatch());
    final JsonObject contentJson = new JsonObject();
    contentJson.add("control", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceV2PolicyOptions.control()));
    contentJson.addProperty("type", replaceV2PolicyOptions.type());
    if (replaceV2PolicyOptions.description() != null) {
      contentJson.addProperty("description", replaceV2PolicyOptions.description());
    }
    if (replaceV2PolicyOptions.subject() != null) {
      contentJson.add("subject", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceV2PolicyOptions.subject()));
    }
    if (replaceV2PolicyOptions.resource() != null) {
      contentJson.add("resource", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceV2PolicyOptions.resource()));
    }
    if (replaceV2PolicyOptions.pattern() != null) {
      contentJson.addProperty("pattern", replaceV2PolicyOptions.pattern());
    }
    if (replaceV2PolicyOptions.rule() != null) {
      contentJson.add("rule", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceV2PolicyOptions.rule()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<V2Policy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<V2Policy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a policy by ID.
   *
   * Retrieve a policy by providing a policy ID.
   *
   * @param getV2PolicyOptions the {@link GetV2PolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link V2PolicyTemplateMetaData}
   */
  public ServiceCall<V2PolicyTemplateMetaData> getV2Policy(GetV2PolicyOptions getV2PolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getV2PolicyOptions,
      "getV2PolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getV2PolicyOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "getV2Policy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getV2PolicyOptions.format() != null) {
      builder.query("format", String.valueOf(getV2PolicyOptions.format()));
    }
    ResponseConverter<V2PolicyTemplateMetaData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<V2PolicyTemplateMetaData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a policy by ID.
   *
   * Delete a policy by providing a policy ID. A policy cannot be deleted if the subject ID contains a locked service
   * ID. If the subject of the policy is a locked service-id, the request will fail.
   *
   * @param deleteV2PolicyOptions the {@link DeleteV2PolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteV2Policy(DeleteV2PolicyOptions deleteV2PolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteV2PolicyOptions,
      "deleteV2PolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteV2PolicyOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/policies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "deleteV2Policy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List policy templates by attributes.
   *
   * List policy templates and filter by attributes by using query parameters. The following attributes are supported:
   * `account_id`, `policy_service_name`, `policy_service_type`, `policy_service_group_id` and `policy_type`.
   * `account_id` is a required query parameter. These attributes `policy_service_name`, `policy_service_type` and
   * `policy_service_group_id` are mutually exclusive. Only policy templates that have the specified attributes and that
   * the caller has read access to are returned. If the caller does not have read access to any policy templates an
   * empty array is returned.
   *
   * @param listPolicyTemplatesOptions the {@link ListPolicyTemplatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyTemplateCollection}
   */
  public ServiceCall<PolicyTemplateCollection> listPolicyTemplates(ListPolicyTemplatesOptions listPolicyTemplatesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPolicyTemplatesOptions,
      "listPolicyTemplatesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_templates"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "listPolicyTemplates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPolicyTemplatesOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", listPolicyTemplatesOptions.acceptLanguage());
    }
    builder.query("account_id", String.valueOf(listPolicyTemplatesOptions.accountId()));
    if (listPolicyTemplatesOptions.state() != null) {
      builder.query("state", String.valueOf(listPolicyTemplatesOptions.state()));
    }
    if (listPolicyTemplatesOptions.name() != null) {
      builder.query("name", String.valueOf(listPolicyTemplatesOptions.name()));
    }
    if (listPolicyTemplatesOptions.policyServiceType() != null) {
      builder.query("policy_service_type", String.valueOf(listPolicyTemplatesOptions.policyServiceType()));
    }
    if (listPolicyTemplatesOptions.policyServiceName() != null) {
      builder.query("policy_service_name", String.valueOf(listPolicyTemplatesOptions.policyServiceName()));
    }
    if (listPolicyTemplatesOptions.policyServiceGroupId() != null) {
      builder.query("policy_service_group_id", String.valueOf(listPolicyTemplatesOptions.policyServiceGroupId()));
    }
    if (listPolicyTemplatesOptions.policyType() != null) {
      builder.query("policy_type", String.valueOf(listPolicyTemplatesOptions.policyType()));
    }
    if (listPolicyTemplatesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPolicyTemplatesOptions.limit()));
    }
    if (listPolicyTemplatesOptions.start() != null) {
      builder.query("start", String.valueOf(listPolicyTemplatesOptions.start()));
    }
    ResponseConverter<PolicyTemplateCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyTemplateCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a policy template.
   *
   * Create a policy template. Policy templates define a policy without requiring a subject, and you can use them to
   * grant access to multiple subjects.
   *
   * @param createPolicyTemplateOptions the {@link CreatePolicyTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyTemplateLimitData}
   */
  public ServiceCall<PolicyTemplateLimitData> createPolicyTemplate(CreatePolicyTemplateOptions createPolicyTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPolicyTemplateOptions,
      "createPolicyTemplateOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_templates"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "createPolicyTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPolicyTemplateOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", createPolicyTemplateOptions.acceptLanguage());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createPolicyTemplateOptions.name());
    contentJson.addProperty("account_id", createPolicyTemplateOptions.accountId());
    contentJson.add("policy", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyTemplateOptions.policy()));
    if (createPolicyTemplateOptions.description() != null) {
      contentJson.addProperty("description", createPolicyTemplateOptions.description());
    }
    if (createPolicyTemplateOptions.committed() != null) {
      contentJson.addProperty("committed", createPolicyTemplateOptions.committed());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PolicyTemplateLimitData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyTemplateLimitData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve latest version of a policy template.
   *
   * Retrieve the latest version of a policy template by providing a policy template ID.
   *
   * @param getPolicyTemplateOptions the {@link GetPolicyTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyTemplate}
   */
  public ServiceCall<PolicyTemplate> getPolicyTemplate(GetPolicyTemplateOptions getPolicyTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPolicyTemplateOptions,
      "getPolicyTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_template_id", getPolicyTemplateOptions.policyTemplateId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_templates/{policy_template_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "getPolicyTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getPolicyTemplateOptions.state() != null) {
      builder.query("state", String.valueOf(getPolicyTemplateOptions.state()));
    }
    ResponseConverter<PolicyTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a policy template.
   *
   * Delete a policy template by providing the policy template ID. This deletes all versions of this template. A policy
   * template can't be deleted if any version of the template is assigned to one or more child accounts. You must remove
   * the policy assignments first.
   *
   * @param deletePolicyTemplateOptions the {@link DeletePolicyTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePolicyTemplate(DeletePolicyTemplateOptions deletePolicyTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePolicyTemplateOptions,
      "deletePolicyTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_template_id", deletePolicyTemplateOptions.policyTemplateId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_templates/{policy_template_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "deletePolicyTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new policy template version.
   *
   * Create a new version of a policy template. Use this if you need to make updates to a policy template that is
   * committed.
   *
   * @param createPolicyTemplateVersionOptions the {@link CreatePolicyTemplateVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyTemplateLimitData}
   */
  public ServiceCall<PolicyTemplateLimitData> createPolicyTemplateVersion(CreatePolicyTemplateVersionOptions createPolicyTemplateVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPolicyTemplateVersionOptions,
      "createPolicyTemplateVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_template_id", createPolicyTemplateVersionOptions.policyTemplateId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_templates/{policy_template_id}/versions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "createPolicyTemplateVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.add("policy", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyTemplateVersionOptions.policy()));
    if (createPolicyTemplateVersionOptions.name() != null) {
      contentJson.addProperty("name", createPolicyTemplateVersionOptions.name());
    }
    if (createPolicyTemplateVersionOptions.description() != null) {
      contentJson.addProperty("description", createPolicyTemplateVersionOptions.description());
    }
    if (createPolicyTemplateVersionOptions.committed() != null) {
      contentJson.addProperty("committed", createPolicyTemplateVersionOptions.committed());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PolicyTemplateLimitData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyTemplateLimitData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve policy template versions.
   *
   * Retrieve the versions of a policy template by providing a policy template ID.
   *
   * @param listPolicyTemplateVersionsOptions the {@link ListPolicyTemplateVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyTemplateVersionsCollection}
   */
  public ServiceCall<PolicyTemplateVersionsCollection> listPolicyTemplateVersions(ListPolicyTemplateVersionsOptions listPolicyTemplateVersionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPolicyTemplateVersionsOptions,
      "listPolicyTemplateVersionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_template_id", listPolicyTemplateVersionsOptions.policyTemplateId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_templates/{policy_template_id}/versions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "listPolicyTemplateVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPolicyTemplateVersionsOptions.state() != null) {
      builder.query("state", String.valueOf(listPolicyTemplateVersionsOptions.state()));
    }
    if (listPolicyTemplateVersionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPolicyTemplateVersionsOptions.limit()));
    }
    if (listPolicyTemplateVersionsOptions.start() != null) {
      builder.query("start", String.valueOf(listPolicyTemplateVersionsOptions.start()));
    }
    ResponseConverter<PolicyTemplateVersionsCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyTemplateVersionsCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a policy template version.
   *
   * Update a specific version of a policy template. You can use this only if the version isn't committed.
   *
   * @param replacePolicyTemplateOptions the {@link ReplacePolicyTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyTemplate}
   */
  public ServiceCall<PolicyTemplate> replacePolicyTemplate(ReplacePolicyTemplateOptions replacePolicyTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replacePolicyTemplateOptions,
      "replacePolicyTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_template_id", replacePolicyTemplateOptions.policyTemplateId());
    pathParamsMap.put("version", replacePolicyTemplateOptions.version());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_templates/{policy_template_id}/versions/{version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "replacePolicyTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", replacePolicyTemplateOptions.ifMatch());
    final JsonObject contentJson = new JsonObject();
    contentJson.add("policy", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replacePolicyTemplateOptions.policy()));
    if (replacePolicyTemplateOptions.name() != null) {
      contentJson.addProperty("name", replacePolicyTemplateOptions.name());
    }
    if (replacePolicyTemplateOptions.description() != null) {
      contentJson.addProperty("description", replacePolicyTemplateOptions.description());
    }
    if (replacePolicyTemplateOptions.committed() != null) {
      contentJson.addProperty("committed", replacePolicyTemplateOptions.committed());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PolicyTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a policy template version.
   *
   * Delete a specific version of a policy template by providing a policy template ID and version number. You can't
   * delete a policy template version that is assigned to one or more child accounts. You must remove the policy
   * assignments first.
   *
   * @param deletePolicyTemplateVersionOptions the {@link DeletePolicyTemplateVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePolicyTemplateVersion(DeletePolicyTemplateVersionOptions deletePolicyTemplateVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePolicyTemplateVersionOptions,
      "deletePolicyTemplateVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_template_id", deletePolicyTemplateVersionOptions.policyTemplateId());
    pathParamsMap.put("version", deletePolicyTemplateVersionOptions.version());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_templates/{policy_template_id}/versions/{version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "deletePolicyTemplateVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a policy template version.
   *
   * Retrieve a policy template by providing a policy template ID and version number.
   *
   * @param getPolicyTemplateVersionOptions the {@link GetPolicyTemplateVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyTemplate}
   */
  public ServiceCall<PolicyTemplate> getPolicyTemplateVersion(GetPolicyTemplateVersionOptions getPolicyTemplateVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPolicyTemplateVersionOptions,
      "getPolicyTemplateVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_template_id", getPolicyTemplateVersionOptions.policyTemplateId());
    pathParamsMap.put("version", getPolicyTemplateVersionOptions.version());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_templates/{policy_template_id}/versions/{version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "getPolicyTemplateVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<PolicyTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Commit a policy template version.
   *
   * Commit a policy template version. You can make no further changes to the policy template once it's committed. If
   * you need to make updates after committing a version, create a new version.
   *
   * @param commitPolicyTemplateOptions the {@link CommitPolicyTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> commitPolicyTemplate(CommitPolicyTemplateOptions commitPolicyTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(commitPolicyTemplateOptions,
      "commitPolicyTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_template_id", commitPolicyTemplateOptions.policyTemplateId());
    pathParamsMap.put("version", commitPolicyTemplateOptions.version());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_templates/{policy_template_id}/versions/{version}/commit", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "commitPolicyTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get policy template assignments.
   *
   * Get policy template assignments by attributes. The following attributes are supported:
   * `account_id`, `template_id`, `template_version`, `sort`.
   * `account_id` is a required query parameter. Only policy template assignments that have the specified attributes and
   * that the caller has read access to are returned. If the caller does not have read access to any policy template
   * assignments an empty array is returned.
   *
   * @param listPolicyAssignmentsOptions the {@link ListPolicyAssignmentsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyTemplateAssignmentCollection}
   */
  public ServiceCall<PolicyTemplateAssignmentCollection> listPolicyAssignments(ListPolicyAssignmentsOptions listPolicyAssignmentsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPolicyAssignmentsOptions,
      "listPolicyAssignmentsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_assignments"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "listPolicyAssignments");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPolicyAssignmentsOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", listPolicyAssignmentsOptions.acceptLanguage());
    }
    builder.query("version", String.valueOf(listPolicyAssignmentsOptions.version()));
    builder.query("account_id", String.valueOf(listPolicyAssignmentsOptions.accountId()));
    if (listPolicyAssignmentsOptions.templateId() != null) {
      builder.query("template_id", String.valueOf(listPolicyAssignmentsOptions.templateId()));
    }
    if (listPolicyAssignmentsOptions.templateVersion() != null) {
      builder.query("template_version", String.valueOf(listPolicyAssignmentsOptions.templateVersion()));
    }
    if (listPolicyAssignmentsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPolicyAssignmentsOptions.limit()));
    }
    if (listPolicyAssignmentsOptions.start() != null) {
      builder.query("start", String.valueOf(listPolicyAssignmentsOptions.start()));
    }
    ResponseConverter<PolicyTemplateAssignmentCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyTemplateAssignmentCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a policy authorization template assignment.
   *
   * Assign a policy template to child accounts and account groups. This creates the policy in the accounts and account
   * groups that you specify.
   *
   * @param createPolicyTemplateAssignmentOptions the {@link CreatePolicyTemplateAssignmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyAssignmentV1Collection}
   */
  public ServiceCall<PolicyAssignmentV1Collection> createPolicyTemplateAssignment(CreatePolicyTemplateAssignmentOptions createPolicyTemplateAssignmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPolicyTemplateAssignmentOptions,
      "createPolicyTemplateAssignmentOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_assignments"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "createPolicyTemplateAssignment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPolicyTemplateAssignmentOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", createPolicyTemplateAssignmentOptions.acceptLanguage());
    }
    builder.query("version", String.valueOf(createPolicyTemplateAssignmentOptions.version()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyTemplateAssignmentOptions.target()));
    contentJson.add("templates", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyTemplateAssignmentOptions.templates()));
    builder.bodyJson(contentJson);
    ResponseConverter<PolicyAssignmentV1Collection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyAssignmentV1Collection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a policy assignment.
   *
   * Retrieve a policy template assignment by providing a policy assignment ID.
   *
   * @param getPolicyAssignmentOptions the {@link GetPolicyAssignmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyTemplateAssignmentItems}
   */
  public ServiceCall<PolicyTemplateAssignmentItems> getPolicyAssignment(GetPolicyAssignmentOptions getPolicyAssignmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPolicyAssignmentOptions,
      "getPolicyAssignmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("assignment_id", getPolicyAssignmentOptions.assignmentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_assignments/{assignment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "getPolicyAssignment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(getPolicyAssignmentOptions.version()));
    ResponseConverter<PolicyTemplateAssignmentItems> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyTemplateAssignmentItems>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a policy authorization type assignment.
   *
   * Update a policy assignment by providing a policy assignment ID.
   *
   * @param updatePolicyAssignmentOptions the {@link UpdatePolicyAssignmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyAssignmentV1}
   */
  public ServiceCall<PolicyAssignmentV1> updatePolicyAssignment(UpdatePolicyAssignmentOptions updatePolicyAssignmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePolicyAssignmentOptions,
      "updatePolicyAssignmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("assignment_id", updatePolicyAssignmentOptions.assignmentId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_assignments/{assignment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "updatePolicyAssignment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", updatePolicyAssignmentOptions.ifMatch());
    builder.query("version", String.valueOf(updatePolicyAssignmentOptions.version()));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("template_version", updatePolicyAssignmentOptions.templateVersion());
    builder.bodyJson(contentJson);
    ResponseConverter<PolicyAssignmentV1> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyAssignmentV1>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove a policy assignment.
   *
   * Remove a policy template assignment by providing a policy assignment ID. You can't delete a policy assignment if
   * the status is "in_progress".
   *
   * @param deletePolicyAssignmentOptions the {@link DeletePolicyAssignmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePolicyAssignment(DeletePolicyAssignmentOptions deletePolicyAssignmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePolicyAssignmentOptions,
      "deletePolicyAssignmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("assignment_id", deletePolicyAssignmentOptions.assignmentId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/policy_assignments/{assignment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "deletePolicyAssignment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve Access Management account settings by account ID.
   *
   * Retrieve Access Management settings for an account by providing the account ID.
   *
   * @param getSettingsOptions the {@link GetSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccountSettingsAccessManagement}
   */
  public ServiceCall<AccountSettingsAccessManagement> getSettings(GetSettingsOptions getSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSettingsOptions,
      "getSettingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("account_id", getSettingsOptions.accountId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/accounts/{account_id}/settings/access_management", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "getSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSettingsOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", getSettingsOptions.acceptLanguage());
    }
    ResponseConverter<AccountSettingsAccessManagement> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccountSettingsAccessManagement>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update Access Management account settings by account ID.
   *
   * Update access management settings for an account.
   *
   * ### External Account Identity Interaction
   *
   * Update the way identities within an external account are allowed to interact with the requested account by
   * providing:
   * * the `account_id` as a parameter
   * * one or more external account ID(s) and state for the specific identity in the request body
   *
   * External account identity interaction includes the following `identity_types`: `user` (user identities that are
   * defined as [IBMid's](https://cloud.ibm.com/docs/account?topic=account-identity-overview#users-bestpract)),
   * `service_id` (defined as [IAM
   * ServiceIds](https://cloud.ibm.com/docs/account?topic=account-identity-overview#serviceid-bestpract)), `service`
   * (defined by a service’s [CRN](https://cloud.ibm.com/docs/account?topic=account-crn)). To update an Identity’s
   * setting, the `state` and `external_allowed_accounts` fields are required.
   *
   * Different identity states are:
   * * "enabled": An identity type is allowed to access resources in the account provided it has access policies on
   * those resources.
   * * "limited": An identity type is allowed to access resources in the account provided it has access policies on
   * those resources AND it is associated with either the account the resources are in or one of the allowed accounts.
   * This setting uses the "external_allowed_accounts" list.
   * * "monitor": It has no direct impact on an Identity’s access. Instead, it creates AT events for access decisions as
   * if the account were in a limited “state”.
   *
   * **Note**: The state "enabled" is a special case. In this case, access is given to all accounts and there is no need
   * to specify a particular list. Therefore, when updating "state" to "enabled" for an identity type
   * "external_allowed_accounts" should be left empty.
   *
   * @param updateSettingsOptions the {@link UpdateSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccountSettingsAccessManagement}
   */
  public ServiceCall<AccountSettingsAccessManagement> updateSettings(UpdateSettingsOptions updateSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSettingsOptions,
      "updateSettingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("account_id", updateSettingsOptions.accountId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/accounts/{account_id}/settings/access_management", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "updateSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", updateSettingsOptions.ifMatch());
    if (updateSettingsOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", updateSettingsOptions.acceptLanguage());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateSettingsOptions.externalAccountIdentityInteraction() != null) {
      contentJson.add("external_account_identity_interaction", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettingsOptions.externalAccountIdentityInteraction()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AccountSettingsAccessManagement> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccountSettingsAccessManagement>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List action control templates by attributes.
   *
   * List action control templates and filter by attributes by using query parameters. The following attributes are
   * supported:
   * `account_id`
   * `account_id` is a required query parameter. Only action control templates that have the specified attributes and
   * that the caller has read access to are returned. If the caller does not have read access to any action control
   * templates an empty array is returned.
   *
   * @param listActionControlTemplatesOptions the {@link ListActionControlTemplatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlTemplateCollection}
   */
  public ServiceCall<ActionControlTemplateCollection> listActionControlTemplates(ListActionControlTemplatesOptions listActionControlTemplatesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listActionControlTemplatesOptions,
      "listActionControlTemplatesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_templates"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "listActionControlTemplates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listActionControlTemplatesOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", listActionControlTemplatesOptions.acceptLanguage());
    }
    builder.query("account_id", String.valueOf(listActionControlTemplatesOptions.accountId()));
    if (listActionControlTemplatesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listActionControlTemplatesOptions.limit()));
    }
    if (listActionControlTemplatesOptions.start() != null) {
      builder.query("start", String.valueOf(listActionControlTemplatesOptions.start()));
    }
    ResponseConverter<ActionControlTemplateCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlTemplateCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an action control template.
   *
   * Create an action control template. Action control templates define a service action control.
   *
   * @param createActionControlTemplateOptions the {@link CreateActionControlTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlTemplate}
   */
  public ServiceCall<ActionControlTemplate> createActionControlTemplate(CreateActionControlTemplateOptions createActionControlTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createActionControlTemplateOptions,
      "createActionControlTemplateOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_templates"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "createActionControlTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createActionControlTemplateOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", createActionControlTemplateOptions.acceptLanguage());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createActionControlTemplateOptions.name());
    contentJson.addProperty("account_id", createActionControlTemplateOptions.accountId());
    if (createActionControlTemplateOptions.description() != null) {
      contentJson.addProperty("description", createActionControlTemplateOptions.description());
    }
    if (createActionControlTemplateOptions.committed() != null) {
      contentJson.addProperty("committed", createActionControlTemplateOptions.committed());
    }
    if (createActionControlTemplateOptions.actionControl() != null) {
      contentJson.add("action_control", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionControlTemplateOptions.actionControl()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ActionControlTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the latest version of an action control template.
   *
   * Retrieve the latest version of an action control template by providing an action control template ID.
   *
   * @param getActionControlTemplateOptions the {@link GetActionControlTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlTemplate}
   */
  public ServiceCall<ActionControlTemplate> getActionControlTemplate(GetActionControlTemplateOptions getActionControlTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getActionControlTemplateOptions,
      "getActionControlTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_control_template_id", getActionControlTemplateOptions.actionControlTemplateId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_templates/{action_control_template_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "getActionControlTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getActionControlTemplateOptions.state() != null) {
      builder.query("state", String.valueOf(getActionControlTemplateOptions.state()));
    }
    ResponseConverter<ActionControlTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an action control template.
   *
   * Delete an action control template by providing the action control template ID. This deletes all versions of this
   * template. An action control template can't be deleted if any version of the template is assigned to one or more
   * child accounts. You must remove the action control assignments first.
   *
   * @param deleteActionControlTemplateOptions the {@link DeleteActionControlTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteActionControlTemplate(DeleteActionControlTemplateOptions deleteActionControlTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteActionControlTemplateOptions,
      "deleteActionControlTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_control_template_id", deleteActionControlTemplateOptions.actionControlTemplateId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_templates/{action_control_template_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "deleteActionControlTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new action control template version.
   *
   * Create a new version of an action control template. Use this if you need to make updates to an action control
   * template that is committed.
   *
   * @param createActionControlTemplateVersionOptions the {@link CreateActionControlTemplateVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlTemplate}
   */
  public ServiceCall<ActionControlTemplate> createActionControlTemplateVersion(CreateActionControlTemplateVersionOptions createActionControlTemplateVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createActionControlTemplateVersionOptions,
      "createActionControlTemplateVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_control_template_id", createActionControlTemplateVersionOptions.actionControlTemplateId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_templates/{action_control_template_id}/versions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "createActionControlTemplateVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createActionControlTemplateVersionOptions.name() != null) {
      contentJson.addProperty("name", createActionControlTemplateVersionOptions.name());
    }
    if (createActionControlTemplateVersionOptions.description() != null) {
      contentJson.addProperty("description", createActionControlTemplateVersionOptions.description());
    }
    if (createActionControlTemplateVersionOptions.actionControl() != null) {
      contentJson.add("action_control", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionControlTemplateVersionOptions.actionControl()));
    }
    if (createActionControlTemplateVersionOptions.committed() != null) {
      contentJson.addProperty("committed", createActionControlTemplateVersionOptions.committed());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ActionControlTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve action control template versions.
   *
   * Retrieve the versions of an action control template by providing an action control template ID.
   *
   * @param listActionControlTemplateVersionsOptions the {@link ListActionControlTemplateVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlTemplateVersionsCollection}
   */
  public ServiceCall<ActionControlTemplateVersionsCollection> listActionControlTemplateVersions(ListActionControlTemplateVersionsOptions listActionControlTemplateVersionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listActionControlTemplateVersionsOptions,
      "listActionControlTemplateVersionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_control_template_id", listActionControlTemplateVersionsOptions.actionControlTemplateId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_templates/{action_control_template_id}/versions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "listActionControlTemplateVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listActionControlTemplateVersionsOptions.state() != null) {
      builder.query("state", String.valueOf(listActionControlTemplateVersionsOptions.state()));
    }
    if (listActionControlTemplateVersionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listActionControlTemplateVersionsOptions.limit()));
    }
    if (listActionControlTemplateVersionsOptions.start() != null) {
      builder.query("start", String.valueOf(listActionControlTemplateVersionsOptions.start()));
    }
    ResponseConverter<ActionControlTemplateVersionsCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlTemplateVersionsCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an action control template version.
   *
   * Update a specific version of an action control template. You can use this only if the version isn't committed.
   *
   * @param replaceActionControlTemplateOptions the {@link ReplaceActionControlTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlTemplate}
   */
  public ServiceCall<ActionControlTemplate> replaceActionControlTemplate(ReplaceActionControlTemplateOptions replaceActionControlTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceActionControlTemplateOptions,
      "replaceActionControlTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_control_template_id", replaceActionControlTemplateOptions.actionControlTemplateId());
    pathParamsMap.put("version", replaceActionControlTemplateOptions.version());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_templates/{action_control_template_id}/versions/{version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "replaceActionControlTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", replaceActionControlTemplateOptions.ifMatch());
    final JsonObject contentJson = new JsonObject();
    if (replaceActionControlTemplateOptions.name() != null) {
      contentJson.addProperty("name", replaceActionControlTemplateOptions.name());
    }
    if (replaceActionControlTemplateOptions.description() != null) {
      contentJson.addProperty("description", replaceActionControlTemplateOptions.description());
    }
    if (replaceActionControlTemplateOptions.actionControl() != null) {
      contentJson.add("action_control", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceActionControlTemplateOptions.actionControl()));
    }
    if (replaceActionControlTemplateOptions.committed() != null) {
      contentJson.addProperty("committed", replaceActionControlTemplateOptions.committed());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ActionControlTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an action control template version.
   *
   * Delete a specific version of an action control template by providing an action control template ID and version
   * number. You can't delete an action control template version that is assigned to one or more child accounts. You
   * must remove the action control assignments first.
   *
   * @param deleteActionControlTemplateVersionOptions the {@link DeleteActionControlTemplateVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteActionControlTemplateVersion(DeleteActionControlTemplateVersionOptions deleteActionControlTemplateVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteActionControlTemplateVersionOptions,
      "deleteActionControlTemplateVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_control_template_id", deleteActionControlTemplateVersionOptions.actionControlTemplateId());
    pathParamsMap.put("version", deleteActionControlTemplateVersionOptions.version());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_templates/{action_control_template_id}/versions/{version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "deleteActionControlTemplateVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an action control template version.
   *
   * Retrieve an action control template by providing an action control template ID and version number.
   *
   * @param getActionControlTemplateVersionOptions the {@link GetActionControlTemplateVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlTemplate}
   */
  public ServiceCall<ActionControlTemplate> getActionControlTemplateVersion(GetActionControlTemplateVersionOptions getActionControlTemplateVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getActionControlTemplateVersionOptions,
      "getActionControlTemplateVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_control_template_id", getActionControlTemplateVersionOptions.actionControlTemplateId());
    pathParamsMap.put("version", getActionControlTemplateVersionOptions.version());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_templates/{action_control_template_id}/versions/{version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "getActionControlTemplateVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ActionControlTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Commit an action control template version.
   *
   * Commit an action control template version. You cannot make any further changes to the action control template once
   * it's committed. If you have to make updates after committing a version, create a new version.
   *
   * @param commitActionControlTemplateOptions the {@link CommitActionControlTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> commitActionControlTemplate(CommitActionControlTemplateOptions commitActionControlTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(commitActionControlTemplateOptions,
      "commitActionControlTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_control_template_id", commitActionControlTemplateOptions.actionControlTemplateId());
    pathParamsMap.put("version", commitActionControlTemplateOptions.version());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_templates/{action_control_template_id}/versions/{version}/commit", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "commitActionControlTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get action control template assignments.
   *
   * Get action control template assignments by attributes. The following attributes are supported:
   * `account_id`, `template_id`, `template_version`, `sort`.
   * `account_id` is a required query parameter. Only action control template assignments with the specified attributes
   * and  accessible by the caller are returned. If the caller does not have read access to any action control template
   * assignments, an empty array is returned.
   *
   * @param listActionControlAssignmentsOptions the {@link ListActionControlAssignmentsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlAssignmentCollection}
   */
  public ServiceCall<ActionControlAssignmentCollection> listActionControlAssignments(ListActionControlAssignmentsOptions listActionControlAssignmentsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listActionControlAssignmentsOptions,
      "listActionControlAssignmentsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_assignments"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "listActionControlAssignments");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listActionControlAssignmentsOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", listActionControlAssignmentsOptions.acceptLanguage());
    }
    builder.query("account_id", String.valueOf(listActionControlAssignmentsOptions.accountId()));
    if (listActionControlAssignmentsOptions.templateId() != null) {
      builder.query("template_id", String.valueOf(listActionControlAssignmentsOptions.templateId()));
    }
    if (listActionControlAssignmentsOptions.templateVersion() != null) {
      builder.query("template_version", String.valueOf(listActionControlAssignmentsOptions.templateVersion()));
    }
    if (listActionControlAssignmentsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listActionControlAssignmentsOptions.limit()));
    }
    if (listActionControlAssignmentsOptions.start() != null) {
      builder.query("start", String.valueOf(listActionControlAssignmentsOptions.start()));
    }
    ResponseConverter<ActionControlAssignmentCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlAssignmentCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an action control template assignment.
   *
   * Assign an action control template to child accounts and account groups. This creates the action control in the
   * accounts and account groups that you specify.
   *
   * @param createActionControlTemplateAssignmentOptions the {@link CreateActionControlTemplateAssignmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlAssignmentCollection}
   */
  public ServiceCall<ActionControlAssignmentCollection> createActionControlTemplateAssignment(CreateActionControlTemplateAssignmentOptions createActionControlTemplateAssignmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createActionControlTemplateAssignmentOptions,
      "createActionControlTemplateAssignmentOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_assignments"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "createActionControlTemplateAssignment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createActionControlTemplateAssignmentOptions.acceptLanguage() != null) {
      builder.header("Accept-Language", createActionControlTemplateAssignmentOptions.acceptLanguage());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionControlTemplateAssignmentOptions.target()));
    contentJson.add("templates", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionControlTemplateAssignmentOptions.templates()));
    builder.bodyJson(contentJson);
    ResponseConverter<ActionControlAssignmentCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlAssignmentCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an action control assignment.
   *
   * Retrieve an action control template assignment by providing an action control assignment ID.
   *
   * @param getActionControlAssignmentOptions the {@link GetActionControlAssignmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlAssignment}
   */
  public ServiceCall<ActionControlAssignment> getActionControlAssignment(GetActionControlAssignmentOptions getActionControlAssignmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getActionControlAssignmentOptions,
      "getActionControlAssignmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("assignment_id", getActionControlAssignmentOptions.assignmentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_assignments/{assignment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "getActionControlAssignment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ActionControlAssignment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlAssignment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an action control assignment.
   *
   * Update an action control assignment by providing an action control assignment ID.
   *
   * @param updateActionControlAssignmentOptions the {@link UpdateActionControlAssignmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionControlAssignment}
   */
  public ServiceCall<ActionControlAssignment> updateActionControlAssignment(UpdateActionControlAssignmentOptions updateActionControlAssignmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateActionControlAssignmentOptions,
      "updateActionControlAssignmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("assignment_id", updateActionControlAssignmentOptions.assignmentId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_assignments/{assignment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "updateActionControlAssignment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", updateActionControlAssignmentOptions.ifMatch());
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("template_version", updateActionControlAssignmentOptions.templateVersion());
    builder.bodyJson(contentJson);
    ResponseConverter<ActionControlAssignment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionControlAssignment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove an action control assignment.
   *
   * Remove an action control template assignment by providing an action control assignment ID. You can't delete an
   * action control assignment if the status is "in_progress".
   *
   * @param deleteActionControlAssignmentOptions the {@link DeleteActionControlAssignmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteActionControlAssignment(DeleteActionControlAssignmentOptions deleteActionControlAssignmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteActionControlAssignmentOptions,
      "deleteActionControlAssignmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("assignment_id", deleteActionControlAssignmentOptions.assignmentId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/action_control_assignments/{assignment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("iam_policy_management", "v1", "deleteActionControlAssignment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

}
