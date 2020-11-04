package com.cg.lab4.exercise3;
/**
 * video class extends from media item
 * @author challa chaturya
 *
 */
public  class Video extends MediaItem {
		
    String director;
	String genre;
	int yearOfReleased;
		

	public Video(int id, String title, int noOfCopies, int runTime, String director, String genre, int yearOfReleased) {
		super(id, title, noOfCopies, runTime);
		this.director = director;
		this.genre = genre;
		this.yearOfReleased = yearOfReleased;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearOfReleased() {
		return yearOfReleased;
	}

	public void setYearOfReleased(int yearOfReleased) {
		this.yearOfReleased = yearOfReleased;
	}

	@Override
	String print() {
	return	("Video[id= "+id+", title= "+title+",noOfcopies= "+noOfCopies+", runTime= "+runTime+", director= "+director+", genre= "+genre+", yearOfreleased= "+yearOfReleased+"]");
		
	}

}
