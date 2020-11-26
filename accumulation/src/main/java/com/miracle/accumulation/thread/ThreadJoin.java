package com.miracle.accumulation.thread;

import lombok.SneakyThrows;

/**
 * @author sqq
 * @description join
 * @date 2020/11/25 11:35
 */
public class ThreadJoin {

  public static void main(String[] args) {

    Thread t1 = new Thread(new Runnable() {
      @SneakyThrows
      @Override
      public void run() {
        Thread.sleep(1000);
        Thread.currentThread().getName();
      }
    });

  }
}
