package dependency;

public class App {

	public static void main(String[] args) {
		B bRef = new B("Tý");
		
		A aRef = new A(bRef);
		aRef.print(bRef);
		
		aRef.print();
	}

}
