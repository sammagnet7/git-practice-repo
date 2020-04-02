package sierra.cathy.nio2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;

public class TestWatcher {

	public static void main(String[] args) {
		Path p1=Paths.get("F:/WORKSPACEs/OCPJP/OCPJP/Nio directory");
		
		try {
			WatchService watch= FileSystems.getDefault().newWatchService();
			p1.register(watch, ENTRY_DELETE);
			WatchKey key=null;
			
			while(true){
				try {
					key=watch.take();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				for(WatchEvent<?> event: key.pollEvents()){
					WatchEvent.Kind<?> kind=event.kind();
					System.out.println(kind.name()+" "+kind.type()+" "+event.context());
					
					if(event.context().toString().equalsIgnoreCase("Dir1")){
						System.out.println("delete done");
						return;
					}
					
				}
				key.reset();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
