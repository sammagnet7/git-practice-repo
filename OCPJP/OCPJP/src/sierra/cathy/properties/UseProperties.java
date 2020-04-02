package sierra.cathy.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class UseProperties {

	public static void main(String[] args) {

		Properties p1=new Properties();
		p1=System.getProperties();
		p1.setProperty("Name", "Soumik");
		p1.list(System.out);
		
		
		
		Properties p2=new Properties();
		p2.setProperty("Forename", "Soumik");
		p2.setProperty("Surname", "Dutta");
		p2.list(System.out);
		
		try{
			FileOutputStream out=new FileOutputStream("MyProperties.props");
			p2.store(out, "It is my first properties file");
			out.close();
			
		}catch(IOException e){
			System.out.println(e);
			
		}
		
		
		
		Properties p3=new Properties();
		try{
			FileInputStream in=new FileInputStream("MyProperties.props");
			p3.load(in);
			p3.list(System.out);
			p3.setProperty("EmpId", "1334352");
			p3.put("Company", "TCS"); //As Properties class implements Hashtable, here using Hashtable method also works.
			p3.list(System.out);
			FileOutputStream out1=new FileOutputStream("MyUpdated.props");
			//FileOutputStream out1=new FileOutputStream("MyProperties.props");
			p3.store(out1, "Updated properties as follows");
			in.close();
			out1.close();
			System.out.println(p3.getProperty("Forename"));
		}catch(IOException e){
			System.out.println(e);
		}

	}

}
