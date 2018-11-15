package Inlamn1;

import javax.swing.JOptionPane;

public class Uppg1Moment3 {
	public static double getWeight(){ //usern ger sin vikt, den konverteras från string till double
		double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "insert your weigth in kg." ));
		return weight;
	}
	public static double getLength(){//usern ger sin längd, den konverteras från string till double
		double length = Double.parseDouble(JOptionPane.showInputDialog(null, "insert your length in cm."));
		double powLength = Math.pow((length / 100), 2);
		return powLength;
	}
	public static double getBmi(){//anropar getWeight och getLength och räknar mha dom Bmi:n och vrundar det till ett tal med en decimal 
		double weight = getWeight();
		double length = getLength();
		double bmi = Math.round((weight / length) * 10d) / 10d;
		return bmi;
	}
	public static String sort(double bmi) { //tar bmi:n som en parameter och kollar vilken viktklass man hör till
		if (bmi < 18.5) {
			return "Undervikt";
		}else if (bmi < 25) {
			return "Normalvikt";
		}else if (bmi < 30) {
			return "Overvikt";
		}else {
			return "Fetma";
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bmi = getBmi();//anropar getBmi
		String sortedBmi = sort(bmi);//anropar sort
		JOptionPane.showMessageDialog(null, "BMI: " + bmi + "\nViktklass: " + sortedBmi);//outputtar bmi och viktklass
		
		
	}
}
