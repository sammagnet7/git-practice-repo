package sierra.cathy;

public class TestCar {

	public static void main(String[] args) {
		
		Car c=new Car();
		BMW bmw=new BMW();
		System.out.println(c.modelNo +" "+ bmw.modelNo);
		System.out.println(c.type +" "+ bmw.type);
		System.out.println(Car.type +" "+BMW.type);
		c.methodInst();
		c.methodStat();
		Car.methodStat();
		bmw.methodInst();
		bmw.methodStat();
		BMW.methodStat();
		

	}

}
