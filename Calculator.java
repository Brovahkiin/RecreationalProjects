import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);
		int a, b, total;
		double aa, bb, totald;

		System.out.println("Menu\nEnter number selection.\n"
							+ "(1) for addition.\n"
							+ "(2) for subtraction.\n"
							+ "(3) for multiplication.\n"
							+ "(4) for division.");

		int menu = keyboard.nextInt();

		if(menu == 1)
		{
			System.out.println("Enter FIRST number you would like to add.");
			a = keyboard.nextInt();

			System.out.println("Enter SECOND number you would like to add.");
			b = keyboard.nextInt();

			total = addition(a,b);
			System.out.println("Your sum is " + total);
		}
		else if(menu == 2)
		{
			System.out.println("Enter the FIRST number you would like to subtract.");
			a = keyboard.nextInt();

			System.out.println("Enter the SECOND number you would like to subtract.");
			b = keyboard.nextInt();

			total = subtraction(a,b);
			System.out.println("Your difference is " + total);
		}
		else if(menu == 3)
		{
			System.out.println("Enter the FIRST number you would like to multiply.");
			a = keyboard.nextInt();

			System.out.println("Enter the SECONE number you would like to multiply.");
			b = keyboard.nextInt();

			total = multiplication(a,b);
			System.out.println("Your product is " + total);
		}
		else if(menu == 4)
		{
			System.out.println("Enter the FIRST number you would like to divide.");
			aa = keyboard.nextInt();

			System.out.println("Enter the SECOND number you would like to divide.");
			bb = keyboard.nextInt();

			if(bb == 0)
			{
				System.out.println("Result is infinite.\nYOU CAN NOT DIVIDE BY ZERO!");
				System.exit(0);
			}

			totald = division(aa,bb);
			System.out.println("Your quotient is " + totald);
		}
		else
			System.out.println("You have entered an invalid selection.");


	}
	public static int addition(int a, int b)
	{
		return (a+b);
	}
	public static int subtraction(int a, int b)
	{
		return (a-b);
	}
	public static int multiplication(int a, int b)
	{
		return (a*b);
	}
	public static double division(double a, double b)
	{
		return (a/b);
	}

}