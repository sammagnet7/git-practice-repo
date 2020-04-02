package sierra.cathy.exceptions;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

public class B implements Closeable{

	@Override
	public void close() throws IOException {
		System.out.println("Closing Closeable B");
		throw new EOFException("Throwing from class B's close method");
		
	}
	
	public void methodB(){
		System.out.println("Running MethodB from class B");
	}
	/*public void methodB1() throws SQLException{
		System.out.println("MethodB1 of B");
		throw new SQLException("throwinh from Class B");
	}*/

}
