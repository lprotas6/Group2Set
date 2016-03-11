
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDeck extends Deck
{
    public TestDeck()
    {
        
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testCreateEmptyDeck()
    {
        Deck d = new Deck();
        assertEquals(true,d.isEmpty());
    }
    
    @Test
    public void testPrintOut()
    {
        Deck d = new Deck();
        Card c1 = new Card(4);
        Card c2 = new Card(7);
        Card c3 = new Card(9);
        d.add(c1);
        d.add(c2);
        d.add(c3);
        assertEquals(9, d.takeTop);
    }
    
    @Test
    public void testShuffle()
    {
        Deck d = new Deck();
    }
    
    @Test
    public void testSort()
    {
        Deck d = new Deck();
    }
    
    @Test
    public void testRemoveCompleteDeck()
    {
        Deck d = new Deck();
    }
}
