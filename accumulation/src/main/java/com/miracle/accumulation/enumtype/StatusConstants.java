package com.miracle.accumulation.enumtype;


import org.springframework.util.StringUtils;

/**
 * sqq
 */
public enum StatusConstants {

  WAITPUBLISH("0", "待发布"),

  PUBLISH("1", "已发布"),

  PAUSH("2", "已报工");


  private String key;

  private String value;

  StatusConstants(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  public static String getValue(String key) {
    if (StringUtils.isEmpty(key)) {
      return null;
    }
    StatusConstants[] carTypeEnums = values();
    for (StatusConstants carTypeEnum : carTypeEnums) {
      if (carTypeEnum.key().equals(key)) {
        return carTypeEnum.value();
      }
    }
    return null;
  }

  private String value() {
    return this.value;
  }


  private String key() {
    return this.key;
  }
}
