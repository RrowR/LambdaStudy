package com.study.syntax;

import com.study.prepare.NoneReturnNoneParameter;

public class Basicsyntax {
    public static void main(String[] args) {
        //实现无参，无返回值的函数式接口
        NoneReturnNoneParameter lambda1 = () -> {
            System.out.println("这是一个无参，无返回值的方法");
        };
        lambda1.test();
    }
}
