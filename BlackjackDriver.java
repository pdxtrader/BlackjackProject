package blackjack;

import java.util.Scanner;

public class BlackjackDriver {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		
		//Introduction
		System.out.println("Welcome to the blackjack table.");
		System.out.println("You start with 100 beaver pelts.");
		System.out.println("If you lose all pelts you will lose.");
		
		//
		
		
		
//		System.out.println(Character.toChars(0x1F0A2));
		System.out.println(Deck.newDeck());  //prints the full deck
	}
}
