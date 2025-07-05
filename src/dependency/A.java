package dependency;

public class A {
	//instance fields
	
	public A(B bRef) {
		bRef.printName();
		
	}
	
	
	public void print(B bRef) {
		bRef.printName();
	}
	
	public void print() {
		
		B bRef = new B("Tèo");
		bRef.printName();
		
	}

}
