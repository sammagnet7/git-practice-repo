package sierra.cathy.collections;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{
	

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		if(o1.getPage()<o2.getPage())	return -1;
		else if(o1.getPage()==o2.getPage()) return 0;
		else return +1;
	}

}
