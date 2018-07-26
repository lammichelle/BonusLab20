import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// Let's assign child to parent type
		
		//Note:
		//LinkedList = child (individual classes)
		//List (first) = parent even when it's an interface
		
		List<Integer> list = new LinkedList <>(); //can assign a child to a parent 
		List<Integer> list2 = new ArrayList<>();
		
		LinkedList<Integer> nums = new LinkedList<>();
		nums.add(56); //add method
		nums.add(100);
		nums.add(85);
		nums.add(47);
		
		//no need two string, link list and array list has 2 string method overwritten
		System.out.println(nums);
		
		Integer num = nums.get(2);
		int num2 = nums.get(2); //these two could work
		
		
		System.out.println(nums.get(2));
		
		/////////////////////////////////////////////////////////////
		for (int i = 0; i < nums.size(); i++) {
			System.out.println("i is: "+ (i+1) +" value is: "+ nums.get(i)); 
			//want to change at each iteration in loop
			//i+1 bc we want the first count to be 1
				
		}
		
		////////////////////////////////////////////////////////////
		//enhanced loop
		System.out.println("This is coming from the for each loop: ");
		for (int n : nums) { //LHS data type + name  && RHS what we looping for 
			System.out.println(n);
		}
		
		
		////////////////////////////////////////////////////////////
		LinkedList<Integer> newList = addNums(nums); //calling the addNums method, can eliminate LHS if wanted
		System.out.println(newList);
		
		
	}
	//add nums to this list with new method 
		public static LinkedList<Integer> addNums(LinkedList<Integer> numbers) {
			numbers.add(88);
			numbers.add(98);
			numbers.add(108);
			
			
			
			return numbers;
			
			
			
			
		}
		
		
		
	

}
