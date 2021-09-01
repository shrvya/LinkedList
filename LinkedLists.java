package linkedlist;

/*
 * this class uses generics and  will create a linkedlist by adding nodes 
 * head is used to point to first node
 * data refers to value  in the linked list
 * next points  to next node in linked list
 * T refers to any data type
 */
public class LinkedLists<T> {
	public Node head = null, current, temp;

	class Node<T> {
		T data;
		Node next;

		/*
		 * this is a constructor of class Node this constructor will create node with
		 * data of type T and next will be null
		 */
		Node(T d) {
			data = d;
			next = null;
		}

	}

	/*
	 * this method is used to delete the first node current will point to first node
	 * temp will point to second node. second node is made as head
	 */
	public Node deleteFirst() {
		current = head;
		temp = head.next;
		head = temp;
		return head;

	}

	/*
	 * this method will add new nodes to then end data refers to data in the node
	 * current is a pointer to nodes and keeps iterating the linked list head will
	 * point to first node
	 */
	public void append(T data) {
		Node newnode = new Node(data);
		if (head == null) {

			head = newnode;
			current = head;

		} else {

			current.next = newnode;
			current = newnode;

		}
	}

	/*
	 * this method will print the linked list tempnode , a node is considered it
	 * acts like a iterator and iterates till last node this method will display
	 * content of linked list
	 */

	public void print() {
		Node tempnode = head;
		while (tempnode.next != null) {
			System.out.print(tempnode.data + "-->");
			tempnode = tempnode.next;
		}
		System.out.println(tempnode.data);
	}

}
