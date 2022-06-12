package Inheritancee;


class Parent{
	void bike() {
		System.out.println("bike");
	}
}
class Child extends Parent{
	void cycle(){
		System.out.println("Cyclingg");
	}
}

public class single {
	
	public static void main(String[]args)
	{
		Child obj = new Child();
		obj.bike();
		obj.cycle();
	}
		
}

