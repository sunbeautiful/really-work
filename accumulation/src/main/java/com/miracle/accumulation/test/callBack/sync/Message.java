package com.miracle.accumulation.test.callBack.sync;

import com.miracle.accumulation.dto.User;

/**
 * @author sqq
 * @description
 * @date 2020/11/26 17:18
 */
public class Message implements CallBackMessage {


  public void doTask(String str) {
    Task task = new Task();
    task.doTask(this, "message");
    //System.out.println("do task");
  }


  @Override
  public void createMessage(User user) {
    System.out.println("createMessage");
  }
}
