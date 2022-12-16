package warGame;

public class Card {
	private String name;
	private int value;
	
	public Card(int rank, String suit) {
		value=rank;
		
		switch (rank) {
		case 2: name = "2";
		break;
		case 3: name = "3";
		break;
		case 4: name = "4";
		break;
		case 5: name = "5";
		break;
		case 6: name = "6";
		break;
		case 7: name = "7";
		break;
		case 8: name = "8";
		break;
		case 9: name = "9";
		break;
		case 10: name = "10";
		break;
		case 11: name = "Jack";
		break;
		case 12: name = "Queen";
		break;
		case 13: name = "King";
		break;
		case 14: name = "Ace";
		break;
		
		}
		name += " of " + suit;
		
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value =value;
	}
	public String getName() {
		return name;
		
	}
	public void setName (String name) {
		this.name=name;
	}
	
	public void describe() {
		System.out.println(this.getName());
	}
	}
	
//	
//	I tried this but couldnt get it to work


////value (contains a value from 2-14 representing cards 2-Ace)
//List<Integer> value = new ArrayList<Integer>();
//value.add(2);
//value.add(3);
//value.add(4);
//value.add(5);
//value.add(6);
//value.add(7);
//value.add(8);
//value.add(9);
//value.add(10);
//value.add(11);
//value.add(12);
//value.add(13);
//value.add(14);
//
//for (int i = 0; i<value.size(); i++) {
//	System.out.println(value.get(i));
//
//List<String> Suits = new ArrayList<String>();
//Suits.add("Diamonds");
//Suits.add("Hearts");
//Suits.add("Spades");
//Suits.add("Clubs");}
//
//
////name (e.g. Ace of Diamonds, or Two of Hearts)
//
////need to print out "value" of "Suit" in a loop
//
//
//System.out.println(cardDeck);
//
//
//
//
//
////getters and setters
//
//public static ArrayList<Cards> getCardDeck() {
//	return cardDeck;
//}
//
//public static void setCardDeck(ArrayList<Cards> cardDeck) {
//	PlayingCards.cardDeck = cardDeck;
//}
//
////there is a problem with the card deck method which is related to the curly brackets
//private static ArrayList<Cards> cardDeck = new ArrayList<Cards>(); {
//
//for (int i = 1; i<15; i++) {
//	switch(i){
//	case 1:
//		for (int value: value) {
//				 cardDeck.add(new Card (Suit.Hearts, value,i));
//		} i =1;
//case 2:
//	for (int value: value) {
//			 {cardDeck.add(new Card(Suit.Clubs, value,i));
//	} i =1;
//}
//case 3:
//for (int value: value) {
//		 {cardDeck.add(new Card (Suit.Spades, value,i));
//} i =1;
//
//case 4:
//	for (int value:value) {
//			 {cardDeck.add(new Card (Suit.Diamonds, value,i));
//	} i =1;
//
//
//}
