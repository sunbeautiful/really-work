package com.miracle.accumulation.test;

import com.miracle.accumulation.interfaceclass.CommonParam;
import java.util.List;

/**
 * @author sqq
 * @description
 * @date 2020/11/26 15:40
 */
public class SqlGeneratorFactoryDemo {

  public static void main(String[] args) {
    SqlGeneratorFactory sqlGeneratorFactory = new SqlGeneratorFactory();
    String generator = sqlGeneratorFactory.generator(new CommonParam() {
      @Override
      public String generateSql() {
        return null;
      }
    });
    System.out.println(generator);

   
  }


  public static void test(List<String> list) {
    System.out.println("lsit");
  }
}
