

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestZetTable.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestZetTable
{
    /**
     * Default constructor for test class TestZetTable
     */
    public TestZetTable()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        ZetTable table = new ZetTable();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void simulateGame()
    {
        while (table.cardsInDeck() != 0)
        {
            int[] indices = table.findZet();
            if (indices == null)
            {
                if (table.open3Cards())
                {
                    System.out.println(table);
                }
            }
            else
            {
                table.remove3Cards(indices);
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
