/**
 * 
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.6.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.olympia.oxfordapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


/**
 * LanguagesResults
 */
public class LanguagesResults   {
  @SerializedName("region")
  private String region = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("sourceLanguage")
  private LanguagesSourceLanguage sourceLanguage = null;

  @SerializedName("targetLanguage")
  private LanguagesTargetLanguage targetLanguage = null;

  /**
   * whether monolingual or bilingual.
   */
  public enum TypeEnum {
    @SerializedName("monolingual")
    MONOLINGUAL("monolingual"),
    
    @SerializedName("bilingual")
    BILINGUAL("bilingual");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public LanguagesResults region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Name of region.
   * @return region
  **/
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public LanguagesResults source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Name of source dictionary.
   * @return source
  **/
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public LanguagesResults sourceLanguage(LanguagesSourceLanguage sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    return this;
  }

   /**
   * Get sourceLanguage
   * @return sourceLanguage
  **/
  public LanguagesSourceLanguage getSourceLanguage() {
    return sourceLanguage;
  }

  public void setSourceLanguage(LanguagesSourceLanguage sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }

  public LanguagesResults targetLanguage(LanguagesTargetLanguage targetLanguage) {
    this.targetLanguage = targetLanguage;
    return this;
  }

   /**
   * Get targetLanguage
   * @return targetLanguage
  **/
  public LanguagesTargetLanguage getTargetLanguage() {
    return targetLanguage;
  }

  public void setTargetLanguage(LanguagesTargetLanguage targetLanguage) {
    this.targetLanguage = targetLanguage;
  }

  public LanguagesResults type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * whether monolingual or bilingual.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguagesResults languagesResults = (LanguagesResults) o;
    return Objects.equals(this.region, languagesResults.region) &&
        Objects.equals(this.source, languagesResults.source) &&
        Objects.equals(this.sourceLanguage, languagesResults.sourceLanguage) &&
        Objects.equals(this.targetLanguage, languagesResults.targetLanguage) &&
        Objects.equals(this.type, languagesResults.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, source, sourceLanguage, targetLanguage, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguagesResults {\n");
    
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    targetLanguage: ").append(toIndentedString(targetLanguage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

