package sierra.cathy.thread;

public class TestThread {

	public static void main(String[] args) {
		
		Runnable myR=() -> {for(int i=0; i<4; i++){
			System.out.println("Currently running thread: "+ Thread.currentThread().getName()+" and i is: "+i);
			try{
				Thread.sleep(4000);
			}catch(InterruptedException e){e.printStackTrace();}
		}
		};
			
		System.out.println("Main thread name is: "+ Thread.currentThread().getName());
		
		Thread t1=new Thread(myR);
		Thread t2=new Thread(myR);
		Thread t3=new Thread(myR);
		t1.setName("Sathi");
		t2.setName("Soumo");
		t3.setName("Soumo-Sathi");
		t1.start();
		t2.start();
		t3.start();
		/*System.out.println("Is Sathi thread alive? "+t1.isAlive());
		System.out.println("Sathi's State: "+t1.getState());
		System.out.println("Is Soumo thread alive? "+t2.isAlive());
		System.out.println("Soumo's State: "+t2.getState());
		System.out.println("Is Soumo-Sathi thread alive? "+t3.isAlive());
		System.out.println("Soumo-Sathi's State: "+t3.getState());*/

	}

}
