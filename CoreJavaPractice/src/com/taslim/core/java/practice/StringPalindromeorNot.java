package com.taslim.core.java.practice;
//4.Write a program to check whether String is palindrome or not. 
import java.util.Scanner;

public class StringPalindromeorNot {
	public static void main(String[] args) {
		String s,r ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enetr the String:");
		s = sc.nextLine();
		
		int l = s.length();
		for(int i=l-1; i>=0;i--)
		     r = r + s.charAt(i);
		
		if(s.equals(r))
		{
			System.out.print("String is Palindrome");
		}
		else
		{
			System.out.print("String is not Palindrome");
		}
		

		}

	}
	 