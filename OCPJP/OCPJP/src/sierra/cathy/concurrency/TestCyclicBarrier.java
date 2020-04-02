package sierra.cathy.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {
	CyclicBarrier cb;
	
	TestCyclicBarrier(CyclicBarrier cb){
		this.cb=cb;
	}
	
	class MyRunnable implements Runnable{

		@Override
		public void run() {
			
			System.out.println("Before waiting: "+Thread.currentThread().getName());
			
			try {
				cb.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println("After waiting1: "+Thread.currentThread().getName());
			
			try {
				cb.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println("After waiting2: "+Thread.currentThread().getName());
		}
		
		
		
	}
	
	
	

	public static void main(String[] args) {

		Runnable barrierAction=() -> {
			System.out.println("Inside CyclicBarrier: "+ Thread.currentThread().getName());
		};
		CyclicBarrier cb=new CyclicBarrier(3, barrierAction);
		TestCyclicBarrier tcb=new TestCyclicBarrier(cb);
		MyRunnable mr=tcb.new MyRunnable();
		Thread thread1=new Thread(mr);
		Thread thread2=new Thread(mr);
		Thread thread3=new Thread(mr);
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("Main method completes: "+Thread.currentThread().getName());

	}

}
