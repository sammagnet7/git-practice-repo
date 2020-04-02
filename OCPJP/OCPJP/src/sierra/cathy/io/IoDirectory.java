package sierra.cathy.io;
import java.io.*;

public class IoDirectory {

	public static void main(String[] args) {

		File fileDirectory1=new File("My directory");
		fileDirectory1.mkdir();
		//file1.delete();
		File file1=new File(fileDirectory1,"My fIle1.txt");
		try {
			PrintWriter pw=new PrintWriter(file1);
			pw.println("My name is: ");
			pw.println("Soumik Dutta");
			pw.flush();
			pw.close();
			System.out.println("------------------------");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try{
			File fileDirectory2=new File("My directory");
			System.out.println(fileDirectory2.isDirectory());
			File file2=new File(fileDirectory2,"My fIle1.txt");
			System.out.println(file2.isFile());
			FileReader fr1=new FileReader(file2);
			BufferedReader br1=new BufferedReader(fr1);
			String s;
			while((s=br1.readLine())!=null){
				System.out.println(s);	
			}
			br1.close();
			fr1.close();
			System.out.println("------------------------");
			
		}catch(IOException e)
		{
			e.printStackTrace();
			
		}
		
			File fileDirectory3=new File("My directory");
			System.out.println(fileDirectory3.isDirectory());
			File file3=new File(fileDirectory3,"My fIle1.txt");
			System.out.println(file3.isFile());
			System.out.println(fileDirectory3.delete());
			
			File file4=new File(fileDirectory3,"My fIle1 renamed.txt");
			System.out.println(file3.renameTo(file4));
			File fileDirectory4=new File("My directory renamed");
			System.out.println(fileDirectory3.renameTo(fileDirectory4));
			
			//Change of order will not rename the file inside.
		/*	System.out.println(fileDirectory4.isDirectory());
			File file4=new File(fileDirectory4,"My fIle1 renamed.txt");
			System.out.println(file3.renameTo(file4));
			*/
			System.out.println("------------------------");
			
			
			File fileDirectory5=new File("src");
			System.out.println(fileDirectory5.isDirectory());
			String[] sArray=fileDirectory5.list();
			for(String s:sArray){
				System.out.println(s);
			}
			System.out.println("------------------------");

	}

}
