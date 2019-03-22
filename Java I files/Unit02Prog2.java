/**
* Class: CIST 2371 Introduction to Java
* Semester: Fall 2018
* Instructor: Stevie Prettyman
* Description: Solution to Unit 02 Program 2
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

public class Unit02Prog2{
	public static void main(String[] args){
		int total = 0;
		int cnt = 0;
		Scanner input = new Scanner(System.in);

		while (cnt < 10){
			System.out.print("Please type a number: ");
			int number = input.nextInt();
			total += number;
			cnt++;
		}

		System.out.print("The total is: " + total + "\n");
	}
}