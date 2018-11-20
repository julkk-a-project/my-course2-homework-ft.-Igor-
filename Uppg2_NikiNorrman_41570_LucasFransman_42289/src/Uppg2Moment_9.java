import javax.swing.JOptionPane;

public class Uppg2Moment_9 {
	private static int getBinary() {
		String num = JOptionPane.showInputDialog("Number to convert?");
		int finalBinary = convertToInt(num);
		return finalBinary;
	}
	private static int convertToInt(String num) {
		 int intNum = Integer.parseInt(num);
		 int binary = getBinary(intNum);
		 return binary;
	}
	private static int getBinary(int num) {
		 String s = "";
		 int rest = 0;
		    while (num > 0) {
		    	rest = num % 2;
		        num /= 2;
		        s = Integer.toString(rest).toString() + s; 
		    }
		    return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		  int binary = getBinary();
		  JOptionPane.showMessageDialog(null, binary);
		    
		        }
	}


