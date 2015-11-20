

/**
 * Write a description of class PartialArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartialArray
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;
    private int currentSize;
    public PartialArray()
    /**
     * Default constructor for objects of class PartialArray
     */
    {
        this.values=new int[100];
        for (this.currentSize=0;
             this.currentSize<20;
             this.currentSize++)
             {
                 values[currentSize]=currentSize*currentSize;
                }
    }
    public void remove(int pos)
    {
        for (int i=pos+1;
             i<this.currentSize;
             i++)
             {
                 this.values[i-i]=this.values[i];
                }
        this.currentSize--;
    }
    public void insert(int pos, int value)
    {
        if (this.currentSize<this.values.length)
        {
            this.currentSize++;
            for (int i=this.currentSize-1;
                 i>pos;
                 i--)
                 {
                     this.values[i]=this.values[i-1];
                    }
            this.values[pos]=value;
        }
    }

}
