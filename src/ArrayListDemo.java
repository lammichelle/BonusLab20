import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Wrapper classes are available for all primitive types (8 total)
		//primitive types = boolean , byte , char , short , int , long , float and double
		//Wrapper classes are also known as generics
		
		//this is not necessary
		Integer intObj = new Integer(100);	//this is saying int i = 100 
		int m = intObj.intValue(); //this will convert my parent wrapper(Integer - Heap) to a primitive Int 
		
		
	
		// autoboxing - by default java will do the above operation for us
		Integer n = 100; //this can be seen as Object
		
		//unboxing - convert to primitive type
		int j = n; //store in stack as primitive type - int 
		
		ArrayList test = new ArrayList(); 
		// if we do this and add items, we would need to cast them when pulling them out
		
		//No need to declare the type in angle brackets on the RHS with Java8
		ArrayList<String> names = new ArrayList <String>();
		names.add("Grant Chirpus"); //using methods
		names.add("Alex");
		names.add("Kaelan");
		names.add("Michelle");
		names.add(4, "Ben"); // you can add elements to a specific index
		//be careful that your indexes are in sequence
		System.out.println("Hey! Please enter a name: ");
		String name = scan.nextLine();
		names.add(name);
		
		System.out.println(names);//format [ ,]
	///////////////////////////////////////////////////////////	
		//if want to print it line by line, do for loop
		//array list uses the size method to determing length
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//want to print specific name using index nums 
		String test1 = names.get(0);
		System.out.println(test1);	
	////////////////////////////////////////////////////////////////	
	System.out.println();
	System.out.println("This is using the enhanced for loop!");
	// for each loops, dont need to use the get() method bc we dotn refernce the index
	
	
	for (String temp : names ) {
		System.out.println(temp);
	}
	
	
	/////////////////////////////////////////////////////////////
	//using contains method & boolean
	if(names.contains("Alex")){
		System.out.println("Maches an element!");
	}
	
	boolean checkContents = names.contains("Alex");
	System.out.println(checkContents);
	////////////////////////////////////////////////////////////
	//using remove method
	
	names.remove(0);
	System.out.println(names); //grant chirpus is now removed

	//use clear method 
	names.clear();
	System.out.println(names); //removes all elements 
	}

}
