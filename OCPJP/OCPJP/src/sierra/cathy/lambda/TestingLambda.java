package sierra.cathy.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestingLambda {
	String a="Hi";
	int n=7; 
	
	//For Lambda expression outside method, variables used inside Lambda is not needed to be final or effectively final essentially
	Consumer<String> c= s -> {String a="Hello"; int n=6; System.out.println(s+" "+" " +a+" "+n);}; 
	
	
	
	
	

	public static void main(String[] args) {
		
		TestingLambda TL=new TestingLambda();
		TL.c.accept("Bye");
		String userName="hi";
		//BiConsumer<String, String> bc=(key,value) -> {userName="hg"; System.out.println(userName);};
		BiConsumer<String, String> bc=(key,value) -> {System.out.println(userName);}; // final or effectively final rule is applicable for inner method lambda expression.
//		userName="";
		System.out.println("---------------");
		
		List<String> aList= Arrays.asList("Hi","hello");
		Consumer<String> c1= (s1) -> System.out.println(s1);
		//Consumer<String> c1= (s1) -> {System.out.println(s1); if(s1.equalsIgnoreCase("Hello")) aList.set(1, "Bye");};
		Consumer<String> c2= (s1) -> {if(s1.equalsIgnoreCase("Hello")) aList.set(1, "Bye");};
		aList.forEach(c1.andThen(c2));
		System.out.println(aList);
		System.out.println("---------------");
		
		Map<String, String> mp1=new HashMap<>();	
		mp1.put("1", "Shreya");
		mp1.put("2", "Sathi");
		
		BiConsumer<String, String> bc1= (k1,v1)-> { mp1.replace("2", "Amar Sathi") ;System.out.println(k1+ " "+ v1);};
		mp1.forEach(bc1);	
		System.out.println("---------------");
		
		Consumer<String> c= (s) -> System.out.println(s); //instance
		
		aList.forEach(c);
		aList.forEach(System.out :: println);
		
		aList.forEach(TestingLambda :: myPrint);  //static
		System.out.println("---------------");
		
		
		
	}
	public static void myPrint(String s1){
		System.out.println("myprint: "+s1);
	}
	

}
