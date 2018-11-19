import javax.swing.JOptionPane;

public class Uppg2Moment_9 {
	private static int getBinary() {
		String num = JOptionPane.showInputDialog("Enter the number you would like to convert?");
		int remainder = convertToInt(num);
		return remainder;
	}
	private static int convertToInt(String num) {
		 int intNum = Integer.parseInt(num);
		 int remainder = getBinary(intNum);
		 return remainder;
	}
	private static int getBinary(int num) {
		 String s = "";
		 int remainder = 0;
		    while (num > 0) {
		    	remainder = num % 2;
		        num /= 2;
		        s = Integer.toString(remainder).toString() + s; 
		    }
		    return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int binary = getBinary();
		  JOptionPane.showMessageDialog(null, binary);
		    
		        }
	}


