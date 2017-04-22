package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	    public static List<Card> newDeck() {
	        List<Card> deck = new ArrayList<>(52);

	        //creates deck from suit and rank
	        for (Suit s : Suit.values()) {
	        	for (Rank r : Rank.values()) {
	                deck.add(new Card(r, s));
	            }
	        	
	        //shuffles deck 
	        Collections.shuffle(deck);
	        	 
//	        	 for (Card card : deck) {
//                 System.out.println(card);
//        }
	        
//	             for (Card card : deck) {
//	                 System.out.println(card);
//	             }
	             
	             
//	             public class Hopper {
//	            		List<PingPongBall> teamPingPongBalls = new ArrayList<>(1000);
//
//
//	            		public PingPongBall hopperProcess() {
//	            			TeamNames[] names = TeamNames.values();
//	            			Seed[] seeds = { Seed.SEED1, Seed.SEED2, Seed.SEED3, Seed.SEED4, Seed.SEED5, Seed.SEED6, Seed.SEED7, Seed.SEED8,
//	            					Seed.SEED9, Seed.SEED10, Seed.SEED11, Seed.SEED12, Seed.SEED13, Seed.SEED14 };
//	            			for (int i = 0; i < names.length; i++) {
//	            				for (int j = 0; j < seeds[i].getNumVal(); j++) {
//	            					teamPingPongBalls.add(new PingPongBall(names[i], seeds[i]));
//	            				}
//	            			}
//
//	            			Collections.shuffle(teamPingPongBalls);
//	            			PingPongBall pick = new PingPongBall();
//	            			pick = teamPingPongBalls.get(0); // iterate by x of winners
//	            			

	            			
//	            			return pick; // return output	        	
	             
	             
	             
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
	   	 return deck;
	    }
	}