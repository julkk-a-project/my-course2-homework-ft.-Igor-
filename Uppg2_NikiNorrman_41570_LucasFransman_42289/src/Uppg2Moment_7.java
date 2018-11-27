import javax.swing.JOptionPane;

public class Uppg2Moment_7 {
	private static double getKatet(String x) {
		double katet = Double.parseDouble(JOptionPane.showInputDialog(x));
		return katet;
	}
	private static double getHypotenusa(double x, double y) {
		double hypotenusa = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
		double roundedHypo = (double) Math.round(hypotenusa * 100) / 100; //Avrundar till 2 decimaler
		return roundedHypo;
		
	}
	
	/*
	 * getKatet() = Tar l�ngden f�r katet 1 och katet 2.
	 * getHypotenusa() = R�knar ut hypotenusan.
	 */
	
	public static void main(String[] args) {
		double katet1 = getKatet("Katet 1 l�ngd i cm");
		double katet2 = getKatet("Katet 2 l�ngd i cm");
		double hypotenusa = getHypotenusa(katet1, katet2);
		JOptionPane.showMessageDialog(null, "Triangelns hypotenusa: " + hypotenusa + " cm."); // Output
	}

}
