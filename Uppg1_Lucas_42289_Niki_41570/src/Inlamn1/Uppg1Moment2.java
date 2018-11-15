package Inlamn1;

import javax.swing.JOptionPane;

public class Uppg1Moment2 {
	public static double getDiameter() {
	double diameter = Double.parseDouble(JOptionPane.showInputDialog("Cirkelns diameter i cm?"));//usern anger cirkelns diametern i cm och det konverteras från en sträng till int
	return diameter;                                                                                 
	}
	public static double getArea(double diameter) { //beräknar arean och avrundar arean till ett tal med 2 decimaler
		double radie = diameter / 2;
		double area = 3.14159265359 * Math.pow(radie, 2);
		double roundedArea = Math.round(area * 100d) / 100d;
		return roundedArea;
	}
	public static double getOmkrets(double diameter) { //beräknar omkretsen och avrundar omkretsen till ett tal med 2 decimaler
		double radie = diameter / 2;
		double omkrets = 2 * 3.14159265359 * radie;
		double roundedOmkrets = Math.round(omkrets * 100d) / 100d;
		return roundedOmkrets;
	}
	public static void main(String[] args) {
		double diameter = getDiameter(); //anropar getDiameter
		double omkrets = getOmkrets(diameter); //anropar getOmkrets
		double area = getArea(diameter); //anropar getArea
		JOptionPane.showMessageDialog(null, "Cirkelns area ar " + area + " kvadrat cm.\nCirkelns omrets ar " + omkrets + " cm.");//ger arean och omkretsen åt usern
		
	}

}