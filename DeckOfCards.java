package singleton;

import java.util.*;

public class DeckOfCards
{
	private ArrayList<Card> deck;

	public DeckOfCards()
	{
		deck = new ArrayList<Card>();
	}

	public void shuffle()
	{
		Random r = new Random();
		for (int i = 0; i < deck.size(); i++)
		{
			int swap = r.nextInt(deck.size());
			if (swap != i)
			{
				Collections.swap(deck, i, swap);
			}
		}
	}

	public Card deal() throws Exception
	{
		if (deck.isEmpty())
		{
			throw new Exception("Deck is empty!");
		}
		Card c = deck.get(0);
		deck.remove(c);
		return c;
	}

	private void loadDeck()
	{
		for (Card.Suit suit : Card.Suit.values())
		{
			for (Card.CardType cardType : Card.CardType.values())
			{
				deck.add(new Card(suit, cardType));
			}
		}
	}
}