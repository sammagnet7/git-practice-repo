package sierra.cathy;

public class A extends ReturnTest{
	public int a;
	
	A(int a){
		this.a=a;
	}
	
	void go(){
		methodB(a);
		
	}

}
