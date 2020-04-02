package sierra.cathy.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class TestParallelStreams {
	
	public void printSum(){
		List<Integer> list1=Arrays.asList(12,32,45,65,78,32,68,2,32);
		int sum= list1.stream().parallel().peek(i -> System.out.println(i + " : " +Thread.currentThread().getName())).mapToInt(i -> i).sum();
		System.out.println("Sum in printSum is: "+sum);
	}
	
	public void printSumWithFixedThread(){
		List<Integer> list1=Arrays.asList(12,32,45,65,78,32,68,2,32);
		ForkJoinPool fjPool=new ForkJoinPool(2);
		Future f=fjPool.submit(
				()-> list1.parallelStream()
				.peek(i -> System.out.println(i + " : " +Thread.currentThread().getName()))
				.mapToInt(i -> i)
				.sum()
				);
		
		Integer n=0;
		try {
			n = (Integer) f.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum in printSumWithFixedThread is: "+n);
	}
	
	public void checkingIsParallel(){
		Stream<Integer> stm1=Arrays.asList(12,32,45).stream().parallel();
		Stream<Integer> stm2=Arrays.asList(12,32,45).stream().parallel();
		stm2.sequential();
		System.out.println(stm1.isParallel());
		System.out.println(stm2.isParallel());
	}
	
	public void computeAverage(){
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		OptionalDouble avg1=list.parallelStream().mapToDouble(i -> i).reduce((a1,a2)-> (a1+a2)/2);
		OptionalDouble avg2=list.parallelStream().mapToDouble(i -> i).average();
		if(avg1.isPresent())	System.out.println("Average with reduce function: "+avg1.getAsDouble());
		if(avg2.isPresent())	System.out.println("Average function with average function: "+avg2.getAsDouble() +" -> correct");
	}

	public static void main(String[] args) {
		TestParallelStreams ps=new TestParallelStreams();
		ps.printSum();
		System.out.println("===================");
		ps.printSumWithFixedThread();
		System.out.println("===================");
		ps.checkingIsParallel();
		System.out.println("===================");
		ps.computeAverage();
		System.out.println("===================");
		

	}

}
