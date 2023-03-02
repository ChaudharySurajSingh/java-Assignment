import java.util.Scanner;

/*Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit
or Loss.*/
public class question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the cost price: ");
		int cp = scanner.nextInt();
		System.out.println("enter the selling price: ");
		int sp = scanner.nextInt();
		int amount;
		if (sp>cp) {
			amount=(sp-cp);
			System.out.println("you got a profit of: "+ amount);
		} else if (cp>sp) {
			amount = (cp- sp);
			System.out.println("you have a loss of: "+ amount);
		}
		else {
			System.out.println("you don't have any loss or profit: ");
		}
	}
}