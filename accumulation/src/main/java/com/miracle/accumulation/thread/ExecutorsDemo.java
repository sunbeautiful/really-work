package com.miracle.accumulation.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lombok.SneakyThrows;

/**
 * @author sqq
 * @description
 * @date 2020/11/25 9:40
 */
public class ExecutorsDemo {

  public static void main(String[] args) {
    /**
     *
     */
    ExecutorService fixedThreadPool = new ThreadPoolExecutor(5, 5,
        0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(),
        new ThreadPoolExecutor.CallerRunsPolicy());

    ExecutorService threadPool = new ThreadPoolExecutor(8
        // 依据服务端部署8核或16核cpu
        , 16
        //空闲10分钟回收线程
        , 10
        , TimeUnit.MINUTES
        //工作队列最大长度100
        , new ArrayBlockingQueue<Runnable>(1000)
        //工作队列满了，提交任务的线程自己去执行
        , new ThreadPoolExecutor.CallerRunsPolicy());

    for (int i = 0; i < 66; i++) {
      fixedThreadPool.execute(new Runnable() {
        @SneakyThrows
        @Override
        public void run() {
          Thread.sleep(2000);
          System.out.println(Thread.currentThread().getName() + "--" + System.currentTimeMillis());
        }
      });

    }

  }
}
