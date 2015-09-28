import java.util.Scanner;

public class Triangle extends Shape {
	
	public double b,h,a,c;
	
	Scanner scn = new Scanner(System.in);
	public Triangle (double b, double h, double a, double c)
	{
		super("Triangle");
		this.b=b;		this.h=h;		this.a=a;		this.c=c;
	}
	public double area()
	{
	return ((b*h)/2);
	}
	public double perimeter()
	{
	return a+b+c;
	}
	public String color()
	{
		colour=scn.next();
		return colour;	
	}
}
