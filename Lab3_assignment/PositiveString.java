/**
Author: chaturya
Date  : 26/10/2020
Desc  : to display whether the string is positive or not
*/
import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.next();
		int count=0;
		for(int i=0;i<str.length()-1;i++){
			//char ch=str.charAt(i);
			if(str.charAt(i)<str.charAt(i+1))
			{
				count++;
			}
		}
		if(count==str.length()-1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
