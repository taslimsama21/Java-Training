package com.taslim.core.java.practice;

//9.Write a program to find factorial of int number with the help of while loop. 
public class Factorial {
	public static void main(String[] args) {
		int i, f = 1;
		int num = 4;

		for (i = 1; i <= num; i++) {
			f = f * i;
		}
		System.out.println("Number:" + num + " \nFactorial:" + f);
	}
}
