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
		System.out.println("");
		System.out.println("The dealer begins shuffling the deck.");
		Dealer.newDeck();
		
		//Make your wager class
		
		
		//later put in dealer/player loop till player is bust or quits
		//Dealer deals
		Dealer.deal();
		
		Rank.getNumVal(0);
		
		
//		System.out.println(Character.toChars(0x1F0A2));
//		System.out.println(Deck.newDeck());  //prints the full deck
	}
}
