package HashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomHashMap<String,String> hashMap = new CustomHashMap<String,String>(); // raw type hashmap
		hashMap.put("Testing", "hashmap");
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
		hashMap.print();
		// hashMap.put("Davor", 1111);

		CustomHashMap<Integer, String> anotherHashMap = new CustomHashMap<Integer, String>();
		anotherHashMap.put(111, "Zigic");
		anotherHashMap.put(222, "Peromobil");
		
		CustomHashMap<String, String> andYetAnotherOne = new CustomHashMap<String, String>();
		andYetAnotherOne.put("Mobilni", "telefon");
		

	}

}
