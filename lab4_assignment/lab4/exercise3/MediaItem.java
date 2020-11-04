package com.cg.lab4.exercise3;
/**
 * an abstract subclass called media item is created
 * @author challa chaturya
 *
 */

public abstract class MediaItem extends Item{
	int  runTime;
/**
 * costructor for mediaitem
 * @param id
 * @param title
 * @param noOfCopies
 * @param runTime
 */
	public MediaItem(int id, String title, int noOfCopies, int runTime) {
		super(id, title, noOfCopies);
		this.runTime = runTime;
	}

/**
 * to get runtime
 * @return runtime
 */

	public int getRunTime() {
		return runTime;
	}
/**
 * to set runtime
 * @param runTime
 */
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}


@Override
	String print() {
		
		return ("media item[id="+id+", title"+title+",noOfcopies="+noOfCopies+", runTime="+runTime+"]");
	}

}
