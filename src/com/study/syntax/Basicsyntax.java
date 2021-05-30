package com.study.syntax;

import com.study.prepare.*;

public class Basicsyntax {
    public static void main(String[] args) {
        //1、实现无参，无返回值的函数式接口
        NoneReturnNoneParameter lambda1 = () -> {
            System.out.println("这是一个无参，无返回值的方法");
        };
        lambda1.test();
        //2、实现一个参数，无返回值的函数式接口
        NoneReturnSingleParameter lambda2 = (int a) -> {
            System.out.println("这是一个参数，无返回值的方法"+"a="+a);
        };
        lambda2.test(10);
        //3、实现多个参数，无返回值的函数式接口
        NoneReturnMultipleParameter lambda3 = (int a,int b) -> {
            System.out.println("这是多个参数，无返回值的方法"+"a="+a+" b="+b);
        };
        lambda3.test(100,200);
        //4、无参数，有返回值的函数式接口
        SingleReturnNoneParameter lambda4 = () -> {
            System.out.print("这是无参但是有返回值的方法，返回值是:");
            return 10;
        };
        int test = lambda4.test();
        System.out.println(test);
        //5、实现一个参数，有返回值的函数式接口
        SingleReturnSingleParameter lambda5 = (int a) -> {
            System.out.print("这是一个参数，有返回值的函数式接口，返回值是:");
            return a;
        };
        int test1 = lambda5.test(5);
        System.out.println(test1);
        //6、实现多个参数，有返回值的函数式接口
        SingleReturnMultipleParameter lambda6 = (int a,int b) -> {
            System.out.print("这是多个参数，一个返回值的函数式接口,返回值是:");
            return a+b;
        };
        int test2 = lambda6.test(99, 21);
        System.out.println(test2);
    }
}
