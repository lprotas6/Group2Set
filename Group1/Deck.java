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

public class Deck
{
    ArrayList<Card> deque;
    String something="";

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
        if(deque.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void add(Card card){
        deque.add(card);
    }

    public Card takeTop(){
        if (!isEmpty())
        {
            return deque.remove(deque.size()-1);
        }
        else
        {
            return null;
        }
    }

    public void shuffle(){
        
        Collections.shuffle(deque);
    }

    public void sort(){
     
        Collections.sort(deque);
    }

    public String toString(){
        for (int i = 0; i<deque.size(); i++)
        {
            something += takeTop() + "\n";
        }
        return something;
    }

}
