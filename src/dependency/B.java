package dependency;

public class B {
	private String name;
	
	public B(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Name: " + this.name);
	}

}
