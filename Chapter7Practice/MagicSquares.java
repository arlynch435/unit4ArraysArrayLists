import java.util.Scanner;


public class MagicSquares
{
    public static void main(String[] args)
    {
        int[][] grid= new int[4][4];
        Scanner s= new Scanner(System.in);
        System.out.print("Please enter 16 integers that will be placed from right to left, and then restart in the next row");
        for (int i=0;
             i<grid.length;
             i++)
        {
            for (int j=0;
             j<grid[i].length;
             j++)
          {
             int number= s.nextInt();
             if (number<=16 &&
                 number>=1)
             {
                 grid[i][j]=number;
                 number=s.nextInt();
                }
          }
        }
        int row1=0;
        for (int i=0;
             i<grid[0].length;
             i++)
             {
                 row1+=grid[0][i];
                }
        int row2=0;
        for (int i=0;
             i<grid[1].length;
             i++)
             {
                 row2+=grid[1][i];
                }
        int row3=0;
        for (int i=0;
             i<grid[2].length;
             i++)
             {
                 row3+=grid[2][i];
                }
        int row4=0;
        for (int i=0;
             i<grid[3].length;
             i++)
             {
                 row4+=grid[3][i];
                }
        int col1=0;
        for (int i=0;
             i<grid.length;
             i++)
             {
                 col1+=grid[i][0];
                }
        int col2=0;
        for (int i=0;
             i<grid.length;
             i++)
             {
                 col2+=grid[i][1];
                }
        int col3=0;
        for (int i=0;
             i<grid.length;
             i++)
             {
                 col3+=grid[i][2];
                }
        int col4=0;
        for (int i=0;
             i<grid.length;
             i++)
             {
                 col4+=grid[i][3];
                }
        int diag1=0;
        for (int i=0;
             i<grid.length;
             i++)
             {
                 diag1+=grid[i][i];
                }
        int diag2=0;
        for (int i=grid.length-1;
             i>0;
             i--)
             {
                 for (int j=0;
                      j<grid.length;
                      j++)
             {
                 diag2+=grid[j][i];
                }
            }
        if (row1==row2 &&
            row2==row3 &&
            row3==row4 &&
            row4==col1 &&
            col1==col2 &&
            col2==col3 &&
            col3==col4 &&
            col4==diag1 &&
            diag1=diag2)
            {
                System.out.println("This is a magic square!");
            }
    }
}
