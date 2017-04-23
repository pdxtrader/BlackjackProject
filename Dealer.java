package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
	List<Card> dealersHand = new ArrayList<>();
	List<Card> deck = new ArrayList<>(52);
	
	public  List<Card> newDeck() {

		// creates deck from suit and rank
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
				
				Collections.shuffle(deck);
			}
		}
		return deck;
	}
	
	public void initialDeal(){
		dealersHand.add(deck.remove(0));
		dealersHand.add(deck.remove(0));
		int total = 0;
		for (Card card : dealersHand) {
			System.err.println(card);
			total = total + card.getRank().getNumVal();
		}
		System.err.println(total);
	}

	public  void deal() {
		List<Card> myDeck = newDeck();
		
		
//		System.out.println("The dealer places a card face down");
		
		//could use an if ^\w = one (1), etc (might have to use a split string)
		
//		
//		System.out.println(myDeck);
		
		
		//if face up card for dealer isn't 
		
	
		System.out.println("The dealer shows is showing : " + myDeck.get(0));
		
		
		
//		MyDeck.remove.equals 'ace'
//		myDeck.remove(0);
//		
//		//if ace also flip to enable a -10 if they exceed 21
//		
//		//seeds[i].getNumVal()
//		
//		System.out.println(myDeck);
//		
		
		
		
//		Integer dealerCardValueCardOne = deck.getDeck().get(0).getCardNumber().getValue()
//		so then the value of the variable dealerCardValueCardOne for example is the integer value
		
			//.add
			//subtract the dealt card from the deck
			//.get
			//.remove
		
	}

}


