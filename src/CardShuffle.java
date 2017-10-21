import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CardShuffle {
	//Gets 15 random numbers in a list
		public List<Integer> cardShuffle() {
			List<Integer> listNumbers = new ArrayList<Integer>();
			for (int i = 0; i <= 24; i++)  listNumbers.add(i);
			Collections.shuffle(listNumbers);		
			for (int i = 0; i <= 14; i++) listNumbers.remove(10);
			return listNumbers;	
		}
		
		//Turns numbers into a card name
		public List<String> cardAssign() {
			List<Integer> listNumbers = cardShuffle();
			List<String> listCards = new ArrayList<String>();
			for (int i = 0; i <=9; i++) {
				listCards.add(whatCard(listNumbers.get(i)));
			}
			
			return listCards;
				
					
		}

		public String whatCard(int cardID) {
			String card;
			switch (cardID) {
				case 0: card = "Chapel";
						break;
				case 1: card = "Cellar";
						break;
				case 2: card = "Moat";
						break;
				case 3: card = "Chancellor";
						break;
				case 4: card = "Village";
						break;
				case 5: card = "Woodcutter";
						break;
				case 6: card = "Workshop";
						break;
				case 7: card = "Bureaucrat";
						break;
				case 8: card = "Feast";
						break;
				case 9: card = "Gardens";
						break;
				case 10: card = "Militia";
						break; 
				case 11: card = "Moneylender";
						break;
				case 12: card = "Remodel";
						break;
				case 13: card = "Smithy";
						break;
				case 14: card = "Spy";
						break;
				case 15: card = "Thief";
						break;
				case 16: card = "Throne Room";
						break;
				case 17: card = "Council Room";
						break;
				case 18: card = "Festival";
						break;
				case 19: card = "Labortory";
						break;
				case 20: card = "Library";
						break;
				case 21: card = "Market";
						break;
				case 22: card = "Mine";
						break;
				case 23: card = "Witch";
						break;
				case 24: card = "Adventurer";
						break;
				default: card = "Invalid";
						break;							
			}
			return card;
			
			
		}
}
