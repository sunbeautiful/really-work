package com.miracle.accumulation.functionprogramm;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * @author sqq
 * @description
 * @date 2020/11/26 13:29
 */
public class ConsumerDemo<T> {

  public static void main(String[] args) {
    Consumer<String> consumer = new Consumer<String>() {
      @Override
      public void accept(String str) {
        System.out.println(str);
      }
    };
    Consumer<String> consumer1 = (cmd) -> System.out.println(cmd);

    Consumer<String> consumer2 = (cmd) -> System.out.println(cmd + cmd);

    consumer1.andThen(consumer1).andThen(consumer2).accept("m");
  }

  Consumer<T> andThen(Consumer<? super T> after) {
    Objects.requireNonNull(after);
    return (T t) -> {
      System.out.println(t);
      after.accept(t);
    };
  }

}
