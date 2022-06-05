import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) {
        int[] r1 = {3, 4, 1, 7, 2};
        int[] r2 = {1, 0, 9, 4, 2};
        int[] r3 = {2, 2, 3, 4, 5};
        int[][] arr = {r1, r2, r3};

        System.out.println(Arrays.toString(getCoords(arr, 44)));
    }

    public static int[] getCoords(int[][] arr, int target) 
    {
        return searchRows(arr, target, 0);
    }

    public static int[] searchRows(int[][] arr, int target, int rowIndex) 
    {
        if (rowIndex == arr.length) 
        {
            return new int[] {-1, -1};
        }
        int yCoord = searchRow(arr[rowIndex], target, 0);
        if (yCoord >= 0)
        {
            return new int[] {rowIndex, yCoord};
        }
        else
        {
            return searchRows(arr, target, rowIndex + 1);
        }
    }

    public static int searchRow(int[] row, int target, int index) 
    {
        if(index == row.length) 
        {
            return -1;
        }
        if (row[index] == target) 
        {
            return index;
        }
        return searchRow(row, target, index + 1);
    }
}
