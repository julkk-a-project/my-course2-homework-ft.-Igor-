package Inlamn1;

import javax.swing.JOptionPane;

public class Uppg1Moment8 {// allt samma som moment 7 förutom primtals checker
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
			return "jamnt";
		}
		else {
			return "udda";
		}
	}
	public static String checkPrim(double tal) {//kollar om talet är ett primtal
		for (double i = 2; i < tal; i++) {
	        if (tal % i == 0) {
	            return "inte ett primtal";
	        }
		else {
			return "primtal";
		}
		}
	    if (tal == 2.0 ) {
			return "primtal";
		}
		else if (tal == 1.0 || tal == 0.0) {
			return "inte ett primtal";
		}
		else {
			return "";
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tal = getTal();
		String helTal = checkHeltal(tal);
		if (helTal == "heltal") { 
			String uddaJamnt = checkUdJa(tal);
			String prim = checkPrim(tal); //om heltal => check if prim
			JOptionPane.showMessageDialog(null, tal + " ar ett " + uddaJamnt + " " + helTal + " och " + prim + ".");
		}
		else {
			JOptionPane.showMessageDialog(null,  tal + " ar ett " + helTal + ".");
		}
		
	}
}
