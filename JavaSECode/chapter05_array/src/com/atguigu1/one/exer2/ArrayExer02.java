package com.atguigu1.one.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer02
 * Package: com.atguigu1.one.exer2
 * Description:
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 *
 * @Author niuhanjie
 * @Create 2023/9/6 14:20
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("输入一个数字(1-7)：");
        int i = r.nextInt();
        if (i < 1 || i > 7) {
            System.out.println("你输入的数字超出范围！！！");
        } else {
            System.out.println("对应的星期是：" + weeks[i - 1]);
        }
        r.close();

    }
}
