package com.study;

/**
 * @FunctionalInterface 判断是不是函数式接口
 */
public class Lambda {
    @FunctionalInterface
    interface test1{
        void test1();
    }

    @FunctionalInterface
    interface test2{
        void test2();
        static void test3(){};
        default void test(){};
        String toString();
    }
}
