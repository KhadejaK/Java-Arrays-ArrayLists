import java.util.Arrays;

/**
 * manage an array of Strings
 * @author KhadejaKhalid
 */
public class WordProcessor
{
   private String[] phrase;
   private static final int INITIAL_CAPACITY = 8;
  
   /**
    * Default constructor, initializes array to hold 8 elements
    */
   public WordProcessor()
   {
      phrase = new String[INITIAL_CAPACITY];
   }
   
   /**
    * adds the given string at the end of the partially filled array.
    * @param toAdd : value to add
    */
   public void add(String toAdd) 
   {
      growIfNeeded();
      for (int x=0; x < phrase.length; x++) 
      {
         if (phrase[x] == null)
         {
            phrase[x] = toAdd;
            break;
         }
      }
      
   }
   
   /**
    * adds the String at the specified index. 
    * Grow the array by doubling its size if necessary and then add the element
    * @param toAdd : value to add
    * @param index : index to add it in
    */
   public void add(String toAdd, int index)
   {
      for (int x = phrase.length-1; x >= 0; x--)
      {
         if (phrase[x] != null)
         {
            if (x == index)
            {
               phrase[x+1] = phrase[x];
               phrase[x] = toAdd;
               break;
            }
            else
            {
               phrase[x+1] = phrase[x];
            }            
         }
      }

   }
   
   /**
    * If elements at adjacent indexes are equal, remove one
    */
   public void removeAdjacentDuplicates()
   {
      int counter = 0;
      String[] newArray = new String[phrase.length];
      
      for (int x=0; x < phrase.length; x++) 
      {
         if (!Arrays.asList(newArray).contains(phrase[x]))
         {
            newArray[counter] = phrase[x];
            counter++;
         }  
      }
      
      phrase = newArray;
   }
   
   /**
    * checks to see if the array is full. If it is, it doubles the size of 
    * the array and copies the elements to a the new array in the same order.
    */
   private void growIfNeeded()
   {
      if (phrase[phrase.length-1] != null)
      {
         String[] newArray = new String[phrase.length*2];
         for (int x=0; x < phrase.length; x++)
         {
            newArray[x] = phrase[x];
         }
         
         phrase = newArray;
      }
   }
   
   /**
    * returns a string representation of the array. The string starts with "[" and ends with "]" 
    * The elements of the array are separated by commas. There should be no comma at the beginning or end of the list.
    */
   public String toString() 
   {
      String s = "";
      for (int x=0; x < phrase.length; x++)
      {
         if (x != phrase.length-1)
         {
            if (phrase[x+1] == null) 
            {
               s += phrase[x] + "]";
               break; 
            }
         }
         if (x == 0)
            s += "[" + phrase[x] + ", ";
         else if (x == phrase.length-1)
            s += phrase[x] + "]";
         else
            s += phrase[x] + ", ";            
         }

      

      return s;
   }
   
}
