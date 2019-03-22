/**
* Class: CIST 2371 Introduction to Java
* Semester: Fall 2018
* Instructor: Stevie Prettyman
* Description: Solution to Unit 01 Program 1
* Due: 9/02/2018
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

public class Unit01_Prog1{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Please enter a celsius temperature: ");
	double celsius = input.nextDouble();
	double fahrenheit = (9.0/5) * celsius + 32;
	System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit!" );
	}
}