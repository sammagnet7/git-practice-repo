package sierra.cathy.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Nio2Tester {

	public static void main(String[] args) {
		
		//Path pu=Paths.get("file:///c:/temp.");
		Path p1=Paths.get("F:/WORKSPACEs/OCPJP/OCPJP/Nio directory1");
		Path f1=Paths.get("F:","WORKSPACEs","OCPJP","OCPJP","Nio directory1","Nio file1.txt");
		Path p2=Paths.get("/Nio directory2");	//creating file at relative path F:
		Path f2=Paths.get("/Nio directory2/Nio file2.txt");
		Path p3=Paths.get("F:/WORKSPACEs/OCPJP/OCPJP/Nio directory3/sub dir1/sub dir2");
		Path f3=Paths.get("F:/WORKSPACEs/OCPJP/OCPJP/Nio directory3/sub dir1/sub dir2/file inside.txt");
		Path f4=Paths.get("F:/WORKSPACEs/OCPJP/OCPJP/Nio directory3/sub dir1/sub dir2/file inside2.txt");
		Path f5=Paths.get("F:/WORKSPACEs/OCPJP/OCPJP/Nio directory3/sub dir1/sub dir2/file inside3.txt");
		
		
		
//		try {
		/*	Files.createDirectory(p1);
			Files.createFile(f1);*/
/*			Files.createDirectory(p2);
			Files.createFile(f2);
			System.out.println(p2.getFileName());
			System.out.println(p2.getParent());
			System.out.println(p2.getRoot());*/
			
			/*Files.createDirectories(p3);
			Files.createFile(f3);
			Files.createFile(f4);
			Files.createFile(f5);
			*/
			
			//System.out.println(Files.copy(f3, f4));
			//System.out.println(Files.deleteIfExists(f4));
			//System.out.println(Files.copy(f3, f4));
			//System.out.println(Files.move(f3, f5));
			//System.out.println(Files.move(f3, f5, StandardCopyOption.REPLACE_EXISTING));
			
		
			
			
			
			
			
			
			
//		} catch (IOException e) {
//			e.printStackTrace();
	//	}

		System.out.println(f5.getFileName());
		System.out.println(f5.getNameCount());
		System.out.println(f5.getName(2));
		System.out.println(f5.getParent());
		System.out.println(f5.getRoot());
		System.out.println(f5.toString());
		System.out.println(f5.subpath(0, 3));
	
	
	}

}
