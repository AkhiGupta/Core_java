package Exception_Handling;

public class Nested_Try_Catch {
	public static void main(String[] args)
	{
		try {
			int a = args.length;
			int b = 10/a;
			System.out.println("a="+a);
			
			try {
				if(a==1)
					a = a/(a-a);
				if(a==2) {
					int c[] = {1};
				    c[42] = 99;
				   }
				
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array index out of bound:" +e);
				
				} catch(ArithmeticException e) {
					System.out.println("Divide by 0:" +e);
	       }
		
		} finally {
			System.out.println("Exception Caught");
		
		
		}
	}
}
