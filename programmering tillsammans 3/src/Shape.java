
public class Shape {
	protected int x;
	protected int y;
	
	
	public int[] getCords() {
		int[] list = {x,y};
		return list;
	}
	
	public double getArea() {
		return 0;
	}
	
	public void setCord(int xx,int yy) {
		x = xx;
		y = yy;
	}
	
	public String toString() {
		return "I am a Shape and my cordinates are "+x+", "+y+".";
	}
	
	
}
