package sierra.cathy.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class TestConcurrency {
	
	class Counter{
		//private int count;
		private AtomicInteger count=new AtomicInteger();
		
		public void increment(){
			//count++;
			count.getAndIncrement();
		}
		public int getCount(){
			//return count;
			return count.intValue();
		}
	}
	
	class IncrementerThread extends Thread{
		private Counter counter;
		IncrementerThread(Counter c){
			this.counter=c;
		}
		
		public void run(){
			for(int i=1; i<=10000; i++){
				counter.increment(); 
			}
			
		}
	}

	public static void main(String[] args) {
		TestConcurrency tc=new TestConcurrency();
		Counter c=tc.new Counter();
		IncrementerThread it1=tc.new IncrementerThread(c);
		IncrementerThread it2=tc.new IncrementerThread(c);
		 
		it1.start();
		it2.start();
		try {
			it1.join();
			it2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(c.getCount());
				

	}

}
