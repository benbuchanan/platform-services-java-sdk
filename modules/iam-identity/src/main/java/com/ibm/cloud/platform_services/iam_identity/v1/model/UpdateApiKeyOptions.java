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
 * The updateApiKey options.
 */
public class UpdateApiKeyOptions extends GenericModel {

  protected String id;
  protected String ifMatch;
  protected String name;
  protected String description;
  protected Boolean supportSessions;
  protected String actionWhenLeaked;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String ifMatch;
    private String name;
    private String description;
    private Boolean supportSessions;
    private String actionWhenLeaked;

    /**
     * Instantiates a new Builder from an existing UpdateApiKeyOptions instance.
     *
     * @param updateApiKeyOptions the instance to initialize the Builder with
     */
    private Builder(UpdateApiKeyOptions updateApiKeyOptions) {
      this.id = updateApiKeyOptions.id;
      this.ifMatch = updateApiKeyOptions.ifMatch;
      this.name = updateApiKeyOptions.name;
      this.description = updateApiKeyOptions.description;
      this.supportSessions = updateApiKeyOptions.supportSessions;
      this.actionWhenLeaked = updateApiKeyOptions.actionWhenLeaked;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param ifMatch the ifMatch
     */
    public Builder(String id, String ifMatch) {
      this.id = id;
      this.ifMatch = ifMatch;
    }

    /**
     * Builds a UpdateApiKeyOptions.
     *
     * @return the new UpdateApiKeyOptions instance
     */
    public UpdateApiKeyOptions build() {
      return new UpdateApiKeyOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateApiKeyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateApiKeyOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateApiKeyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateApiKeyOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the supportSessions.
     *
     * @param supportSessions the supportSessions
     * @return the UpdateApiKeyOptions builder
     */
    public Builder supportSessions(Boolean supportSessions) {
      this.supportSessions = supportSessions;
      return this;
    }

    /**
     * Set the actionWhenLeaked.
     *
     * @param actionWhenLeaked the actionWhenLeaked
     * @return the UpdateApiKeyOptions builder
     */
    public Builder actionWhenLeaked(String actionWhenLeaked) {
      this.actionWhenLeaked = actionWhenLeaked;
      return this;
    }
  }

  protected UpdateApiKeyOptions() { }

  protected UpdateApiKeyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    id = builder.id;
    ifMatch = builder.ifMatch;
    name = builder.name;
    description = builder.description;
    supportSessions = builder.supportSessions;
    actionWhenLeaked = builder.actionWhenLeaked;
  }

  /**
   * New builder.
   *
   * @return a UpdateApiKeyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Unique ID of the API key to be updated.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the ifMatch.
   *
   * Version of the API key to be updated. Specify the version that you retrieved when reading the API key. This value
   * helps identifying parallel usage of this API. Pass * to indicate to update any version available. This might result
   * in stale updates.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the name.
   *
   * The name of the API key to update. If specified in the request the parameter must not be empty. The name is not
   * checked for uniqueness. Failure to this will result in an Error condition.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The description of the API key to update. If specified an empty description will clear the description of the API
   * key. If a non empty value is provided the API key will be updated.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the supportSessions.
   *
   * Defines whether you can manage CLI login sessions for the API key. When `true`, sessions are created and can be
   * reviewed or revoked. When `false`, no sessions are tracked. To block access, delete or rotate the API key.
   * Available only for user API keys.
   *
   * @return the supportSessions
   */
  public Boolean supportSessions() {
    return supportSessions;
  }

  /**
   * Gets the actionWhenLeaked.
   *
   * Defines the action to take when API key is leaked, valid values are 'none', 'disable' and 'delete'.
   *
   * @return the actionWhenLeaked
   */
  public String actionWhenLeaked() {
    return actionWhenLeaked;
  }
}

