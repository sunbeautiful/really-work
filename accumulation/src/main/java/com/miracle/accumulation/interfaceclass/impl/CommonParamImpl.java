package com.miracle.accumulation.interfaceclass.impl;

import com.miracle.accumulation.interfaceclass.CommonParam;

/**
 * @author sqq
 * @description
 * @date 2020/11/26 15:43
 */
public class CommonParamImpl implements CommonParam {

  @Override
  public String generateSql() {
    return "select * from test";
  }
}
