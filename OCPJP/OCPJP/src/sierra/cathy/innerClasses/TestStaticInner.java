package sierra.cathy.innerClasses;

import sierra.cathy.innerClasses.StaticInnerClass.MyClass;
import sierra.cathy.innerClasses.StaticInnerClass.MyStaticClass;

public class TestStaticInner {

	public static void main(String[] args) {

		StaticInnerClass si=new StaticInnerClass();
		si.myMethod();
		//StaticInnerClass.MyStaticClass ms1=si.new MyStaticClass();   //will not compile
		//StaticInnerClass.MyStaticClass ms1=si.MyStaticClass();   //will not compile
		StaticInnerClass.MyStaticClass ms=new StaticInnerClass.MyStaticClass();
		ms.printNum();
		
		StaticInnerClass.MyStaticClass m1=new StaticInnerClass.MyStaticClass();
		StaticInnerClass.MyStaticClass m2=new MyStaticClass();
		MyStaticClass m3=new MyStaticClass();
		StaticInnerClass.MyClass mc=new StaticInnerClass().new MyClass();
		MyClass mc2=new StaticInnerClass().new MyClass();
		//MyClass mc3=new MyClass(); //will not compile
		
		System.out.println("====================");
		StaticInnerClass.method();
	}

}
