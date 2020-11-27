package com.miracle.accumulation.thread;

import com.miracle.accumulation.enumtype.BaseError;
import com.miracle.accumulation.interfaceclass.CommonError;

/**
 * @author sqq
 * @description 自定义异常
 * @date 2020/11/26 11:06
 */
public class CustomizeException extends RuntimeException {

  private static final long serialVersionUID = -6113415417393886782L;

  private String message;

  public CustomizeException() {
    super();
  }

  public CustomizeException(String message) {
    super(message);
  }

  public CustomizeException(Throwable cause) {
    super(cause);
  }

  public CustomizeException(String message, Throwable cause) {
    super(message, cause);
  }

  public CustomizeException(BaseError baseError, Throwable cause) {
    super(baseError.getMessage(), cause);
  }

  public CustomizeException(CommonError baseError, String message) {
    super(baseError.getMessage());
    this.message = message;
  }

  public CustomizeException(CommonError baseError) {
    super(baseError.getMessage());
  }
}
