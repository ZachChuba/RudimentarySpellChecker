/**
 * 
 * @author zchuba
 *	A node of a singly linked list:
 *	Methods setNext, getNext, toString
 *	Data: node and a pointer to the next node
 */
public class MyLinkedListNode {
	private String node;
	private MyLinkedListNode next = null;
	
	public MyLinkedListNode(String node) {
		this.node = node;
	}
	
	public void setNext(String s) {
		this.next = new MyLinkedListNode(s);
	}
	
	// Overloaded
	public void setNext(MyLinkedListNode s) {
		this.next = s;
	}
	
	public MyLinkedListNode getNext() {
		return next;
	}
	
	@Override
	public String toString() {
		return node;
	}

}
