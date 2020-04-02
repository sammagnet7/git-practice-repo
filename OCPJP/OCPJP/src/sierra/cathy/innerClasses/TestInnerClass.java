package sierra.cathy.innerClasses;

public class TestInnerClass {
	
	

	public static void main(String[] args) {
		Car c=new Car();
		c.myMethod1();
		Car.Wheel cw=new Car().new Wheel();
		cw.myMethod1();
		
		
		MethodInnerClass mic=new MethodInnerClass();
		mic.myMthod2();
	}

}
