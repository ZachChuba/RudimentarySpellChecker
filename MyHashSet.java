/**
 * 
 * @author zchuba Bare-bones implementation of a HashSet 
 *		   Init MyHashSet()
 *         Interface Methods: add, contains, hashCode
 */
public class MyHashSet {
	private static final int HASH_TABLE_SIZE = 40000;
	private MyLinkedList[] hashTable;

	public MyHashSet() {
		this.hashTable = new MyLinkedList[HASH_TABLE_SIZE];
	}

	/**
	 * 
	 * @param str
	 * Adds str to the hashSet
	 */
	public void add(String str) {
		int hashCode = calculateHashCode(str);
		// If index is empty, init a new linked list with the element
		if (hashTable[hashCode] == null) {
			hashTable[hashCode] = new MyLinkedList(str);
		} else {
			hashTable[hashCode].add(str);
		}
	}

	/**
	 * 
	 * @param str
	 * @return true if str is in the hash set, false if not
	 */
	public boolean contains(String str) {
		int hashCode = calculateHashCode(str);
		// Edge case rejections
		if (hashTable[hashCode] == null) {
			return false;
		}
		if (hashTable[hashCode].contains(str)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param String s
	 * @return hash code of s
	 */
	public int hashCode(String s) {
		return calculateHashCode(s);
	}

	/**
	 * This method was not designed by me.
	 * 
	 * @param s, a string
	 * @return hash code of that string
	 */
	private int calculateHashCode(String s) {
		int h = 0;
		for (int i = 0; i < s.length(); i++) {
			h = (h << 5) | (h >>> 27); // 5-bit cyclic shift of the running sum
			h += (int) s.charAt(i); // add in next character
		}
		return 20000 + h % 20000;
	}

}
