import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * A crude temperature map
 * @author KhadejaKhalid
 */
public class TemperatureMap
{
   private int[][] array; 
   private static final int SIDE = 10;
   
   /**
    * The constructor takes a 2d array of ints as a parameter
    * @param arr
    */
   public TemperatureMap(int[][] arr)
   {
      array = arr;
   }

   /**
    * creates a map consisting of colored squares
    * @param g2 : drawer
    */
   public void drawMap(Graphics2D g2)
   {
      int x = 0;
      int y = 0;
      for (int row = 0; row < array.length; row ++)
      {
         for (int column = 0; column < array[0].length; column++)
         {
            Rectangle square = new Rectangle(x, y, SIDE, SIDE);
            g2.setColor(getColor(array[row][column]));
            g2.fill(square);
            x = x + SIDE;
         }
         x = 0;
         y = y + SIDE;
      }
   }
   
   /**
    * @return the difference between the highest and lowest points
    */
   public int maxDifference()
   {
      int max = array[0][0];
      int min = array[0][0];
      
      for (int row = 0; row < array.length; row++)
      {
           for (int column = 0; column < array[0].length; column++)
           {
               if(max < array[row][column])
                  max = array[row][column];
               if(min > array[row][column])
                  min = array[row][column];
           }
      }
      
      return max-min;
   }
   
   /**
    * @param temp : get the temp
    * @return proper color
    */
   private Color getColor(int temp)
   {
      if (temp <= 32)
         return Color.BLUE;
      else if (temp <= 50)
         return Color.GREEN;
      else if (temp <= 85)
         return Color.ORANGE;
      else
         return Color.RED;
   }
}
