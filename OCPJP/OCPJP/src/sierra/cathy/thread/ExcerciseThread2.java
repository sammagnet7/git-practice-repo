package sierra.cathy.thread;

public class ExcerciseThread2 {
	
	/*static */class MyThread extends Thread{
		private StringBuffer sb;
		public MyThread(StringBuffer sb){
			this.sb=sb;
		}
		public void run(){
			System.out.println("Trying to get a lock by: "+Thread.currentThread().getName());
			synchronized(sb){
			for(int i=0;i<100;i++){
				System.out.println(sb + " "+ i+" "+Thread.currentThread().getName());
				
			}
			System.out.println("-----------");
			char c=(char)sb.toString().charAt(0);
			c++;
			/*sb.delete(0, sb.length());
			sb.append(c);*/
			sb.setCharAt(0, c);
		}}
	}

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("A");
		//StringBuffer sb2=new StringBuffer("X");
		ExcerciseThread2 et=new ExcerciseThread2();
		MyThread mt1=et.new MyThread(sb1);
		MyThread mt2=et.new MyThread(sb1);
		MyThread mt3=et.new MyThread(sb1);
		mt1.start();
		mt2.start();
		mt3.start();
		/*ExcerciseThread2.MyThread mt4=et.new MyThread(sb2);
		ExcerciseThread2.MyThread mt5=et.new MyThread(sb2);
		ExcerciseThread2.MyThread mt6=et.new MyThread(sb2);
		mt4.start();
		mt5.start();
		mt6.start();*/

	}

}
