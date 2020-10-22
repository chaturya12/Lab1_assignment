import java.util.*;

public class Difference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,sum=0,square=0,sqSum=0,difference=0;
		System.out.println("enter the number:");
		number=sc.nextInt();
			
		calculateDifference(number, sum, square,sqSum);
	}

	private static void calculateDifference(int number, int sum, int square,int sqSum) {
		int difference=0;
		for(int i=1;i<=number;i++) {
			 sum=sum+i*i;}
			 System.out.println(sum);
		
		for(int i=1;i<=number;i++) {
						sqSum=sqSum+i;
			square=sqSum*sqSum;}
			
			System.out.println(square);
		
		 difference=sum-square;
		 System.out.println(difference);
	}

}
