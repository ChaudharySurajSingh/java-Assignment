import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
		double ans;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number: ");
		double num1 = scanner.nextDouble();
		System.out.println("enter second number: ");
		double num2 = scanner.nextDouble();
		System.out.println("please enter the operation which you want to perform");
		System.out.println("such as +, -, *, /, % ");
		char operator = scanner.next().charAt(0);
		switch (operator){
			case '+':
			 ans = num1+num2;
				System.out.println(num1+" + "+ num2 +" = "+ ans);
				break;
			case '-':
				ans = num1-num2;
				System.out.println(num1+" - "+ num2 +" = "+ ans);
				break;
			case '*':
				ans = num1*num2;
				System.out.println(num1+" * "+ num2 +" = "+ ans);
				break;
			case '/':
				ans = num1/num2;
				System.out.println(num1+" / "+ num2 +" = "+ ans);
				break;
			case '%':
				ans = num1%num2;
				System.out.println(num1+" % "+ num2 +" = "+ ans);
				break;
			default:
				System.out.println("please enter a valid case (+ ,- ,* ,/ ,%)");
		}

	}
}
