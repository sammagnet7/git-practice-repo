package sierra.cathy.collections;

import java.util.*;

public class TestQueue {
	
	static class PQcom implements Comparator<Integer>{
		public int compare(Integer a1, Integer a2){
			//return a2.compareTo(a1);
			//return a1-a2;
			return a2-a1;
		}
		
	}

	public static void main(String[] args) {
		
		int[] MyArray=new int[]{9,1,6,4,7,2,8,5,3}; 
		PriorityQueue<Integer> myPQ=new PriorityQueue<>();
		
		System.out.println(Arrays.toString(MyArray));
		System.out.println(myPQ);
		
		//Feeding data to queue		
		for(int a:MyArray){
			myPQ.offer(a);
			System.out.print(a);
		}
		System.out.println("\n-----");
		System.out.println(myPQ.size());
		
		
		
		//retrieving highest priority data not deleting
		for(int a:MyArray){
			System.out.print(myPQ.peek());
			System.out.println(myPQ);
		}
		System.out.println("\n-----");
		System.out.println(myPQ.size());
		System.out.println(myPQ);
		
		//retrieving highest priority data with deleting
		for(int a:MyArray){
			System.out.print(myPQ.poll());
			System.out.println(myPQ);
		}
		System.out.println("\n-----");
		System.out.println(myPQ.size());
		System.out.println(myPQ);
		
		System.out.println(myPQ.poll());
		
		
		
		
		
		PQcom comp=new PQcom();
		PriorityQueue<Integer> myPQ2=new PriorityQueue<>(comp);
		//Feeding data to queue		
				for(int a:MyArray){
					myPQ2.offer(a);
					System.out.print(a);
				}
				System.out.println("\n-----");
				System.out.println(myPQ2.size());
				System.out.println(myPQ2);
		//retrieving highest priority data with deleting
				for(int a:MyArray){
					System.out.print(myPQ2.poll());
					System.out.println(myPQ2);
				}
				System.out.println("\n-----");
				System.out.println(myPQ2.size());
				System.out.println(myPQ2);
				
				
				
				
		//ArrayDequeue:---------
				
				
				int[] MyArray1=new int[]{9,1,6,4,7,2,8,5,3}; 
				ArrayDeque<Integer> ADQ1=new ArrayDeque<>(2);
				ArrayDeque<Integer> ADQ2=new ArrayDeque<>(2);
				ArrayDeque<Integer> ADQ3=new ArrayDeque<>(2);
				ArrayDeque<Integer> ADQ4=new ArrayDeque<>();
				ArrayDeque<Integer> ADQ5=new ArrayDeque<>();
				
				for(Integer i: MyArray1){
					ADQ1.offer(i);
					ADQ2.offerFirst(i);
					ADQ3.push(i);
					ADQ4.add(i);
					ADQ5.addFirst(i);
				}
				
				System.out.println(Arrays.toString(MyArray1));
				System.out.println("ADQ1.offer(i) "+ ADQ1);
				System.out.println("ADQ2.offerFirst(i) "+ADQ2);
				System.out.println("ADQ3.push(i) "+ADQ3);
				System.out.println("ADQ4.add(i) "+ADQ4);
				System.out.println("ADQ5.addFirst(i "+ADQ5);
				
				System.out.println(ADQ1.poll());
				System.out.println(ADQ1);
				
				System.out.println(ADQ1.peek());
				System.out.println(ADQ1);
				
				System.out.println(ADQ1.pop());
				System.out.println(ADQ1);
				
				System.out.println(ADQ1.remove());
				System.out.println(ADQ1);
				
				System.out.println(ADQ1.removeLast());
				System.out.println(ADQ1.removeLast());
				System.out.println(ADQ1.removeLast());
				System.out.println(ADQ1.removeLast());
				System.out.println(ADQ1);
				
				System.out.println(ADQ1.pollLast());
				System.out.println(ADQ1);
				
				
				System.out.println(ADQ1.poll());
				System.out.println(ADQ1);
				System.out.println(ADQ1.poll());
				System.out.println(ADQ1);
				
				/*System.out.println(ADQ1.pop());
				System.out.println(ADQ1);*/
	}
}
