package com.miracle.accumulation.util;

import com.miracle.accumulation.interfaceclass.CommonError;
import com.miracle.accumulation.thread.CustomizeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Validate 校验器
 *
 * @author yzj
 * @date 2020/2/13
 */
public class Validate {

  private final static String stuff = ",";

  private Validate() {
  }

  public static void assertTrue(Boolean isTrue, CommonError baseError, String... args) {
    if (Boolean.FALSE.equals(isTrue)) {
      List<String> list = new ArrayList<>(Arrays.asList(args));
      StringBuilder msg = new StringBuilder();

      for (String s : list) {
        msg.append(s);
        msg.append(stuff);
      }
      throw new CustomizeException(baseError, msg.toString());
    }
  }

  public static void assertTrue(Boolean isTrue, CommonError baseError) {
    if (Boolean.FALSE.equals(isTrue)) {
      throw new CustomizeException(baseError);
    }
  }
}
