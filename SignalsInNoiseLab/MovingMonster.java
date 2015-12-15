

/**
 * The monster that is placed within the radar
 * 
 * @author Austin Lynch
 * @version 12/15/15
 */
public class MovingMonster
{
    /** the row index value of the monster */
    private int row;
    /**the column index value of the mosnter*/
    private int col;
    /**the change in column after each scan*/
    private int dx;
    /**the change in row after each scan*/
    private int dy;

    /**
     * Default constructor for objects of class Monster
     * @param   x    the row speed of the monster
     * @param   y    the column speed of the monster
     * @param   row    the row index of the monster
     * @param   col    the column index of the monster
     */
    public MovingMonster(int row, int col, int x, int y)
    {
        // initialise instance variables
        this.row=row;
        this.col=col;
        this.dx=x;
        this.dy=y;
    }

    /**
     * Sets the row and column of the monster.
     *
     * @pre        the parameters are within the radar size
     * @param    x    the row index value
     * @param    y    the column index value
     */
    public void setPosition(int x, int y)
    {
        // put your code here
        this.row=x;
        this.col=y;
    }
    /**
     * Moves the monster based on its speed.
     *
     */
    public void travel()
    {
        // put your code here
        this.row+=this.dy;
        this.col+=this.dx;
    }
    /**
     * Returns the row the monster is located in.
     * @return    returns the row index of the monster
     */
    public int getRow()
    {
        // put your code here
        return this.row;
    }
    /**
     * Returns the column the monster is located in.
     * @return    returns the column index of the monster
     */
    public int getCol()
    {
        // put your code here
        return this.col;
    }

}
