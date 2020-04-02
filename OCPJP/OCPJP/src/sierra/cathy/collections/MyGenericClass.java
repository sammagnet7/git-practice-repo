package sierra.cathy.collections;

import java.util.*;

public class MyGenericClass<T,U>{
	
	T instance;
	U num;
	
	
	public MyGenericClass(T instance, U num) {
		super();
		this.instance = instance;
		this.num = num;
	}

	public T getInstance() {
		return instance;
	}

	public void setInstance(T instance) {
		this.instance = instance;
	}

	public U getNum() {
		return num;
	}

	public void setNum(U num) {
		this.num = num;
	}
	
	public <Z> List<Z> getList(Z x){
		List<Z> list=new ArrayList<Z>();
		list.add(x);
		return list;
	}
	
	
	
	
	

}
