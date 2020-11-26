package com.miracle.common.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * @author sqq
 * @description
 * @date 2020/11/25 10:41
 */
@Setter
@Getter
public class BaseDto {

  private String id;

  private Long innerVersion;

  private String creator;

  private Date createTime;

  private String updator;

  private Date updateTime;

  private String remark;

}
