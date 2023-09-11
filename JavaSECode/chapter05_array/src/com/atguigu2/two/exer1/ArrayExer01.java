package com.atguigu2.two.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.atguigu2.two.exer1
 * Description: 获取arr数组中所有元素的和
 *
 * @Author niuhanjie
 * @Create 2023/9/8 15:37
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
//        int[][] arr1 = new int[3][2];
        int[][] arr1 = {{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+"\t");
                sum = sum + arr1[i][j];
            }
            System.out.println(" ");
        }
        System.out.println("arr1的和是："+sum);
    }
}
