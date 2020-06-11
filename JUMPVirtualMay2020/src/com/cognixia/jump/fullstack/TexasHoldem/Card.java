package com.cognixia.jump.fullstack.TexasHoldem;

import java.util.Map;

public class Card {

	private final Rank RANK;
	private final Suit SUIT;
	
	private final static Map<String, Card> CARD_CACHE = initCache();
	
	private static Map<String, Card> initCache() {
		
		final Map<String, Card> cache = new HashMap<>();
		for(final Suit suit: Suit.values()) {
			for(final Rank rank: Rank.values()) {
				cache.put     
			}
			
		}
	}
	private Card(final Rank rank,
				final Suit suit) {
			this.RANK = rank;
			this.SUIT = suit;
	}
	
	

	enum Suit {
		DIAMONDS,
		CLUBS,
		HEARTS,
		SPADES
	}
	enum Rank {
		TWO(2),
		THREE(3),
		FOUR(4),
		FIVE(5),
		SIX(6),
		SEVEN(7),
		EIGHT(8),
		NINE(9),
		TEN(10),
		JACK(11),
		QUEEN(12),
		KING(13),
		ACE(14);
		
		private final int rankValue;
		
		Rank(final int rankValue) {
			this.rankValue = rankValue;
		}
	};
	
	
}
