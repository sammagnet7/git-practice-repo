package sierra.cathy.collections;

import java.util.*;

import com.sun.javafx.collections.MappingChange.Map;

public class TestMap {

	public static void main(String[] args) {

		TreeMap<String, String> myMap=new TreeMap<String,String>();
		myMap.put("A","Ambar");
		myMap.put("G","Gabbar");
		myMap.put("S","Srijoni");
		myMap.put("J","Jobber");
		myMap.put("J","Akbor"); //Overrides the previous duplicate key value pair
		
		System.out.println(myMap);
		System.out.println("----");
		
		SortedMap<String, String> mySubMap1=myMap.subMap("G", "S");
		System.out.println(mySubMap1);
		SortedMap<String, String> mySubMap2=myMap.subMap("G", true, "S", false);
		System.out.println(mySubMap2);
		System.out.println("----");
		
		SortedMap<String, String> mySubMap3=myMap.headMap("G");
		System.out.println(mySubMap3);
		SortedMap<String, String> mySubMap4=myMap.headMap("G", false);
		System.out.println(mySubMap4);
		System.out.println("----");
		
		SortedMap<String, String> mySubMap5=myMap.tailMap("J");
		System.out.println(mySubMap5);
		SortedMap<String, String> mySubMap6=myMap.tailMap("J", true);
		System.out.println(mySubMap6);
		System.out.println("----");
		
		String s1=myMap.floorKey("G");
		System.out.println(s1);
		System.out.println("----");
		String s2=myMap.ceilingKey("J");
		System.out.println(s2);
		System.out.println("----");
		
		String s3=myMap.lowerKey("G");
		System.out.println(s3);
		System.out.println("----");
		String s4=myMap.higherKey("J");
		System.out.println(s4);
		System.out.println("----");
	}

}
