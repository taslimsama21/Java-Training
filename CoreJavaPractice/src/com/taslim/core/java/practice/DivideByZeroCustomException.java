package com.taslim.core.java.practice;

//7.Write a program to throw a custom Exception when number is divided by zero. 
public class DivideByZeroCustomException {
public static void main(String[] args) {
		
		try {
			int t1=5, t2=0;
				
			if(t2 == 0)
			{
				throw new ItsException("We cannot divide a number with 0  ");
			}
		else
		{
			int res = t1/t2;
			System.out.print("Result"+ res);
		}
			
		}
		
		catch(ItsException e)
		{
			System.out.println(e);
		}

	}
	
	
}
class ItsException extends Exception
{
	ItsException(String s)
	{
		System.out.print(s);
	}
}