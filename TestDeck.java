
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
        assertEquals(9, d.takeTop().getId());
    }
    
    @Test
    public void testShuffle()
    {
        Deck d = new Deck();
        Deck d2 = new Deck();
        Card c1 = new Card(4);
        Card c2 = new Card(7);
        Card c3 = new Card(9);
        d.add(c1);
        d.add(c2);
        d.add(c3);
        d2.add(c1);
        d2.add(c2);
        d2.add(c3);
        d.shuffle();
        assertEquals("This test should fail.....",d,d2);
    }
    
    @Test
    public void testSort()
    {
        Deck d = new Deck();
        Deck d2 = new Deck();
        Card c1 = new Card(4);
        Card c2 = new Card(7);
        Card c3 = new Card(9);
        d.add(c1);
        d.add(c2);
        d.add(c3);
        d2.add(c1);
        d2.add(c2);
        d2.add(c3);
        d.shuffle();
        boolean shuffleWorks;
        d.sort();
        shuffleWorks = d2.toString().equals(d.toString());
        assertTrue(shuffleWorks);
    }
    
    @Test
    public void testRemoveCompleteDeck()
    {
        Deck d = new Deck();
        Card c1 = new Card(7);
        Card c2 = new Card(83);
        Card c3 = new Card(946);
        int[] correctIds = {946, 83, 7};
        int[] addedIds = new int[3];
        d.add(c1);
        d.add(c2);
        d.add(c3);
        addedIds[0] = d.takeTop().getId();
        addedIds[1] = d.takeTop().getId();
        addedIds[2] = d.takeTop().getId();
        assertArrayEquals(correctIds, addedIds);
    }
}
