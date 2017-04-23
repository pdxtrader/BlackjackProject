package blackjack;

import java.util.List;
import java.util.Scanner;

public class BlackjackDriver {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BlackjackDriver driver = new BlackjackDriver();  //creates driver object so we can call non static methods
		Dealer d = new Dealer();   
		Player p = new Player();
		
		//Introduction
		System.out.println("Welcome to the blackjack table.");
		System.out.println("You start with 100 beaver pelts.");
		System.out.println("If you lose all pelts you will be");
		System.out.println("escorted from the premise peltless.");
		
		//Do you want to continue (Y | N)
		
		//Assigns a new deck and shuffle it
		System.out.println("");
		System.out.println("The dealer begins shuffling the deck.");
		System.out.println("");
		d.newDeck();
		
		//MAKE YOUR WAGER LOGIC
			//all in: you boldly push your pile of beaver pelts to the middle of the table
		
		//Dealer deals initial hand 
		p.addCard(d.dealCard());	//passes a card from the deck to the player
		d.addCard(d.dealCard());	//passes a card from the deck to the dealer
		p.addCard(d.dealCard());	//passes a card from the deck to the player
		d.addCard(d.dealCard());	//passes a card from the deck to the dealer
		
		//Instantiates hand sums for dealer and player
		int dealerTotal = driver.calculateHand(d.getDealersHand());
		int playerTotal = driver.calculateHand(p.getPlayersHand());
		
		//Begins hand loop
		while (dealerTotal < 21 && playerTotal < 21) {  //or do a recursive call back to the top
			
		//Initial hand messaging
		System.out.println("Dealer is showing: [" + d.getDealersHand().get(1) + "]" );   //******IF DEALER IS SHOWING ACE SKIP DECISION LOGIC
		System.out.println("Your hand contains: " + p.getPlayersHand());
		
		//Initial decision logic  MOVE INTO PLAYER METHOD
		System.out.println("\nWhat would you like to do?");
		System.out.println("1) Hit");
		System.out.println("2) Stay");
		
		//possibly move this to logic in the dealer class
		int doWhat = kb.nextInt();
		
		switch (doWhat) {
			case 1:  //adds a card to the players deck
				p.addCard(d.dealCard());
				System.out.println("You are dealt a new card: [" + p.getPlayersHand().get(2) +"]");
				System.out.println("Your hand now contains: " + p.getPlayersHand());
				break;
			case 2:
				System.out.println("meow");
				break;
				
		}
			//Updates hand totals after an hitting, staying, etc
			dealerTotal = driver.calculateHand(d.getDealersHand());  
			System.out.println(dealerTotal);
			playerTotal = driver.calculateHand(p.getPlayersHand());
			System.out.println(playerTotal);
			
			//enter if logic 
			if (playerTotal > 21) {
				System.out.println("You have busted!!");
//				System.out.println("The dealer collects your " + XXX + " pelts");
				//minus your beaver pelts
			}
				else if (dealerTotal > 21) {
					System.out.println("The dealer has busted!!");
//					System.out.println("The dealer slaps " + XXX + " pelts on the table");
			}
		}
		
		//End comparison logic/Prints out sums

//		System.out.println(" " + dealerTotal);		//prints sum of dealers hand
//		System.out.println("");
//		System.out.println(playerTotal);		//prints sum of players hand


		//later put in dealer/player loop till player is bust or quits
	}
	//calls the value assign from Rank enum and returns it
	public int calculateHand(List<Card> hand){  
		int total = 0;
		for (Card card : hand) {
			total = total + card.getRank().getNumVal();
		}
		return total;
	}
}
