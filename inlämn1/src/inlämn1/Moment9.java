package inlämn1;

import javax.swing.JOptionPane;

public class Moment9 {
	public static int getNumber(){
		int input = Integer.parseInt(JOptionPane.showInputDialog("Ge en nummer"));
		return input;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = getNumber();
		String strNumber = Integer.toString(number);
		String combinedStrings = "";
		for (int i = 1; i < 11; i++) {
			combinedStrings += (i + " * " + strNumber + " = " + number * i + "\n");
		}
		JOptionPane.showMessageDialog(null, combinedStrings);
	}

}




