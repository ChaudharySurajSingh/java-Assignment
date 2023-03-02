import java.util.Scanner;

/*Q4 - Write a program to print positive number entered by the user, if user enters a negative number, it is
skipped.*/
public class question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter any number: ");
		int num = scanner.nextInt();
		if (num>=0){
			System.out.println("You entered a positive number that is : "+ num);
		}
		else {
			System.out.println("You entered a negative number which is skipped by me: ");
		}
	}
}
