/**
  Author: chaturya
  Date  : 23/10/2020
  Desc  : program using jagged array
 */ 

import java.util.*;
public class HandsOn2 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[][]=new String[2][];
		arr[0]=new String[3];
		arr[1]=new String[6];
		
		//giving values to the inner array1
		arr[0][0]="mr";
		arr[0][1]="ms";
		arr[0][2]="mrs";
		
	
		//giving values to inner array2
		arr[1][0]="pranav";
		arr[1][1]="kavya";
		arr[1][2]="lakshmi";
		arr[1][3]="prathik";
		arr[1][4]="appu";
		arr[1][5]="dilli";
		
		// used gender array for diiferentiation
		String[] genderNdStatus= {"male","female","married"};
			genderClass(arr, genderNdStatus);
			
		
		}

	private static void genderClass(String[][] arr, String[] gender) {
		int k=0,i=0,j=0;
		//if gender is male
			   if(gender[k].equals("male"))
			    {
				
			       System.out.println(arr[i][j]+arr[1][0]);
			       System.out.println(arr[i][j]+arr[1][3]);
			     
			    }
			   k++;
			   j++;
			   
		//if gender is female	   
			    if(gender[k].equals("female"))
			    {
				  System.out.println(arr[i][j]+arr[1][1]);
				  System.out.println(arr[i][j]+arr[1][5]);
				
			    }
			   k++;
			   j++;
			   
			   //if gender is 
			   if(gender[k].equals("married"))
			    {
				  System.out.println(arr[i][j]+arr[1][2]);
				  System.out.println(arr[i][j]+arr[1][4]);
		    	}
			  
	}
		
	}


