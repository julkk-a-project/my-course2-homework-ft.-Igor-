package inlämn1;

import javax.swing.JOptionPane;

import java.time.YearMonth;


public class Moment6 {

	public static int getInt(String string) {
		String year = JOptionPane.showInputDialog(string);
		int intYear = Integer.parseInt(year);
		return intYear;
	}

	public static int getDays(int year, int month) {
		YearMonth dagar = YearMonth.of(year, month);
		int daggar = dagar.lengthOfMonth();
		return daggar;
	}
	
	public static void main(String[] args) {
		int year = getInt("Give a year");
		int month = getInt("Give a number for a month");
		int days = getDays(year,month);
		JOptionPane.showMessageDialog(null, "Hey! there are "+days+" days in the month with the number "+month+" and year "+year, "Days", 1);	
	}

}
