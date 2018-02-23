import java.util.Scanner;
public class DumbCalculator {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.print("What is your first number?");
		double number1=input.nextDouble();

		System.out.print("What is your second number?");
		double number2=input.nextDouble();

		System.out.print("What is your third number?");
		double number3=input.nextDouble();

		System.out.println("("+number1+" + "+number2+" + "+number3+")/2 is ... "+(number1+number2+number3/2));
	}
}