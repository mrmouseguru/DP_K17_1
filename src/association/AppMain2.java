package association;

public class AppMain2 {

	public static void main(String[] args) {
		//khai báo biến tham chiếu 
		B bRef; //bước 1;
		//khởi tạo object class B trong heap
		//bước 3: bRef chứa giá trị tham chiếu
		bRef =     new B("Tèo");//bước 2
		
		//dùng biến tham chiếu bRef
		//để send message đến hành vi 
		//printName của object class B
		//bRef.printName();
		//******TẠO object class A
		A aRef;//bước 1
		//bước 2
		//aRef = new A(bRef);
		aRef = new A();
		//send message
		aRef.setBRef(bRef);
		aRef.print();
		

	}

}
