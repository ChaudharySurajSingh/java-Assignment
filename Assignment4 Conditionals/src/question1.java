/*Q1 - Write a program which takes the values of length and breadth from user and check if it is a square or
not.*/
import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the length: ");
		int length = scanner.nextInt();
		System.out.println("enter the breadth: ");
		int breadth = scanner.nextInt();
		if (breadth == length) {
			System.out.println("it is a square: ");
		}
		else {
			System.out.println("it is not a square");
		}

	}
}
