
/**
 * Implements insertion sort and selection sort for arrays and arraylists
 * Compares efficiency of both routines
 * 
 * @Kara Herson
 * @2/13/2017
 */
import java.util.ArrayList;
public class Sorting
{
    public static void main()
    {
        Sorting s = new Sorting();
        
        //insertion sort
        int[] sorted10 = s.sortedArray(10);
        int[] sorted100 = s.sortedArray(100);
        int[] sorted1000 = s.sortedArray(1000);
        s.insertionSortArray(sorted10);
        s.insertionSortArray(sorted100);
        s.insertionSortArray(sorted1000);
        
        //test selection sort for arrays
        System.out.print("\n **** Selection Sort for Arrays ****\n");
  
    }
    
    public int[] randomArray(int length)
    {
        int[] array = new int [length];
        int range = array.length;
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * (range+1));
        }
        return array;
    }
    
    public int[] sortedArray(int length)
    {
        int[] array = new int [length];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }
        return array;
    }
    
    public int[] reverseArray(int length)
    {
        int[] array = new int [length];
        for (int i = 0, j = array.length; i < array.length; i++, j--)
        {
            array[i] = j;
        }
        return array;
    }
    
    public void printArray (int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length-1] + "\n");
    }

    public void insertionSortArray (int[] array)
    {
        int moves = 0;
        int comparisons = 0;
        for (int i = 1; i < array.length; i++)
        {
            int movingValue = array[i];
            for (int j = i-1; j > -1; j--)
            {
                int leftValue = array[j];
                comparisons ++;
                if (movingValue < leftValue)
                {
                    array[j] = movingValue;
                    array[j+1] = leftValue;
                    moves +=3; 
                } else {
                    break;
                }
            }
        }
        
        System.out.print("\nInsertion sort for array of length " + array.length);
        System.out.print("\nComparisons: " + comparisons);
        System.out.print("\nMoves: " + moves + "\n");
    }
    
    public void selectionSortArray (int[] array)
    {
        
        for (int i = 0; i < array.length-1; i++)
        {
            int smallestIndex = i;
            int temp = array[i];
            for (int j = i+1; j < array.length; j++)
            {
                int testValue = array[j];
                int currentValue = array[smallestIndex];
                if (testValue < currentValue)
                {
                    smallestIndex = j;
                }
            }
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
                    
    }
}
