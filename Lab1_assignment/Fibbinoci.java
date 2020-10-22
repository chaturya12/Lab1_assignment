import java.util.Scanner;
public class Fibbinoci {
	
	

	public static void main(String[] args) {
		
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=ab.nextInt();
		recursive(num);
		
		
	}

	private static void recursive(int num) {
		int frst=0,sec=1,nxtSum=0;
		
		for(int i=0;i<num;i++)
		{
			System.out.println(frst);
			nxtSum=frst+sec;
			frst=sec;
			sec=nxtSum;
		}
	}
}


