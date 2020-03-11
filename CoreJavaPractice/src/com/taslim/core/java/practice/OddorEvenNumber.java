package com.taslim.core.java.practice;

/*3.Write a program which takes user input(number) from console and print whether number is odd or even. 
Program should print message 'Invalid Number' if user enters anything other than number (specifically 'int'). */
import java.util.Scanner;

public class OddorEvenNumber {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Intger Value:");
	     
	     try {
	    	 if(sc.hasNextInt()){
		            int n;
		            n = sc.nextInt();
		            if (n%2 == 0) {
		    			System.out.println("Number is Even");
		    		}
		    		else {
		    			System.out.println("Number is Odd");
		    		}
		     }
		     
		     else{
                 throw new Excep("Invalid Number ");
		     }
	     }
	     catch(Excep e)
	     {
	    	 System.out.println(e);
	     }
	    
	     sc.close();
	}

}
class Excep extends Exception
{
 Excep(String s)
 {
	  System.out.print(s);
 }
}
