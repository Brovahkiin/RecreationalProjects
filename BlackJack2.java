import java.util.Scanner;
import java.util.Random;

public class BlackJack2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		int c1, c2,cR, total, d1, d2, dR, dTotal;
		String input, input2;
		c1 = userRoll();
		c2 = userRoll();
	
		System.out.println("Welcome to BlackJack2.0.\nType Deal to begin.");
		keyboard.nextLine();

		total = c1 + c2;
	
		System.out.println("Your beggining hand is " + c1 + " and " + c2 + ".\nA total of " + total + "\n" +
							 "Would you like to 'Hit' or 'Stay'?");
		input = keyboard.nextLine();
	
	
		if(input.equalsIgnoreCase("hit"))
		{
			
			do
			{
				cR = userRoll();
				System.out.println("Your added card is " + cR + ".");
				total = total + cR;
				System.out.println("Your hand total is " + total);
			
				if(total > 21)
				{
					System.out.println("Sorry you have busted!");
					System.exit(0);
				}
				else if(total == 21)
				{
					System.out.println("You have blackjack! you win!");
					System.exit(0);
				}
				System.out.println("Would you like to 'Hit' or 'Stay'?");
				input2 = keyboard.nextLine();			
				
			}
			while(input2.equalsIgnoreCase("hit") || total >= 21);
			
			if(input2.equalsIgnoreCase("stay"))
			{
				d1 = dealerRoll();
				d2 = dealerRoll();
			
				dTotal = d1 + d2;
			
				System.out.println("Dealer's cards are " + d1 + " and " + d2 + ".\nWith a total of " + dTotal + ".");
			
				if(dTotal == 21)
					System.out.println("Sorry the dealer has Blackjack, you lose.");
			
				while(dTotal != 21 || dTotal < total || dTotal > 21)
				{
					dR = dealerRoll();
					dTotal = dTotal + dR;
					System.out.println("Dealer's new card is " + dR + "\nWith a new total of " + dTotal + ".");
				
					if(dTotal == 21)
					{
						System.out.println("Sorry the dealer has Blackjack, you lose.");
						System.exit(0);
					}
					
					if(dTotal > 21)
					{
						System.out.println("The dealer has busted, You win!");
						System.exit(0);
					}
					
					if(dTotal < total)
					{
						System.out.println("You beat the dealer's hand! you win!");
						System.exit(0);
					}
				}
			}
		
		}
		else if(input.equalsIgnoreCase("stay"))
		{
			d1 = dealerRoll();
			d2 = dealerRoll();
			
			dTotal = d1 + d2;
			
			System.out.println("Dealer's cards are " + d1 + " and " + d2 + ".\nWith a total of " + dTotal + ".");
			
			if(dTotal == 21)
				System.out.println("Sorry the dealer has Blackjack, you lose.");
			
			while(dTotal != 21 || dTotal < total || dTotal > 21)
			{
				dR = dealerRoll();
				dTotal = dTotal + dR;
				System.out.println("Dealer's new card is " + dR + "\nWith a new total of " + dTotal + ".");
				
				if(dTotal == 21)
				{
					System.out.println("Sorry the dealer has Blackjack, you lose.");
					System.exit(0);
				}
					
				if(dTotal > 21)
				{
					System.out.println("The dealer has busted, You win!");
					System.exit(0);
				}	
					
				if(dTotal < total)
				{
					System.out.println("You beat the dealer's hand! you win!");
					System.exit(0);
				}
			}
		}	
		
	}
	public static int userRoll()
	{	
		Random roll = new Random();
		int card = roll.nextInt(10) + 1;
		return card;

	}
	public static int dealerRoll()
	{
		Random roll = new Random();
		int card = roll.nextInt(10) + 1;
		return card;
	}
}