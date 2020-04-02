package sierra.cathy.innerClasses;

public class StaticInnerClass {
	
	private double version=1.0;
	private static int classNum=1;

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}
	public void myMethod(){
		StaticInnerClass.MyStaticClass m1=new StaticInnerClass.MyStaticClass();
		StaticInnerClass.MyStaticClass m2=new MyStaticClass();
		MyStaticClass ms=new MyStaticClass();
		ms.printNum();
		MyClass mc=new MyClass();
	}

	
	static class MyStaticClass{
		public int num=103;
		double version=5.0;
		static int classNum=5;
		public void printNum(){
			System.out.println(num);
			//System.out.println(version);
			System.out.println(classNum);
		}
		
	}
	MyStaticClass member=new MyStaticClass();
	MyClass member2=new MyClass();
	
	
	public static void method(){
		StaticInnerClass.MyStaticClass m1=new StaticInnerClass.MyStaticClass();
		StaticInnerClass.MyStaticClass m2=new MyStaticClass();
		
		MyStaticClass m3=new MyStaticClass();
		StaticInnerClass sic= new StaticInnerClass();
	//	System.out.println(sic.m3.classNum);	will not compile
		System.out.println(sic.member.version);
		System.out.println(sic.member.classNum);
		System.out.println("-------------------");
		System.out.println(sic.member.toString());
		System.out.println(sic.member2.toString());
		System.out.println("-------------------");
		
		StaticInnerClass.MyClass mc=new StaticInnerClass().new MyClass();
		MyClass mc2=new StaticInnerClass().new MyClass();
		
		StaticInnerClass inC=new StaticInnerClass();
		System.out.println(inC.version);
		System.out.println(inC.classNum);
		System.out.println(StaticInnerClass.classNum);
	//	System.out.println(StaticInnerClass.version); will not compile as non-static fields are not accessible by class name
		
		System.out.println(m3.version);
		System.out.println(m3.classNum);
		System.out.println(MyStaticClass.classNum);
	//	System.out.println(MyStaticClass.version);	will not compile as non-static fields are not accessible by class name
	}
	
	class MyClass{
		
	} 	//will not compile

/*	static class MyClass{
		
	}*/
	
}
