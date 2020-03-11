package com.taslim.core.java.practice;

import java.util.Arrays;

/*8.Write a program to split array into to same parts with the help of loop(s).
For array of odd length you should keep left part bigger than right part. i.e. for array of length 7,
program should create two arrays of length 4 and length of 3. */
public class SplitArray {
public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8};
		int l = arr.length;
		
		int a[] = new int[(l+1)/2];
		int b[] = new int[l - a.length];
		
       for(int i=0;i<l;i++)
       {
    	   if(i < a.length)
    	       a[i] = arr[i];
    	       else
    	    	   b[i - a.length] = arr[i];
       }
       
       System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(b));
	}

}
