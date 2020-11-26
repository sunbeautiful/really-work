package com.miracle.accumulation.enumtype;

import com.miracle.accumulation.interfaceclass.CommonError;

/**
 * @author 59326
 */

public enum BaseError implements CommonError {
  /**
   * 参数不能为空
   */
  PARAM_CAN_NOT_EMPTY("PARAM_CAN_NOT_EMPTY");

  private String message;

  BaseError(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return null;
  }
}

