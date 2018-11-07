package inlämn1;

import javax.swing.JOptionPane;

public class Moment7 {
	public static double getTal() {
		double tal = Double.parseDouble(JOptionPane.showInputDialog("Ge ett decimaltal"));
		return tal;
	}
	public static String checkHeltal(double tal) {
		if ((tal % 1) == 0) {
			return "heltal";
		} 
		else {
			return "decimaltal";
		}
	}
	public static String checkUdJa(double tal) {
		if ((tal % 2) == 0) {
			return "jämnt";
		}
		else {
			return "udda";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tal = getTal();
		String helTal = checkHeltal(tal);
		if (helTal == "heltal") { 
			String uddaJamnt = checkUdJa(tal);
			JOptionPane.showMessageDialog(null, tal + " är ett " + uddaJamnt + " " + helTal + ".");
		}
		else {
			JOptionPane.showMessageDialog(null,  tal + " är ett " + helTal + ".");
		}
		
	}
}
		
