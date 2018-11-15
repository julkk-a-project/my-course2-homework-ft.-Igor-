package Inlamn1;

import javax.swing.JOptionPane;

public class Uppg1Moment7 {
	public static double getTal() {//tar userns tal och konverterar det till en double
		double tal = Double.parseDouble(JOptionPane.showInputDialog("Ge ett decimaltal"));
		return tal;
	}
	public static String checkHeltal(double tal) { //checkar ifall heltal
		if ((tal % 1) == 0) {
			return "heltal";
		} 
		else {
			return "decimaltal";
		}
	}
	public static String checkUdJa(double tal) {//checkar ifall jämnt eller udda
		if ((tal % 2) == 0) {
			return "jamnt";
		}
		else {
			return "udda";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tal = getTal();//anropar getTal
		String helTal = checkHeltal(tal);//anropar checkHeltal
		if (helTal == "heltal") { //ifall talet är ett heltal kollar man om det är udda eller jämnt
			String uddaJamnt = checkUdJa(tal);//anropar checkUdJa
			JOptionPane.showMessageDialog(null, tal + " ar ett " + uddaJamnt + " " + helTal + ".");//output
		}
		else {
			JOptionPane.showMessageDialog(null,  tal + " ar ett " + helTal + ".");//output
		}
		
	}
}
		
