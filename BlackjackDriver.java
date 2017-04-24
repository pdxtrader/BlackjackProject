package blackjack;

import java.util.List;
import java.util.Scanner;

public class BlackjackDriver {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BlackjackDriver driver = new BlackjackDriver(); // creates driver object so it can call non static methods
		Dealer d = new Dealer();
		Player p = new Player();
		p.setBeaverPelts(100); // sets our odd frontier player currency to 100

		// Introduction
		System.out.println("Welcome to the blackjack table.");
		System.out.println("You start with 100 beaver pelts.");
		System.out.println("If you lose all pelts you will be");
		System.out.println("escorted from the premise peltless.");

		// ***Refactor*** Do you want to continue (Y | N)

		// Assigns a new deck and shuffle it
		System.out.println("");
		System.out.println("The dealer begins shuffling the deck.");
		System.out.println("");
		d.newDeck();

		//iterates through hands until player has run out of game currency
		while (p.getBeaverPelts() > 0) {
			//resets players and dealer hands for a new hand
			d.resetDealersHand(d.getDealersHand()); 
			p.resetPlayersHand(p.getPlayersHand());
	
			int m = 0; // Placemarker that keeps this while loop running till they wager correctly
			while (m == 0) {
				p.setPeltsBeingBet(0);  //resets the amount bet from last turn
				System.out.println("\nYou currently have " + p.getBeaverPelts() + " pelts, how many will you wager?");
				System.out.println("1) Wager 1 pelt");
				System.out.println("2) Wager 2 pelts");
				System.out.println("3) Wager 5 pelts");
				System.out.println("4) Bet the farm!!");
				int amountToWager = kb.nextInt();  

				switch (amountToWager) {
				case 1: //reduces players game currency by their bet and stores it in a temp bet variable
					if (p.getBeaverPelts() < amountToWager) {
						System.out.println("You do not have that many pelts!");
					} else {
						p.setBeaverPelts(p.getBeaverPelts() - 1);  //reduces player currency by bet amount
						p.setPeltsBeingBet(1);  //sets temp bet variable to bet amount
						m = 1;
					}
					break;
				case 2:
					if (p.getBeaverPelts() < amountToWager) {
						System.out.println("You do not have that many pelts!");
					} else {
						p.setBeaverPelts(p.getBeaverPelts() - 2);
						p.setPeltsBeingBet(2); 
						m = 1;
					}
					break;
				case 3:
					if (p.getBeaverPelts() < amountToWager) {
						System.out.println("You do not have that many pelts!");
					} else {
						p.setBeaverPelts(p.getBeaverPelts() - 5);
						p.setPeltsBeingBet(5); 
						m = 1;
					}
					break;
				case 4:
					if (p.getBeaverPelts() < amountToWager) {
						System.out.println("You do not have that many pelts!");
					} else {
						int temp = p.getBeaverPelts();
						p.setPeltsBeingBet(temp);
						p.setBeaverPelts(0);
						m = 1;
					}
					break;
				}
			}

			// Dealer deals initial hand
			p.addCard(d.dealCard()); // passes a card from the deck to the player
			d.addCard(d.dealCard()); // passes a card from the deck to the dealer
			p.addCard(d.dealCard()); // passes a card from the deck to the player
			d.addCard(d.dealCard()); // passes a card from the deck to the dealer

			// Instantiates hand sums for dealer and player
			int dealerTotal = driver.calculateHand(d.getDealersHand());
			int playerTotal = driver.calculateHand(p.getPlayersHand());

			// Begins hand loop
			boolean keepPlaying = true;
			while (keepPlaying) {

				// Initial hand messaging
				System.out.println("Dealer is showing: [" + d.getDealersHand().get(1) + "]"); //****showing ace skip
				System.out.println("Your hand contains: " + p.getPlayersHand());

				// Initial decision logic MOVE INTO PLAYER METHOD
				System.out.println("\nWhat would you like to do?");
				System.out.println("1) Hit");
				System.out.println("2) Stay");

				// possibly move this to logic in the dealer class
				int playerAction = kb.nextInt();

				switch (playerAction) {
				case 1: // adds a card to the players deck, calculates new totals
					p.addCard(d.dealCard());
					playerTotal = driver.calculateHand(p.getPlayersHand());
					System.out.println("\nYou are dealt a new card: ["
							+ p.getPlayersHand().get(p.getPlayersHand().size() - 1) + "]");
					System.out.println("Your hand now contains: " + p.getPlayersHand());
					break;
				case 2: // have to add if dealer is done method
					while (dealerTotal < 17) { // needs to show the other card
												// of dealer if draw
						d.addCard(d.dealCard());
						System.out.println("The dealer hits and recieves a new card: ["
								+ d.getDealersHand().get(p.getPlayersHand().size() - 1) + "]");
						dealerTotal = driver.calculateHand(d.getDealersHand());
						System.out.println();
					}
					if (dealerTotal > playerTotal) {
						System.out.println("The dealer has " + dealerTotal + " while you have " + playerTotal);
						System.out.println("The dealer has won, you forfeit the " + p.getPeltsBeingBet() + " pelts you bet.");
						keepPlaying = false;
					} else if (dealerTotal < playerTotal) {
						System.out.println("The dealer has " + dealerTotal + " while you have " + playerTotal);
						System.out.println("You have won, you recieve " + p.getPeltsBeingBet() + " pelts.");
						p.setBeaverPelts(p.getBeaverPelts() + (p.getPeltsBeingBet() * 2));
						keepPlaying = false;
					} else if (dealerTotal == playerTotal) {
						System.out.println("The dealer has " + dealerTotal + " while you have " + playerTotal);
						System.out.println("You have pushed.  You take back the pelts you bet.");
						p.setBeaverPelts(p.getBeaverPelts() + p.getPeltsBeingBet());
						keepPlaying = false;
					}
					keepPlaying = false;
					System.out.println("You have " + p.getBeaverPelts() + " pelts reamining.");
					break;
				}
				// Updates hand totals after hitting, staying, etc
				dealerTotal = driver.calculateHand(d.getDealersHand());  
				playerTotal = driver.calculateHand(p.getPlayersHand());  
				
				
				//if dealer has an ace(using a value of 1) which a total hand value under 21, such as 14
				//it would then display as 25 as ace(using a value of 11) 
				
				
				

//				// enter if logic, might have to be a method that's called
//				if (playerTotal > 21) {
//					System.out.println("You have busted!!  You lose this hand.");
//					System.out.println("The dealer collects your " + p.getPeltsBeingBet() + " beaver pelts.");
//					keepPlaying = false;
//				} else if (dealerTotal > 21) {
//					System.out.println("The dealer has busted!! You win this hand.");
//					System.out.println("The dealer slaps " + p.getPeltsBeingBet() + " pelts on the table.");
//					p.setBeaverPelts(p.getBeaverPelts() + (p.getPeltsBeingBet() * 2));
//					keepPlaying = false;
//				}

			}
		
		}

	}

	// calls the value assign from Rank enum and returns it
	public int calculateHand(List<Card> hand) {
		int total = 0;
		for (Card card : hand) {
			total = total + card.getRank().getNumVal();
		}
		for (Card card : hand) {
			if (card.getRank().equals(Rank.Ace) && total > 21) {
				total = total - 10;
			}
		}
		return total;
	}
}
