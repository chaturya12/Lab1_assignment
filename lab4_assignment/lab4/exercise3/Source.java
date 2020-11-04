package com.cg.lab4.exercise3;
/**
 * main class to print the details of items
 * @author challa chaturya
 *
 */
public class Source {

	public static void main(String[] args) {
		// an object for journal class is created
		Journal journal=new Journal(1,"JournalPaper",2000,5000,"Shyam","KML",1999);
		
		// an object for book class is created
		Book book=new Book(2,"JAVA",1000,900,"Kathy","ABC");
		
		// an object for video class is created
		Video video=new Video(3,"video1",500,60,"Abhiram","Comedy",2019);
		
		// an object for cd class is created
		CD cd=new CD(4,"Video2",200,120,"Shekar","action");
		
		// for printing the details
		System.out.println(journal.print());
		System.out.println(book.print());
		System.out.println(video.print());
		System.out.println(cd.print());
		
		

	}

}
