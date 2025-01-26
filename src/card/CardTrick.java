package card;

import java.util.Random;
import java.util.Scanner;

/**
 * MODIFIER : CHITWEN ARORA
 * DATE : 25:01:2025
 * STUDENT ID :991781047
 */

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        Random random = new Random();

        // Fill magicHand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            int value = random.nextInt(13) + 1; // card values 1 to 13
            String suit = suits[random.nextInt(suits.length)];

            Card c = new Card();
            c.setValue(value);
            c.setSuit(suit);
            magicHand[i] = c;
        }

        
        System.out.println("Magic Hand:");
        for (Card card : magicHand) {
            System.out.println(card);
        }

       
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPick a card value (1-13):");
        int userValue = scanner.nextInt();
        System.out.println("Pick a suit (Hearts, Diamonds, Clubs, Spades):");
        String userSuit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean foundUserCard = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                foundUserCard = true;
                break;
            }
        }

        
        if (foundUserCard) {
            System.out.println("Your card is in the magic hand! You win!");
        } else {
            System.out.println("Your card is not in the magic hand. You lose.");
        }

      
        Card luckyCard = new Card();
        luckyCard.setValue(2); 
        luckyCard.setSuit("Clubs"); 

        boolean foundLuckyCard = false;
        for (Card card : magicHand) {
            if (card.equals(luckyCard)) {
                foundLuckyCard = true;
                break;
            }
        }

        System.out.println("\nLucky Card: " + luckyCard);
        if (foundLuckyCard) {
            System.out.println("The lucky card is in the magic hand! You win!");
        } else {
            System.out.println("The lucky card is not in the magic hand. You lose.");
        }
    }
}


