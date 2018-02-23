import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.print("Your height in m: ");
		double height=input.nextDouble();

		System.out.print("Your weight in kg: ");
		int weight=input.nextInt();

		System.out.println("Your BMI is "+weight/height/height);
	}
}