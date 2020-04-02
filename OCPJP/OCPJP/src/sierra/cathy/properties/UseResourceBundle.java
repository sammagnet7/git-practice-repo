package sierra.cathy.properties;

import java.util.Locale;
import java.util.ResourceBundle;

public class UseResourceBundle {

	public static void main(String[] args) {
		Locale lc=new Locale("pt","IN");
		ResourceBundle rb=ResourceBundle.getBundle("MyLabel", lc);
		System.out.println(rb.getString("Company")+" "+rb.getString("Empid")+" "+rb.getString("Forename"));
		
		Locale lcN=new Locale("en","IN");
		ResourceBundle rbN=ResourceBundle.getBundle("sierra.cathy.properties.MyLabel", lcN);
		System.out.println(rbN.getString("Hi"));
		
		
		Locale lc1=new Locale("pt","IN");
		ResourceBundle rb1=ResourceBundle.getBundle("sierra.cathy.properties.MyLabel",lc1);
		System.out.println(rb1.getObject("Company")+" "+rb1.getObject("Empid")+" "+rb1.getString("Surname")+" "+rb1.getString("College"));
		
		Locale initial=Locale.getDefault();
		System.out.println(initial);
		Locale.setDefault(lc);
		System.out.println(Locale.getDefault());
		Locale.setDefault(initial);
		System.out.println(Locale.getDefault());
		
		Locale lc2=new Locale("pt","US");
		ResourceBundle rb3=ResourceBundle.getBundle("sierra.cathy.properties.MyLabel", lc);
		System.out.println(rb3.getObject("Empid"));
		
		

	}

}
