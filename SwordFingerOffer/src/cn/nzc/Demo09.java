/**
 * Copyright (C), 2015-2021
 * FileName: Demo09
 * Author:   niko
 * Date:     2021/4/17 20:18
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          20:18           1.0
 */
package cn.nzc;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * 维护两个栈，第一个栈支持插入操作，第二个栈支持删除操作。
 *
 * 根据栈先进后出的特性，我们每次往第一个栈里插入元素后，第一个栈的底部元素是最后插入的元素，第一个栈的顶部元素是下一个待删除的元素。
 * 为了维护队列先进先出的特性，我们引入第二个栈，用第二个栈维护待删除的元素，在执行删除操作的时候我们首先看下第二个栈是否为空。
 * 如果为空，我们将第一个栈里的元素一个个弹出插入到第二个栈里，这样第二个栈里元素的顺序就是待删除的元素的顺序，
 * 要执行删除操作的时候我们直接弹出第二个栈的元素返回即可。
 *
 */
//复习
public class Demo09 {

    public static void main(String[] args) {

    }

    class CQueue {
        Stack<Integer> inStack,outStack;
        public CQueue() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void appendTail(int value) {
            inStack.push(value);
        }

        public int deleteHead() {
            //如果输出栈不为空，则输出
            if (!outStack.isEmpty()) {
                return outStack.pop();
            } else {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
                if (outStack.isEmpty()) {
                    return -1;
                } else {
                    return outStack.pop();
                }
            }
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}