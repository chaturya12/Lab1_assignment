package com.cg.lab4.exercise3;
/**
 * book class is created which extends from written item  subclass
 * @author challa chaturya
 *
 */
public  class Book extends WrittenItem {
/**
 * constructor for book class
 * @param id
 * @param title
 * @param noOfCopies
 * @param noOfPages
 * @param authorName
 * @param publicationName
 */
	public Book(int id, String title, int noOfCopies, int noOfPages, String authorName, String publicationName) {
		super(id, title, noOfCopies, noOfPages, authorName, publicationName);
		
	}
/**
 *  an overrided method for print 
 */
	@Override
	String print() {
		
		return ("Book [id= "+id+", title= "+title+", noOfCopies= "+noOfCopies+", author name= "+authorName+", publication name= "+publicationName+"]"); 
	}

}
