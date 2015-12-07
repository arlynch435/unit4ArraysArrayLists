import java.util.Scanner;
import java.util.ArrayList;
public class TopCustomerz
{
    private ArrayList<String> customers= new ArrayList<String>();
    private ArrayList<Double> prices=new ArrayList<Double>();
    public TopCustomerz()
    {
    }
    public void addSale(String customerNamer, double amount)
    {
        this.customers.add(customerNamer);
        this.prices.add(amount);
    }
    public String nameOfBestCustomer()
    {
        String best="";
        double largest=0;
        int largestAt=0;
        for (int i=0;
             i<prices.size();
             i++)
             {
                 if (prices.get(i)>largest)
                 {
                     largest=prices.get(i);
                     largestAt=i;
                    }
                }
        best=this.customers.get(largestAt);
        return best;
    }
    public ArrayList<String> nameofBestCustomers(int topN)
    {
        ArrayList<String> bestN=new ArrayList<String>();
        if (this.customers.size()<=topN)
        {
            return this.customers;
        }
        else
        {
            for (int j=0;
                 j<=topN;
                 j++)
                 {
                     double largest=0;
                     int largestAt=0;
                for (int i=0;
                     i<prices.size();
                     i++)
                     {
                         if (prices.get(i)>largest)
                         {
                             largest=prices.get(i);
                             largestAt=i;
                            }
                        }
                bestN.add(this.customers.get(largestAt));
                this.customers.remove(largestAt);
                this.prices.remove(largestAt);
                }
            return bestN;
        }
    }

}
