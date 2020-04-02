package sierra.cathy.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestSyncCollection {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> list1=new CopyOnWriteArrayList<>();
		List<Integer> list2=new ArrayList<>();
		for(int i=1; i<=100; i++){
			list1.add(i);
			list2.add(i);
		}
		System.out.println(list1);
		
		//For for-each loop modification of the normal collection gives concurrency error. Here we have to use -- 
		//CopyOnWrite Collections so that modification creates new Object not affecting the original one --
		//which we are iterating on.
		for(Integer i:list1){
			System.out.println(i);
			if(i>50){
				list1.remove(i);
			}
		}
		System.out.println(list1);
		System.out.println("------------------------------------------------");
		
		//For traditional for loop modifying inside loop modifies the original Collection object thus creating undesirable res
		System.out.println(list2);
		for(int i=0; i<list2.size(); i++){
			System.out.print(i+" : ");
			System.out.println(list2.get(i));
			if(list2.get(i)>50){
				list2.remove(i);
			}
		}
		System.out.print(list2);
	}

}
