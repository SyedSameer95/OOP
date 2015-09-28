
public class Main {

	public static void main(String[] args) {
			
		Shape[] shapeList =  new Shape[7];
	    shapeList[0] = new Circle(3);
	    shapeList[1] = new Rectangle(3,4);
	    shapeList[2] = new Rectangle(5,9);
	    shapeList[3] = new Oval(3,4);
	    shapeList[4] = new Square(2);
	    shapeList[5] = new Triangle(2,1,3,4);
	    shapeList[6] = new Trapezium(2,1,1,2,2);
	    
		for(int i=0;i<shapeList.length;i++){
			System.out.print(shapeList[i].tostring()+" ");
			System.out.print(shapeList[i].area()+" ");
			System.out.println(shapeList[i].perimeter()+ " ");
			System.out.print("Enter Colour for "+shapeList[i].tostring());
			System.out.println(shapeList[i].color());
			System.out.println("--------------------------------------------");
		}


	}

}
