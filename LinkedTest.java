package linkedlist;

public class LinkedTest {
	/*
	 * this is the main method this will create a object of Integer type for class
	 * LinkedList and use it to access methods
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedLists<Integer> linklist = new LinkedLists();
		System.out.println("Linked list");
		linklist.append(56);
		linklist.append(30);
		linklist.append(70);
		linklist.print();
		System.out.println("Linked list after modification:");
		linklist.findInsert(30, 40);
		System.out.println("Linked list after deletion:");
		linklist.findDelete(40);
		linklist.size();
	}

}
