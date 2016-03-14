

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestZetAnalyzer.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestZetAnalyzer
{
    /**
     * Default constructor for test class TestZetAnalyzer
     */
    public TestZetAnalyzer()
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
    public void testIsZetTrue()
    {
        assertEquals(true,ZetAnalyzer.isZet((new ZetCard(1,1,1,1)),(new ZetCard(2,2,2,2)),(new ZetCard(3,3,3,3))));
    }
    @Test
    public void testIsZetFalse()
    {
        assertEquals(false,ZetAnalyzer.isZet((new ZetCard(2,1,2,3)),(new ZetCard(1,2,3,1)),(new ZetCard(1,3,1,2))));
    }
    @Test
    public void testFindZet()
    {
        
    }
}
