package com.taslim.core.java.practice;

/*2.Write a program to find occurrences of character in String. i.e. for input String 'Hello' character 'l' occurred twice. So, program should print 2 in console.
Moreover, program should throw exception if character does not exist in String. */
public class FindOccurenceofCharInString {

	public static void main(String[] args) {
		String s = "Classroom";
		char c = 'o';
		
		
		
		int result=0;
		for(int i=0; i<s.length();i++)
		{
		         if(s.charAt(i)==c)
					 result++;
		}
		try {
		if(result == 0)
		{
			throw new MyException("Ex");
		}
		else
		{
			System.out.print(result);
		}
	  }
		catch(MyException e)
		{
			 System.out.println(e) ;
		}
		
	}

}

class MyException extends Exception
{
	 MyException(String ss)
	{
		System.out.print("Character not found in the string ");
	}
  }