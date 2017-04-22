package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	    public static void main(String[] args) {
	        List<Card> deck = new ArrayList<>(52);

	        for (Suit s : Suit.values()) {
	        	for (Rank r : Rank.values()) {
	                deck.add(new Card(r, s));
	            }      
	        	 for (Card card : deck) {
	                 System.out.println(card);
	        }
	        	 Collections.shuffle(deck);

	             for (Card card : deck) {
	                 System.out.println(card);
	             }
	        	
//	        	Card c1 = new Card(Rank.SEVEN, Suit.CLUBS);
//	        	Card c2 = new Card(Rank.EIGHT, Suit.HEARTS);
//	        	
//	        	System.out.println(c1.rank.ordinal());
//	        	System.out.println(c1.rank.compareTo(c1.rank));
//	        	
//	        	if (c1.rank.ordinal() > c2.rank.ordinal());
	        	
	       	
	        
//	        2: Modify Deck.java again so that in addition to printing the sorted cards,
//	        you also print out the same cards after they have been shuffled.
	        
	       
	        }
	    }

	    


	}