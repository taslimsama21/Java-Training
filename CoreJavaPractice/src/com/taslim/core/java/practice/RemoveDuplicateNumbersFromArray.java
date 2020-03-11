package com.taslim.core.java.practice;
/* 1.Write a program to remove duplicate numbers from the int array. 
You can use other array which stores unique numbers.(Without using collections) */

import java.util.Arrays;

public class RemoveDuplicateNumbersFromArray {

	public static void main(String[] args) {
		
			 int arr[] = {2,2,6,8,9,4,2};
		        int len = arr.length;
		        int count = 0;

		        Arrays.sort(arr);
		        int temp[] = new int[len+1];
		        int i=0;
		        int k=0;
		        int j =i+1;

		        while(j!=len){
		            if(arr[i]==arr[j]){
		                i++;
		                j++;

		            }
		            else{
		                temp[k]=arr[i];
		                i++;
		                j++;                                            
		                count++;
		                k++;

		            }
		        }
		
		
		        
		        for(k=0;k<count;k++){
	                System.out.print(temp[k]+" ");
	            }
	            
	            System.out.print(temp[len-1]);
		}

	}


