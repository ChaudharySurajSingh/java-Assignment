import java.util.Scanner;

/*Q2 - Write a program to print absolute value of a number entered by the user.*/
public class question2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter any number: ");
		int num = scanner.nextInt();
		if (num <0) {
			System.out.println("you have entered a negative number:");
			System.out.println("the absolute value is: "+ (num*-1));
		}
	}
}