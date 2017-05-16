package HashMap;

public class CustomEntry<K,V> {
	
	/***
	 * Map data structure containing key and value.
	 * It is also used as Linked List, in case we have bucket with the
	 * same hashcode but different keys. We use the pointer 'next'.
	 */

	K key;
	V value;
	CustomEntry<K, V> next;
	
	public CustomEntry(K k, V v) {
		// TODO Auto-generated constructor stub
		key = k;
		value = v;
		next = null;
	}
	

	public V getValue() {
		return value;
	}
	
	public void setValue(V v) {
		value = v;
	}
	
	public K getKey() {
		return key;
	}
}
