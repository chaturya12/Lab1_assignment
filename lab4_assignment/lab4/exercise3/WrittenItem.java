package com.cg.lab4.exercise3;

public abstract class WrittenItem extends Item {
	
	protected int noOfPages;
	protected String authorName;
	protected String publicationName;
   
	public WrittenItem(int id, String title, int noOfCopies, int noOfPages, String authorName, String publicationName) {
		super(id, title, noOfCopies);
		this.noOfPages = noOfPages;
		this.authorName = authorName;
		this.publicationName = publicationName;
	}
    
	abstract String print();
	
	
	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}

	
}
