package com.miracle.accumulation.test;

/**
 * @author sqq
 * @description i++ 和++i
 * @date 2020/11/25 11:10
 */
public class IAddAndAddI {

  public static void main(String[] args) {
    int i = 10;
    int j;
    int k;
    //System.out.println(++i);
    //System.out.println(i++);
    System.out.println(j = i++);
    System.out.println(i);
    System.out.println(k = ++i);
    System.out.println(i);
  }

}
