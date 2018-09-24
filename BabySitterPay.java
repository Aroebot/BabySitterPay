
public class BabySitterPay {


	//private BabySitterCalc calc;
	
	/**
	 * Main method to start the program. This will construct the user interface and 
	 * construct the calculator method and then print the results.
	 * @param args
	 */
	public static void main(String[] args) {
		BabySitterCalc calc = new BabySitterCalc();
		BabySitterUI ui = new BabySitterUI(calc);
		ui.printresults();
		
	}	
}
