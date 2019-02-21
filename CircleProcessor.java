/**
 * a class CircleProcessor which manages an array of Circles
 * @author KhadejaKhalid
 */
public class CircleProcessor
{
   private Circle[] circles;

   /**
    * Constructs a CircleProcessor
    * @param circle : the array of circles
    */
   public CircleProcessor(Circle[] circle)
   {
      circles = circle;
   }
   
   /**
    * @return the average area of the Circles
    */
   public double averageArea()
   {
      double sum = 0;
      for (int x = 0; x < circles.length; x++)
      {
         sum += circles[x].area();
      }
      return sum/(circles.length);
   }
   
   /**
    * swaps the largest and smallest elements
    */
   public void swapMaxAndMin()
   {
      Circle max = circles[0];
      Circle min = circles[0];
      int maxPos = 0;
      int minPos = 0;
      
      for (int x = 0; x < circles.length; x++)
      {
         if (circles[x].getRadius() > max.getRadius())
            maxPos = x;
         
         if (circles[x].getRadius() < min.getRadius())
            minPos = x;        
      }
      
      Circle temp = circles[maxPos];
      circles[maxPos] = circles[minPos];
      circles[minPos] = temp;
   }
   
   /**
    * @return a string representation of the array
    */
   public String toString()
   {
      String s = "";
      for (int x = 0; x < circles.length; x++)
      {
         if (x == 0)
            s = "[";
         if (x == circles.length-1)
         {
            s += circles[x].toString() + "]";
            break;
         }
         s += circles[x].toString() + ", ";
      }
      return s;
   }
}
