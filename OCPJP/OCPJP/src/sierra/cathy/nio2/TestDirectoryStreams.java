package sierra.cathy.nio2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestDirectoryStreams {

	public static void main(String[] args) {
		Path p1=Paths.get("F:/WORKSPACEs/OCPJP/OCPJP/Nio directory");
		try {
			DirectoryStream<Path> DS1=Files.newDirectoryStream(p1);
			for(Path p:DS1){
				System.out.println(p.getFileName());
			}
			System.out.println("-----------------------");
			
			DirectoryStream<Path> DS2=Files.newDirectoryStream(p1,"[ST]*");
			for(Path p:DS2){
				System.out.println(p.getFileName());
			}
			System.out.println("-----------------------");
			
			DirectoryStream<Path> DS3=Files.newDirectoryStream(p1,"glob:{P*,S*,T*}");
			for(Path p:DS3){
				System.out.println(p.getFileName());
			}
			System.out.println("-----------------------");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//FileVisitor
		MyFileVisitor mfv=new MyFileVisitor();
		try {
			Files.walkFileTree(p1, mfv);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
