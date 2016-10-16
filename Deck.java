package deck;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 
 * @author Russell
 * @version 1.0
 * @since 9/8/2016
 * 
 * Deck class containing cards and deck methods.
 * 
 * Based on: http://rosettacode.org/wiki/Playing_cards
 * 
 */

public class Deck
{
	
	private final LinkedList<Card> deck = new LinkedList<Card>();

	/**
	 * No-args constructor
	 * 
	 * Supplies the deck with a new set of cards by looping
	 * through all of the enum values.
	 */
	public Deck()
	{
		for (Pip pip : Pip.values()) // For-each loop!
		{
			for (Suit suit : Suit.values()) // For-each loop!
			{
				deck.add(new Card (pip, suit));
			}
		}
	}
	
	/**
	 * Shuffles the cards of the deck using the provided Collections shuffle method.
	 */
	public void shuffle()
	{
		Collections.shuffle(deck);
	}
	
	/**
	 * 
	 * Deals a card by popping from the top of the LinkedList.
	 * @return the card at the top of the deck
	 * 
	 */
	public Card deal()
	{
		return deck.pop();
	}
	
	
	/**
	 * 
	 * Displays the deck contents by iterating through the LinkedList using the
	 * listIterator.
	 * 
	 */
	public void contents()
	{
		ListIterator<Card> deckContents = deck.listIterator(); // Creating an instance of the LinkedList ListIterator
		
		while (deckContents.hasNext())
		{
			System.out.println(deckContents.next()); // Don't forget the .next unless you only want memory addresses
		}
		
		if (deck.isEmpty())
		{
			System.out.println("The deck is empty.");
		}
	}
	
	/**
	 * 
	 * Clears the deck using the provided LinkedList clear method.
	 * 
	 */
	public void clear()
	{
		deck.clear();
	}
} // End of Deck class
