package entities;

public class Triangle {
	 public double a;
	 public double b;
	 public double c;
	 double result;
	 
	 public double area() {
		 double p = (a + b + c) / 2.00;
		 return result = Math.sqrt(p * (p - a) * (p -b) * (p -c));
	 }
}
