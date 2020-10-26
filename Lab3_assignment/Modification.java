/**
Author: chaturya
Date  : 26/10/2020
Desc  : To form a number which is equal to two consecutive numbers
*/
import java.util.*;


public class Modification {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int number=sc.nextInt();
		System.out.println("the modified number is"+modifyNumber(number));
	}

	private static int modifyNumber(int number) {
		StringBuffer str=new StringBuffer();
		str.append(number);
		String str1=str.toString();
		StringBuffer str2=new StringBuffer("");
		int i;
		for( i=0;i<str1.length()-1;i++) {
			char presentNum=str1.charAt(i);
			char nextNum=str1.charAt(i+1);
			int numberAtPresent=presentNum;
			int numberAtNext=nextNum;
			if(numberAtPresent>numberAtNext)
			{
				int difference=numberAtPresent-numberAtNext;
				str2.append(difference);
			}
			else {
				int difference=numberAtNext-numberAtPresent;
				str2.append(difference);
			}
			
		}
		str2.append(str1.charAt(i));
		String s=str2.toString();
		int num=Integer.parseInt(s);
		return num;
		
		
	}

}
