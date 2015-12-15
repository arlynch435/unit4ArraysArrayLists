

/**
 * The monster that is placed within the radar
 * 
 * @author Austin Lynch
 * @version 12/15/15
 */
public class ManyMonsters
{
    /** the row array of the monsters*/
    private int[] row;
    /**the column array of the monsters*/
    private int[] col;
    /** how many monsters are in the array*/
    private int ticker;
    /**
     * Default constructor for objects of class Monster
     * @pre The length of the arrays must not be larger than the length of the radar sizes
     * @param   x    the array of row coordinates for the monsters
     * @param   y    the array of column cooordinates for the monsters
     */
    public ManyMonsters(int x, int y)
    {
        // initialise instance variables
        this.row= new int[x];
        this.col= new int[y];
        this.ticker=0;
    }

    /**
     * Sets the row and column of the monster.
     *
     * @pre        the parameters are within the radar size and ticker < array length
     * @param    x    the row index value
     * @param    y    the column index value
     */
    public void setPosition(int x, int y)
    {
        // put your code here
        this.row[ticker]=x;
        this.col[ticker]=y;
        this.ticker++;
    }
    /**
     * Returns the row the monster is located in.
     * @return    returns the row index of the monster
     */
    public int[] getRow()
    {
        // put your code here
        return this.row;
    }
    /**
     * Returns the column the monster is located in.
     * @return    returns the column index of the monster
     */
    public int[] getCol()
    {
        // put your code here
        return this.col;
    }

}
