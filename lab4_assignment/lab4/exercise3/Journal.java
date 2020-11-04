package com.cg.lab4.exercise3;
/**
 * journal class is created which extnds written class
 * @author challa chaturya
 *
 */
public  class Journal extends WrittenItem{
	
	int yearPublished;
/**
 * constructor for journal class
 * @param id
 * @param title
 * @param noOfCopies
 * @param noOfPages
 * @param authorName
 * @param publicationName
 * @param yearPublished
 */
	public Journal(int id, String title, int noOfCopies, int noOfPages, String authorName, String publicationName,	int yearPublished) {
		super(id, title, noOfCopies, noOfPages, authorName, publicationName);
		this.yearPublished = yearPublished;
	}
/**
 * to get the year of published
 * @return yearPublished
 */
	public int getYearPublished() {
		return yearPublished;
	}
/**
 * to set yearpublished
 * @param yearPublished
 */
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
/**
 * override method of print
 */
	@Override
	String print() {
		
		return ("Journal Paper [id= "+id+", title="+title+", noOfCopies= "+noOfCopies+", author name="+authorName+", publication name= "+publicationName+", yearPublished= "+yearPublished+"]"); 

	}

}
