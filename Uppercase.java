/**
  Author: chaturya
  Date  : 23/10/2020
  Desc  : to convert the string to both uppercase and lowercase
 */
import java.util.*;
public class Uppercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the strings");
		String arr[]=new String[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		sortedArray(arr);
		sortStrings(arr);
	}

	private static void sortStrings(String[] arr) {
		String lowerCase=null,upperCase=null;
        for(int i=0;i<arr.length;i++)
        {
        	
        	int length=arr[i].length();
        	if(length%2==0)
        	{
        		//if length is even
        		
        		//leftside converted to uppercase 
        		
        		upperCase=arr[i].substring(0,length/2);
        		upperCase=upperCase.toUpperCase();
        		
        		//rightside converted to lowercase
        		
        		lowerCase=arr[i].substring((length/2),length);
        		lowerCase=lowerCase.toLowerCase();
        		
        		//total array
        		
        		arr[i]=upperCase+lowerCase;
        		System.out.println(arr[i]);
        	}
        	else {
                 //if length is odd
        		
        		//leftside converted to uppercase 
        		
        		upperCase=arr[i].substring(0,(length/2)+1);
        		upperCase=upperCase.toUpperCase();
        		
        		//rightside converted to lowercase
        		
        		lowerCase=arr[i].substring((length/2)+1,length);
        		lowerCase=lowerCase.toLowerCase();
        		//total array
        		arr[i]=upperCase+lowerCase;
        		System.out.println(arr[i]);
        	}
        }
	}

	private static void sortedArray(String[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
