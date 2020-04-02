package sierra.cathy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {

	public static void main(String[] args) {
	
		A a=new A(3);
		A a1=new A(3);
		//as hashcodes are unique for every object, this object can not be used as hashkey in hashmap because it will go through hashcode() method before equals()
		System.out.println(a.hashCode()+" "+a1.hashCode());
		System.out.println(a.equals(a1));
		
		Integer i1=new Integer(1000);
		Integer i2=new Integer(1000);
		
		Integer i3=new Integer(10);
		Integer i4=new Integer(10);
		
		System.out.println(i1==i2);
		System.out.println(i3==i4);
		
		Integer i5=128;
		Integer i6=128;
		
		Integer i7=127;
		Integer i8=127;
		
		System.out.println(i5==i6);
		System.out.println(i7==i8);
		
		//If overridden methods are provided then only calls different methods based on argument types otherwise, single method will be called for both the types.
		test(128);
		test(new Integer(128));
		
		ArrayList<TestCollection> aL=new ArrayList<>();
		//Set<TestCollection> st=new HashSet<>();
		TestCollection tc=new TestCollection();
		aL.add(tc);
		System.out.println(aL);
		//Collections.sort((aL);
		
		
		
		System.out.println("=======================\n");
		
		TreeSet<Integer> ts1=new TreeSet<>();
		ts1.add(1);
		ts1.add(2);
		System.out.println(ts1.add(1));
		System.out.println(ts1);
		
		List<Integer> returnList=returnList();
		System.out.println(returnList);

	}
	
	static void test(Integer i){
		System.out.println("Integer");
	}
	static void test(int i){
		System.out.println("int");
	}
	public static <E> List<E> returnList(){
		ArrayList<E> ml=new ArrayList<E>();
		ml.add((E) Integer.valueOf(1));
		return ml;
		//return new ArrayList<E>();
		
	}
	

	
}
