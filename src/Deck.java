import java.util.*;
public class Deck {

	public static void main(String[] args) {
		
		List<String> deck = new ArrayList<String>();
		for(int i = 0; i <= 2; i++) {
			deck.add("estate");
		}
		for(int i = 0; i <= 6; i++) {
			deck.add("copper");
		}
			
		System.out.println(deck);
		Collections.shuffle(deck);
		System.out.println(deck);
		List<String> hand = new ArrayList<String>();
		for(int i = 0; i <= 4; i++) {
			hand.add(deck.get(i));
			deck.remove(i);
		}
		System.out.println(hand);
		System.out.println(deck);

	}
}
