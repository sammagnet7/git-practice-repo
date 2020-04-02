package sierra.cathy.lambda;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TestingFunction {

	public static void main(String[] args) {
		
		Function<Integer,String> f1 = (i) -> {if(i==42) return "forty two"; else return "unkonown";};
		System.out.println(f1.apply(42));
		
		BiFunction<Integer, Integer, String> bf1= (i1,i2)-> {if(i1==i2) return "equal"; else return "not equal";};
		System.out.println(bf1.apply(42, 42));
		
		
		Map<String, String> mp1=new TreeMap<String, String>();
		mp1.put("Hi","Hello");
		//mp1.replaceAll(function);
		//mp1.computeIfAbsent(key, mappingFunction)

		//UnaryOperator<Double> log2= 
		
		
	}
	
	
}
