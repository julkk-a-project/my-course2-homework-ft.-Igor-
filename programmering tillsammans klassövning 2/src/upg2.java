

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class upg2 {

	public static int adder(List<Integer> l) {
		int total = 0;
		for(int i=0;i<l.size();i++) {
			int index = l.get(i);
			total += index;
		}
		return total;
	}
	
	public static void main(String[] args) {
		String protoList = JOptionPane.showInputDialog("skriv tal sepererad med mellanrum, så räknar jag ihop dem!");
	 	List<Integer> l=new ArrayList<Integer>();
	 	String[] ss=protoList.split(" ");
		for(int i=0;i<ss.length;i++) {
			l.add(Integer.parseInt(ss[i]));
		}
		int total = adder(l);
		
		System.out.println(total);
		

	}

}
