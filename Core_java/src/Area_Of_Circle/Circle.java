package Area_Of_Circle;


class demo{
	static double Pi = Math.PI;
	
	 void Area(double r) {
		 double a = Pi*r*r;
		 System.out.println("The Area Of The Circle Is : "+ a);
	 }
	 
	 void Area(float r) {
		 float a = (float)Pi*r*r;
		 System.out.println("The Area Of The Circle in float Is : "+ a);
	 }
	 }
	 
	 


public class Circle {

	public static void main(String[] args) {
		demo  obj = new demo();
		obj.Area(3);
		obj.Area(3.5);
	}

}
