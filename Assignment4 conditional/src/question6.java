import java.util.Scanner;

/*Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below
100 - 90 = A+
90 - 80 = A
80 - 70 = B+
70 - 60 = B
60 - 50 = C
50 - 40 = D
40 - 30 = E
30 - 0  = F
*/

public class question6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your marks to know your grade:");
		int marks = scanner.nextInt();
		if (marks >= 90&&marks<=100) {
			System.out.print("Your Grade is A+");
		} else if (marks >= 80&& marks<90) {
			System.out.print("Your Grade is A");
		} else if (marks >= 70&& marks<80) {
			System.out.print("Your Grade is B+");
		} else if (marks >= 60&& marks<70) {
			System.out.print("Your Grade is B");
		} else if (marks >= 50&& marks<60) {
			System.out.print("Your Grade is C");
		} else if (marks >= 40&& marks<50) {
			System.out.print("Your Grade is D");
		} else if (marks >= 30&& marks<40) {
			System.out.print("Your Grade is E");
		} else if (marks<30) {
			System.out.print("Your Grade is F");
		} else {
			System.out.print("Error!!  Please Enter valid marks");
		}
	}
}
