package HashMap;

import java.util.LinkedList;
import java.util.Queue;

public class CustomHashMap<K,V> {

	// Size of the HashMap
	static CustomHashMap hashMap = new CustomHashMap();
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
	 * @param key inserting into hashMap	
	 * @param value value for the 'key'
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
	 * @return returns the value for the requested key, returns -1 if the
	 *         HashMap contains no mapping for the key
	 *
	 */
	public int get(String key) {
		int hash = key.hashCode();
		int bucket = getBucketNumber(hash);

		CustomEntry<String, Integer> existingElement = table[bucket];

		while (existingElement != null) {
			
			if (existingElement.key.equals(key)) {
				return existingElement.value;
			}
			existingElement = existingElement.next;
		}
		return -1;
	}

	/***
	 * 
	 * @param hashMap
	 *            which we are going to print
	 */
	public void print() {
		Queue<String> queue = new LinkedList<>();
		for (int i = 0; i < CustomHashMap.SIZE; i++) {
			try {
				if (table[i] == null) {

				} else {
					CustomEntry<String, Integer> temp = table[i];
					while (temp != null) {
						String concat = temp.getKey() + "=" + temp.getValue();
						queue.add(concat);
						temp = temp.next;
					}

				}

			} catch (NullPointerException e) {
				// TODO: handle exception
			}
		}
		System.out.println(queue);
	}

	/***
	 * 
	 * @param key  that we are searching for
	 * @return returs true if it contains, false if don't
	 */
	public boolean containsKey(String key) {
		for (int i = 0; i < CustomHashMap.SIZE; i++) {
			try {
				if (table[i] == null) {

				} else {
					
					CustomEntry<String, Integer> temp = table[i];
					while (temp != null) {
						if(temp.getKey().equals(key)) {
							return true;
						}
						
						temp = temp.next;
					}

				}

			} catch (NullPointerException e) {
				// TODO: handle exception
			}
		}
		return false;

	}
	
	/***
	 * 
	 * @param value that we are searching for
	 * @return returs true if it contains, false if don't
	 */
	public boolean containsValue(Integer value) {
		for (int i = 0; i < CustomHashMap.SIZE; i++) {
			try {
				if (table[i] == null) {

				} else {
					
					CustomEntry<String, Integer> temp = table[i];
					while (temp != null) {
						if(temp.getValue().equals(value)) {
							return true;
						}
						
						temp = temp.next;
					}

				}

			} catch (NullPointerException e) {
				// TODO: handle exception
			}
		}
		
		
		return false;
		
	}

}
