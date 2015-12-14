

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
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

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
    public void testOneMonster()
    {
        Radar testRadar=new Radar(100,100);
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
                      i++)
             {
                 if (testRadar.getAccumulatedDetection(i,j)>largestAccumulated)
                 {
                     largestAccumulated=testRadar.getAccumulatedDetection(i,j);
                     largestRow=i;
                     largestColumn=j;
                    }
                }
            }
        if(largestRow == 50 && largestColumn == 50)
            {
                
            }
    }

}
