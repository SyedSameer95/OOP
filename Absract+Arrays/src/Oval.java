import java.util.Scanner;

public class Oval extends Shape{
	
	public double x,y;

	Scanner scn = new Scanner(System.in);
	
	public Oval (double x, double y)
	{
	super("Oval");
	this.x=x;
	this.y=y;
	}
	public Oval (String ShapeN)
	{
		super(ShapeN);
	}
			
	public double area() 
	{
		return Math.PI*x*y;
	}
	public double perimeter()
	{
		return 2*Math.PI*x*y;
	}
	public String color()
	{
	colour=scn.next();
	return colour;	
	}	
}
