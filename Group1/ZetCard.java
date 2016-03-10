

public class ZetCard extends Card
{
    int number; //1 for one shape, 2 for two shapes, 3 for three shapes
    int shape; //1 for oval, 2 for squiggle, 3 for diamond
    int fill; //1 for empth, 2 for soild, 3 for striped
    int color; //1 for red, 2 for green, 3 for blue
    int id; //ID is a unique number that only the card with that particular
                //combination of traits has
    String tostring;
    
    
    int[][][][] idArray = new int[3][3][3][3];
    
    
    public ZetCard(int userNumber, int userShape, int userFill, int userColor)
    {
        number=userNumber;
        shape=userShape;
        fill=userFill;
        color=userColor;
        
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
        return tostring;
    }
}



