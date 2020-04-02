import java.util.*;

public class TestGenerics {

	public static void main(String[] args) {
		List<Integer> myList=new ArrayList<>();
		//List myList=new ArrayList<Integer>();
		List<Integer> myList2=insert(myList);
		System.out.println(myList2);
		//System.out.println(myList2.get(0).intValue());

	}
	
	public static List insert(List list){
		list.add("hello");
		return list;
	}

}