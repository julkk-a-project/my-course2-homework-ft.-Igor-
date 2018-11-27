
public class Rectangle extends Shape {

	protected int width;
	protected int height;
	
	
	public Rectangle(int xx, int yy, int w, int h) {
		x = xx;
		y = yy;
		width = w;
		height = h;
	}
	
	public String toString() {
		double area = getArea();
		return "I am a Rectangle, i am the "+totalSelf+"th of my kind, I am "+width+" wide and "+height+" high, which makes me as large as "+area+". My cordinates are "+x+", "+y+".";
	}
	public double getArea() {
		return width*height;
	}

}
