
public class SumOfCubes {

	static int sum=0,lastDigit;

	public static void main(String[] args) {
		//enter the num
		//calculate sum
		//display result
		System.out.println("Enter the number");
		int number=4321;
		CubeSum(number);
		System.out.println("The sum of the cubes of "+number+" is "+sum);
		

	}

	private static int CubeSum(int number) {
	while(number>0) {
		
	    lastDigit = number%10;
	    sum=lastDigit*lastDigit*lastDigit+sum;
		number=number/10;
	}
	return sum;
	
	
	}

}
