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
	int flag = 0;

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
	 * this method will find the desired data in the list it will check for each
	 * node .if data of any node is same as data being searched then variable flag
	 * is turned to 1 otherwise flag remains 0
	 */
	public void find(T data) {
		current = head;
		temp = current.next;
		while (temp != null) {
			if (temp.data == data) {
				flag = 1;
			}
			temp = temp.next;
		}

		if (flag == 1) {
			System.out.println(data + " Is present in the list");
		} else {
			System.out.println(data + " Not found");
		}

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
