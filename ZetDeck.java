import java.util.*;
/**
 * Write a description of class ZetDeck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZetDeck extends Deck
{
    ArrayList<ZetCard> zetDeque; 
    /**
     * Constructor for objects of class ZetDeck
     */
    public ZetDeck()
    {
        super(81);
        for (int number=1; number<4; number++){
            //for loop to go through each shape
            for (int shape=1; shape<4; shape++){
                //for loop to go through each fill
                for (int fill=1; fill<4; fill++){
                    //for loop to go through each color
                    for (int color=1; color<4; color++){
                        //add a ZetCard with your 4 parameters
                        add(new ZetCard(number, shape, fill, color));
                    }
                }
            }
        }
        }
    }
