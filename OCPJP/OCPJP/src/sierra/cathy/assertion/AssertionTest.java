package sierra.cathy.assertion;

public class AssertionTest {

	public static void main(String[] args) {
		go(15);

	}
	//You need to use -enableassertions
	//and to disable for this perticular class use--> -enableassertions -da:sierra.cathy.assertion.AssertionTest
	private static void go(int x){
		assert(x<15):getMessage()+" and Argument is: "+x;
		System.out.println("Method completes");
		
	}
	public static String getMessage(){
		return "argument is not less than 15";
	}

}
