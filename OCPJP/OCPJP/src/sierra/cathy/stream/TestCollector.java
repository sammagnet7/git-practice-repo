package sierra.cathy.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollector {

	public static void main(String[] args) {

		try(Stream s1= Files.lines(Paths.get("F:/WORKSPACEs/OCPJP/OCPJP/src/DogList.txt"))){
			
			//s1.forEach(System.out::println);
			List<Dog> list=(List<Dog>) s1.map(lines -> {String[] dogItems = ((String) lines).split("/");
			Dog dog=new Dog(Integer.parseInt(dogItems[0]),dogItems[1]);
			return dog;}).collect(Collectors.toList());
			
			list.forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
