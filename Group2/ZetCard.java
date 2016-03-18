
import java.util.ArrayList;
public class ZetCard extends Card
{
    int number; //1 for one shape, 2 for two shapes, 3 for three shapes
    int shape; //1 for oval, 2 for squiggle, 3 for diamond
    int fill; //1 for empth, 2 for soild, 3 for striped
    int color; //1 for red, 2 for green, 3 for blue
    //ID is a unique number that only the card with that particular
                //combination of traits has
    String stringid;
    
    
    
    public ZetCard(int userNumber, int userShape, int userFill, int userColor)
    {
        super((userNumber-1)*27+(userShape-1)*9+(userFill-1)*3+(userColor-1));
        number=userNumber;
        shape=userShape;
        fill=userFill;
        color=userColor;
        
        stringid = ""+number+":"+shape+":"+fill+":"+color;
    }
    
    public int getNumber()
    {
        return number;
        
    }
    
    public int getShape()
    {
        return shape;
    }
    
    public int getFill()
    {
        return fill;
    }
    
    public int getColor()
    {
        return color;
    }
    
    public String toString()
    {
        return stringid;
    }
}



