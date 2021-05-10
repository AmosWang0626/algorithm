package com.amos.algorithm.linked;

import com.amos.algorithm.base.OneNodeLinked;

/**
 * 两数相加
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/5/10
 */
public class N002TwoNumAdd {

    public static void main(String[] args) {
        OneNodeLinked<Integer> linked1 = new OneNodeLinked<>(2, new OneNodeLinked<>(1, new OneNodeLinked<>(5)));
        OneNodeLinked<Integer> linked2 = new OneNodeLinked<>(1, new OneNodeLinked<>(2, new OneNodeLinked<>(5)));

        OneNodeLinked<Integer> list = new OneNodeLinked<>(null);
        OneNodeLinked<Integer> result = list;
        int temp = 0;

        while (linked1 != null || linked2 != null || temp != 0) {
            if (linked1 != null) {
                temp += linked1.getValue();
                linked1 = linked1.getNext();
            }
            if (linked2 != null) {
                temp += linked2.getValue();
                linked2 = linked2.getNext();
            }

            list.setNext(new OneNodeLinked<>(temp % 10));
            temp = temp / 10;
            list = list.getNext();
        }

        System.out.println(result.getNext());
    }

}
