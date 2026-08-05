// Last updated: 05/08/2026, 10:27:55
class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (arr[i][j] != arr[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}