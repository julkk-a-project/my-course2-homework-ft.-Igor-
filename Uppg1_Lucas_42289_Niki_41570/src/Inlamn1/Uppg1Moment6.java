package Inlamn1;

import javax.swing.JOptionPane;

import java.time.YearMonth;


public class Uppg1Moment6 {

	public static int getInt(String string) {//tar årtal och månad från usern
		String year = JOptionPane.showInputDialog(string);
		int intYear = Integer.parseInt(year);
		return intYear;
	}

	public static int getDays(int year, int month) {//returnerar antal dagar i månaden
		YearMonth dagar = YearMonth.of(year, month);
		int daggar = dagar.lengthOfMonth();
		return daggar;
	}
	
	public static void main(String[] args) {
		int year = getInt("Give a year");//anropar getInt
		int month = getInt("Give a number for a month");//anropar getInt
		int days = getDays(year,month); //anropar getDays
		JOptionPane.showMessageDialog(null, "Hey! there are " + days + " days in the month with the number " + month + " and year " + year, "Days", 1);//output	
	}

}
