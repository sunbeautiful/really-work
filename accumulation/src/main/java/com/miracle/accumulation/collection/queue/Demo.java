package com.miracle.accumulation.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sqq
 * @description
 * @date 2020/11/27 10:46
 */
public class Demo {

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    System.out.println(queue.poll());
    System.out.println(queue.element());
    System.out.println(queue.peek());
/*    　　抛出异常 　　返回特殊值
    插入：add(e) 　　  offer(e) 插入一个元素
    移除：remove()    poll() 移除和返回队列的头
    检查：element()   peek() 返回但不移除队列的头。*/

  }

}
