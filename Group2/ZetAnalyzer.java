/**
 *  Provides static methods for finding sets.
 */

/*

  Tips:

  - Given a, b, c from {1, 2, 3}, they are all equal or all different if and only if
    (a + b + c) % 3 == 0.  This property can be used for testing three cards for a set
    easily.

    (For more mathematically inclined, the SET deck corresponds to the 4-dimensional vector
    space over the algebraic field {0, 1, 2} with modulo 3 arithmetic.  Three cards form a "set"
    if and only if the sum of the corresponding vectors is 0.) 

  - isZet and findZet are static methods.

  - in isZet, don't forget to check that the cards are not all the same.

  - Note that an array passed to findZet can have nulls in some of the elements.

*/

public class ZetAnalyzer
{
    public ZetAnalyzer()
    {
    }
    public static boolean isZet(ZetCard card1, ZetCard card2, ZetCard card3)
    {
        boolean n,s,f,c;
        boolean iset = false;
        if (card1.getNumber()+card2.getNumber()+card3.getNumber()%3 == 0)
            n = true;
        else
            n = false;
        if (card1.getShape()+card2.getShape()+card3.getShape()%3 == 0)
            s = true;
        else 
            s = false;
        if (card1.getFill()+card2.getFill()+card3.getFill()%3 == 0)
            f = true;
        else
            f = false;
        if (card1.getColor()+card2.getColor()+card3.getColor()%3==0)
            c = true;
        else 
            c = false;
        if ((n)&&(s)&&(f)&&(c))
        {
            iset = true;
            if (card1.equals(card2)||card2.equals(card3)||card3.equals(card1))
                iset = false;
        }
        return iset;
    }
    public static int[] findZet(ZetCard[] cards)
    {
        ZetCard[] zetar = new ZetCard [3];
        for (int i = 0; i<cards.length(); i++)
        {
            zetar[1] = cards[i];
            for (int k = 0; k<cards.length(); k++)
            {
                zetar[2] = cards[k];
                for(int c = 0; c<cards.length(); c++)
                {
                    zetar[3] = cards[c];
                    if (isZet(zetar[1],zetar[2],zetar[3]))
                        return zetar;
                }
            }
        }
        return null;
    }
}
