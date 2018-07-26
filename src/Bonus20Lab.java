import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bonus20Lab {

	public static void main(String[] args) {

		String answer;

		Scanner scan = new Scanner(System.in); // have to do case sensitive later
		// parallel arrays

		HashMap<String, Double> inventory = new HashMap<>();

		// fill the inventory
		inventory = fillInventory(inventory);

		System.out.println(inventory);

		// display the inventory
		displayInventory(inventory);

		answer = "yes";
		ArrayList<String> orderName = new ArrayList<String>();
		ArrayList<Double> orderPrice = new ArrayList<Double>();

		while (answer.equalsIgnoreCase("yes")) {

			System.out.println("What would you like to order? ");
			String userInput = scan.next();

			if (inventory.containsKey(userInput)) {
				System.out.print("Adding " + userInput + "to cart at $ ");
				System.out.println(inventory.get(userInput));

			} else {
				System.out.println("We don't have that.");
			}

			System.out.println("Add more?(yes/no)");
			answer = scan.next();
			if (answer.equalsIgnoreCase("no")) {
				orderName.add(userInput);
				orderPrice.add(inventory.get(userInput));
			}

		}
		System.out.print("Here's what you have: " + orderName);
		Average(orderPrice);

	}

	// display inventory
	private static HashMap<String, Double> fillInventory(HashMap<String, Double> tempInventory) {
		// key is String and value is Double
		tempInventory.put("apple", 0.99);
		tempInventory.put("banana", 0.59);
		tempInventory.put("cauliflower", 1.59);
		tempInventory.put("dragonfruit", 2.19);
		tempInventory.put("elderberry", 1.79);
		tempInventory.put("figs", 2.19);
		tempInventory.put("grapefruit", 1.99);
		tempInventory.put("honeydew", 3.49);

		return tempInventory;
	}

	private static void displayInventory(HashMap<String, Double> inventory) {

		// foreach loop
		String format = "%s\t\t%s";
		System.out.printf(format, "Item", "Price ");
		System.out.println();
		System.out.println("===============");

		for (String item : inventory.keySet()) {
			// String format = "%s\t\t%s";
			System.out.printf("%s\t\t%s%n", item, inventory.get(item));
			//

			// data type/name : inventory
		}

	}

	private static void Average(ArrayList<Double> orderPrice) {

		double num = 0;
		double sum = 0;
		for (int i = 0; i < orderPrice.size(); i++) {
			sum += orderPrice.get(i);
		}

			double average = sum / orderPrice.size();

			System.out.printf("%.2f%n", average);
		
	}

	// method for average
	// method for highest price
	// method for lowest price

}
