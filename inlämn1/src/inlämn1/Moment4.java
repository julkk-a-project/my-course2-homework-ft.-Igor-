package inlämn1;

import javax.swing.JOptionPane;

public class Moment4 {
	public static String getName() {
		String Name = JOptionPane.showInputDialog("Vad heter du?");
		return Name;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = getName();
		JOptionPane.showMessageDialog(null, "Hej " + userName);
	}
}
