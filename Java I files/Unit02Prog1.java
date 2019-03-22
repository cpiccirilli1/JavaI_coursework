/**
* Class: CIST 2371 Introduction to Java
* Semester: Fall 2018
* Instructor: Stevie Prettyman
* Description: Solution to Unit 02 Program 1
* Due: 9/09/2018
* @author Chelsea Piccirilli
* @version 1.0
*
* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
*
*/

import java.util.Scanner;

public class Unit02Prog1{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Type customer name: ");
	String name = input.nextLine();
	System.out.print("What category is your article under: ");
	String catagory = input.nextLine();
	System.out.print("How many words is your article: ");
	int numWords = input.nextInt();
	double price = 0.0;

	if (numWords > 50)
		price = ((numWords-50)* .08) + 5.00;
	else
		price = numWords * .100;

	System.out.println("Customer: " + name);
	System.out.println("Placed an ad in catagory: " + catagory);
	System.out.println("Ad length is " + numWords + 
		" words, at a price of $" + price +"0");

	}
} 