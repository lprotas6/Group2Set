

public class ZetCard extends Card
{
    int number; //1 for one shape, 2 for two shapes, 3 for three shapes
    int shape; //1 for diamond, 2 for oval, 3 for squiggle
    int fill; //1 for empty, 2 for dashed, 3 for solid
    int color; //1 for red, 2 for green, 3 for purple
    int id; //ID is a unique number that only the card with that particular
                //combination of traits has
    public ZetCard(int userNumber, int userShape, int userFill, int userColor)
    {
        number=userNumber;
        shape=userShape;
        fill=userFill;
        color=userColor;
        
    }


}
