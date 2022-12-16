package warGame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> deck = new ArrayList<>();
	
	public Deck() {
		for (int i=2; i<=14; i++) {
			deck.add(new Card(i, "Spades \u2660"));
			deck.add(new Card(i, "Diamonds \u2662"));
			deck.add(new Card(i, "Hearts \u2661"));
			deck.add(new Card(i, "Clubs \u2662"));
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
		
	}
	public Card drawCard() {
		return deck.remove(0);
	}

}
