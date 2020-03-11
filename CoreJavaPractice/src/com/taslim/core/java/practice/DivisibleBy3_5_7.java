package com.taslim.core.java.practice;

//10.Write a program which iterate over array of numbers and print only those numbers which are divisible by 3 and 5 or 7.
public class DivisibleBy3_5_7 {
	public static void main(String[] args) {
		int n = 360;

		for (int num = 0; num < n; num++) {
			if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0)
				System.out.print(num + " ");
		}
	}
}
