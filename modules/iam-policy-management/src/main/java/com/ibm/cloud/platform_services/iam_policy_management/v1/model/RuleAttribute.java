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

package com.ibm.cloud.platform_services.iam_policy_management.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Rule that specifies additional access that is granted (For example, time-based condition).
 */
public class RuleAttribute extends GenericModel {

  /**
   * The operator of an attribute.
   */
  public interface Operator {
    /** stringEquals. */
    String STRINGEQUALS = "stringEquals";
    /** stringExists. */
    String STRINGEXISTS = "stringExists";
    /** stringEqualsAnyOf. */
    String STRINGEQUALSANYOF = "stringEqualsAnyOf";
    /** stringMatchAnyOf. */
    String STRINGMATCHANYOF = "stringMatchAnyOf";
    /** stringMatch. */
    String STRINGMATCH = "stringMatch";
    /** timeLessThan. */
    String TIMELESSTHAN = "timeLessThan";
    /** timeLessThanOrEquals. */
    String TIMELESSTHANOREQUALS = "timeLessThanOrEquals";
    /** timeGreaterThan. */
    String TIMEGREATERTHAN = "timeGreaterThan";
    /** timeGreaterThanOrEquals. */
    String TIMEGREATERTHANOREQUALS = "timeGreaterThanOrEquals";
    /** dateLessThan. */
    String DATELESSTHAN = "dateLessThan";
    /** dateLessThanOrEquals. */
    String DATELESSTHANOREQUALS = "dateLessThanOrEquals";
    /** dateGreaterThan. */
    String DATEGREATERTHAN = "dateGreaterThan";
    /** dateGreaterThanOrEquals. */
    String DATEGREATERTHANOREQUALS = "dateGreaterThanOrEquals";
    /** dateTimeLessThan. */
    String DATETIMELESSTHAN = "dateTimeLessThan";
    /** dateTimeLessThanOrEquals. */
    String DATETIMELESSTHANOREQUALS = "dateTimeLessThanOrEquals";
    /** dateTimeGreaterThan. */
    String DATETIMEGREATERTHAN = "dateTimeGreaterThan";
    /** dateTimeGreaterThanOrEquals. */
    String DATETIMEGREATERTHANOREQUALS = "dateTimeGreaterThanOrEquals";
    /** dayOfWeekEquals. */
    String DAYOFWEEKEQUALS = "dayOfWeekEquals";
    /** dayOfWeekAnyOf. */
    String DAYOFWEEKANYOF = "dayOfWeekAnyOf";
  }

  protected String key;
  protected String operator;
  protected Object value;

  /**
   * Builder.
   */
  public static class Builder {
    private String key;
    private String operator;
    private Object value;

    /**
     * Instantiates a new Builder from an existing RuleAttribute instance.
     *
     * @param ruleAttribute the instance to initialize the Builder with
     */
    private Builder(RuleAttribute ruleAttribute) {
      this.key = ruleAttribute.key;
      this.operator = ruleAttribute.operator;
      this.value = ruleAttribute.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param key the key
     * @param operator the operator
     * @param value the value
     */
    public Builder(String key, String operator, Object value) {
      this.key = key;
      this.operator = operator;
      this.value = value;
    }

    /**
     * Builds a RuleAttribute.
     *
     * @return the new RuleAttribute instance
     */
    public RuleAttribute build() {
      return new RuleAttribute(this);
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the RuleAttribute builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set the operator.
     *
     * @param operator the operator
     * @return the RuleAttribute builder
     */
    public Builder operator(String operator) {
      this.operator = operator;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the RuleAttribute builder
     */
    public Builder value(Object value) {
      this.value = value;
      return this;
    }
  }

  protected RuleAttribute() { }

  protected RuleAttribute(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.key,
      "key cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.operator,
      "operator cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    key = builder.key;
    operator = builder.operator;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a RuleAttribute builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the key.
   *
   * The name of an attribute.
   *
   * @return the key
   */
  public String key() {
    return key;
  }

  /**
   * Gets the operator.
   *
   * The operator of an attribute.
   *
   * @return the operator
   */
  public String operator() {
    return operator;
  }

  /**
   * Gets the value.
   *
   * The value of a rule, resource, or subject attribute; can be boolean or string for resource and subject attribute.
   * Can be a string or an array of strings (for example, an array of days to permit access) for rule attribute.
   *
   * @return the value
   */
  public Object value() {
    return value;
  }
}

