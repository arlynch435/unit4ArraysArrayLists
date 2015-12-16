

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
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
    /**
     * tests for one mosnter location at (50,50)
     * only works in code where ManyMonsters is not present
     */
    public void testOneMonster5050()
    {
        final int ROWS = 100;
        final int COLS = 100;
        Radar testRadar = new Radar(ROWS, COLS);
        testRadar.setMonsterLocation(50,50);
        for (int i=0;
             i<100;
             i++)
             {
                 testRadar.scan();
                }
        int largestRow=0;
        int largestColumn=0;
        int largestAccumulated=0;
        for (int i=0;
             i<testRadar.getNumRows();
             i++)
             {
                 for (int j=0;
                      j<testRadar.getNumCols();
                      j++)
             {
                 if (testRadar.getAccumulatedDetection(i,j)>largestAccumulated)
                 {
                     largestAccumulated=testRadar.getAccumulatedDetection(i,j);
                     largestRow=i;
                     largestColumn=j;
                    }
                }
            }
        assertEquals(50,largestRow);
        assertEquals(50,largestColumn);
    }
    @Test
    /**
     * tests for one mosnter location at (42,42)
     * only works in code where ManyMonsters is not present
     */
    public void testOneMonster4242()
    {
        final int ROWS = 100;
        final int COLS = 100;
        Radar testRadar = new Radar(ROWS, COLS);
        testRadar.setMonsterLocation(42,42);
        for (int i=0;
             i<100;
             i++)
             {
                 testRadar.scan();
                }
        int largestRow=0;
        int largestColumn=0;
        int largestAccumulated=0;
        for (int i=0;
             i<testRadar.getNumRows();
             i++)
             {
                 for (int j=0;
                      j<testRadar.getNumCols();
                      j++)
             {
                 if (testRadar.getAccumulatedDetection(i,j)>largestAccumulated)
                 {
                     largestAccumulated=testRadar.getAccumulatedDetection(i,j);
                     largestRow=i;
                     largestColumn=j;
                    }
                }
            }
        assertEquals(42,largestRow);
        assertEquals(42,largestColumn);
    }

}
