package io.github.pratikrane.chapters.queues;
//Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

//Example 1:
//Input:
//11110
//11010
//11000
//00000

//Output: 1

//Example 2:
//Input:
//11000
//11000
//00100
//00011

//Output: 3

public class NumsOfIsland {

	public static void main(String[] args) {
		NumsOfIsland islands = new NumsOfIsland();
		char[][] input1 = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		System.out.println(islands.numIslands(input1));
		char[][] input2 = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };
		System.out.println(islands.numIslands(input2));
	}

	public int numIslands(char[][] grid) {
		int count = 0;
		for (int x = 0; x < grid.length; x++)
			for (int y = 0; y < grid[0].length; y++)
				if (grid[x][y] == '1') {
					count++;
					DFSForIslands(grid, x, y);

				}
		return count;
	}

	public void DFSForIslands(char[][] grid, int x, int y) {
		if (x < 0 || y < 0 || x == grid.length || y == grid[0].length || grid[x][y] == '0')
			return;
		grid[x][y] = '0';
		DFSForIslands(grid, x - 1, y);
		DFSForIslands(grid, x + 1, y);
		DFSForIslands(grid, x, y - 1);
		DFSForIslands(grid, x, y + 1);
	}
}
