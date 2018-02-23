import java.util.Scanner;
public class TheForgetfulMachine {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.print("Give me a word!");
		String word1=input.next();

		System.out.print("Give me a second word!");
		String word2=input.next();

		System.out.print("Great, now your favourite number?");
		int number1=input.nextInt();

		System.out.print("And your second-favourite number...");
		int number2=input.nextInt();

		System.out.println("Whew! Wasn't that fun?");
	}
}
