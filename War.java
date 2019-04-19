/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nathan
 */
public class War extends Game {
    

    public War(String War,Suit s, Value gVal) {
        super (War,s, gVal);
    }
public static ArrayList <Card> p1Hand;
    public static ArrayList <Card> p2Hand;
    
    
    public static void makeHand() {
        
      for (int i=0; i <= 26; i++) {
          
          p1Hand.add(cards.get(i));
          p2Hand.add(cards.get(i++));
          
      }  
        Collections.shuffle(p1Hand);
          Collections.shuffle(p2Hand);
        
        
    }
    
    public static void declareWinner() {
        if (p1Hand.isEmpty() == true) {
            System.out.println("Player 2 is the winner!");
            System.exit(0);
        }
        
        if (p2Hand.isEmpty() == true) {
            System.out.println("Player 1 is the winner!");
            System.exit(0);
        }
        
        
    }
    
    public static int cardComparison(Card p1, Card p2) {
        int a = 0;
        int b = 0;
        switch (p1.getValue()) {
            case TWO:
                   a = 2; 
                               break;
                   case THREE:
                   a = 3; 
                              break;
                   case FOUR:
                   a = 4; 
                             break;
                   case FIVE:
                   a = 5; 
                             break;
                   case SIX:
                   a = 6; 
                             break;
                   case SEVEN:
                   a = 7; 
                             break;
                   case EIGHT:
                   a = 8;
                            break;
                   case NINE:
                   a = 9;
                              break;
                   case TEN:
                   a = 10;
                              break;
                   case JACK:
                   a = 11;
                              break;
                   case QUEEN:
                   a = 12;
                             break;
                   case KING:
                   a = 13;
                               break;
                   case ACE:
                   a = 14;
                              break;
                   
        }
        switch (p2.getValue()){
            case TWO:
                b = 2;
                        break;
                        case THREE:
                b = 3;
                        break;
                        case FOUR:
                b = 4;
                        break;
                        case FIVE:
                b = 5;
                        break;
                        case SIX:
                b = 6;
                        break;
                        case SEVEN:
                b = 7;
                        break;
                        case EIGHT:
                b = 8;
                        break;
                        case NINE:
                b = 9;
                        break;
                        case TEN:
                b = 10;
                        break;
                        case JACK:
                b = 11;
                        break;
                        case QUEEN:
                b = 12;
                        break;
                        case KING:
                b = 13;
                        break;
                        case ACE:
                b = 14;
                        break;
        }
       
        
        if (a > b) {
            return 1;
        }
        if (a == b) {
            return 3;
        }
        else return 2;
        
        
        
    }
    
    
    
    
    public static void play() {
        Scanner in = new Scanner(System.in);
        Player p1 = new Player();
        Player p2 = new Player();
        System.out.println("Player 1, please enter your name");
        p1.setPlayerID(in.nextLine());
        System.out.println("Player 2 please enter your name");
        p2.setPlayerID(in.nextLine());
        makeDeck();
        makeHand();
        int option;
        
        while(true) {
            System.out.println("Push 1 to draw cards");
            System.out.println("Push 2 to exit the program");
        option = in.nextInt();
        switch (option) {
            case 1:
               if (cardComparison(p1Hand.get(1), p2Hand.get(2)) == 1); {
                System.out.println("Player 1 wins the draw");
            }
               if (cardComparison(p1Hand.get(1), p2Hand.get(2)) == 2); {
                System.out.println("Player 2 wins the draw");
            }
               if (cardComparison(p1Hand.get(1), p2Hand.get(2)) == 3); {
                System.out.println("The round is a draw");
            }
               declareWinner();
               
                break;
            case 2:
                System.exit(0);
        
        default: 
        System.out.println("Wrong entry");
        }
    }
        
        
        
        
    }

    public static void main(String [] args) {
        play();
    }
    
    
}


