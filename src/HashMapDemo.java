import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

	public static void main(String[] args) {

		// create program using HashMap to runner's race time (distance in km)
		// 5km, 15km, 25km

		// hashmaps has a key and value pair
		HashMap<Integer, Double> raceTimes = new HashMap<>();
		// add in Hashmaps is PUT
		raceTimes.put(5, 30.00); // LHS - distance, RHS - time
		raceTimes.put(15, 90.00);
		raceTimes.put(25, 120.43);
		raceTimes.putIfAbsent(100, 500.00);

		int userDistance = 0;

		// userimport
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a distance in km(5,15,25) or press 0 to exit: ");

		userDistance = scan.nextInt(); // user promps

		while (userDistance != 0) { // while loop bc we dont know when the stop condition happens
			if (raceTimes.containsKey(userDistance)) {// contain key method
				System.out.print("Best Distance for " + userDistance + " km race is "); // to get the value at specific
																						// userdistance
				System.out.print(raceTimes.get(userDistance));
				System.out.println(" minutes.");
				System.out.println();

				// ask user if they want to do it again
				System.out.println("Please enter a distance in km(5,15,25) or press 0 to exit: ");
				userDistance = scan.nextInt(); // user promps

			} else {
				System.out.println("Invalid!");
			}

		}
		
		
		boolean hasNum = raceTimes.containsValue(105);
		System.out.println(hasNum);
		System.out.println();
		System.out.println("Goodbye!");

	}
}
