package com.github.hcsp.calculation;
// 结果应该是4


// 1.首先将该数字加1
// 2.将上一步的结果乘以2
// 3.将上一步的结果减3
// 4.将上一步的结果除以4
// 5.将上一步的结果对5取余
// 将得到的结果返回

public class Solution {
    public static void main(String[] args) {

        System.out.println(calculate(100));
    }


    public static int calculate(int number) {
        int result = ((((number + 1)*2)-3)/4)%5;
                return result;
    }
}
