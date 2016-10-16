package deck;
/**
 * 
 * @author Russell
 * @version 1.0
 * @since 9/8/2016
 * 
 * Based on: http://rosettacode.org/wiki/Playing_cards
 * 
 */

public class Card 
{
	
	private final Pip PIP;
	private final Suit SUIT;
	
	/**
	 * Card constructor.
	 * @param pip sets PIP to pip
	 * @param suit sets SUIT to suit
	 */
	public Card (Pip pip, Suit suit)
	{
		PIP = pip;
		SUIT = suit;
	}
	
	/**
	 * Overwritten toString for displaying card values.
	 * @return string with a card's pip and suit values
	 */
	public String toString()
	{
		return (PIP + " of " + SUIT);
	}
	
} // End of Card class