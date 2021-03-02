
/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
      int sum = 0;
        //sum finder
        
        int countRow = 0;
        int countCol = 0;
        int countDia1 = 0;
        int countDia2 = 0;
        int numRow = array.length;
        int numCol = array[0].length;
        for (int i = 0; i < numRow; i++){
          sum += array[0][i];
        }
        
        if (numCol != numRow){
          return false;
        }
        for (int j = 0; j < numRow; j++){
        for(int i = 0; i< numRow; i++){
         
          countRow += array[j][i];
        }
        if (countRow != sum)
          return false;
        
        }
        for (int j = 0; j < numRow;j++){
        for(int i = 0; i< numRow; i++){
         
          countCol += array[i][j];
        }
        if (countCol != sum)
          return false;
        
        }
        for (int j = 0; j < numRow; j++){
          countDia1 += array[j][j];

        }
        if (countDia1 != sum){
          return false;
        }
        for (int j = 0; j <numRow; j++){
          countDia2 += array[j][numCol-(j+1)];
        }
        if (countDia2 != sum){

          return false;
        }
        return true;





        
        
        

       
        
        
        
        
        
        
        
          // complete this method
    }

    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
