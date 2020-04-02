package sierra.cathy.immutable;

public final class ImmutableObject {
	
	private StringBuilder sb;
	private int i;
	
	public ImmutableObject(StringBuilder s, int x){
		this.sb=new StringBuilder(s);
		this.i=x;
	}
	
	//no setters method will be provided.
	
	public int geti(){
		return this.i;		
	}

	public StringBuilder getsb(){
		StringBuilder sbNew=new StringBuilder(this.sb);
		if(sbNew!=sb){
			System.out.println("Unequal objects!");
		}
		return sbNew;
	}
}
