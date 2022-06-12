package Super;

class Person{
	int id;
	String name;
	
	Person(int id,String name) //constructor
	{
		this.id = id;
		this.name = name;
	}
}

class Employee extends Person{
	float salary;
	Employee(int id,String name,float salary)
	{
		super(id,name);
		this.salary = salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
public class Super_keyword {
	public static void main(String[]args)
	{
		Employee obj = new Employee(1,"Akhilesh_Gupta",1000.50f);
		obj.display();
	}
}
