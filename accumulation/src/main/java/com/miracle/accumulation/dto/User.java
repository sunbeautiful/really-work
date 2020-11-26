package com.miracle.accumulation.dto;

import com.miracle.common.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

/**
 * @author sqq
 * @description
 * @date 2020/11/25 10:38
 */
@Setter
@Getter
public class User extends BaseDto {

  private String name;

  private Integer age;
}
