/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Damali Baker
 * @studentNumber 991818099
 * @dateModified 2025-09-19
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rnd = new Random();
                
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rnd.nextInt(1, 14)); 
            c.setSuit(Card.SUITS[rnd.nextInt(4)]);
            
            magicHand[i] = c;
        }
        
        Scanner inp = new Scanner(System.in);
      
        System.out.print("Enter a card value (1-13): ");
        int value = inp.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        String suit = Card.SUITS[inp.nextInt()];
        
        boolean isFound = false;
        
        for (int i=0; i<magicHand.length; i++)
        {
            if (magicHand[i].getValue() == value && magicHand[i].getSuit().equals(suit)) {
                isFound = true;
                break;
            }
        }
        
        if (isFound) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        }
        else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
    
}
