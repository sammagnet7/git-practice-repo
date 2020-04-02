package sierra.cathy;

public class ReturnTest {

	
	public A method(){
		
		
		ReturnTest rt=new ReturnTest();
		return ((A)rt);
	}
	
	public static void methodB(int a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {

		A a=new A(15);
		a.go();
	}

}
