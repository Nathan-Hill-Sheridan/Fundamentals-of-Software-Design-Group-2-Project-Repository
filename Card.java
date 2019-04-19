/**
 * Card code
 * Nathan Hill
 * 991543139
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public  class Card 
{
    public enum Suit{HEARTS,CLUBS,SPADES,DIAMONDS};
    public enum Value{ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN
    ,JACK,QUEEN,KING};
    //------------------------------------------------------------------------
private Suit suit;
	private Value value;
        
        public Card() {
            
        }
        
        public Card (Suit s, Value gVal) {
            suit = s;
            value = gVal;
        }

    
	public Suit getSuit() {
		return this.suit;
	}


	public Value getValue() {
		return this.value;
	}

    
    
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    
  public String toString() {
      return getValue() + "of " + getSuit();
  }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }
    
}
