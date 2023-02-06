/*Q5 - Write a Java program to swap two numbers with the help of a third variable.*/
public class question5 {
	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 3;
		int temp;
		System.out.println("the first number before swaping is: "+ num1);
		System.out.println("the second number before swaping is: "+ num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("-------------------------------------------");
		System.out.println("the first number after swaping is: "+ num1);
		System.out.println("the second number after swaping is: "+ num2 );
	}
}
