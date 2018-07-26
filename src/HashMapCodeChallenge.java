
import java.util.HashMap;
/* Write a method named mapBully() to modify and return the given map as follows: 
 * if the key "a" has a value, set the key "b" to have that value, 
 * and set the key "a" to have the value "". 
 * Basically "b" is a bully, taking the value and replacing it with the empty string.
 * mapBully({"a": "candy", "b": "dirt"}) to {"a": "", "b": "candy"}
 * mapBully({"a": "candy"}) to {"a": "", "b": "candy"}
 * mapBully({"a": "candy", "b": "carrot", "c": "meh"}) to  {"a": "", "b": "candy", "c": "meh"}
 * Hint: your method should be returning a HashMap
*/
public class HashMapCodeChallenge {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("a", "lucky"); //b:lucky
		
		System.out.println(map);
		System.out.println(mapBully(map));
	
	}

 // your method should go here
	public static HashMap<String, String> mapBully(HashMap<String, String> map) {
		if(map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		
		
		return map;
	}
}