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
        //传统算法
    /*   number++;
        int number2=number*2;
        int number3=number2-3;
        int number4=number3/4;
        int number5 =number4%5;*/
        //简化算法（嵌套）；
        return  ((((number+1)*2)-3)/4)%5;
    }
}
