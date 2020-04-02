package sierra.cathy.nio2;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path>{
		
	public boolean pathMatches(Path path, String glob){
		PathMatcher pm1=FileSystems.getDefault().getPathMatcher(glob);
		return pm1.matches(path);
	}
	
	public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes FA) throws IOException{
		System.out.println("preVisitDirectory: "+path.getFileName());
		if(pathMatches(path,"glob:{S,T}*")){
			return FileVisitResult.SKIP_SUBTREE;
		}
		if(path.getFileName().toString().equalsIgnoreCase("Dir3")){
			//return FileVisitResult.SKIP_SUBTREE;
			return FileVisitResult.TERMINATE;
		}
		return FileVisitResult.CONTINUE;
		
		
	}
	public FileVisitResult visitFile(Path path, BasicFileAttributes FA)throws IOException{
		System.out.println("VisitFile: "+path.getFileName());
		return FileVisitResult.CONTINUE;
		
		
	}
	public FileVisitResult visitFileFailed(Path path, IOException ie){
		System.out.println("VisitFileFailed: "+path.getFileName());
		return FileVisitResult.CONTINUE;
		
		
	}
	public FileVisitResult postVisitDirectory(Path path, IOException ie){
		System.out.println("postVisitDirectory: "+path.getFileName());
		return FileVisitResult.CONTINUE;
		
		
	}
	

}
