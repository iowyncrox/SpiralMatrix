import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (matrix == null || matrix.length == 0)
			return result;

		int m = matrix.length;
		int n = matrix[0].length;

		int x = 0;
		int y = 0;

		while (m > 0 && n > 0) {

			// if one row/column
			if (m == 1) {
				for (int i = 0; i < n; i++) {
					result.add(matrix[x][y++]);
				}
				break;
			} else if (n == 1) {
				for (int i = 0; i < m; i++) {
					result.add(matrix[x++][y]);
				}
				break;
			}

			// move right
			for (int i = 0; i < n - 1; i++) {
				result.add(matrix[x][y++]);
			}

			// move down
			for (int i = 0; i < m - 1; i++) {
				result.add(matrix[x++][y]);
			}

			// move left
			for (int i = 0; i < n - 1; i++) {
				result.add(matrix[x][y--]);
			}

			// move up
			for (int i = 0; i < m - 1; i++) {
				result.add(matrix[x--][y]);
			}

			x++;
			y++;
			m = m - 2;
			n = n - 2;
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

		ArrayList<Integer> list = spiralOrder(matrix);
		System.out.println(list);
	}
}