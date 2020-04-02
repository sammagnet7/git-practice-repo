package sierra.cathy.singleton;

public class SingletonClass {
	
	private static SingletonClass sc;
	public static int count;
	
	private SingletonClass(){
		count++;
		System.out.println("creating singleton object");
		System.out.println(count);
	}

	public static SingletonClass getInstance(){
		if(sc==null){
			sc=new SingletonClass();		
		}
		return sc;
	}
}
