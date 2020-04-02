package sierra.cathy.myenum;

public class Vacation {

	public static void main(String[] args) {

		final DaysOff input= DaysOff.INDEPENDENCEDAY;
		//System.out.println(input);
		
		switch(input){
		default:
	//	case DaysOff.INDEPENDENCEDAY : System.out.println("1");		will not compile
		case INDEPENDENCEDAY : System.out.println("1");
		//default: System.out.println("default");
		case REPUBLICDAY : System.out.println("2");
		}

	}

}
