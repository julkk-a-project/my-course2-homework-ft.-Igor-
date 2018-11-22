

public class Circle extends Shape {
	
	protected double radius;
	
	public Circle(int xx, int yy, double r) {
		x = xx;
		y = yy;
		radius = r;
	}
	
	public String toString() {
		double area = getArea();
		return "I am a Circle, i am the "+totalSelf+"th of my kind. my radius is "+radius+", which makes me as large as "+area+". My cordinates are "+x+", "+y+".";
	}
	public double getArea() {
		return Math.PI*(radius*radius);
	}

}
