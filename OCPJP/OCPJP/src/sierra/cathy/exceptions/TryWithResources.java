package sierra.cathy.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class TryWithResources {
	
	@SuppressWarnings("finally")
	public static void methodA() throws IOException{
		/*A c=null;
		B d=null;*/
		try(A a=new A();B b=new B()){
			System.out.println("Entering try");
			/*c=new A();
			d=new B();*/
			a.methodA();
			b.methodB();
			throw new RuntimeException("Throwing from try block");
			
		}catch (Exception e) {
			System.out.println("Entering catch");
			System.err.println("Main: "+e.getMessage());
			for(Throwable t:e.getSuppressed()){
				System.err.println("Suppressed : "+t.getMessage());
			}
			throw new SQLException("Throwing from catch block"); //no use as finally's exception overrides it
		}finally{
			System.out.println("Entering finally");
			throw new IOException("Throwing from finally block");
			/*try {
				c.close();
				d.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("Entering main's try block");
			methodA();
		} catch (IOException e) {
			System.out.println("Inside main method's catch block");
			System.err.println(e.getMessage());
			for(Throwable t:e.getSuppressed()){ //no use as no suppressed exceptions are there
				System.err.println(t.getMessage());
			}
		}

	}

}
