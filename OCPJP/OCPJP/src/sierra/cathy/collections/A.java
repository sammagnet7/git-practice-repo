package sierra.cathy.collections;

public class A {
	int no;
	
	A(){
		
	}
	A(int num){
		no=num;
	}
	public boolean equals(Object o){
		if(o instanceof A && ((A)o).no==this.no){
			return true;
		}
		return false;
	}
	
	
	

}
