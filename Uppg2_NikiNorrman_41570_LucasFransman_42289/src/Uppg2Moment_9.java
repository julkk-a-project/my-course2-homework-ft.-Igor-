import javax.swing.JOptionPane;

public class Uppg2Moment_9 {
	private static int getBinary() { // Tar siffran som ska konverteras
		String num = JOptionPane.showInputDialog("Give a positive integer to convert?");
		int binary = convertToInt(num); // Kör convertToInt() som konverterar userns input till en int
		int finalBinary = getBinary(binary); // Kör getBinary() som tar ett tal och konverterar det till ett binärt tal
		return finalBinary;
	}
	private static int convertToInt(String num) { // Konverterar sträng till int
		 int intNum = Integer.parseInt(num);
		 return intNum;
		  }
	
	private static int getBinary(int num) { // Binary konverter
		 if (num == 0) { // Loopen kan inte ge en binär motsvarighet för 0 så if 0 return 0 (0 binärt = 0)
			 return 0;
		 }
		 String binaryStr = "";
		 int rest = 0;
		    while (num > 0) {
		    	rest = num % 2;
		        num /= 2;
		        binaryStr = Integer.toString(rest).toString() + binaryStr; 
		    }
		    return convertToInt(binaryStr); // Kör convertToInt() för att konvertera till int
	}

	public static void main(String[] args) {
		  int binary = getBinary(); // Tar ett tall och returnerar binära motsvarigheten
		  JOptionPane.showMessageDialog(null, binary); // output message
		    
		        }
	}


