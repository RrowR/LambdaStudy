package com.study.syntax;

import com.study.prepare.NoneReturnMultipleParameter;
import com.study.prepare.NoneReturnNoneParameter;
import com.study.prepare.SingleReturnSingleParameter;

/**
 * lambda表达式语法进阶
 */
public class BasicPro {
    public static void main(String[] args) {
        //1、实现一个参数，有返回值的函数式接口
        SingleReturnSingleParameter lambda1 = a -> a * a;
        System.out.println(lambda1.test(10));
        NoneReturnNoneParameter lambda2 = () -> {};
        NoneReturnMultipleParameter lambda3 = (a,b) -> System.out.println("a="+a+" b="+b);

    }
}
