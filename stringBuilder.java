package Basics;

//StringBuilder is a class which provides many additional functions for string
//It is used to create mutable strings
// It has additional methods like- setCharAt, append, insert,delete


public class stringBuilder {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Pradnya");
		System.out.println(sb);
		
		//charAt
		
		System.out.println(sb.charAt(3));
		
		//setCharAt
		
		sb.setCharAt(3, 'D');
		System.out.println(sb);
		
		//Append
		
		sb.append('k');
		System.out.println(sb);
		
		//insert
		
		sb.insert(4,'d');
		System.out.println(sb);
		
		//delete
		
		sb.delete(3,4);
		
		System.out.println(sb);
		
		sb.delete(7,8);                   //to delete last character
		
		System.out.println(sb);
		
		
		

	}

}
