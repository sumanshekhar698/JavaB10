package com.java.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();

		// Bonus: shuffle before drawing
		deck.shuffle();

		List<Card> drawnCards = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			drawnCards.add(deck.drawCard());
		}

		// Sort using Comparator.comparing and thenComparing
//        Collections.sort(drawnCards,
//                Comparator.comparing(Card::getSuit)
//                        .thenComparing(Card::getRank));

		// Sort using Comparator.comparing and thenComparing, prioritizing red suits
		// using modulo based on suit ordinal
		Comparator<Card> cardComparator_1 = Comparator.comparing((Card card) -> card.getSuit().ordinal() % 2)
				.thenComparing(Card::getSuit, Comparator.naturalOrder())
				.thenComparing(Card::getRank, Comparator.naturalOrder());// Don't change the order of Enums else it wil
																			// not work

		Comparator<Card> cardComparator_2 = Comparator.comparing((Card card) -> card.getSuit().ordinal() % 2)
				.thenComparing(Card::getSuit).thenComparing(Card::getRank);// Comparator.naturalOrder() its optional
																			// cause Java default behavior is natural
																			// order but recommended to mention as it
																			// avoids confusion

		Comparator<Card> cardComparator_3 = Comparator.comparing((Card card) -> card.getSuit().ordinal() % 2)
				// Compare suits within color using enum constant's intValue
				.thenComparing(card -> card.getSuit().ordinal(), Comparator.naturalOrder())
				// Compare ranks using associated integer values
				.thenComparing(card -> card.getRank().getValue());

		// Compare suits based on assigned values
		Comparator<Card> cardComparator_4 = Comparator.comparing((Card card) -> card.getSuit().getValue())
				// Compare ranks using associated integer values
				.thenComparing(card -> card.getRank().getValue());

		Collections.sort(drawnCards, cardComparator_4);
		System.out.println("Drawn cards (sorted):");
		for (Card card : drawnCards) {
			System.out.println(card);
		}
	}
}