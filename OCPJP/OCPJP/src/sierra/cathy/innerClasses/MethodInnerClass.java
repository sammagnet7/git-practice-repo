package sierra.cathy.innerClasses;

public class MethodInnerClass {
	private String myName ="Soumik";
	private void printMyName(){
		System.out.println(myName);
	}

	public void myMthod2(){
		printMyName();
		class Engine{
			private int engineNum=311;
			protected void myMethod2(){
				System.out.println(engineNum);
				System.out.println(myName);
			}
		}
		Engine e=new Engine();
		e.myMethod2();
		
		
	}
	
	
	
}
