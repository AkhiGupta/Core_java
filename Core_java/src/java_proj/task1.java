package java_proj;

public class task1 {
	int account;
	String Title;
	String Author;
	void input() {
		Title = "REma";
		Author = "Akhi";
		account = 10;
		
	}
	void compute() {
		int days =5;
		int fine = days*4;
		System.out.println("Fine = Rs."+fine);
		
	}
	void display()
	{
		System.out.println("Accession\tTitle\tAuthor");
		System.out.println(account+ "\t\t"+ Title+ "\t"+ Author);
	}
	public static void main(String[] args)
	{
		task1  ob=  new task1();
		ob.input();
		ob.compute();
		ob.display();
	}
}
