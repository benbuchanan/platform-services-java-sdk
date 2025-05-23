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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getPreferencesOnScopeAccount options.
 */
public class GetPreferencesOnScopeAccountOptions extends GenericModel {

  protected String accountId;
  protected String iamId;
  protected String service;
  protected String preferenceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String accountId;
    private String iamId;
    private String service;
    private String preferenceId;

    /**
     * Instantiates a new Builder from an existing GetPreferencesOnScopeAccountOptions instance.
     *
     * @param getPreferencesOnScopeAccountOptions the instance to initialize the Builder with
     */
    private Builder(GetPreferencesOnScopeAccountOptions getPreferencesOnScopeAccountOptions) {
      this.accountId = getPreferencesOnScopeAccountOptions.accountId;
      this.iamId = getPreferencesOnScopeAccountOptions.iamId;
      this.service = getPreferencesOnScopeAccountOptions.service;
      this.preferenceId = getPreferencesOnScopeAccountOptions.preferenceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param accountId the accountId
     * @param iamId the iamId
     * @param service the service
     * @param preferenceId the preferenceId
     */
    public Builder(String accountId, String iamId, String service, String preferenceId) {
      this.accountId = accountId;
      this.iamId = iamId;
      this.service = service;
      this.preferenceId = preferenceId;
    }

    /**
     * Builds a GetPreferencesOnScopeAccountOptions.
     *
     * @return the new GetPreferencesOnScopeAccountOptions instance
     */
    public GetPreferencesOnScopeAccountOptions build() {
      return new GetPreferencesOnScopeAccountOptions(this);
    }

    /**
     * Set the accountId.
     *
     * @param accountId the accountId
     * @return the GetPreferencesOnScopeAccountOptions builder
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * Set the iamId.
     *
     * @param iamId the iamId
     * @return the GetPreferencesOnScopeAccountOptions builder
     */
    public Builder iamId(String iamId) {
      this.iamId = iamId;
      return this;
    }

    /**
     * Set the service.
     *
     * @param service the service
     * @return the GetPreferencesOnScopeAccountOptions builder
     */
    public Builder service(String service) {
      this.service = service;
      return this;
    }

    /**
     * Set the preferenceId.
     *
     * @param preferenceId the preferenceId
     * @return the GetPreferencesOnScopeAccountOptions builder
     */
    public Builder preferenceId(String preferenceId) {
      this.preferenceId = preferenceId;
      return this;
    }
  }

  protected GetPreferencesOnScopeAccountOptions() { }

  protected GetPreferencesOnScopeAccountOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.accountId,
      "accountId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.iamId,
      "iamId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.service,
      "service cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.preferenceId,
      "preferenceId cannot be empty");
    accountId = builder.accountId;
    iamId = builder.iamId;
    service = builder.service;
    preferenceId = builder.preferenceId;
  }

  /**
   * New builder.
   *
   * @return a GetPreferencesOnScopeAccountOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accountId.
   *
   * Account id to get preference for.
   *
   * @return the accountId
   */
  public String accountId() {
    return accountId;
  }

  /**
   * Gets the iamId.
   *
   * IAM id to get the preference for.
   *
   * @return the iamId
   */
  public String iamId() {
    return iamId;
  }

  /**
   * Gets the service.
   *
   * Service of the preference to be fetched.
   *
   * @return the service
   */
  public String service() {
    return service;
  }

  /**
   * Gets the preferenceId.
   *
   * Identifier of preference to be fetched.
   *
   * @return the preferenceId
   */
  public String preferenceId() {
    return preferenceId;
  }
}

