package Inheritancee;
class One{
	void disp() {
		System.out.println("One");
	}
}
class Two extends One{
	void disp1() {
		System.out.println("Two");
	}
}
class Three extends One{
	void disp2() {
		System.out.println("Three");
	}
}
class Four extends One{
	void disp3() {
		System.out.println("Four");
	}
}

public class Hierachal_Inheritances {
	public static void main(String[]args)
	{
		Four obj1 = new Four();
		obj1.disp();
		obj1.disp3();
		
		Three obj2 = new Three();
		obj2.disp();
		obj2.disp2();
		
		Two obj3 = new Two();
		obj3.disp();
		obj3.disp1();
	}
}
