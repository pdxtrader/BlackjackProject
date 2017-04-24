package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private int beaverPelts;
	private int peltsBeingBet;

	private List<Card> playersHand = new ArrayList<>();
	
	public void playerGetsDealt(){
//		playersHand.add(deck.remove(0));  				//moves a card from deck to dealer
//		playersHand.add(deck.remove(0));  				//moves another card from deck to dealer
		int total = 0;									//initializing what will hold dealer hand score
		for (Card card : playersHand) {					//iterates through dealer hand
			System.err.println(card);					
			total = total + card.getRank().getNumVal();	//calls the values stored in enum to dealer hand score
		}
		System.err.println(total);
	}
	
	public void addCard(Card c){
		playersHand.add(c);
	}
	
	public int getPeltsBeingBet() {
		return peltsBeingBet;
	}

	public void setPeltsBeingBet(int peltsBeingBet) {
		this.peltsBeingBet = peltsBeingBet;
	}
	public int getBeaverPelts() {
		return beaverPelts;
	}

	public void setBeaverPelts(int beaverPelts) {
		this.beaverPelts = beaverPelts;
	}

	public List<Card> getPlayersHand() {
		return playersHand;
	}

	public void setPlayersHand(List<Card> playersHand) {
		this.playersHand = playersHand;
	}
	
}
