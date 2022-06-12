package Exception;

public class Final_block {
	public static void main(String[] args)
	{
		try {
			int data = 30/5;
			System.out.println(data);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("It will Allways Excecuted if try will give an Error");
		}
	}
}
