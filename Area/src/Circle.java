
public class Circle extends Shape {

	public int radius;
	
	public Circle (int rad, String name)
	{
		super (name);
		this.radius=rad;
	}
	
	public double area()
	{
		return (Math.PI*radius*radius);
	}
}
