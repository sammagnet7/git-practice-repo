package sierra.cathy.nio2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog extends Animal implements Serializable{
	
	public int number;
	public String name;
	transient private Collar col;
	
	/*Dog(int n, String s){
		this.number=n;
		this.name=s;		
	}*/
	Dog(int n, String s, Collar c){
		this.number=n;
		this.name=s;
		this.col=c;
	}
	Dog(int n, String s, Collar c,String t){
		super(t);
		this.number=n;
		this.name=s;
		this.col=c;
	}
	
	public int getNumber(){
		return number;
	}

	public String getName(){
		return name;
	}
	
	public int getCollarSize(){
		return this.col.size;
	}
	public String getType(){
		return this.type ;
	}
	
	
	private void writeObject(ObjectOutputStream o){
		try {
			o.defaultWriteObject();
			o.writeInt(this.getCollarSize());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void readObject(ObjectInputStream i){
		try {
			i.defaultReadObject();
			int a=i.readInt();
			this.col=new Collar(a);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
