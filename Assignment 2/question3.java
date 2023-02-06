import java.util.Scanner;

/*Q2 - Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
to calculate his total marks and percentage marks. */
public class question3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int mark1,mark2,mark3;
		System.out.println("enter your marks one by one:");
		mark1 = scn.nextInt();
		mark2 = scn.nextInt();
		mark3 = scn.nextInt();
		int totalMarks = (mark1+mark2+mark3);
		int percentage =(totalMarks/3);
		System.out.println("total marks are: "+totalMarks);
		System.out.println("your percentage is: "+ percentage+'%');

	}
}
