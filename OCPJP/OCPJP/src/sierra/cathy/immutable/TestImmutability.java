package sierra.cathy.immutable;

public class TestImmutability {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Hi");
		ImmutableObject ib1=new ImmutableObject(s,13);
		System.out.println(ib1.geti()+"  "+ib1.getsb());
		s.append("hello");
		System.out.println(ib1.geti()+"  "+ib1.getsb());
		

	}

}
