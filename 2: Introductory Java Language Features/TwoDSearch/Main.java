public class Main {
    public static int[] search(int[][] grid, int target)
    {
        int[] coords = new int[2];
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[row].length; col++)
            {
                if (grid[row][col] == target)
                {
                    coords[0] = row;
                    coords[1] = col;
                    return coords;
                }
            }
        }
        coords[0] = -1;
        coords[1] = -1;
        return coords;
    }
}
