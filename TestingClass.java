package HashMap;

import java.util.HashMap;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>(20);
		hashMap.put("Davor", 111);
		hashMap.put("Mada", 222);
		hashMap.put("Samir", 333);
		hashMap.put("Brance", 444);
		hashMap.put("Siker", 555);
		hashMap.put("Kovac", 666);
		hashMap.put("Koricanac", 777);
		hashMap.put("Mare", 888);
		
		System.out.println(hashMap.get("Davor"));
		
		
		System.out.println(hashMap.containsKey("Mare"));
		System.out.println(hashMap.containsValue(222));
		System.out.println(hashMap);
		System.out.println(hashMap.get("Pera"));
	}

}
