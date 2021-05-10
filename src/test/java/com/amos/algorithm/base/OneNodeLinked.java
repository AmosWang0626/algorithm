package com.amos.algorithm.base;

import lombok.Getter;
import lombok.Setter;

/**
 * 单向链表
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/5/10
 */
@Getter
@Setter
public class OneNodeLinked<T> {

    private T value;

    private OneNodeLinked<T> next;

    public OneNodeLinked(T value) {
        this.value = value;
    }

    public OneNodeLinked(T value, OneNodeLinked<T> next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "OneNodeLinked{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
