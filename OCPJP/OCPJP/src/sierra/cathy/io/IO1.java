package sierra.cathy.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IO1 {

	public static void main(String[] args) {
		//1
		/*File file1=new File("My file1.txt");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.exists());
		try {
			System.out.println(file1.createNewFile());
			System.out.println(file1.getAbsolutePath());
			System.out.println(file1.exists());
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/

		//2
	/*	File file2=new File("My file2.txt");
		try {
			FileWriter pw1=new FileWriter(file2);
			pw1.write("Hi\nHello\nHow are you?");
			pw1.flush();
			pw1.close();
			System.out.println(file2.exists());
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//3
		/*File file3=new File("My file2.txt");
		
		try {
			FileReader fr=new FileReader(file3);
			char[] array1=new char[50];
			System.out.println(fr.read(array1));
			for(char c:array1){
				System.out.print(c);
			}
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//4
		File file4=new File("My file3.txt");
		try {
			FileOutputStream FOS1=new FileOutputStream(file4);
			String s="Hi\nHello\nHow are you?";
			FOS1.write(s.getBytes("UTF-8"));
			FOS1.flush();
			FOS1.close();
			System.out.println(file4.exists());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//5
		File file5=new File("My file3.txt");
		
		try {
			FileInputStream fis=new FileInputStream(file5);
			byte[] array2=new byte[50];
			System.out.println(fis.read(array2));
			for(byte b:array2){
				System.out.print((char)b);
			}
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
