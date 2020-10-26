/**
Author: chaturya
Date  : 23/10/2020
Desc  : To display sum of elements using string tokenizer
*/
import java.util.*; 
public class SumUsingStringTokenizer {

	public static void main(String[] args) {
		int number,sum=0;
		StringTokenizer string=new StringTokenizer("1 4 6 2 7 3");
		while(string.hasMoreTokens())
		{
			number=Integer.parseInt(string.nextToken());
			sum=sum+number;
			System.out.println("The elements are :"+number);
		}
		System.out.println("Sum obtained ="+sum);

	}

}
