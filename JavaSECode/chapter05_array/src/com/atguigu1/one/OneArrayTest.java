package com.atguigu1.one;

import sun.security.util.Length;

/**
 * 一维数组的基本使用
 *
 * @author 尚硅谷-宋红康
 * @create 12:08
 */
public class OneArrayTest {
	
	public static void main(String args[]) {
		//1. 数组的声明与初始化
		//静态初始化数组
		double[] prices;
		prices = new double[]{20.03,30.45,65.15,78.98};

		String[] foods;
		foods = new String[]{"烧大肠","粉蒸肉","佛跳墙","炒土豆"};

		//动态初始化数组
		double[] salary;
		salary = new double[3];

		String[] department = new String[3];

		//其他正确形式
		int arr[] = new int[3];
		int arr1[] = {1,2,3};
		int[] arr2 = {1,2,3};

		//2. 数组元素的调用
		System.out.println(prices[0]);
		System.out.println(foods[2]);
		//注意是否超出数组的下标值

		//3. 数组的长度
		System.out.println(prices.length);

		//4. 如何遍历数组
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}

	}

}
/*
* 静态初始化: 数组变量的赋值和数组元素的赋值同时进行
* 	double[] prices;
* 	prices = new double[]{1,3,4,5}
* 动态初始化：数组变量的赋值和数组元素的赋值分开进行
* 	String[] foods = new String[4];
* */