
public class BabySitterCalc {
	
	
	
	private int starttime;
	private int stoptime;
	private int bedtime;
	
	private int beforebedhours;
	private int beforemidnighthours;
	private int aftermidnighthours;
	
	
	public BabySitterCalc() {
		
	}
	/**
	 * Constructor method to set the start, stop and bed time.
	 * @param start - the start time hour
	 * @param stop - the stop time hour
	 * @param bed - the bed time hour
	 */
	public BabySitterCalc(int start, int stop, int bed) {
		setStarttime(start);
		setStoptime(stop);
		setBedtime(bed);
	}
	
	
	/**
	 * This method calculates the number of hours worked for each pay grade.
	 */
	public void calculatetimes() {
		//uses this block if stop time if before bedtime
		if(stoptime<bedtime && stoptime>starttime) {
			setBeforebedhours(stoptime-starttime);
			setBeforemidnighthours(0);
			setAftermidnighthours(0);
		}
		//uses this block if stop time is after bedtime but before midnight
		else if(stoptime<=24 && stoptime>starttime){
			setBeforebedhours(bedtime-starttime);
			setBeforemidnighthours(stoptime-bedtime);
			setAftermidnighthours(0);
		}
		//uses this block if stop time goes beyond midnight
		else {
			setBeforebedhours(bedtime-starttime);
			setBeforemidnighthours(24-bedtime);
			setAftermidnighthours(stoptime);
		}
		
	}

	/**
	 * @return the start time
	 */
	public int getStarttime() {
		return starttime;
	}
	/**
	 * @return the stop time
	 */
	public int getStoptime() {
		return stoptime;
	}
	/**
	 * @return the bed time
	 */
	public int getBedtime() {
		return bedtime;
	}
	/**
	 * @return the number of hours between bedtime and midnight
	 */
	public int getBeforemidnighthours() {
		return beforemidnighthours;
	}
	/**
	 * @return the number of hours after midnight 
	 */
	public int getAftermidnighthours() {
		return aftermidnighthours;
	}
	/**
	 * @return the number of hours before bed
	 */
	public int getBeforebedhours() {
		return beforebedhours;
	}
	
	/**
	 * @param starttime - sets the start time
	 */
	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}
	/**
	 * @param bedtime - sets the bed time
	 */
	public void setBedtime(int bedtime) {
		this.bedtime = bedtime;
	}
	/**
	 * @param stoptime - sets the stop time
	 */
	public void setStoptime(int stoptime) {
		this.stoptime = stoptime;
	}
	/**
	 * @param beforemidnighthours - sets the number of hours worked before midnight and after bed time
	 */
	public void setBeforemidnighthours(int beforemidnthours) {
		this.beforemidnighthours = beforemidnthours;
	}
	/**
	 * @param aftermidnighthours- sets the number of hours worked after midnight
	 */
	public void setAftermidnighthours(int aftermidnthours) {
		this.aftermidnighthours = aftermidnthours;
	}
	/**
	 * @param beforebedhours- sets the number of hours worked before bed time
	 */
	public void setBeforebedhours(int beforebedhours) {
		this.beforebedhours = beforebedhours;
	}

}
