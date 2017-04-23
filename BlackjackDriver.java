package blackjack;

import java.util.Scanner;

public class BlackjackDriver {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		//Introduction
		System.out.println("Welcome to the blackjack table.");
		System.out.println("You start with 100 beaver pelts.");
		System.out.println("If you lose all pelts you will be");
		System.out.println("escorted from the premise peltless.");
		
		//Do you want to continue (Y | N)
		
		//Assign a new deck and shuffle it
		Dealer d = new Dealer();
		System.out.println("");
		System.out.println("The dealer begins shuffling the deck.");
		d.newDeck();
//		
//		//Make your wager class
//		d.initialDeal();
//		
//		//later put in dealer/player loop till player is bust or quits
//		//Dealer deals
//		d.deal();
//		
//		
//		Rank.getNumVal(0);
		
		
//		System.out.println(Deck.newDeck());  //prints the full deck
	}
}
