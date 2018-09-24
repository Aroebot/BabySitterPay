
public class BabySitterPay {

	private static double beforebedrate=12.00;
	private static double beforemidnightrate=8.00;
	private static double aftermidnightrate=16.00;
	private static BabySitterCalc calc;
	
	/**
	 * Main method to start the program. This will construct the user interface and 
	 * construct the calculator method and then print the results.
	 * @param args
	 */
	public static void main(String[] args) {
		
		BabySitterUI ui = new BabySitterUI();
		ui.gettimes();
		
		calc = new BabySitterCalc(ui.getStarttime(), ui.getStoptime(), ui.getBedtime());
		calc.calculatetimes();
		
		printresults();
		
	}
	
	/**
	 * This method will make the final calculation of pay and display
	 */
	public static void printresults() {
		double beforebed, beforemidnight, aftermidnight;
		beforebed=calc.getBeforebedhours()*beforebedrate;
		beforemidnight=calc.getBeforemidnighthours()*beforemidnightrate;
		aftermidnight=calc.getAftermidnighthours()*aftermidnightrate;
		System.out.println("Before Bed: " + beforebed +" : "+ calc.getBeforebedhours() + " hours worked");
		System.out.println("After Bed: " + beforemidnight +" : "+ calc.getBeforemidnighthours() + " hours worked");
		System.out.println("After midnight: " + aftermidnight+" : "+ calc.getAftermidnighthours() + " hours worked");
		System.out.println("Total Pay: $" + (beforebed + beforemidnight + aftermidnight));
		
	}
	
}
