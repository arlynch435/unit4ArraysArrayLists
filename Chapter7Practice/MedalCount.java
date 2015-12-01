

public class MedalCount
{
    final int COUNTRIES=7;
    final int MEDALS=3;
    int[][] counts={
                {1,0,1},
                {1,1,0},
                {0,0,1},
                {1,0,0},
                {0,1,1},
                {0,1,1},
                {1,1,0}
            };
    public MedalCount()
    {
        //alternate way to inticialize array
        //counts= new int[COUNTRIES][MEDALS];
    }
    public static void main(String[] args)
    {
        MedalCount test= new MedalCount();
        System.out.println(test.toString());
    }
    public String toString()
    {
        String str="";
        // option a: for (int i=0;
        //     i<COUNTRIES;
        //     i++)
        //option b:
        for(int i=0;
            i<counts.length;
            i++)
             {
                 //option a: for (int j=0;
                 //     j<MEDALS;
                 //     j++)
                 //option b:
                 //for(int j=0;
                 //    j<counts[0].length;
                 //    j++)
                 //option c: (preferred)
                 for (int j=0;
                      j<counts[0].length;
                      j++)
                      {
                          str+=counts[i][j]+"\t";
                        }
                 str+="\n";
                }
        return str;
    }
    public int medalCountry(int countryIndex)
    {
        int total=0;
        for(int j=0;
            j<counts[countryIndex].length;
            j++)
            {
                total+=counts[countryIndex][j];
            }
        return total;
    }
    public int countMedalType(int medalIndex)
    {
        int total=0;
        for (int i=0;
             i<counts.length;
             i++)
             {
                 total+=counts[i][medalIndex];
                }
        return total;
    }
}
