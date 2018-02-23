import java.util.Scanner;
public class AgeInFiveYears {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.print("Hello.  What is your name?");
		String name=input.next();

		System.out.print("Hi, "+name+"! How old are you? ");
		int age=input.nextInt();

		System.out.print("Did you know that in five years you will be ");
		System.out.print(age+5);
		System.out.println(" years old?");
		System.out.print("And five years ago you were ");
		System.out.print(age-5);
		System.out.println("! Imagine that!");
	}
}