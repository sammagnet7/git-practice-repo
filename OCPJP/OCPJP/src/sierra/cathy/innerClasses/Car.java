package sierra.cathy.innerClasses;

public class Car {

	private int carKey=13;
	
	
	public int getCarKey() {
		return carKey;
	}

	public void setCarKey(int carKey) {
		this.carKey = carKey;
	}
	
	public void myMethod1(){
		System.out.println("Inside outer class Car");
		Wheel w=new Wheel();
		w.myMethod1();
		
	}


	public class Wheel{

		public int WheelNum=133;
		
		//here inner class accessing closer class' private method
		public int myCarKey(){
			return carKey;
		}
		public void myMethod1(){
			System.out.println("Inside inner class Wheel");
			System.out.println(this.WheelNum);
			System.out.println(Car.this.carKey);
		}

		public int getWheelNum() {
			return WheelNum;
		}

		public void setWheelNum(int wheelNum) {
			WheelNum = wheelNum;
		}
		
	}
}
