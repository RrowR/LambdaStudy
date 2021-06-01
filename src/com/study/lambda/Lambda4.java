package com.study.lambda;

public class Lambda4 {
    private static int b = 5;
    public static void main(String[] args) {
        int a = 10;
        Myinterface myinterface = () -> {
            System.out.println("x="+ a);
            System.out.println("x="+ b);
        };
        int a = 50;         //局部变量在被lambda使用时会变成常量(final)
        int b = 110;        //全局变量不会
    }

    interface Myinterface{
        void test();
    }
}
