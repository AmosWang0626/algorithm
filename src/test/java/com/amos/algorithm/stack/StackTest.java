package com.amos.algorithm.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * StackTest
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/5/11
 */
public class StackTest {

    /**
     * peek 获取栈顶元素
     * pop 弹出栈顶元素
     */
    @Test
    public void testPopPeek() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
