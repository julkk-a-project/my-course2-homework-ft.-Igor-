
public class Shape {
	protected int x;
	protected int y;
	public static int total = 0;
	protected int totalSelf;
	
	public Shape() {
		 total += 1;
		 totalSelf = total;
	 }
	
	public int getX() {
		return this.x;
	}
	public int getY () {
		return this.y;
	} 
	
	public double getArea() {
		return 0;
	}
	
	public void setCord(int xx,int yy) {
		x = xx;
		y = yy;
	}
	
	public String toString() {
		return "I am a Shape, i am the "+totalSelf+"th of my kind, and my cordinates are "+x+", "+y+". there are "+total+" of us.";
	}
	
	
	
}
