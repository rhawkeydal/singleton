package singleton;

public class Card
{
	public enum Suit
	{
		CLUBS,
		DIAMONDS,
		HEARTS,
		SPADES
	}

	public enum CardType
	{
		ONE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING,
		ACE
	}

	private final Suit suit;
	private final CardType cardType;

	public Card(Suit suit, CardType cardType)
	{
		this.suit = suit;
		this.cardType = cardType;
	}
	
	public Suit getSuit()
	{
		return suit;
	}
	
	public CardType getCardType()
	{
		return cardType;
	}
}