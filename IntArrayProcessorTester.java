
public class IntArrayProcessorTester
{
    public static void main(String[] args)
    {
        int[] list = {5, 3, 7, 1, 4, 7, 6};  
        IntArrayProcessor util = new IntArrayProcessor(list);
        
        int[] list2 = {-7, -2, -9, -4, -7, -6, -1, -5, -7};  
        IntArrayProcessor util2 = new IntArrayProcessor(list2);
        
        System.out.println("Max: " + util.getMax()); 
        System.out.println("Max: " + util2.getMax());

//         System.out.println("Display Sum: " + util.displaySum());
//         System.out.println("Display Sum: " + util2.displaySum());

        
        
    }
}
