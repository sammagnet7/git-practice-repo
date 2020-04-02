package sierra.cathy.stream;

import java.util.Optional;
import java.util.stream.Stream;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class TestOptional {

	public static void main(String[] args) {

		Optional<Double> od1 = Stream.of(101.1, 202.2, 303.3, 404.4).findFirst();
		System.out.println(od1.get());
		
		
		Optional<Object> od2 = Stream.of().findFirst();
		if(od2.isPresent()){
			System.out.println(od2.get());
		}
		else{
			System.out.println("Null");
		}
		
		od1.ifPresent(n -> System.out.println(n));
		System.out.println("----------");
		
		
		//Optional<Double> od3 = Stream.of(null, 202.2, 303.3, 404.4).findFirst();
		//Optional<Double> od4=Optional.ofNullable(od3.get());
		
		/*if(od3.isPresent()){
			System.out.println(od3.get());
		}
		else{
			System.out.println("Null");
		}*/
		//od3.ifPresent(n -> System.out.println(n));
		
		Dog d1=new Dog(101, "Rosy");
		Optional<Dog> od5=Optional.of(d1);
		od5.ifPresent(System.out::println);
		
		
		Dog d2=null;
		Optional<Dog> od6=Optional.ofNullable(d2);
		od6.ifPresent(System.out::println);
		if(!od6.isPresent()) System.out.println("Null");
		
		
		Optional<Dog> od7= Optional.of(d1);
		Dog d3=od7.orElse(new Dog(102,"Simba"));
		System.out.println(d3);
		
		Optional<Dog> od8= Optional.empty();
		Dog d4=od8.orElse(new Dog(102,"Simba"));
		System.out.println(d4);
	}

}
