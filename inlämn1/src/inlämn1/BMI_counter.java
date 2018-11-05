package inlämn1;

import javax.swing.JOptionPane;

public class BMI_counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kg = JOptionPane.showInputDialog("Weigth in Kg");
		String cm = JOptionPane.showInputDialog("leingth in cm");
		double kgg = Double.parseDouble(kg);
		double meter = Double.parseDouble(cm) / 100;
		double BMI = Math.round(kgg / Math.pow(meter, 2));
		System.out.println(BMI);
//		if (BMI < 18.5>) {
//			
//		}
	}

}
