/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * AdditionalPropertiesClass
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class AdditionalPropertiesClass {
  public static final String SERIALIZED_NAME_MAP_STRING = "map_string";
  @SerializedName(SERIALIZED_NAME_MAP_STRING)
  @javax.annotation.Nullable
  private Map<String, String> mapString = new HashMap<>();

  public static final String SERIALIZED_NAME_MAP_NUMBER = "map_number";
  @SerializedName(SERIALIZED_NAME_MAP_NUMBER)
  @javax.annotation.Nullable
  private Map<String, BigDecimal> mapNumber = new HashMap<>();

  public static final String SERIALIZED_NAME_MAP_INTEGER = "map_integer";
  @SerializedName(SERIALIZED_NAME_MAP_INTEGER)
  @javax.annotation.Nullable
  private Map<String, Integer> mapInteger = new HashMap<>();

  public static final String SERIALIZED_NAME_MAP_BOOLEAN = "map_boolean";
  @SerializedName(SERIALIZED_NAME_MAP_BOOLEAN)
  @javax.annotation.Nullable
  private Map<String, Boolean> mapBoolean = new HashMap<>();

  public static final String SERIALIZED_NAME_MAP_ARRAY_INTEGER = "map_array_integer";
  @SerializedName(SERIALIZED_NAME_MAP_ARRAY_INTEGER)
  @javax.annotation.Nullable
  private Map<String, List<Integer>> mapArrayInteger = new HashMap<>();

  public static final String SERIALIZED_NAME_MAP_ARRAY_ANYTYPE = "map_array_anytype";
  @SerializedName(SERIALIZED_NAME_MAP_ARRAY_ANYTYPE)
  @javax.annotation.Nullable
  private Map<String, List<Object>> mapArrayAnytype = new HashMap<>();

  public static final String SERIALIZED_NAME_MAP_MAP_STRING = "map_map_string";
  @SerializedName(SERIALIZED_NAME_MAP_MAP_STRING)
  @javax.annotation.Nullable
  private Map<String, Map<String, String>> mapMapString = new HashMap<>();

  public static final String SERIALIZED_NAME_MAP_MAP_ANYTYPE = "map_map_anytype";
  @SerializedName(SERIALIZED_NAME_MAP_MAP_ANYTYPE)
  @javax.annotation.Nullable
  private Map<String, Map<String, Object>> mapMapAnytype = new HashMap<>();

  public static final String SERIALIZED_NAME_ANYTYPE1 = "anytype_1";
  @SerializedName(SERIALIZED_NAME_ANYTYPE1)
  @javax.annotation.Nullable
  private Object anytype1;

  public static final String SERIALIZED_NAME_ANYTYPE2 = "anytype_2";
  @SerializedName(SERIALIZED_NAME_ANYTYPE2)
  @javax.annotation.Nullable
  private Object anytype2;

  public static final String SERIALIZED_NAME_ANYTYPE3 = "anytype_3";
  @SerializedName(SERIALIZED_NAME_ANYTYPE3)
  @javax.annotation.Nullable
  private Object anytype3;

  public AdditionalPropertiesClass() {
  }

  public AdditionalPropertiesClass mapString(@javax.annotation.Nullable Map<String, String> mapString) {
    
    this.mapString = mapString;
    return this;
  }

  public AdditionalPropertiesClass putMapStringItem(String key, String mapStringItem) {
    if (this.mapString == null) {
      this.mapString = new HashMap<>();
    }
    this.mapString.put(key, mapStringItem);
    return this;
  }

  /**
   * Get mapString
   * @return mapString
   */
  @javax.annotation.Nullable


  public Map<String, String> getMapString() {
    return mapString;
  }


  public void setMapString(@javax.annotation.Nullable Map<String, String> mapString) {
    this.mapString = mapString;
  }

  public AdditionalPropertiesClass mapNumber(@javax.annotation.Nullable Map<String, BigDecimal> mapNumber) {
    
    this.mapNumber = mapNumber;
    return this;
  }

  public AdditionalPropertiesClass putMapNumberItem(String key, BigDecimal mapNumberItem) {
    if (this.mapNumber == null) {
      this.mapNumber = new HashMap<>();
    }
    this.mapNumber.put(key, mapNumberItem);
    return this;
  }

  /**
   * Get mapNumber
   * @return mapNumber
   */
  @javax.annotation.Nullable
  @Valid


  public Map<String, BigDecimal> getMapNumber() {
    return mapNumber;
  }


  public void setMapNumber(@javax.annotation.Nullable Map<String, BigDecimal> mapNumber) {
    this.mapNumber = mapNumber;
  }

  public AdditionalPropertiesClass mapInteger(@javax.annotation.Nullable Map<String, Integer> mapInteger) {
    
    this.mapInteger = mapInteger;
    return this;
  }

  public AdditionalPropertiesClass putMapIntegerItem(String key, Integer mapIntegerItem) {
    if (this.mapInteger == null) {
      this.mapInteger = new HashMap<>();
    }
    this.mapInteger.put(key, mapIntegerItem);
    return this;
  }

  /**
   * Get mapInteger
   * @return mapInteger
   */
  @javax.annotation.Nullable


  public Map<String, Integer> getMapInteger() {
    return mapInteger;
  }


  public void setMapInteger(@javax.annotation.Nullable Map<String, Integer> mapInteger) {
    this.mapInteger = mapInteger;
  }

  public AdditionalPropertiesClass mapBoolean(@javax.annotation.Nullable Map<String, Boolean> mapBoolean) {
    
    this.mapBoolean = mapBoolean;
    return this;
  }

  public AdditionalPropertiesClass putMapBooleanItem(String key, Boolean mapBooleanItem) {
    if (this.mapBoolean == null) {
      this.mapBoolean = new HashMap<>();
    }
    this.mapBoolean.put(key, mapBooleanItem);
    return this;
  }

  /**
   * Get mapBoolean
   * @return mapBoolean
   */
  @javax.annotation.Nullable


  public Map<String, Boolean> getMapBoolean() {
    return mapBoolean;
  }


  public void setMapBoolean(@javax.annotation.Nullable Map<String, Boolean> mapBoolean) {
    this.mapBoolean = mapBoolean;
  }

  public AdditionalPropertiesClass mapArrayInteger(@javax.annotation.Nullable Map<String, List<Integer>> mapArrayInteger) {
    
    this.mapArrayInteger = mapArrayInteger;
    return this;
  }

  public AdditionalPropertiesClass putMapArrayIntegerItem(String key, List<Integer> mapArrayIntegerItem) {
    if (this.mapArrayInteger == null) {
      this.mapArrayInteger = new HashMap<>();
    }
    this.mapArrayInteger.put(key, mapArrayIntegerItem);
    return this;
  }

  /**
   * Get mapArrayInteger
   * @return mapArrayInteger
   */
  @javax.annotation.Nullable
  @Valid


  public Map<String, List<Integer>> getMapArrayInteger() {
    return mapArrayInteger;
  }


  public void setMapArrayInteger(@javax.annotation.Nullable Map<String, List<Integer>> mapArrayInteger) {
    this.mapArrayInteger = mapArrayInteger;
  }

  public AdditionalPropertiesClass mapArrayAnytype(@javax.annotation.Nullable Map<String, List<Object>> mapArrayAnytype) {
    
    this.mapArrayAnytype = mapArrayAnytype;
    return this;
  }

  public AdditionalPropertiesClass putMapArrayAnytypeItem(String key, List<Object> mapArrayAnytypeItem) {
    if (this.mapArrayAnytype == null) {
      this.mapArrayAnytype = new HashMap<>();
    }
    this.mapArrayAnytype.put(key, mapArrayAnytypeItem);
    return this;
  }

  /**
   * Get mapArrayAnytype
   * @return mapArrayAnytype
   */
  @javax.annotation.Nullable
  @Valid


  public Map<String, List<Object>> getMapArrayAnytype() {
    return mapArrayAnytype;
  }


  public void setMapArrayAnytype(@javax.annotation.Nullable Map<String, List<Object>> mapArrayAnytype) {
    this.mapArrayAnytype = mapArrayAnytype;
  }

  public AdditionalPropertiesClass mapMapString(@javax.annotation.Nullable Map<String, Map<String, String>> mapMapString) {
    
    this.mapMapString = mapMapString;
    return this;
  }

  public AdditionalPropertiesClass putMapMapStringItem(String key, Map<String, String> mapMapStringItem) {
    if (this.mapMapString == null) {
      this.mapMapString = new HashMap<>();
    }
    this.mapMapString.put(key, mapMapStringItem);
    return this;
  }

  /**
   * Get mapMapString
   * @return mapMapString
   */
  @javax.annotation.Nullable
  @Valid


  public Map<String, Map<String, String>> getMapMapString() {
    return mapMapString;
  }


  public void setMapMapString(@javax.annotation.Nullable Map<String, Map<String, String>> mapMapString) {
    this.mapMapString = mapMapString;
  }

  public AdditionalPropertiesClass mapMapAnytype(@javax.annotation.Nullable Map<String, Map<String, Object>> mapMapAnytype) {
    
    this.mapMapAnytype = mapMapAnytype;
    return this;
  }

  public AdditionalPropertiesClass putMapMapAnytypeItem(String key, Map<String, Object> mapMapAnytypeItem) {
    if (this.mapMapAnytype == null) {
      this.mapMapAnytype = new HashMap<>();
    }
    this.mapMapAnytype.put(key, mapMapAnytypeItem);
    return this;
  }

  /**
   * Get mapMapAnytype
   * @return mapMapAnytype
   */
  @javax.annotation.Nullable
  @Valid


  public Map<String, Map<String, Object>> getMapMapAnytype() {
    return mapMapAnytype;
  }


  public void setMapMapAnytype(@javax.annotation.Nullable Map<String, Map<String, Object>> mapMapAnytype) {
    this.mapMapAnytype = mapMapAnytype;
  }

  public AdditionalPropertiesClass anytype1(@javax.annotation.Nullable Object anytype1) {
    
    this.anytype1 = anytype1;
    return this;
  }

  /**
   * Get anytype1
   * @return anytype1
   */
  @javax.annotation.Nullable


  public Object getAnytype1() {
    return anytype1;
  }


  public void setAnytype1(@javax.annotation.Nullable Object anytype1) {
    this.anytype1 = anytype1;
  }

  public AdditionalPropertiesClass anytype2(@javax.annotation.Nullable Object anytype2) {
    
    this.anytype2 = anytype2;
    return this;
  }

  /**
   * Get anytype2
   * @return anytype2
   */
  @javax.annotation.Nullable


  public Object getAnytype2() {
    return anytype2;
  }


  public void setAnytype2(@javax.annotation.Nullable Object anytype2) {
    this.anytype2 = anytype2;
  }

  public AdditionalPropertiesClass anytype3(@javax.annotation.Nullable Object anytype3) {
    
    this.anytype3 = anytype3;
    return this;
  }

  /**
   * Get anytype3
   * @return anytype3
   */
  @javax.annotation.Nullable


  public Object getAnytype3() {
    return anytype3;
  }


  public void setAnytype3(@javax.annotation.Nullable Object anytype3) {
    this.anytype3 = anytype3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesClass additionalPropertiesClass = (AdditionalPropertiesClass) o;
    return Objects.equals(this.mapString, additionalPropertiesClass.mapString) &&
        Objects.equals(this.mapNumber, additionalPropertiesClass.mapNumber) &&
        Objects.equals(this.mapInteger, additionalPropertiesClass.mapInteger) &&
        Objects.equals(this.mapBoolean, additionalPropertiesClass.mapBoolean) &&
        Objects.equals(this.mapArrayInteger, additionalPropertiesClass.mapArrayInteger) &&
        Objects.equals(this.mapArrayAnytype, additionalPropertiesClass.mapArrayAnytype) &&
        Objects.equals(this.mapMapString, additionalPropertiesClass.mapMapString) &&
        Objects.equals(this.mapMapAnytype, additionalPropertiesClass.mapMapAnytype) &&
        Objects.equals(this.anytype1, additionalPropertiesClass.anytype1) &&
        Objects.equals(this.anytype2, additionalPropertiesClass.anytype2) &&
        Objects.equals(this.anytype3, additionalPropertiesClass.anytype3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapString, mapNumber, mapInteger, mapBoolean, mapArrayInteger, mapArrayAnytype, mapMapString, mapMapAnytype, anytype1, anytype2, anytype3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesClass {\n");
    sb.append("    mapString: ").append(toIndentedString(mapString)).append("\n");
    sb.append("    mapNumber: ").append(toIndentedString(mapNumber)).append("\n");
    sb.append("    mapInteger: ").append(toIndentedString(mapInteger)).append("\n");
    sb.append("    mapBoolean: ").append(toIndentedString(mapBoolean)).append("\n");
    sb.append("    mapArrayInteger: ").append(toIndentedString(mapArrayInteger)).append("\n");
    sb.append("    mapArrayAnytype: ").append(toIndentedString(mapArrayAnytype)).append("\n");
    sb.append("    mapMapString: ").append(toIndentedString(mapMapString)).append("\n");
    sb.append("    mapMapAnytype: ").append(toIndentedString(mapMapAnytype)).append("\n");
    sb.append("    anytype1: ").append(toIndentedString(anytype1)).append("\n");
    sb.append("    anytype2: ").append(toIndentedString(anytype2)).append("\n");
    sb.append("    anytype3: ").append(toIndentedString(anytype3)).append("\n");
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

