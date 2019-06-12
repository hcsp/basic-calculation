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
        int res1 = number + 1;
        int res2 = res1 * 2;
        int res3 = res2 - 3;
        int res4 = res3 / 4;
        int res5 = res4 % 5;
        return res5;
    }
}
