


public class ArrayOperations
{
    public static void main(String[] args)
    {
        double[] x= {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("There are "+x.length+" elementss in the array");
        System.out.println("The value at index 0 is: "+x[0]);
        System.out.println("The value at the last index is: "+x[8]);
        System.out.println("The value at the last index is: "+x[x.length-1]);
        for (int i=0;
             i<x.length;
             i++)
             {
                 System.out.println(x[i]);
                }
        for (int i=0;
             i<x.length;
             i++)
             {
                 System.out.println("The value at index "+i+" is "+x[i]);
                }
        for (int i=x.length-1;
             i>=0;
             i--)
             {
                 System.out.println("The value at index "+i+" is "+x[i]);
                }
        for (double value:x)
        {
            System.out.println(value);
        }
    }

}
