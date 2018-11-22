	
//Subclass för moment 8 som räknar ut hypotenusan.
	 
public class Hypotenusa extends Uppg2Moment_8 {
	
	protected static double getHypotenusa(double x, double y) {
		double hypotenusa = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
		double roundedHypo = (double) Math.round(hypotenusa * 100) / 100;
		return roundedHypo;
	}
}
