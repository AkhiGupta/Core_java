package Exception_Handling;

public class without_Exception {
	public static void main(String[] args)
	{
		try {
			int num[] = {22,33,43,53,11,2};
			System.out.println(num[10]);
			
		}catch(Exception e) {
			System.out.println("Element Doesn't Exist");
			
		}
		System.out.println("Welcome to Eclipse");
	}
}
