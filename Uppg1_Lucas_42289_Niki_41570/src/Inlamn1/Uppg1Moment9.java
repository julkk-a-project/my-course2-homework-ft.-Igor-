package Inlamn1;

import javax.swing.JOptionPane;

public class Uppg1Moment9 {
	public static int getNumber(){//usern ger en siffra, den konverteras från string till int
		int input = Integer.parseInt(JOptionPane.showInputDialog("Ge en nummer"));
		return input;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = getNumber();//anropar getNumber
		String strNumber = Integer.toString(number);//konverteras från int till string
		String combinedStrings = "";//blir multiplikations tabellen efter for loopen är klar
		for (int i = 1; i < 11; i++) {//multiplicerar userns tal med 1-10
			combinedStrings += (i + " * " + strNumber + " = " + number * i + "\n");
		}
		JOptionPane.showMessageDialog(null, combinedStrings); //output
	}

}
