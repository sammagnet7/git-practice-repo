package sierra.cathy.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparing {

	public static void main(String[] args) {

		List<Book> myList=new ArrayList<>();
		Book b1=new Book(101, 1303,"Java");
		Book b2=new Book(102,1406,"Spring");
		Book b3=new Book(103,807, "Python");

		myList.add(b2);
		myList.add(b1);
		myList.add(b3);
		System.out.println(myList);
		//Collections.sort(myList);
		Collections.sort(myList, (Book a1, Book a2) -> a1.getName().compareTo(a2.getName()));
		System.out.println(myList);
		BookComparator ComparingInt=new BookComparator();
		Collections.sort(myList, ComparingInt);
		System.out.println(myList);
		Collections.sort(myList, (Book a1, Book a2) -> {if(a1.getUniqId()<a2.getUniqId()) return -1; else if(a1.getUniqId()==a2.getUniqId()) return 0; return +1;});
		System.out.println(myList);
		//Arrays.sort(a);

		Object[] objArray=myList.toArray();
		Book[] bArray=new Book[4];
		myList.toArray(bArray);
		System.out.println(objArray.toString()+" "+bArray.toString());
		List<Book> myListfromArray= Arrays.asList(bArray);
		System.out.println(myListfromArray);
	}

}
