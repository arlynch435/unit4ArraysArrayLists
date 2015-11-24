

/**
 * Write a description of class ArrayMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMethods
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;

    /**
     * Default constructor for objects of class ArrayMethods
     */
    public ArrayMethods(int[] initialValues)
    {
        // initialise instance variables
        this.values=initialValues;
    }

    public void swapFirstAndLast()
    {
        int temp=this.values[0];
        this.values[0]=this.values[this.values.length-1];
        this.values[this.values.length-1]=temp;
    }
    public void shiftRight()
    {
        int temp=this.values[this.values.length-1];
        for(int i=this.values.length-1;
            i>0;
            i--)
            {
                this.values[i+1]=this.values[i];
            }
        this.values[0]=temp;
    }
    public void setZero()
    {
        for (int i=0;
             i<this.values.length;
             i++)
             {
                 this.values[i]=0;
                }
    }
    public void replaceWithLarger()
    {
        int[] newSet=new int[this.values.length];
        newSet[0]=this.values[0];
        newSet[this.values.length-1]=this.values[this.values.length-1];
        for (int i=1;
             i<this.values.length-2;
             i++)
             {
                 if (this.values[i-1]>this.values[i+1])
                 {
                     newSet[i]=this.values[i-1];
                    }
                 else if (this.values[i-1]<this.values[i+1])
                 {
                     newSet[i]=this.values[i+1];
                    }
                 else
                 {
                     newSet[i]=this.values[i];
                    }
                }
        this.values=newSet;
    }
    public void removeMiddle()
    {
        int[] newSet= {};
        if (this.values.length%2==0)
        {
            int[] newSet=new int[this.values.length-1];
            int middle=(this.values.length/2);
            for (int i=0;
                 i<middle;
                 i++)
                 {
                     newSet[i]=this.values[i];
                    }
            for (int i=middle+1;
                 i<this.values.length;
                 i++)
                 {
                     newSet[i-1]=this.values[i];
                    }
        }
        else
        {
           int[] newSet=new int[this.values.length-2];
           int middle1=(this.values.length/2)-1;
           int middle2=this.values.length/2;
           for (int i=0;
                i<middle1;
                i++)
                {
                    newSet[i]=this.values[i];
                }
           for (int i=middle2+1;
                i<this.values.length;
                i++)
                {
                    newSet[i-2]=this.values[i];
                }
        }
        this.values=newSet;
    }
    public void moveEvens()
    {
        int[] newSet=new int[this.values.length];
        int counter =0;
        for (int i=0;
             i<this.values.length;
             i++)
             {
                 if (this.values[i]%2==0)
                 {
                     newSet[counter]=this.values[i];
                     counter++;
                    }
                }
        int counter2=0;
        for (int i=0;
             i<this.values.length;
             i++)
             {
                 if (this.values[i]%2!=0)
                 {
                     newSet[counter+counter2]=this.values[i];
                     counter2++;
                    }
                }
        this.values=newSet;
    }
    public int findSecondLargest()
    {
        int secondLargest=0;
        int largest=0;
        for (int i=0;
             i<this.values.length;
             i++)
             {
                 if (this.values[i]>largest)
                 {
                     largest=this.values[i];
                    }
                }
        for (int i=0;
             i<this.values.length;
             i++)
             {
                 if (this.values[i]>secondLargest &&
                     this.values[i]!=largest)
                 {
                     secondLargest=this.values[i];
                    }
                }
        return secondLargest;
    }

}
