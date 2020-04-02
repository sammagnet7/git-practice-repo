package sierra.cathy;

public class MyClass2 extends MyClass1 implements MyInterface1{

	//public int i=20;
	
/*	public void myMethod(){
		System.out.println("Inside MyClass2's myMethod");
		super.method1();		
	}*/
	
/*	public void method1(){
		System.out.println("Inside MyInterface1's method1!");
	}*/
	
	public void method1(){
		//System.out.println("Inside MyClass2's method1!");
		MyInterface1.super.method1();
		super.method1();
	}
	
	
}
