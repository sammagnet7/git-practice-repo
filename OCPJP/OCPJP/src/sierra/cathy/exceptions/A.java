package sierra.cathy.exceptions;

import java.io.EOFException;
import java.sql.SQLException;

public class A implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing Autocloseable A");
		throw new EOFException("Throwing from class A's close method");
		
	}
	
	public void methodA(){
		System.out.println("Running MethodA from class A");
	}
	/*public void methodA1() throws SQLException{
		System.out.println("MethodA1 of A");
		throw new SQLException("throwinh from Class A");
	}
*/
}
