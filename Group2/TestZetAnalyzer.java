

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
<<<<<<< HEAD
       
=======
        assertEquals(true,ZetAnalyzer.isZet(ZetCard(1,1,2,3),ZetCard(1,2,3,1),ZetCard(1,3,1,2)));
>>>>>>> dd1a00c57ccf998e3214e847acc2ef9e4d5cf766
    }
    @Test
    public void testIsZetFalse()
    {
        assertEquals(true,ZetAnalyzer.isZet(ZetCard(2,1,2,3),ZetCard(1,2,3,1),ZetCard(1,3,1,2)));
    }
    @Test
    public void testFindZet()
    {
        
    }
}
