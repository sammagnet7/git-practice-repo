package sierra.cathy.concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;

public class TestForkJoin {
	//Fork-join task with no return
	class MyForkJoinAction extends RecursiveAction{
		private static final int thresold= 10;
		int[] myArray;
		int start;
		int end;
		
		public MyForkJoinAction(int[] myArray, int start, int end) {
			super();
			this.myArray = myArray;
			this.start = start;
			this.end = end;
		}

		@Override
		protected void compute() {
			if((end-start)<=thresold){
				System.out.println("Start= "+start +" End= "+end+ " Thresold= " +thresold);
				for(int i=start; i<end; i++){
					myArray[i]= ThreadLocalRandom.current().nextInt(1,1000);
					System.out.println(i +" : "+ myArray[i]);
				} 
				System.out.println(Thread.currentThread().getName());
				System.out.println("================================");
				System.out.println();
			}else{
				int halfway= (((end-start)/2)+start);
				//System.out.println("Splitting end= "+end +" Splitting start= " + start +" Splitting half= "+ halfway+" @@@@@@"+Thread.currentThread().getName());
				MyForkJoinAction subAction1=new MyForkJoinAction(myArray, start, halfway);
				MyForkJoinAction subAction2=new MyForkJoinAction(myArray,halfway, end);
			/*	subAction1.fork();
				subAction2.compute();
				subAction1.join();	*/			
				invokeAll(subAction2,subAction1);
			}
			
		}
		
	}
	//Fork-join task with return value
	class MyForkJoinTask extends RecursiveTask<Integer> {
		private static final int thresold= 10;
		int[] myArray;
		int start;
		int end;
		
		public MyForkJoinTask(int[] myArray, int start, int end) {
			super();
			this.myArray = myArray;
			this.start = start;
			this.end = end;
		}

		@Override
		protected Integer compute() {
			if((end-start)<=thresold){
				int position=start;
				for(int i=start; i<end; i++){
					if(myArray[i]>myArray[position]){
						position=i;
					}
				}
				return position;
			}
			else{
				int halfway= (((end-start)/2)+start);
				MyForkJoinTask subTask1=new MyForkJoinTask(myArray, start, halfway);
				MyForkJoinTask subTask2=new MyForkJoinTask(myArray,halfway, end);
				subTask1.fork();
				Integer position2=subTask2.compute();
				Integer position1=subTask1.join();
				if(myArray[position1]>myArray[position2]){
					return position1;
				}
				else if(myArray[position2]>myArray[position1]){
					return position2;
				}
				else{
					return position1<position2?position1:position2;
				}
			}
			
		}
		
	}

	public static void main(String[] args) {

		/*Runtime rt=Runtime.getRuntime();
		System.out.println(rt.totalMemory());
		System.out.println(rt.availableProcessors());*/
		
		int[] mAr=new int[1000];
		ForkJoinPool fjpool=new ForkJoinPool();
		TestForkJoin myClass=new TestForkJoin();
		MyForkJoinAction action=myClass.new MyForkJoinAction(mAr, 0, mAr.length);
		fjpool.invoke(action);
		/*System.out.println("-----------------------------------");
		for(int i:mAr){
			System.out.println(i +"; ");
		}
		System.out.println("-----------------------------------");*/
		
		MyForkJoinTask task=myClass.new MyForkJoinTask(mAr, 0, mAr.length);
		Integer i=fjpool.invoke(task);
		System.out.println("The highest element is "+mAr[i]+ " on position: "+ i);
		

	}

}
