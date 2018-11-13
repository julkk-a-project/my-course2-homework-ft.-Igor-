import javax.swing.JOptionPane;

public class upg4 {

	public static double getDouble(String string) {
		String SDouble = JOptionPane.showInputDialog(string);
		double amount = Double.parseDouble(SDouble);
		return amount;
	}
	public static double area(double x, double y) {
		double area = x*y;
		return area;
	}
	
	public static void main(String[] args) {
		double y = getDouble("How tall (m) is your object?");
		double x = getDouble("How wide (m) is your object?");
		double area = area(x,y);
		JOptionPane.showMessageDialog(null, "It's "+area+"m^2", y+"+"+x+"="+area, 1);

	}

}
