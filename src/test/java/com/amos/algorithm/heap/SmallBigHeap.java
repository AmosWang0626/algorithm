package com.amos.algorithm.heap;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 使用 PriorityQueue 实现小顶堆和大顶堆
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/5/11
 */
public class SmallBigHeap {

    /**
     * 默认小顶堆
     */
    @Test
    public void testSmallHeap() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(9);
        queue.add(8);
        queue.add(3);
        queue.add(4);
        queue.add(1);
        queue.add(7);

        System.out.println(queue);
    }

    /**
     * 改造大顶堆
     */
    @Test
    public void testBigHeap() {
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        queue.add(5);
        queue.add(9);
        queue.add(8);
        queue.add(3);
        queue.add(4);
        queue.add(1);
        queue.add(7);

        System.out.println(queue);
    }

}
