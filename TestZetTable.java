
/**
 * Write a description of class TestZetTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestZetTable
{
    public static void main (String[] args)
    {
        ZetTable table = new ZetTable();
        System.out.println(table.cardsInDeck());
        while (table.cardsInDeck() != 0)
        {
            int[] indices = table.findZet();
            if (indices == null)
            {
                if (table.open3Cards())
                {
                    System.out.println(table.toString());
                }
                else
                {
                    break;
                }
            }
            else
            {
                table.remove3Cards(indices);
                System.out.println(table.toString());
                if (!table.enoughOpen())
                {
                    if (!table.open3Cards())
                    {
                        break;
                    }
                }
            }
        }
    }
}
