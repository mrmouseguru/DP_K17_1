package association;

public class A {
	
	private  B bRef;//instance field/instance variable
	//biến bRef chứa giá trị tham chiếu
	//để điều khiển object class B
	//private static B bRef; static field
	
	public A(B _bRef) {
		//instance field   //giá trị tham chiếu của object B
		this.bRef =         _bRef;
	}
	
	public A() {
		
	}
	
	public void print()
	{
		//
		//System.out.println("AAA ....");
		//sử dụng biến bRef để gửi thông điệp
		//đến hành vi printName() của object class B
		bRef.printName();
	}
	
	public void setBRef(B _bRef) {
		this.bRef = _bRef;
	}
	

}
