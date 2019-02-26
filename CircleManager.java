import java.util.ArrayList;
/**
 * Manages an arrary list of Circle objects
 */
public class CircleManager
{
    private ArrayList<Circle> myCircles;

    /**
     * Constructs an empty CirclManager
     */
    public CircleManager()
    {
        myCircles = new ArrayList<Circle>();
    }

    /**
     * Adds a Circle object to this object
     * @param the Circle to add
     */
    public void add(Circle c)
    {
        myCircles.add(c);
    }

    /**
     * Gets the sum of the areas of the Circles in the 
     * CircleManager
     * @return the sum of the areas
     */
    public double sumAreas()
    {
        return 0;
    }
    
    /**
     * Gets the average of the areas of the Circles in 
     * the CircleManager
     * @return the average of the areas
     */
    public double averageArea()
    {
        return 0;
    }

    /**
     * Gets the largest Circle in this CircleManager
     * @return the largest Circle
     */
    public Circle largest()
    {
       return null;      
    }
    
    /**
     * Gets the first Circle in the CircleManger with 
     * radius > 10
     * @return the first Circle in the CircleManger with 
     * radius > 10
     */
    public Circle firstRadiusGreaterThan10()
    {
        return null;
    }
    
    
    public String toString()
    {
        String s = "ManyCircles[";
        s = s + myCircles.toString() + "]";
        return s;
    }
}
