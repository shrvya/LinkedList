package linkedlist;
import java.util.LinkedList;
public class LinkedLists<K> {
	LinkedList<K> linkedlist = new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);
		for(int i=0;i<linkedlist.size();i+=3)
		{
			System.out.printf(linkedlist.get(i)+"-->"+linkedlist.get(i+1)+"-->"+linkedlist.get(i+2));
		}
	}

}
