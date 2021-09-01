package linkedlist;

/*
 * this class uses generics and  will create a linkedlist by adding nodes and sort it
 * head is used to point to first node
 * data refers to value  in the linked list
 * next points  to next node in linked list
 * T refers to any data type
 * current and temp are used to point on nodes and iterate through list
 */
public class SortedLists<T> {
	public Node head = null, current, temp;
	Object temperory;
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
	 * this method will consider current ,temp nodes and an object temporary this
	 * method will compare data value of current node with every other node in the
	 * list if data of any node is greater than current data then value of tempnode
	 * and current node is swapped current will initially point to first node.with
	 * every iteration current node and temp node will shift
	 */
	public void sort() {
		current = head;

		while (current != null) {
			temp = current.next;
			while (temp != null) {
				if ((int) current.data > (int) temp.data) {
					temperory = temp.data;
					temp.data = current.data;
					current.data = temperory;

				}
				temp = temp.next;
			}
			current = current.next;
		}
		print();
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
