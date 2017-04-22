package blackjack;

public class Card {
	   private Rank rank;
	    private Suit suit;

	    public Card(Rank r, Suit s) {
	        rank = r;
	        suit = s;
	    }

	    @Override
	    public String toString() {
	        return (rank + " of " + suit).toLowerCase();  // formats for sysout
	    }
	    
	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result
	        		+ ((rank == null) ? 0 : rank.hashCode());
	        result = prime * result
	        		+ ((suit == null) ? 0 : suit.hashCode());
	        return result;
	    }
	    
	//  Modify Card.java and Deck.java so that the cards are
	//  printed in a sorted order, with rank sorting before suit.
	    
	    
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Card other = (Card) obj;
	        if (suit != other.suit)
	        	return false;
	        if (rank != other.rank)
	            return false;
	        return true;
	    }
	}

