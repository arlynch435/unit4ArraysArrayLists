

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
                 this.values[i-1]=this.values[i];
                }
        this.currentSize--;
    }
    public void insert(int pos, int value)
    {
        if (this.currentSize==this.values.length)
        {
            this.growArray();
        }
            this.currentSize++;
            for (int i=this.currentSize-1;
                 i>pos;
                 i--)
                 {
                     this.values[i]=this.values[i-1];
                    }
            this.values[pos]=value;
    }
    public void swap(int posA,int posB)
    {
        int temp=this.values[posA];
        this.values[posA]=this.values[posB];
        this.values[posB]=temp;
    }
    private void growArray()
    {
        int totalSize= this.values.length;
        int[] newArray= new int[totalSize*2];
        for (int i=0;
             i<totalSize;
             i++)
             {
                 newArray[i]=this.values[i];
                }
        this.values=newArray;
    }
    public static void main(String[] args)
    {
        PartialArray weee=new PartialArray();
        weee.remove(5);
        weee.insert(5,6);
        weee.swap(5,2);
    }

}
