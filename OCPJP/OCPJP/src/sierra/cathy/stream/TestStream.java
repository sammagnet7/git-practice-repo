package sierra.cathy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		Double[] array1={101.1,202.2,303.3,404.4,505.5,606.6,707.7};
		Stream<Double> str1=Arrays.stream(array1);
		long count1=str1.count();
		System.out.println(count1);
		System.out.println("------------");
		
		Stream<Double> str2=Arrays.stream(array1);
		long count2=str2.filter(d-> d>200 && d<700).count();
		System.out.println(count2);
		System.out.println("------------");
		
		double[] array2={101.1,202.2,303.3,404.4,505.5,606.6,707.7};
		List<Double> list1=Arrays.asList(array1);
		long count3=Stream.of(list1).count();
		System.out.println(count3); // op=1
		System.out.println("------------");
		
		List<Double> list2=Arrays.asList(array1);
		long count4=list2.stream().count();
		System.out.println(count4); //op=7
		System.out.println("------------");
		
		Stream<Double> str3= Stream.of(array1); //
		DoubleStream str4= DoubleStream.of(array2);
		//System.out.println(str3.count());
		//System.out.println(str4.count());
		str3.forEach(System.out::println);
		str4.forEach(System.out::println);
		System.out.println("------------");
		
		DoubleStream str5=DoubleStream.of(101.1,202.2,303.3,404.4,505.5,606.6,707.7);
		//double d1=str5.map(d-> d*d).sum();
		OptionalDouble d1=str5.map(d-> d*d).average();
		System.out.println(d1);
		System.out.println(d1.getAsDouble());
		System.out.println("------------");
		
		DoubleStream str6=DoubleStream.of();
		OptionalDouble d2=str6.map(d-> d*d).average();
		System.out.println(d2);
		if(d2.isPresent()){System.out.println(d2.getAsDouble());
		}else System.out.println("EMPTY");
		System.out.println("------------");
		
		DoubleStream str7=DoubleStream.of(101.1,202.2,303.3,404.4,505.5,606.6,707.7);
		//double d3=str7.peek(System.out::println).map(d->d*d).reduce((x1,x2) -> (x1+x2));
		double d3=str7.peek(System.out::println).map(d->d*d).reduce(0.0, (x1,x2) -> (x1+x2));
		System.out.println(d3);
		System.out.println("------------");
		
		
	}

}
