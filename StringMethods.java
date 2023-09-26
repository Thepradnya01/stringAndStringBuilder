//String is a non-primitive data type in java
//Strings are immutable in java

package Basics;


public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Pradnya";
		String b="Kulkarni";
		
		//Concatenation- used to connect different string with each other, done by using "+" sign
		
		String c=a+" "+b;
		System.out.println(c);
		
		
		//chaAt- used to find character in a string at particular index
		
		System.out.println(a.charAt(3));
		System.out.println(b.charAt(6));
		System.out.println(c.charAt(9));
		
		//length-used to find out length of a string
		
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());
		
		//compareTo- this function is used to compare two different strings, if firstString>secondString--> return positive value, for opposite case, returns negative value and for equal, returns 0
		// we can also use == to check if string are eqaul or not, but that does not give accurate result every time. so to pass every test case, use compareTo.
		// a<b, b<c, a<z keep it in mind
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(c));
		
		//substring- substring(startIndex,endIndex)- used to retrieve substring, endIndex is exclusive
		
		System.out.println(a.substring(0,3));
		System.out.println(a.substring(4));   //will print up to end
		
		
		
		

	}

}
