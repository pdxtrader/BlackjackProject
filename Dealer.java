package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
	private List<Card> dealersHand = new ArrayList<>();
	private List<Card> deck = new ArrayList<>(52);
	
	public  List<Card> newDeck() {
		// creates a new deck and shuffles the deck
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
				
				Collections.shuffle(deck);
			}
		}
		return deck;
	}
		
	public void addCard(Card c){  	//add a card to the dealers hand
		dealersHand.add(c);
	}

	public Card dealCard(){			//removes the top card of the deck
		return deck.remove(0);
	}

	public List<Card> getDealersHand() {
		return dealersHand;
	}

	public void setDealersHand(List<Card> dealersHand) {
		this.dealersHand = dealersHand;
	}
//	public void resetDealersHand(List<Card> dealersHand) {
//		dealersHand.clear();
//	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
//	public void initialDeal(){
//		dealersHand.add(deck.remove(0));  				//moves a card from deck to dealer
//		dealersHand.add(deck.remove(0));  				//moves another card from deck to dealer
//		int total = 0;									//initializing what will hold dealer hand score
////		for (Card card : dealersHand) {					//iterates through dealer hand
////			System.err.println(card);					
////			total = total + card.getRank().getNumVal();	
////		}
////		System.err.println(total);
//	}

}


