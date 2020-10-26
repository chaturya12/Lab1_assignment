/**
Author: chaturya
Date  : 26/10/2020
Desc  : To return the string with its mirror image
*/
import java.util.*;
public class MirrorImage {

	public static void main(String[] args) {		
		// taking input using StringBuffer
		StringBuffer givenString=new StringBuffer("Earth"); 		
		System.out.println(givenString+"|"+getImage(givenString));
	}
//method to provide the mirror image
	private static StringBuffer getImage(StringBuffer givenString) {
		StringBuffer reversed1= givenString.reverse();
		return reversed1;
	}

}
