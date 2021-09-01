package linkedlist;

/*
 * this class uses generics and  will create a linkedlist by adding nodes 
 * head is used to point to first node
 * data refers to value  in the linked list
 * next points  to next node in linked list
 * T refers to any data type
 * current and temp are used to point on nodes and iterate through list
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
	 * this method will find the node with desired data in the list and append a new
	 * node next to that node.if node is found then flag=1 otherwise if flag=0 then
	 * desired node is not found and cannot append
	 */
	public void findInsert(T search, T data) {
		Node newnode = new Node(data);
		current = head;
		temp = current.next;
		while (temp != null) {
			if (temp.data == search) {
				newnode.next = temp.next;
				temp.next = newnode;
				print();
				flag = 1;
				break;
			}
			temp = temp.next;
		}

		if (flag == 0) {
			System.out.println("Node not Found.Cannot append");
		}
	}

	/*
	 * this method will find a node with particular value and delete that node
	 * current and temp iterate through the linked list.if the node is found then
	 * flag=1 otherwise flag=0.
	 */
	public Node findDelete(T search) {
		current = head;
		temp = current.next;
		while (temp != null) {
			if (temp.data == search) {
				current.next = temp.next;
				flag = 1;
				break;
			}
			temp = temp.next;
			current = current.next;
		}
		if (flag == 0) {
			System.out.println("Node not Found.Cannot append");
		}
		print();
		return temp;
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
	 * this method will display the number of nodes in the linked list size is the
	 * variable used with every iteration of the while loop size increments
	 */
	public void size() {
		// TODO Auto-generated method stub
		temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		System.out.println("Size of linked list is :" + size);
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
