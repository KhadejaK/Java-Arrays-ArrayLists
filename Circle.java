public class Circle
{
    private double radius;

    /**
     * Constructs a Circle with the given radius
     * @param theRadius the radius of this Circle
     */
    public Circle(double theRadius)
    {
        radius = theRadius;
    }
    
    /**
     * Gets the area of this circle
     * @return the area of this circle
     */
    public double area()
    {
        return radius * radius * Math.PI;
    }
    
    /**
     * Sets a new radius for this Circle
     * @param newRadius the new radius of this Circle
     */
    public void setRadius(int newRadius)
    {
        radius = newRadius;
    }
    /**
     * Gets the radius of this Circle.
     * @return the radius
     */
    public double getRadius()
    {
        return radius;
    }
    
    public String toString()
    {
        String s = "Circle[radius=" + radius + "]";
        return s;
    }
}