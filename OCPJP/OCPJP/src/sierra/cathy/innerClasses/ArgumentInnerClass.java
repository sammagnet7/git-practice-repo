package sierra.cathy.innerClasses;

public class ArgumentInnerClass {

	public static void main(String[] args) {
		AnonymousInnerClass a=new AnonymousInnerClass();
		Dog d=new Dog();
		a.myMethod3(d);
		a.myMethod3(new Dog(){
			public void printKennel(){
				System.out.println("Inside argument");
			}
		});
		
	/*	a.myMethod4(new Animal(){

			@Override
			public void printType() {
				System.out.println("Implementing inside argument");
			}
			
		});*/
		
		a.myMethod4(()-> { System.out.println("Argument animal using Lambda"); System.out.println("Hi");});
		

	}

}
