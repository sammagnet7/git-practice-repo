package sierra.cathy.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class TestRandom {

	class Random implements AutoCloseable{

		@Override
		public void close() throws Exception {
			throw new IOException("From A");
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		TestRandom t=new TestRandom();
		try(Random a=t.new Random()){
			throw new IOException("From Main try block");
//		} catch (IOException e) {	 //Gives compiler error. 
		} catch (Exception e) {		//Exception class must be compatible with try with resources' exception
			//e.printStackTrace();
			System.err.println(e.getMessage());
			for(Throwable th:e.getSuppressed()){
				//th.printStackTrace();
				System.err.println(th.getMessage());
			}
		}

	}

}
