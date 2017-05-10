package HashMap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.internal.Throwables;

public class CustomHashMap {
	// Size of the HashMap
	private static final int SIZE = 16;
	private CustomEntry<String, Integer> table[] = new CustomEntry[SIZE];

	/***
	 * 
	 * @param hash
	 * @return returns the index for hashcode hash
	 */
	private int getBucketNumber(int hash) {
		return hash & (SIZE - 1);
	}

	/***
	 * 
	 * @param key
	 * @param value
	 */
	public void put(String key, Integer value) {

		int hash = key.hashCode();
		int bucket = getBucketNumber(hash);

		CustomEntry<String, Integer> existingElement = table[bucket];

		// Traverse thru table until we have free position to insert CustomEntry
		// object
		for (; existingElement != null; existingElement = existingElement.next) {
			// If we have Entry with the same key
			if (existingElement.key.equals(key)) {
				System.out.println("duplicate key value pair, replacing existing key " + key + ", with value " + value);
				existingElement.value = value;
				return;

			}

		}
		// ADDING NEW

		CustomEntry<String, Integer> newEntry = new CustomEntry<String, Integer>(key, value);
		newEntry.next = table[bucket];
		table[bucket] = newEntry;
		System.out.println("ADDING NEW at position " + bucket);
	}

	/***
	 * 
	 * @param key
	 * @return returns the entry with the requested key, returns null if the
	 *         HashMap contains no mapping for the key
	 *
	 */
	public String get(String key) {
		int hash = key.hashCode();
		int bucket = getBucketNumber(hash);

		CustomEntry<String, Integer> existingElement = table[bucket];

		while (existingElement != null) {
			System.out.println("Traversing");
			if (existingElement.key.equals(key)) {
				return existingElement.key;
			}
			existingElement = existingElement.next;
		}
		return null;
	}

	public int get(Integer value) {

		return -1;
	}

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
		hashMap.put("Davor", 1111);

		for (int i = 0; i < CustomHashMap.SIZE; i++) {
			System.out.print("Position " + i + " ");
			try {
				System.out.print(hashMap.table[i].getKey());

				if (hashMap.table[i].next == null) {

				} else {
					System.out.print(" -> " + hashMap.table[i].next.getKey());
				}
			} catch (NullPointerException e) {
				// TODO: handle exception

			}
			System.out.println();

		}

		Queue<String> queue = new LinkedList<>();
		for (int i = 0; i < CustomHashMap.SIZE; i++) {

			try {
				if (hashMap.table[i] == null) {

				} else {
					queue.add(hashMap.table[i].getKey());
				}
			} catch (NullPointerException e) {
				// TODO: handle exception

			}

		}
		System.out.println(queue);

		String found = hashMap.get("Mare");
		System.out.println(found);

		String notFound = hashMap.get("Steva");
		System.out.println(notFound);

	}

}
