import java.util.Scanner;

public class Rectangle extends Shape {
	public double len;
	public double wid;
			
	Scanner scn = new Scanner(System.in);
	
	public Rectangle (double len, double wid)
	{
		super(" Rectangle");
		this.len=len;
		this.wid=wid;
	}
	public Rectangle (String ShapeN)
	{
		super(ShapeN);
	}
	public double area() 
	{
		return len* wid;
		
	}
	public double perimeter()
	{
		return 2*(len + wid);
	}
	public String color()
	{
	colour=scn.next();
	return colour;	
	}
}
