package Inlamn1;

import javax.swing.JOptionPane;

public class Uppg1Moment4 {
	public static String getName() { //tar userns name och returnera det
		String Name = JOptionPane.showInputDialog("Vad heter du?");
		return Name;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = getName();//anropar getName
		JOptionPane.showMessageDialog(null, "Hej " + userName);//outputtar hej name
	}
}

