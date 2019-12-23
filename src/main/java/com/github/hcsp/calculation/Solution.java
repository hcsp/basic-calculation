package com.github.hcsp.calculation;

public class Solution {
    public static void main(String[] args) {
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
        int r = (number + 1) * 2 - 3;
        int r1 = r / 4;
        int r2 = r1 % 5;
        return r2;
    }
}
