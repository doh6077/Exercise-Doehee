package exercise1;
import java.util.Random; 
import java.util.Scanner; 
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Dohee Kim
 * @Date 27, May, 2023
 */
public class CardTrick {
    
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random = new Random(); 
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            card.setValue(random.nextInt(10)+1);
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit from 0 to 3 (inclusive)
            hand[i] = card;
        
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value (1 ~ 10) ");
        int value = scanner.nextInt();
        System.out.println("Enter the suit (0 ~ 3) ");
        int suit = scanner.nextInt();
        Card user = new Card();
        user.setValue(value);
        user.setSuit(Card.SUITS[suit]);
        
        for (int i =0 ; i<hand.length ; i++){
            if( user.getValue() == hand[i].getValue()&& user.getSuit().equals(hand[i].getSuit())){
                printInfo();
                break;
            }
        }
            
        }
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
       // I'm done! 
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Dohee");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Improve Sofe Skills");
   System.out.println();   

        System.out.println("My hobbies:");
        System.out.println("-- Cooking");
        System.out.println("-- Working out");

        System.out.println();
        
    
    }

}
