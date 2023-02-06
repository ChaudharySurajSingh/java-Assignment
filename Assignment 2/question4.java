/*Q4 - Given two numbers, return their sum in the following format:
Int t representing number of test cases
T lines of Two integers representing the numbers to be added*/

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int testCase;
		System.out.println("enter the number of test case:");
		testCase = scn.nextInt();
		for (int i =1; i<=testCase; i++){
			System.out.println("test case "+i);
			System.out.println("enter the numbers:");
			int num1 = scn.nextInt();
			int num2 = scn.nextInt();
			int sum = (num1+num2);
			System.out.println(sum);
		}
		scn.close();
	}
}
