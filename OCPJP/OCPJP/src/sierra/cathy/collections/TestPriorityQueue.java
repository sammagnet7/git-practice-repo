package sierra.cathy.collections;

import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<String> PQ=new PriorityQueue<>();
		PQ.add("2");
		//System.out.println(PQ.peek());
		PQ.add("4");
		System.out.println(PQ.peek());
		PQ.offer("1");
		//System.out.println(PQ.peek());
		PQ.add("3");
		//System.out.println(PQ.peek());
		PQ.remove("1");
		//System.out.println(PQ.peek());
		System.out.println(PQ.poll());
		if(PQ.remove("2")) PQ.poll();
		System.out.println(PQ.poll()+" "+PQ.peek());
		

	}

}
