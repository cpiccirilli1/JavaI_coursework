/**
* Class: CIST 2371 Introduction to Java
* Semester: Fall 2018
* Instructor: Stevie Prettyman
* Description: Solution to Unit 03 Program 1
* Due: 9/23/2018
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

public class Unit03Prog1{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("[+] Give 2 characters: ");
		char start = input.next().charAt(0);
		char end = input.next().charAt(0);
		printChar(start, end);

	}

	public static void printChar(char c1, char c2){
		System.out.println("[+] Printing all characters from " + c1 + " to " + c2 + ":");
		int count = 0;

		for(char alpha = c1; alpha <= c2; alpha++){
			if (count < 9){
				System.out.print(alpha + " ");
				count++;
			}
			else{
				System.out.println(alpha + " ");
				count = 0;
			}
		}

		System.out.println("");
	}
}