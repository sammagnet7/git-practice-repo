package sierra.cathy.collections;

public class TestMyGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyGenericClass<String, Integer> MGC=new MyGenericClass<String,Integer>("Soumik", 101);
		
		System.out.println(MGC.getInstance());
		System.out.println(MGC.getNum());
		System.out.println(MGC.getList((float)(0.15)));

	}

}
