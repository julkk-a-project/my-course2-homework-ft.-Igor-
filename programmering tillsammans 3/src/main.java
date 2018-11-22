
public class main {

	public static void main(String[] args) {
		Shape s = new Shape();
		s.setCord(2, 69);
		System.out.println(s);
		Shape r = new Rectangle(123, 321, 69, 420);
		System.out.println(r);
		Shape c = new Circle(404, 404, 18);
		System.out.println(c);
		double bob =c.getArea();
		System.out.println(bob);
		Shape[] shapes = {s,r,c};
		for (int i = 0; i < 3; i++) {
			System.out.println("ok");
			System.out.println(shapes[i]);
		}
		
	}

}
