package sierra.cathy.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonClass sc1=SingletonClass.getInstance();
		SingletonClass sc2=SingletonClass.getInstance();
		SingletonClass sc3=SingletonClass.getInstance();
		
		SingletonEnum se1=SingletonEnum.INSTANCE;
		System.out.println(se1.bookShow("1A"));
		SingletonEnum se2=SingletonEnum.INSTANCE;
		System.out.println(se2.bookShow("1A"));
		SingletonEnum se3=SingletonEnum.INSTANCE;
		//Because there is only one instance of an enum constant
		

	}

}
