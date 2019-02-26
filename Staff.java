import java.util.ArrayList;

/**
 * Write the class Staff. It contains methods that manipulate an ArrayList of Strings 
 * representing the names of staff members. The constructor takes an ArrayList of 
 * String names as a parameter. In addition to the constructor, you need to 
 * implement the following methods
 * @author KhadejaKhalid
 */
public class Staff
{
   private ArrayList<String> names = new ArrayList<String>();
   
   /**
    * Constructs the staff
    * @param name : an arraylist of names
    */
   public Staff(ArrayList<String> name)
   {
      names = name;
   }

   /**
    * Determines if the other Staff contains all the same elements in the same order as this Staff
    * @param other : the other staff
    * @return if found or not
    */
   public boolean equals(Staff other) 
   {
      boolean found = true;
      
      if(names.size() != other.names.size())
         found = false;
      
      for(int x=0; x < other.names.size(); x++)
      {
         if(names.get(x) != other.names.get(x))
            found = false;
      }

      return found;
   }
   
   /**
    * Determines if the other Staff and this Staff contain exactly the same elements but in any order
    * @param other : the other staff
    * @return if found or not
    */
   public boolean sameContents(Staff other) 
   {
      boolean found = true;
      
      if(names.size() != other.names.size())
         found = false;
      
      for(int x=0; x < other.names.size(); x++)
      {
         if(!other.names.contains(names.get(x)))
            found = false;
      }
      
      return found;
   }
   
   /**
    * Replaces each vowel in every ArrayList element with the replacement value text. 
    * Assume the vowels are aeiouyAEIOUY
    * @param text : to replace with
    */
   public void replaceVowelsWith(String text) 
   {
      String vowels = "aeiouyAEIOUY";
      
      for(int x=0; x < names.size(); x++)
      {
         String newName= names.get(x).replaceAll( "[aeiouyAEIOUY]", text );
         names.set(x, newName);
      }
   }
   
   /**
    * Gets the staff member whose name has the most vowels. 
    * If more than one has that number of vowels, return the first. 
    * Return null if the list is empty. Assume the vowels are aeiouAEIOU
    * @return
    */
   public String mostVowels() 
   {
      if(names.size() == 0)
         return null;
      
      int length = 0;
      String v = "";
      for(int x=0; x < names.size(); x++)
      {
         String temp = names.get(x).replaceAll("[^aeiouAEIOU]", "");
         if (temp.length() > length)
         {
            v = names.get(x);
            length = temp.length();
         }
      }
      return v;
   }
   
   /**
    * gets a string represent ion using ArrayList's toString method
    */
   public String toString() 
   {
      return names.toString();
   }
   
}
