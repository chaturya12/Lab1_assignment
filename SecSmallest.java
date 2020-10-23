/**
  Author: chaturya
  Date  : 23/10/2020
  Desc  : to find second smallest
 */
import java.util.*;
public class SecSmallest {

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
		getSecondSmallest(arr);

	}

	private static void getSecondSmallest(int[] arr) {
		
		// sort the array
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
		System.out.println("The secong smallest element is:"+arr[1]);
	}

}
