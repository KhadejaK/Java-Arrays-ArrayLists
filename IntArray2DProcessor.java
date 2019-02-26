/**
 * process a 2d array of integers
 */
public class IntArray2DProcessor
{
    private int[][] matrix;
    public IntArray2DProcessor(int[][] array)
    {
        matrix = array;
    }
    
    /**
     * Gets the sum of all the elements in the array
     * return the sum of all the elements in the array
     */
    public int sum()
    {
       int sum = 0;
       
       for (int row = 0; row < matrix.length; row ++)
       {
            for (int column = 0; column < matrix[0].length; column++)
            {
                sum += matrix[row][column];
            }
       }
       
       return sum;
    }
    
    /**
     * Gets the max value in the array
     * return the max in the array
     */
    public int max()
    {
       int max = matrix[0][0];
       
       for (int row = 0; row < matrix.length; row++)
       {
            for (int column = 0; column < matrix[0].length; column++)
            {
                if(max < matrix[row][column])
                   max = matrix[row][column];
            }
       }
       
       return max;
    }
    
    /**
     * Gets the sum of the elements in a given row
     * @param r the row whose sum we want
     * return the sum of the elements in a given row
     */
    public int sum(int r)
    {
       int sum = 0;
       
       for (int column = 0; column < matrix[0].length; column++)
       {
          sum += matrix[r][column];
       }
  
       return sum;
    }
}
