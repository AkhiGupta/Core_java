package Abstractions;

abstract class atm
{
	abstract void withdraw();
}
public class abstractionss {
	void withdraw() {
    	System.out.println("Withdraw Sucessfully");
    }
	public static void main(String[] args) 
	{
		abstractionss obj1 = new abstractionss();
		obj1.withdraw();

	}
}
