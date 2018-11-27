import javax.swing.JOptionPane;

public class Uppg2Moment_6 {
	private static double getKatet(String x) {
		double katet = Double.parseDouble(JOptionPane.showInputDialog(x));
		return katet;
	}
	private static void getHypotenusa(double x, double y) {
		double hypotenusa = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
		double roundedHypo = (double) Math.round(hypotenusa * 100) / 100; // Avrundar till 2 decimaler
		JOptionPane.showMessageDialog(null, "Triangelns hypotenusa: " + roundedHypo + " cm."); // Output
		
	}
	/*
	 * getKatet() = Tar längden för katet 1 och katet 2.
	 * getHypotenusa() = Räknar ut hypotenusan och ger output meddelandet.
	 */
	

	public static void main(String[] args) {
		double katet1 = getKatet("Katet 1 längd i cm");
		double katet2 = getKatet("Katet 2 längd i cm");
		getHypotenusa(katet1, katet2);
		
	}

}
