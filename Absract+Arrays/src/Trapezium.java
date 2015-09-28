
import java.util.Scanner;

public class Trapezium extends Shape {
	
	public double a,b,h,c,d;
	
	Scanner scn = new Scanner(System.in);
	
	public Trapezium (double a, double b,double c, double d, double h)
	{
		super("Trapezium");
		this.a=a; this.b=b; this.c=c; this.d=d; this.h=h;
	}
	public double area()
	{
		return ((a+b)/2)*h;
	}
	public double perimeter()
	{
		return a+b+c+d;
	}
	public String color()
	{
	colour=scn.next();
	return colour;	
	}

}
