package com.taslim.core.java.practice;
/*5.Write a program to print following pattern in console with the help of for loop.                                                                                                        
A
AB
ABC
ABCD
ABCDE
ABCD
ABC
AB
A */
public class Pattern {
	

		public static void main(String[] args) {
			
			for(int i=0; i<4;i++)
			{
				int abc = 65;
				for(int j=0;j<=i;j++)
				{
					System.out.print((char) (abc +j));
				}
				System.out.println();
			}
			for(int i=4; i>=0;i--)
			{
				int abc = 65;
				for(int j=0; j<=i; j++)
				{
					System.out.print((char) (abc + j));
				}
				System.out.println();
			}

		}
}
	