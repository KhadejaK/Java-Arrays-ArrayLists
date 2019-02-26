import java.util.ArrayList;

public class ArrayListString
{
   public static void main(String[] args)
   {
      ArrayList<String> flowers = new ArrayList<String>();
      flowers.add("rose");
      flowers.add("violet");
      flowers.add("pansy");
      flowers.add("zinnia");
      flowers.add(3, "lavender");
      flowers.remove(1);
      for (int x=0; x < flowers.size(); x++)
      {
         String s = flowers.get(x).substring(0,1).toUpperCase();
         s += flowers.get(x).substring(1, flowers.get(x).length());
         flowers.set(x, s);
      }
      
      System.out.println(flowers);
   }

}
