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
 * The commitProfileTemplate options.
 */
public class CommitProfileTemplateOptions extends GenericModel {

  protected String templateId;
  protected String version;

  /**
   * Builder.
   */
  public static class Builder {
    private String templateId;
    private String version;

    /**
     * Instantiates a new Builder from an existing CommitProfileTemplateOptions instance.
     *
     * @param commitProfileTemplateOptions the instance to initialize the Builder with
     */
    private Builder(CommitProfileTemplateOptions commitProfileTemplateOptions) {
      this.templateId = commitProfileTemplateOptions.templateId;
      this.version = commitProfileTemplateOptions.version;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param templateId the templateId
     * @param version the version
     */
    public Builder(String templateId, String version) {
      this.templateId = templateId;
      this.version = version;
    }

    /**
     * Builds a CommitProfileTemplateOptions.
     *
     * @return the new CommitProfileTemplateOptions instance
     */
    public CommitProfileTemplateOptions build() {
      return new CommitProfileTemplateOptions(this);
    }

    /**
     * Set the templateId.
     *
     * @param templateId the templateId
     * @return the CommitProfileTemplateOptions builder
     */
    public Builder templateId(String templateId) {
      this.templateId = templateId;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the CommitProfileTemplateOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }

  protected CommitProfileTemplateOptions() { }

  protected CommitProfileTemplateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.templateId,
      "templateId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.version,
      "version cannot be empty");
    templateId = builder.templateId;
    version = builder.version;
  }

  /**
   * New builder.
   *
   * @return a CommitProfileTemplateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the templateId.
   *
   * ID of the trusted profile template.
   *
   * @return the templateId
   */
  public String templateId() {
    return templateId;
  }

  /**
   * Gets the version.
   *
   * Version of the Profile Template.
   *
   * @return the version
   */
  public String version() {
    return version;
  }
}

