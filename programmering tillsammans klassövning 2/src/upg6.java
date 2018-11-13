import javax.swing.JOptionPane;

public class upg6 {


	public static int getInt(String string) {
		String SInt = JOptionPane.showInputDialog(string);
		int amount = Integer.parseInt(SInt);
		return amount;
	}
	
	public static void main(String[] args) {
		int n = getInt("How many fibonatchi?\n(fails after the 45th fibonatchi number.)");
		int [] fibo = new int[n];
		fibo[0] = 1;
		fibo[1] = 2;
		for (int i = 2;i<n;i++) {
			int adder = fibo[i-1] + fibo[i-2];
			System.out.println(adder);
			fibo[i] = adder;
		}
			
			
	

		for (int u=0;u<n;u++) {
			System.out.println((u+1)+": "+fibo[u]);
		}
		
		//f(n) = f(n-1) + f(n-2)

	}

}
