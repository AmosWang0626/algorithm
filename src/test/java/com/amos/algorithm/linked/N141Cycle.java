package com.amos.algorithm.linked;

import com.amos.algorithm.base.OneNodeLinked;

/**
 * 环形链表
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/5/10
 */
public class N141Cycle {

    public static void main(String[] args) {
        // 构造环形链表
        // 3 >>> 2 >>> 0 >>> -4
        final OneNodeLinked<Integer> linked4 = new OneNodeLinked<>(-4);
        OneNodeLinked<Integer> head = new OneNodeLinked<>(3, new OneNodeLinked<>(2, new OneNodeLinked<>(0, linked4)));
        linked4.setNext(head.getNext());

        boolean flag = false;
        OneNodeLinked<Integer> fast = head.getNext();
        while (head != null && fast != null && fast.getNext() != null) {
            System.out.println(head.getValue() + ">>>>>" + fast.getValue());
            if (head == fast) {
                flag = true;
                break;
            }

            fast = fast.getNext().getNext();
            head = head.getNext();
        }

        System.out.println("当前链表" + (flag ? "是" : "不是") + "环形链表");
    }

}
