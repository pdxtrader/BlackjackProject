package blackjack;

public class Card {
	    private Rank rank;
	    private Suit suit;
  
	    public Rank getRank() {
			return rank;
		}

		public void setRank(Rank rank) {
			this.rank = rank;
		}

		public Suit getSuit() {
			return suit;
		}

		public void setSuit(Suit suit) {
			this.suit = suit;
		}

		public Card(Rank r, Suit s) {
	        rank = r;
	        suit = s;
//	        Rank[] rvalue = { Rank.Ace, Rank.Two, Rank.Three, Rank.Four, Rank.Five, Rank.Six, Rank.Seven, Rank.Eight,
//					Rank.Nine, Rank.Ten, Rank.Jack, Rank.Queen, Rank.King };
	    }
	    
	    public Card() {
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

