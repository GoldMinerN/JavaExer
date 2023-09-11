package com.atguigu1.one.exer3;

import java.util.Scanner;

/**
 * ClassName: ArrayExer03
 * Package: com.atguigu1.one.exer3
 * Description:
 *
 * @Author niuhanjie
 * @Create 2023/9/6 15:45
 * @Version 1.0
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入学生的人数：");
        int count = scanner.nextInt();
        int[] scores = new int[count];

        int max = scores[0];
        char grade = ' ';
        System.out.println("输入" + count + "个学生的成绩：");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        System.out.println("最高分是：" + max);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= max - 10) {
                grade = 'A';
            } else if (scores[i] >= max - 20) {
                grade = 'B';
            } else if (scores[i] >= max - 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("student " + i + " score is " + scores[i] + " grade is " + grade);
        }
        scanner.close();

    }
}

