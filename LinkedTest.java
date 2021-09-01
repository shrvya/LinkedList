package linkedlist;

public class LinkedTest {
	/*
	 * this is the main method this will create a object of Integer type for class
	 * LinkedList and use it to access methods
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedLists<Integer> linklist = new SortedLists<Integer>();
		System.out.println("Linked list is :");
		linklist.append(56);
		linklist.append(30);
		linklist.append(70);
		linklist.append(40);
		linklist.print();
		System.out.println("Sorted list is: ");
		linklist.sort();
		
		
	}

}
