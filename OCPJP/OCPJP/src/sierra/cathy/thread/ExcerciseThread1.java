package sierra.cathy.thread;

public class ExcerciseThread1 {

	public static void main(String[] args) {

		Runnable myR=() -> {
			for(int i=1; i<=100; i++){
				System.out.println(Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
				if(i%10==0) System.out.println("Count is: "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1=new Thread(myR);
		t1.start();

	}

}
