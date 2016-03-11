/**
 *  Represents a generic deck of cards.
 */

/*

  Tips:

  - Use an ArrayList<Card> to hold the cards.
  - Add and remove cards at the end of the list.
  - Use Collections.shuffle and Collections.sort to shuffle and sort the deck,
    or write your own methods.  If you write your own, use selection sort
    to sort and a similar algorithm to shuffle.  Use Math.random().
  - In the toString method, separate strings for individual cards with "\n".

*/

import java.util.*;

public class Deck extends Card
{
    ArrayList<Card> deque;
    public Deck(){
        
        deque = new ArrayList<Card>();
        
    }
    
    public Deck(int capacity){
        
        deque = new ArrayList<Card>(capacity);
        
    }
    
    public int getNumCards(){
        return deque.size();
    }
    
    public boolean isEmpty(){
        if(stack.empty()==true){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void add(Card card){
        stack.push(card);
    }
    
    public Card takeTop(){
        stack.pop();
        return stack.peek();
    }
    
    public void shuffle(){
        
    }
    
    public void sort(){
        
    }
    
    public String toString(){
        return "HELLO";
    }
    
    
}
