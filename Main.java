package HashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomHashMap hashMap = new CustomHashMap(); // raw type hashmap
		hashMap.put("Davor", 111);
		hashMap.put("Maya", 222);
		hashMap.put("Samir", 333);
		hashMap.put("Brance", 444);
		hashMap.put("Siker", 555);
		hashMap.put("Kovac", 666);
		hashMap.put("Koricanac", 777);
		hashMap.put("Mare", 888);
		hashMap.put("Steva", 111);
		hashMap.put("Pera", 222);
		hashMap.put("Paja", 333);
		hashMap.put("Kori", 444);
		hashMap.put("Vasa", 666);
		hashMap.put("Pedja", 888);
		hashMap.put("Srecko", 444);
		hashMap.put("Theodor", 31);
		hashMap.put("Leo", 134);
		hashMap.put("Laci", 3424);
		hashMap.put("Bajus", 32411);
		hashMap.put("Olja", 432);
		// hashMap.put("Davor", 1111);

		CustomHashMap<Integer, String> anotherHashMap = new CustomHashMap<Integer, String>();
		anotherHashMap.put(111, "Zigic");
		System.out.println(anotherHashMap);
		
		HashMap<String, Integer> phonebook = new HashMap<>();
		phonebook.put("Steva", 432);
		phonebook.put("Moma", 111);
		System.out.println(phonebook.get("Steva"));
		
		hashMap.print();
		
		System.out.println(hashMap.containsKey("Samir"));
		System.out.println(hashMap.containsValue(777));
		
		hashMap.remove("Koricanac");
		hashMap.remove("Siker");
		hashMap.remove("Bajus");
		
		hashMap.print();
		
		int found = hashMap.get("Mare");
		System.out.println(found);
		
		boolean testing = hashMap.containsValue(111);
		System.out.println(testing);
		
		hashMap.clear();
		
		hashMap.print();

	}

}
