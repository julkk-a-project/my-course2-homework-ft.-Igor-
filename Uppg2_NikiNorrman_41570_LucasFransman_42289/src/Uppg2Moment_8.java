import javax.swing.JOptionPane;

public class Uppg2Moment_8 {
	private static double getKatet(String x) {
		double katet = Double.parseDouble(JOptionPane.showInputDialog(x));
		return katet;
	}
	/*
	 * getKatet() = Tar längden för katet 1 och katet 2.
	 * Hypotenusa.getHypotenusa() = Räknar ut hypotenusan mha funktionen getHypotenusa från klassen Hypotenusa.
	 */

	public static void main(String[] args) {
		double katet1 = getKatet("Katet 1 längd i cm");
		double katet2 = getKatet("Katet 2 längd i cm");
		double hypotenusa = Hypotenusa.getHypotenusa(katet1, katet2); // klass Hypotenusa
		JOptionPane.showMessageDialog(null, "Triangelns hypotenusa: " + hypotenusa + " cm."); // Output
	}

}
