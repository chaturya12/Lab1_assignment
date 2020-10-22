
public class PizzaWithMethods {
//-----------Pizza Names---------------------
	 static String VEG_EXTRAVAGANZA="Veg Extravaganza";
	 static String DELUX_VEGGLE="Delux veggle";
//-------------- size----------
	 static String REGULAR_PIZZA_SIZE="regular";
	 static String MEDIUM_PIZZA_SIZE="medium";
//--------------crust------------
	 static String NEW_HAND_TOSSED="New Hand Tossed";
	 static String CHEESE_BURST="Cheese Burst";
//-----------Toppings--------
	 static String VEG_EXTRAVAGANZA_TOPPINGS="Black Olive, Capsicum, Onion, Corn";
	 
	 
	 
	 static String pizzaName;
	  static String size;
	 static String crust;
	 static double price;
	 static String toppings;
	 
	 
	 
	 
	public static void main(String[] args) {
		// order pizza
		String tokenNo=orderPizza(VEG_EXTRAVAGANZA,NEW_HAND_TOSSED,REGULAR_PIZZA_SIZE);
		//cook pizza
		cookPizza(tokenNo);
		//display pizza
		displayPizza();

	}




	private static void cookPizza(String tokenNo) {
		System.out.println("wait for 30 mins");
		
			if(tokenNo.equalsIgnoreCase(VEG_EXTRAVAGANZA+"001") &
					PizzaWithMethods.crust.equalsIgnoreCase(NEW_HAND_TOSSED) &
					PizzaWithMethods.size.equalsIgnoreCase(REGULAR_PIZZA_SIZE)) {
				PizzaWithMethods.toppings=VEG_EXTRAVAGANZA_TOPPINGS;
				PizzaWithMethods.price=540;
			}
		
		
	}




	private static String orderPizza(String pizzaName, String crust, String size) {
		PizzaWithMethods.pizzaName=pizzaName;
		PizzaWithMethods.crust=crust;
		PizzaWithMethods.size=size;
		String tokenNo=pizzaName+"001";
		System.out.println("Thanks for ordering");
		return tokenNo;
	}




	private static void displayPizza() {
		System.out.println("------------Pizza Details----------");
        System.out.println("[Name] : "+pizzaName);
        System.out.println("[size] : "+size);
        System.out.println("[Crust] : "+crust);
        System.out.println("[Price] : "+price);
        System.out.println("[Toppings] : "+toppings);
	}

}
