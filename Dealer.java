package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
	
	public static List<Card> newDeck() {
		List<Card> deck = new ArrayList<>(52);

		// creates deck from suit and rank
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
				
				Collections.shuffle(deck);
			}
		}
		return deck;
	}

	public static void deal() {
		List<Card> myDeck = newDeck();
		System.out.println("The dealer places a card face down");
		
		
		System.out.println(myDeck);
		
		
		//if face up card for dealer isn't 
		
	
		System.out.println("The dealer shows is showing : " + myDeck.get(0));
		//getNumVal();
		myDeck.remove(0);
		
		//seeds[i].getNumVal()
		
		System.out.println(myDeck);
		
//		Integer dealerCardValueCardOne = deck.getDeck().get(0).getCardNumber().getValue()
//		so then the value of the variable dealerCardValueCardOne for example is the integer value
		
			//.add
			//subtract the dealt card from the deck
			//.get
			//.remove
		
	}

}


