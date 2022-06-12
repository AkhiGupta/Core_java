package Exception_Handling;

public class Examp1 {
	public static void main(String[] args)
	{
		try {
			int a = 0;
			System.out.println("a="+a);
			int b =22/a;
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by 0" +e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Divided by 0" +e);
		}
		catch(Exception e)
		{
			System.out.println("Exception+e"+e);
		}
		System.out.println("Exc");
	}
}
