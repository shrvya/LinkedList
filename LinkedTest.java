package linkedlist;

public class LinkedTest {
	/*
	 * this is the main method this will create a object of Integer type for class
	 * LinkedList and use it to access methods this object will call append method
	 * to create a linked list then deleteFirst method is called linked list after
	 * popping first element is displayed
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedLists<Integer> linklist = new LinkedLists();
		System.out.println("Linked list");
		linklist.append(56);
		linklist.append(30);
		linklist.append(70);
		linklist.print();
		linklist.deleteFirst();
		System.out.println("Linked list after deletion");
		linklist.print();
	}

}
