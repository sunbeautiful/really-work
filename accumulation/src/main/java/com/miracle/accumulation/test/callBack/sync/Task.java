package com.miracle.accumulation.test.callBack.sync;

import com.miracle.accumulation.dto.User;

/**
 * @author sqq
 * @description
 * @date 2020/11/26 17:18
 */
public class Task {

  public void doTask(CallBackMessage callBack, String message) {
    User user = new User();
    callBack.createMessage(user);
  }

}
