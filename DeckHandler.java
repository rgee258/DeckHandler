package deck;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * 
 * @author Russell
 * @version 1.0
 * @since 9/8/2016
 * 
 * Main class for user input for handling the deck.
 * 
 * Based on: http://rosettacode.org/wiki/Playing_cards
 * 
 */

public class DeckHandler {

	public static void main(String[] args) 
	{

		// Setup for user input
		boolean continueLoop = true;
		String command;

		Scanner keyboardIn = new Scanner(System.in);

		// Create a new deck and the card that is on top
		Deck deck = new Deck();
		Card currentCard;


		// User introduction and commands
		System.out.println("Here's a program dedicated towards playing with a deck of cards.");
		System.out.println("We have started you off with a completely new deck of cards.\n");

		System.out.println("Type in any of the following commands: ");
		System.out.println("deal (Deal the card at the top of the deck.)");
		System.out.println("shuffle (Shuffle the deck.)");
		System.out.println("contents (Display the contents of the deck.)");
		System.out.println("cleardeck (Clear the contents of the deck.)");
		System.out.println("newdeck (Create a new deck and discard the old one.)");
		System.out.println("commands (Display the commands for the deck.)");
		System.out.println("exit (Exit the program.)\n");

		// Begin main user input loop
		while (continueLoop)
		{

			System.out.print("Enter your command: ");
			command = keyboardIn.nextLine();
			System.out.println("");

			switch (command)
			{
			case ("deal"): // Deal a card from the deck
				try
				{
					currentCard = deck.deal();
					System.out.println("Card dealt: " + currentCard.toString() + "\n");
				}
				catch (NoSuchElementException e)
				{
					System.out.println("There are no more cards to deal, the deck is empty.\n");
				}
				break;
			case ("shuffle"): // Shuffle the deck
				deck.shuffle();
				System.out.println("The deck has been shuffled.\n");
				break;
			case ("contents"): // Display the deck's contents
				deck.contents();
				System.out.println("");
				break;
			case ("cleardeck"): // Clear the deck of its cards
				deck.clear();
				System.out.println("The deck has been cleared of its cards.\n");
				break;
			case ("newdeck"): // Create a new deck
				deck = new Deck();
			System.out.println("A new deck has been created.\n");
				break;
			case ("commands"): // Display the list of available commands
				System.out.println("Command List: ");
				System.out.println("deal (Deal the card at the top of the deck.)");
				System.out.println("shuffle (Shuffle the deck.)");
				System.out.println("contents (Display the contents of the deck.)");
				System.out.println("newdeck (Create a new deck and discard the old one.)");
				System.out.println("commands (Display the commands for the deck.)");
				System.out.println("exit (Exit the program.)\n");
				break;
			case ("exit"): // Exit out of the user input loop
				System.out.println("Thanks for playing with this deck of cards!");
				continueLoop = false;
				break;
			default:
				System.out.println("Invalid command, please try again.\n");
			} // Close switch statement
			
			if (!continueLoop) // Exit the system when the user is finished
			{
				System.exit(0);
			}

		} // Close continueLoop

		keyboardIn.close();
	} // End of main method

} // End of DeckHandler class
