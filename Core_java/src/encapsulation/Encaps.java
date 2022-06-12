package encapsulation;

public class Encaps {
	
		int yr;
		int model;
		int cost;
		String name;
		
		public void display1() {
		 	  System.out.println("Year of purchase:- " +2019);
		 	  System.out.println("Comapny:- " +"Suzuki");
		   }
		   public void display2() {
		 	  System.out.println("Model:- " +2018);
		 	  System.out.println("Cost:- " +90000);
		   }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Encaps ob1 = new Encaps();
		 	ob1.display1();
		 	ob1.display2();
		}
	}

