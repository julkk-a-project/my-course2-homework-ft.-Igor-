package inlämn1;

import javax.swing.JOptionPane;
import javax.swing.Math;

public class Circle_Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String diameter = JOptionPane.showInputDialog("what is the diameter of your cicle?");
		double radius = (Double.parseDouble(diameter) / 2);
		double area = Math.PI*Math.pow(radius,2);
		System.out.println(area);
		double omkr = 2*Math.PI*radius;
		System.out.println(omkr);
		JOptionPane.showMessageDialog(null, "Omkräts: "+omkr+"\nArea: "+area);

	}

}
