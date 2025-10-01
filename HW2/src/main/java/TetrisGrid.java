/**
 * TetrisGrid encapsulates a tetris board and has
 * a clearRows() capability.
 * 
 * @author bmngxn
 */

public class TetrisGrid {
	private boolean[][] grid; 
    private int width;    
    private int height;
	
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid; 			  // all false by default
        this.width = grid.length;     // Cartesian x
        this.height = grid[0].length; // Cartesian y
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		boolean[][] newGrid = new boolean[width][height];

        int ny = 0;

        for (int y = 0; y < height; y++) {

            boolean isAllTrueRow = true;
            for (int x = 0; x < width; x++) {
                if (grid[x][y] == false) {
                    isAllTrueRow = false;
                    break;
                }
            }

            if (!isAllTrueRow) {
                for (int x = 0; x < width; x++) {
                    newGrid[x][ny] = grid[x][y];
                }
                ny++;
            }
        }
        this.grid = newGrid;
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid;
	}
}
