package sierra.cathy.innerClasses;

public class AnonymousInnerClass {
	
	private double version=1.0;
	public Dog dogNormal=new Dog();
	public Dog dogAnonymous=new Dog(){
		private String breed="new kennel";
		
		public void printKennel(){
			System.out.println(breed);
		}
	};
	
	public void myMethod3(Dog d){
		d.printKennel();
	}
	/*
	public Animal a=new Animal(){

		@Override
		public void printType() {

			System.out.println("Anonymous animal");
			
		}
		
	};*/
	
	//Example of Lambda expression
	public Animal a=()->System.out.println("Anonymous animal using Lambda");
	
	public void myMethod4(Animal an){
		an.printType();
	}
	

	public static void main(String[] args) {
		
		AnonymousInnerClass aic=new AnonymousInnerClass();
		aic.myMethod3(aic.dogNormal);
		aic.myMethod3(aic.dogAnonymous);
		aic.myMethod4(aic.a);
		
	}

}
