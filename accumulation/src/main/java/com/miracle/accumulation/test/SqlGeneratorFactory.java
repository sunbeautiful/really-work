package com.miracle.accumulation.test;

import com.miracle.accumulation.interfaceclass.CommonParam;

/**
 * @author sqq
 * @description
 * @date 2020/11/26 15:38
 */
public class SqlGeneratorFactory {

  public String generator(CommonParam param) {
    return param.generateSql();
  }
}

