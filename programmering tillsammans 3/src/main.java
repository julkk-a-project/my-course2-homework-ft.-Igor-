

public class main {

	public static void main(String[] args) {
		Shape s = new Shape();
		s.setCord(2, 69);
		System.out.println(s);
		System.out.println(Shape.total);
		Shape r = new Rectangle(123, 321, 69, 420);
		System.out.println(r);
		Shape c = new Circle(404, 404, 18);
		System.out.println(c);
		System.out.println(Shape.total);
		double bob =c.getArea();
		System.out.println(bob);
		Shape s2 = new Shape();
		Shape s3 = new Shape();
		Shape[] shapes = {s,s2,s3,r,c};
		for (int i = 0; i < 3; i++) {
			System.out.println(shapes[i]);
		}
		System.out.println(Shape.total);
		
	}

}
