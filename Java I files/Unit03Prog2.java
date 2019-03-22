/**
* Class: CIST 2371 Introduction to Java
* Semester: Fall 2018
* Instructor: Stevie Prettyman
* Description: Solution to Unit 03 Program 2
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
import java.util.*;


public class Unit03Prog2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] numArray = new int[10];
		int num_input; int count = 0;

		for (int i = 0; i < numArray.length; i ++){
			
			System.out.print("Please enter an integer: ");
			num_input = input.nextInt();
			int searchMe = uniqueList(numArray, num_input);

			if (searchMe != -1){
				numArray[i] = num_input;
				count++;
			}
			System.out.print("");

		}

		printArray(numArray, count);

	}

	public static int uniqueList(int numArray[], int n){
		for (int i = 0; i < numArray.length; i ++){
			if (n == numArray[i])
				return -1;

		}
		return 1;
	}
	

	public static void printArray(int numArray[], int num){
		
		System.out.println("Number of unique integers: " + num);
		System.out.print("Unique integers: ");
		
		for (int i = 0; i < numArray.length; i++){
			if (numArray[i] != 0)
				System.out.print(numArray[i] + " ");
		}
		System.out.print("\n");	

	}

}