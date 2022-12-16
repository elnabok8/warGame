package warGame;

public class App {
	public static void main (String[] args) {
		
		
		
		Deck deck = new Deck();
		System.out.println();
		
		deck.shuffle();
		
		Player Player1 = new Player("Josie", 0);
		Player1.draw(deck);
		
		Player Player2 = new Player("Mirabell", 0);
		Player2.draw(deck);
		
		
		for (int i =2; i<26; i++) {
			Card Player1Card = Player1.flip();
			Card Player2Card = Player2.flip();
			
			
			
			
			
			System.out.println("Start of Round");
			System.out.println();

			
			
			
			
			if (Player1Card.getValue() > Player2Card.getValue()) {
				Player1.describeName(); Player1Card.describe();
				Player1.incrementScore();
				System.out.println("Player 1 Wins");
				System.out.println();
				Player1.describe();
				Player2.describe();
				System.out.println();
				
			} else if(Player1Card.getValue() < Player2Card.getValue()) {
				Player1.describeName(); Player1Card.describe();
				Player2.describeName(); Player2Card.describe();
				Player2.incrementScore();
				System.out.println("Player 2 Wins");
				System.out.println();
				Player1.describe();
				Player2.describe();
				System.out.println();
				
				
			}else if (Player1Card.getValue() == Player2Card.getValue()) {
				
			Player1.describeName(); Player1Card.describe();
			Player2.describeName(); Player2Card.describe();
			System.out.println("Tie");
			System.out.println();
			Player1.describe();
			Player2.describe();
			System.out.println();
			
			
			
			}
			}
			
			
			if (Player1.getScore()>Player2.getScore()) {
				System.out.println("Player 1 Wins the Game!");
				System.out.println("Sorry Player 2 -_-");
				System.out.println();
				System.out.println();
				
			} else if (Player2.getScore()>Player1.getScore()) {
				System.out.println("Player 2 Wins the Game!"); 
				System.out.println("Sorry Player 1 -_-");
				
				System.out.println();
				System.out.println();
			} else {
				System.out.println("You tied");
				System.out.println();
				System.out.println();
			}
		
		}
	
		
		
		
	
	
	
	
	
	}
