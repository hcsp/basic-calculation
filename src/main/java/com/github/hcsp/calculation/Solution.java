package com.github.hcsp.calculation;

public class Solution {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        char d = '&';
        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
        // 结果应该是4
        System.out.println(calculate(100));
    }

    // 1.首先将该数字加1
    // 2.将上一步的结果乘以2
    // 3.将上一步的结果减3
    // 4.将上一步的结果除以4
    // 5.将上一步的结果对5取余
    // 将得到的结果返回
    public static int calculate(int number) {
        int a = number + 1; // 加法运算符
        int b = a * 2; // 乘法运算符
        int c = b - 3; // 减法运算符
        int d = c / 4; // 除法运算符
        int e = d % 5; // %是取余运算符，取余是带符合的运算
        return e;
    }
}
