// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int rows = grid.length;
        if (rows == 0) {
			return 0;
		}
        int cols = grid[0].length;

        int minRow = rows, maxRow = -1;
        int minCol = cols, maxCol = -1;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == ch) {
                    if (r < minRow) minRow = r;
                    if (r > maxRow) maxRow = r;
                    if (c < minCol) minCol = c;
                    if (c > maxCol) maxCol = c;
                }
            }
        }
        if (maxRow == -1) {
			return 0;
		}
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int rows = grid.length;
        if (rows == 0) {
			return 0;
		}

        int cols = grid[0].length;
        int count = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (isPlusCenter(r, c)) {
                    count++;
                }
            }
        }
        return count;
		
	}
	/**
	 * Checks whether point(r, c) is the center of a plus.
	 * 
	 * @param rows row index
	 * @param cols column index
	 * @return true if ..., false otw.
	 */

	private boolean isPlusCenter(int r, int c) {
		char ch = grid[r][c];
		if (ch == ' ') {
			return false;
		}
		int up = plusSize(r, c, -1, 0, ch);
        int down = plusSize(r, c, 1, 0, ch);
        int left = plusSize(r, c, 0, -1, ch);
        int right = plusSize(r, c, 0, 1, ch);

		return up >= 2 && up == down && down == left && left == right;
	}


	/**
	 * Returns an integer representing the number of grids equal to current char
	 * (r,c) on a specific direction.
	 * 
	 * @param r current char's row index
	 * @param c current char's column index
	 * @param dx x direction
	 * @param dy y direction
	 * @param ch current char
	 */
	private int plusSize(int r, int c, int dx, int dy, char ch) {
        int size = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int newRow = r + dx;
        int newCol = c + dy;
        while ((newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) 
				&& grid[newRow][newCol] == ch) {
            size++;
            newRow += dx;
            newCol += dy;
        }
        return size;		
	}
}
