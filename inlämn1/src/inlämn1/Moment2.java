package inl�mn1;

import javax.swing.JOptionPane;

public class Moment2 {
	public static double getDiameter() {
	double diameter = Double.parseDouble(JOptionPane.showInputDialog("Cirkelns diameter i cm?"));
	return diameter;
	}
	public static double getArea(double diameter) {
		double radie = diameter / 2;
		double area = 3.14159265359 * Math.pow(radie, 2);
		double roundedArea = Math.round(area * 100d) / 100d;
		return roundedArea;
	}
	public static double getOmkrets(double diameter) {
		double radie = diameter / 2;
		double omkrets = 2 * 3.14159265359 * radie;
		double roundedOmkrets = Math.round(omkrets * 100d) / 100d;
		return roundedOmkrets;
	}
	public static void main(String[] args) {
		double diameter = getDiameter();
		double omkrets = getOmkrets(diameter);
		double area = getArea(diameter);
		JOptionPane.showMessageDialog(null, "Cirkelns area �r " + area + " kvadrat cm.\nCirkelns omrets �r " + omkrets + " cm.");
		
	}

}