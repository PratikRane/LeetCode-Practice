package io.github.pratikrane.problems.problem994;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	static class Position {
		int x, y;

		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	final static int EMPTY = 0, FRESH = 1, ROTTEN = 2;

	private boolean canRot(int[][] grid, Position pos) {
		if (grid[pos.x][pos.y] == 0 || grid[pos.x][pos.y] == 2) {
			return false;
		}

		// check orange on left
		if (pos.x - 1 >= 0 && grid[pos.x - 1][pos.y] == ROTTEN) {
			return true;
		} else if (pos.x + 1 < grid.length && grid[pos.x + 1][pos.y] == ROTTEN) {
			return true;
		} else if (pos.y - 1 >= 0 && grid[pos.x][pos.y - 1] == ROTTEN) {
			return true;
		} else if (pos.y + 1 < grid[pos.x].length && grid[pos.x][pos.y + 1] == ROTTEN) {
			return true;
		} else {
			return false;
		}
	}

	public int orangesRotting(int[][] grid) {
		final Queue<Position> toRot = new LinkedList<>();
		int minutes = 0;

		int fresh = 0;
		do {
			fresh = 0;
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j] == ROTTEN) {
					} else if (grid[i][j] == FRESH) {
						fresh++;
						final Position pos = new Position(i, j);
						if (canRot(grid, pos)) {
							toRot.add(pos);
						}
					}
				}
			}
			if (!toRot.isEmpty()) {
				minutes++;
				fresh -= toRot.size();
				rot(toRot, grid);
			} else if (fresh != 0) {
				return -1;
			}

		} while (fresh != 0);

		return minutes;
	}

	private void rot(Queue<Position> toRot, int[][] grid) {
		while (!toRot.isEmpty()) {
			final Position pos = toRot.remove();
			grid[pos.x][pos.y] = ROTTEN;
		}
	}
}
