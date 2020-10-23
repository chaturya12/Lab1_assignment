/**
  Author: chaturya
  Date  : 23/10/2020
  Desc  : program of car spaces
 */ import java.util.*;
class CarDetails{
	private String ownerName;
	private int regNo;
	
	//getters and setters
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	
	
}
public class Handon1 {

	public static void main(String[] args) {
		int arr[][]=new int[5][];
		CarDetails carDetails=new CarDetails();
		int choice,carNo=0;
		
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		while(choice<3)
		{
		System.out.println("1.Park the car");
		System.out.println("2.Get Car");
		System.out.println("3.Get available space");
		switch(choice)
		{
		
		//to park the car
		case 1:
			System.out.println("enter car owner name:");
			System.out.println("Owner name="+CarDetails.getOwnerName());
		    System.out.println("enter registration number");
		    System.out.println("Registration number="+CarDetails.setRegNo());
		    carNo++;
		    break;
		    
		    // to get the count of car
		case 2:
			System.out.println("the total cars upto now="+carNo);break;
			
			// to know the remaining space
		case 3:
			if(carNo<100)
			{  
				
				int remaining=100-carNo;
				System.out.println("the space remined on 1st floor="+remaining);
				remaining=70-carNo;
				System.out.println("the space remained on second floor= "+remaining);
				remaining=50-carNo;
				System.out.println("the space remained on third floor="+remaining);
				remaining=20-carNo;
				System.out.println("the space remained on fourth="+remaining);
				remaining=10-carNo;
				System.out.println("the space remained on fifth="+remaining);
			}
			}
		}
		
		}
	}


