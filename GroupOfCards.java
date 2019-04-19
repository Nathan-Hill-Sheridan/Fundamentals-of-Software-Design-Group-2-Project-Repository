/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards extends Card 
{
    
   
   
    //The group of cards, stored in an ArrayList
    public static ArrayList <Card> cards;
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize, Suit s, Value gVal)
    {
        super(s, gVal);
        size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    /*runs through the values for each suit, and each time it does this, 
    it assigns one value at a time, 13 times each for each suit, totaling
    up to 52 cards.
    */
    
 public static void makeDeck() {
     for (Card.Suit s: Card.Suit.values()) {
         
         for(Card.Value v: Card.Value.values()) {
             
            Card card = new Card();
            card.setValue(v);
            card.setSuit(s);
            cards.add(card);
         }
     }
     shuffle();
 }
        
        
    
    
    
    
    public static void shuffle()
    {
  
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

    @Override
    public String toString() {
        return "";
    }
    
}//end class
