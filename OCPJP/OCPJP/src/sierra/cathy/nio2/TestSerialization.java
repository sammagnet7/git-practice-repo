package sierra.cathy.nio2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		Collar c=new Collar(13);
		//Dog d=new Dog(101,"Rosy",c);
		//d.type="MyMammel";
		Dog d=new Dog(101,"Rosy",c,"MyNewMammel");
		
		System.out.println(d.getName()+" "+d.getNumber()+" "+d.getCollarSize()+" "+d.getType());
		File file=new File("F:/WORKSPACEs/OCPJP/OCPJP/Nio directory/Serialized File.ser");
		try {
			FileOutputStream fos1=new FileOutputStream(file);
			ObjectOutputStream oos1=new ObjectOutputStream(fos1);
			oos1.writeObject(d);
			oos1.close();
			fos1.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis1;
		try {
			fis1 = new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis1);
			Dog d1=(Dog)ois.readObject();
			System.out.println(d1.getName()+" "+d1.getNumber()+" "+d1.getCollarSize()+" "+d1.getType());
			ois.close();
			fis1.close();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
