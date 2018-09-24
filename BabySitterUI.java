import java.util.Scanner;

public class BabySitterUI {

	private int starttime;
	private int stoptime;
	private int bedtime;
	
	/**
	 * Generic constructor class to build the UI.
	 */
	public BabySitterUI() {
		
	}
	
	/**
	 * The UI to get the startime, stoptime and bedtime hour as an integer. 
	 * If the string is invalid, it will re-ask for a valid time. 
	 * This will parse a string into an integer and convert from 12 hour 
	 * format to 24 hour format.
	 */
	public void gettimes() {
		Boolean valid=false;
		int start=0;
		int stop=0;
		int bed=0;
		
		Scanner gettime = new Scanner(System.in); //Scanner to get user input.
		
		while(!valid) {
			System.out.println("What time did you start?");
			try {
				start=Integer.parseInt(gettime.nextLine());
				if(start<12) {
					start=start+12;
				}
				setStarttime(start);
				valid=true;
			}catch(Exception e) {
				valid=false;
				System.out.println("Enter a valid time please.");
			}
		}
		valid=false;
		
		while(!valid) {
			System.out.println("What time did you stop?");
			
			try {
				stop = Integer.parseInt(gettime.nextLine());
				if (stop<=12 && stop>4) {
					stop=stop+12;
				}
				setStoptime(stop);
				valid=true;
			}catch(Exception e) {
				valid=false;
				System.out.println("Enter a valid time please.");
			}
		}
		valid=false;
		
		while(!valid) {
			System.out.println("What time is bed time?");
			
			try {
				bed = Integer.parseInt(gettime.nextLine());
				if (bed<12 && bed>5) {
					bed=bed+12;
				}
				setBedtime(bed);
				valid=true;
			}catch(Exception e) {
				valid=false;
				System.out.println("Enter a valid time please.");
			}
		}
		
		gettime.close();//closes the scanner
		
	}
	
	/**
	 * @param starttime - sets the start time
	 */
	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}
	/**
	 * @param stoptime - sets the stop time
	 */
	public void setStoptime(int stoptime) {
		this.stoptime = stoptime;
	}
	/**
	 * @param bedtime - sets the bedtime
	 */
	public void setBedtime(int bedtime) {
		this.bedtime = bedtime;
	}
	
	/**
	 * @return the start time as an int
	 */
	public int getStarttime() {
		return starttime;
	}
	
	/**
	 * @return the stop time as an int
	 */
	public int getStoptime() {
		return stoptime;
	}
	
	/**
	 * @return the bedtime as an int
	 */
	public int getBedtime() {
		return bedtime;
	}
}
