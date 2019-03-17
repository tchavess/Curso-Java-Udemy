package course;

public class Rectangle {
	public double widght;
	public double height;
	
	public double area() {
		double a = widght * height;
		return a;
	}
	 public double perimeter() {
		 double p = (2 * widght)+(2 * height);
		 return p;
		 
	 }
	 
	 public double diagonal() {
		 double c= Math.sqrt((widght * widght) + (height * height));
		 return c;
		 
	 }
	
}

