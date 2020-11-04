package com.cg.lab4.exercise3;
/**
 * cd class is created from media item
 * @author challa chaturya
 *
 */
public class CD extends MediaItem {
	String artist;
	String genre;
	/**
	 * constructor for cd class
	 * @param id
	 * @param title
	 * @param noOfCopies
	 * @param runTime
	 * @param artist
	 * @param genre
	 */
	public CD(int id, String title, int noOfCopies, int runTime, String artist, String genre) {
		super(id, title, noOfCopies, runTime);
		this.artist = artist;
		this.genre = genre;
	}
	/**
	 * to get artist
	 * @return artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 *  to set artist
	 * @param artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 *  to get genre
	 * @return genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * to set genre
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	String print() {
		
		 super.print();
		 return ("CD [id= "+id+", title="+title+", noOfCopies= "+noOfCopies+", run time= "+runTime+", artist= "+artist+", genre= "+genre+"]");
	}
	
	
}