import java.util.*;
public class TrafficLights {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the colour :");
		String colour=sc.nextLine();
		
		
switch(colour) {
case "RED":
case "red":
	System.out.println("Stop");break;
case "GREEN":
case "green":
	System.out.println("Go");break;
case "YELLOW":
case "yellow":
	System.out.println("ready");break;
}
	}

}
