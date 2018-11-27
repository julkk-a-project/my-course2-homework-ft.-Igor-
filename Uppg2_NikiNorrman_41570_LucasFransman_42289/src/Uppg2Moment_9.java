import javax.swing.JOptionPane;

public class Uppg2Moment_9 {
	private static int getBinary() { // Tar siffran som ska konverteras
		String num = JOptionPane.showInputDialog("Give a positive integer to convert?");
		int binary = convertToInt(num); // K�r convertToInt() som konverterar userns input till en int
		int finalBinary = getBinary(binary); // K�r getBinary() som tar ett tal och konverterar det till ett bin�rt tal
		return finalBinary;
	}
	private static int convertToInt(String num) { // Konverterar str�ng till int
		 int intNum = Integer.parseInt(num);
		 return intNum;
		  }
	
	private static int getBinary(int num) { // Binary konverter
		 if (num == 0) { // Loopen kan inte ge en bin�r motsvarighet f�r 0 s� if 0 return 0 (0 bin�rt = 0)
			 return 0;
		 }
		 String binaryStr = "";
		 int rest = 0;
		    while (num > 0) {
		    	rest = num % 2;
		        num /= 2;
		        binaryStr = Integer.toString(rest).toString() + binaryStr; 
		    }
		    return convertToInt(binaryStr); // K�r convertToInt() f�r att konvertera till int
	}

	public static void main(String[] args) {
		  int binary = getBinary(); // Tar ett tall och returnerar bin�ra motsvarigheten
		  JOptionPane.showMessageDialog(null, binary); // output message
		    
		        }
	}


