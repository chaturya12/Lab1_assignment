import java.util.*;
public class calculateSum {

	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		number=sc.nextInt();
		calculateSum(number, sum);
		
	}

	private static void calculateSum(int number,int sum) {
		
		for(int i=1;i<=number;i++)
		{
			if((i%3==0)&& (i%5==0) ) {
				sum=sum+i;
			}
		}
		System.out.println("the sum of natural numbers which are divisible by both 3 and 5 is "+sum);
	
	}

}
