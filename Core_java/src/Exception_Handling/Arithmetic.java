package Exception_Handling;

public class Arithmetic {
	public static void main(String[] args)
	{
		int d = 0,a;
		try {
			a = 10/d;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Divided by Zero");
		}
		
	}
}
