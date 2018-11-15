package Inlamn1;

import javax.swing.JOptionPane;

public class Uppg1Moment5 {
	public static int getArtal() {//tar userns årtal
		int artal = Integer.parseInt(JOptionPane.showInputDialog("Ge ett artal"));
		return artal;
	}
	public static String checkSkottAr(int artal) {//checkar om skottår eller icke skottår
		if ((artal % 100) == 0) {//kollar ifall årtalet är ett jämnt hundratal
			return "100";
		}
		else if ((artal % 4) == 0) {
			return "skottar";
		}
		else {
			return "inte skottar";
		}
	}
	public static String checkSkottAr2(int artal) {//tar det 2 första talen i årtalet ex 1700 => 17
		String strArtal = Integer.toString(artal);//int till string
		char[] artalArray = strArtal.toCharArray();//årtalet till en character array
		int[] artalIntArray = new int[2];//skapar en int array
		for (int i = 0; i < 2; i++) {//lägger dom 2 första siffrorna i årtalet i en int array så ex 1700 så 17
			artalIntArray[i] = (int) artalArray[i] - 48; //check ascii table 0 = 48
		}
		String num = "";
		for (int i : artalIntArray) {
			num += Integer.toString(i);//[1, 7] blir "17"
		}
		int finalNum = Integer.parseInt(num);//konverterar från string till int
		if ((finalNum % 4) == 0 ) { //om årtalet är ex 1700 kollar den om 17 modulo 4 är 0 eller inte 
			return "skottar";
		}
		else {
			return "inte skottar";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int artal = getArtal();//anropar getArtal
		String skottAr = checkSkottAr(artal);//Anropar checkSkottAr
		if (skottAr == "100") {
			String skottar2 = checkSkottAr2(artal);//anropas ifall årtalet är ett jämnt hundratal
			JOptionPane.showMessageDialog(null, skottar2);//output
			
		}
		else {
			JOptionPane.showMessageDialog(null, skottAr);//output
		}
		
	}

}


