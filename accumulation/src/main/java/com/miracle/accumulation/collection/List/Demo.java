package com.miracle.accumulation.collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author sqq
 * @description
 * @date 2020/11/27 11:19
 */
public class Demo {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    Integer[] integers = list.toArray(new Integer[list.size()]);
    for (int i = 0; i < integers.length; i++) {
      System.out.println(integers[i]);
    }

    Integer[] strings = list.stream().toArray(Integer[]::new);
    //下面这种方式将数组转换List后,不能对List增删,只能查改,否则抛出 UnsupportedOperationException异常，
    // Arrays.asList(T t)返回值是java.util.Arrays类中一个私有静态内部类，java.util.Arrays.ArrayList，
    // 它并非java.util.ArrayList类。java.util.Arrays.ArrayList类具有 set()，get()，contains()等方法，
    // 但是不具有添加add()或删除remove()方法, 所以调用add()方法会报错。
    List<Integer> integers1 = Arrays.asList(strings);
    List<Integer> collect = Stream.of(strings).collect(Collectors.toList());
  }

}
