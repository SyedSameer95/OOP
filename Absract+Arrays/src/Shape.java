
public abstract class Shape {
	
	public String ShapeN,colour;
	
	
	public Shape (String name)
	{
		ShapeN = name;
	}
	
	 public abstract double area();
	 public abstract double perimeter();
	 public abstract String color();

	 public String tostring()
	 {
		 return ShapeN;
	 }
	 
}


