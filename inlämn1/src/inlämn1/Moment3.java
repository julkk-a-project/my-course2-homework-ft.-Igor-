package inlämn1;

import javax.swing.JOptionPane;

public class Moment3 {
	public static double getWeight(){
		double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "insert your weigth in kg." ));
		return weight;
	}
	public static double getLength(){
		double length = Double.parseDouble(JOptionPane.showInputDialog(null, "insert your length in cm"));
		double powLength = Math.pow((length / 100), 2);
		return powLength;
	}
	public static double getBmi(){
		double weight = getWeight();
		double length = getLength();
		double bmi = Math.round((weight / length) * 10d) / 10d;
		return bmi;
	}
	public static String sort(double bmi) {
		if (bmi < 18.5) {
			return "Undervikt";
		}else if (bmi < 25) {
			return "Normalvikt";
		}else if (bmi < 30) {
			return "Övervikt";
		}else {
			return "Fetma";
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bmi = getBmi();
		String sortedBmi = sort(bmi);
		JOptionPane.showMessageDialog(null, "BMI: " + bmi + "\nViktklass: " + sortedBmi);
		
		
	}