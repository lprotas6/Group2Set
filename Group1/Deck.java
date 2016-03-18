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
        
        return deque.remove(deque.size()-1);

    }

    public void shuffle(){
        
        Collections.shuffle(deque);
    }

    public void sort(){
     
        Collections.sort(deque);
    }

    public String toString(){
        String deckString="";
        for (int i = 0; i<deque.size(); i++)
        {
            System.out.println("a");
            deckString+=deque.get(i).toString()+"\n";
            //takeTop().toString()+"\n";
        }
        return deckString;
    }

}
