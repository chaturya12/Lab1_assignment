/**
  Author: chaturya
  Date  : 23/10/2020
  Desc  : to reverse and sort
 */
import java.util.*;
public class RevNSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values");
		for(int i=0;i<size;i++)
		{
		arr[i]=sc.nextInt();
		}
		
		getSorted(arr);


	}

	private static void getSorted(int[] arr) {
		
		//reversing array
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
		
		// sorting
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]+"");
		}
	}

}
