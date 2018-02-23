import java.util.Scanner;
public class MoreUserInputOfData {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.println("Please enter the following information so I can sell it for a profit!");

		System.out.print("First Name: ");
		String firstName=input.next();

		System.out.print("Last Name: ");
		String lastName=input.next();

		System.out.print("Grade(9-12): ");
		int grade=input.nextInt();

		System.out.print("Student ID: ");
		int ID=input.nextInt();

		System.out.print("Login: ");
		String login=input.next();

		System.out.print("Average: ");
		double average=input.nextDouble();

		System.out.println("Your Information: ");
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Grade(9-12): "+grade);
		System.out.println("Student ID: "+ID);
		System.out.println("Login: "+login);
		System.out.println("Average: "+average);
	}
}