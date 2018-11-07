package inlämn1;

import javax.swing.JOptionPane;

public class Moment5 {
	public static int getArtal() {
		int artal = Integer.parseInt(JOptionPane.showInputDialog("Ge ett årtal"));
		return artal;
	}
	public static String checkSkottAr(int artal) {
		if ((artal % 100) == 0) {
			return "100";
		}
		else if ((artal % 4) == 0) {
			return "skottår";
		}
		else {
			return "inte skottår";
		}
	}
	public static String checkSkottAr2(int artal) {
		String strArtal = Integer.toString(artal);
		char[] artalArray = strArtal.toCharArray();
		int[] artalIntArray = new int[2];
		for (int i = 0; i < 2; i++) {
			artalIntArray[i] = (int) artalArray[i] - 48; // check ascii table 0 = 48
		}
		String num = "";
		for (int i : artalIntArray) {
			num += Integer.toString(i);
		}
		int finalNum = Integer.parseInt(num);
		if ((finalNum % 4) == 0 ) {
			return "skottår";
		}
		else {
			return "inte skottår";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int artal = getArtal();
		String skottAr = checkSkottAr(artal);
		if (skottAr == "100") {
			String skottar2 = checkSkottAr2(artal);
			JOptionPane.showMessageDialog(null, skottar2);
			
		}
		else {
			JOptionPane.showMessageDialog(null, skottAr);
		}
		
	}

}


