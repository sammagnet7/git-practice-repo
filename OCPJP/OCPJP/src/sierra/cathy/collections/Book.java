package sierra.cathy.collections;

public class Book implements Comparable<Book>{
	
	int page;
	int uniqId;
	String name;
	
	public Book(int page, int uniqId, String name) {
		super();
		this.page = page;
		this.uniqId = uniqId;
		this.name = name;
	}
	

	
	public int getUniqId() {
		return uniqId;
	}



	public void setUniqId(int uniqId) {
		this.uniqId = uniqId;
	}



	public int getPage() {
		return page;
	}



	public void setPage(int page) {
		this.page = page;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	


	@Override
	public String toString() {
		return "Book [page=" + page + ", uniqId=" + uniqId + ", name=" + name + "]";
	}



	@Override
	public int compareTo(Book o) {
		return this.name.compareTo(o.name);
	}

}
