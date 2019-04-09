/**
 * 
 * @author zchuba
 *	A rudimentary single linked list data structure
 *	Supports add, size, contains
 */
public class MyLinkedList {
	private int size;
	private MyLinkedListNode firstNode;
	private MyLinkedListNode lastNode;
	
	// Initialize
	public MyLinkedList(String firstNode) {
		this.size = 1;
		this.firstNode = new MyLinkedListNode(firstNode);
		this.lastNode = this.firstNode;
	}
	
	/**
	 * 
	 * @param newNode value to be added to the end of the linked list
	 * Adds newNode to end of linked list
	 */
	public void add(String newNode) {
		// Add a node after the last node, then set the last node to that node
		MyLinkedListNode currentNode = lastNode;
		currentNode.setNext(newNode);
		lastNode = currentNode.getNext();
		size++;
	}
	
	/**
	 * 
	 * @return size of the linked list
	 */
	public int size() {
		return size;
	}
	
	/**
	 * 
	 * @param value target value to be found in linked list
	 * @return true if value is found, false if not (case sensitive)
	 */
	public boolean contains(String value) {
		MyLinkedListNode currentNode = firstNode;
		while (currentNode != null) {
			if (currentNode.toString().equals(value)) {
				return true;
			}
			currentNode = currentNode.getNext();
		}
		return false;
	}

}
