package sierra.cathy.io;

import java.io.Console;

//Important note: This class needs to be run from cmd as because here in eclipse no console object is present.
public class TestConsole {

	public static void main(String[] args) {
		
		String s=null;
		char[] chAr;
		
		Console c=System.console();
		chAr=c.readPassword("%s", "pw: ");
		for(char ch:chAr){
			c.format("%c", ch);			
		}
		c.format("\n");
		
		int counter=5;
		while(counter>0){
			s=c.readLine("%s","Input: ");
			c.format("Output: %s %s\n", "Hi",s);
			counter--;
			
			
		}
		
		

	}

}
