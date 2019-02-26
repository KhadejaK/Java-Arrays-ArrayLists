
public class IntArray2DProcessorTester
{
    public static void main(String[] args)
    {
        int[][] array = {
                {1,2,3,-5},
                {3,5,-1,2},
                {-2,7,5,3}
            };
        IntArray2DProcessor processor = new IntArray2DProcessor(array);
        
		int[][] array2 = {
                {-4,-2,-3,-5},
                {-3,-5,-1,-2},
                {-2,-7,-5,-3}
            };
        IntArray2DProcessor processor2 = new IntArray2DProcessor(array2);

        System.out.println("Sum array1: " + processor.sum());
        System.out.println("Sum array2: " + processor2.sum());
        System.out.println();

        System.out.println("Max array1: " + processor.max());
        System.out.println("Max array2: " + processor2.max());
        System.out.println("Expected max array2: -1");
        System.out.println();
        
        System.out.println("Sum array1 row1: " + processor.sum(1));
        
    }
}
