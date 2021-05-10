package com.amos.algorithm.base;

import lombok.Getter;
import lombok.Setter;

/**
 * 双向链表
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/5/10
 */
@Getter
@Setter
public class TwoNodeLinked<T> {

    private T value;

    private TwoNodeLinked<T> prev;

    private TwoNodeLinked<T> next;

    public TwoNodeLinked(T value) {
        this.value = value;
    }

    public TwoNodeLinked(T value, TwoNodeLinked<T> prev, TwoNodeLinked<T> next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    @Override
    public String toString() {
        return "TwoNodeLinked{" +
                "value=" + value +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}
