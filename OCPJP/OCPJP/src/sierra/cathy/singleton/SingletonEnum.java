package sierra.cathy.singleton;

import java.util.*;

public enum SingletonEnum {
	INSTANCE;
	public int count;
	private Set<String> seats=new HashSet<String>();
	
	private SingletonEnum(){
		seats.add("1A");
		seats.add("1B");
		count++; //knock knock as opposed to classes in case of Enums static attributes can not be used inside constructor.
		System.out.println("Creating singleton enum object");
		System.out.println(count);
	
	}
	

	public boolean bookShow(String s){
		return seats.remove(s);
	}
	
}
