// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  char[][] chocolate;
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    this.chocolate= new char[rows][cols];
    for (int i=0;
         i<this.chocolate.length;
         i++)
         {
             for (int j=0;
                  j<this.chocolate[i].length;
                  j++)
                  {
                      this.chocolate[i][j]=' ';
                    }
            }
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
      this.chocolate= new char[rows][cols];
      for (int i=0;
         i<this.chocolate.length;
         i++)
         {
             for (int j=0;
                  j<this.chocolate[i].length;
                  j++)
                  {
                      this.chocolate[i][j]=fill;
                    }
            }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
    int row=this.chocolate.length;
    return row;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
    int col=this.chocolate[0].length;
    return col;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
    char square=' ';
    square=this.chocolate[row][col];
    return square;
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    this.chocolate[row][col]=ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    boolean empty=false;
    if (this.chocolate[row][col]==' ')
    {
        empty=true;
    }
    return empty;
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for(int i=row0;
        i<=row1;
        i++)
        {
            for (int j=col0;
                 j<=col1;
                 j++)
                 {
                     this.chocolate[i][j]=fill;
                    }
        }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    for(int i=row0;
        i<=row1;
        i++)
        {
            for (int j=col0;
                 j<=col1;
                 j++)
                 {
                     this.chocolate[i][j]=' ';
                    }
        }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
      int total=0;
      for(int i=0;
        i<this.chocolate[row].length;
        i++)
        {
            if (this.chocolate[row][i]!=' ')
            {
                total++;
            }
        }
      return total;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
    int total=0;
    for (int i=0;
         i<this.chocolate.length;
         i++)
         {
             if (this.chocolate[i][col]!=' ')
             {
                 total++;
                }
            }
    return total;
  }
}
