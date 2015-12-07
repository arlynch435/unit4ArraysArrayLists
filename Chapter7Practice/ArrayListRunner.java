import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       names.get(0);
       names.get(names.size()-1);
       System.out.println("The array list has " + names.size() + " elements.");
       System.out.println(names);
       names.set(0,"Alice B. Toklas");
       System.out.println(names);
       names.add(3,"Doug");
       System.out.println(names);
       for (String value : names)
       {
           System.out.println(value);
        }
       ArrayList<String> names2=new ArrayList<String>(names);
       names.remove(0);
       System.out.println(names);
       System.out.println(names2);
   }
} 