package com.study.blambda;

/**
 * 函数引用
 */
public class Lambda1 {
    private interface Calculate {
        int calculate(int a,int b);
    }

    public static void main(String[] args) {
//        Calculate calculate = (x,y) -> calculate(x,y);
//        System.out.println(calculate.calculate(20,20));
        //Lambda1类引用calculate方法，也成为函数引用
        Calculate calculate = Lambda1::calculate;
        System.out.println(calculate.calculate(10,10));
    }

    private static int calculate(int x,int y){
        if (x > y){
            return x - y;
        }else if (x < y){
            return y - x;
        }
        return  x + y;
    }
}
