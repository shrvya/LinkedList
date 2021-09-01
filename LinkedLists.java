package linkedlist;

/*
 * this class uses generics and  will create a linkedlist by adding nodes 
 * head is used to point to first node
 * data refers to value  in the linked list
 * next points  to next node in linked list
 * T refers to any data type
 */
public class LinkedLists<T> {
	Node head;

	class Node {
		int data;
		Node next;

		/*
		 * this is a constructor of class Node this constructor will create node data of
		 * node will be assigned to d and next will be null
		 */
		Node(int d) {
			data = d;
			next = null;
		}

	}

	/*
	 * this method will print the linked list tempnode , a node is considered it
	 * acts like a iterator and iterates till last node this method will display
	 * content of linked list
	 */
	public void insertFront(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}

	public void print() {
		Node tempnode = head;
		while (tempnode != null) {
			System.out.print(tempnode.data + " ");
			tempnode = tempnode.next;
		}
	}

	/*
	 * this is the main method this will create a object of Integer type for class
	 * Linked List and use it to access method insertFront and print
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedLists<Integer> linklist = new LinkedLists();
		linklist.insertFront(70);
		linklist.insertFront(30);
		linklist.insertFront(56);
		linklist.print();

	}

}
