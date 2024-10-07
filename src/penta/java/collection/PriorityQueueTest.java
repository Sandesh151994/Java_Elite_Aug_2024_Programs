package penta.java.collection;

/*
 * enqueue- to insert
 * dequeue- to delete
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> pq=new ArrayDeque<>();

		pq.add(67);
		pq.add(43);
		pq.add(78);
		pq.add(56);
		pq.addFirst(89);
		pq.addLast(59);
		pq.offer(21);
		
		//5-Highest Priority
		// this will get inserted to queue first
		// 43-will be inserted last
		
		System.out.println(pq);
		System.out.println("Removing elements from queue in FIFO");
		
//		System.out.println(pq.poll());
//		System.out.println(pq.remove());
		
		System.out.println(pq.remove());
		System.out.println(pq.removeLast());
		System.out.println(pq.pollFirst());
		
		Deque<String> list=new LinkedList<>();
		
		list.offer("ABC");
		list.offerFirst("XYZ");
		System.out.println(list);
		
		
		
		

	}

}
