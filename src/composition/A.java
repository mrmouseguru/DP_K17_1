package composition;

public class A {
	//instance fields
	private B bRef;
	
	public A() {
		bRef = new B("Tèo");
	}
	public void print() {
		bRef.printName();
	}

}
