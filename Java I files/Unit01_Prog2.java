/**
* Class: CIST 2371 Introduction to Java
* Semester: Fall 2018
* Instructor: Stevie Prettyman
* Description: Solution to Unit 01 Program 2
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

public class Unit01_Prog2{
	public static void main(String[] args){
		final double meterRate = 0.305;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number of feet to convert: ");
		int feet = input.nextInt();

		double conversion = feet * meterRate;
		System.out.println(feet + " feet converts to " + conversion + " meters!");
	
	}
}