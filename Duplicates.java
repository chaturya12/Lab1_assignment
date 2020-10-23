/**
  Author: chaturya
  Date  : 23/10/2020
  Desc  : to remove the duplicates and reverse the array
 */
import java.util.*;
public class Duplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		modifyArray(arr);
	}

	private static void modifyArray(int[] arr) {
		Arrays.sort(arr);
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j++]=arr[arr.length-1];
			System.out.println("After removing duplicates from the array and by reversing");
			for(int k=j-1;k>=0;k--)
			{
				System.out.println(temp[k]);
				
			}
	}
}
