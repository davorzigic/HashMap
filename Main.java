package HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomHashMap hashMap = new CustomHashMap();
		hashMap.put("Davor", 111);
		hashMap.put("Maya", 222);
		hashMap.put("Samir", 333);
		hashMap.put("Brance", 444);
		hashMap.put("Siker", 555);
		hashMap.put("Kovac", 666);
		hashMap.put("Koricanac", 777);
		hashMap.put("Mare", 888);
		// hashMap.put("Davor", 1111);

		
		hashMap.print();
		
		System.out.println(hashMap.containsKey("Samir"));
		System.out.println(hashMap.containsValue(777));
		
		int found = hashMap.get("Mare");
		System.out.println(found);
		

		int notFound = hashMap.get("Steva");
		System.out.println(notFound);

	}

}
