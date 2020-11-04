package com.cg.lab4.exercise3;
/**
 * 
 * @author challa chaturya
 * Super class Item with its attributes is created with constructor and getters and setters toString() and print.
 */
public abstract class Item {
   int id;
   String title;
   int noOfCopies;
   
   /**
    * to get id
    * @return id
    */
   public int getId() {
	return id;
}

/** 
 * to  set id
 * @param id
 */
  public void setId(int id) {
	this.id = id;
}

/**
 * to get title
 * @return title
 */
  public String getTitle() {
	return title;
}

/**
 * to set title
 * @param title
 */
  public void setTitle(String title) {
	this.title = title;
}

/**
 * to get number of copies
 * @return copies
 */
  public int getNoOfCopies() {
	return noOfCopies;
}
/**
 * to set copies
 * @param noOfCopies
 */

  public void setNoOfCopies(int noOfCopies) {
	this.noOfCopies = noOfCopies;
}

/**
 * constructor for item superclass is created
 * @param id
 * @param title
 * @param noOfCopies
 */
  public Item(int id, String title, int noOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
  

@Override
public String toString() {
	return "Item [id="+id+", title "+title+", copies="+noOfCopies+"]";
}



@Override
public int hashCode() {
	
	return this.id;
}


@Override
public boolean equals(Object obj) {
	if(obj==null)
		return false;
	if(obj==this)
		return true;
	boolean b=(this.getId()==((Item)obj).getId())&&(this.getTitle()==((Item)obj).getTitle())&&((Item)obj).getNoOfCopies()==((Item)obj).getNoOfCopies();
	return b;
}
 /**
  * to print the output
  * @return values
  */
  abstract String print();
  
  
}
  

