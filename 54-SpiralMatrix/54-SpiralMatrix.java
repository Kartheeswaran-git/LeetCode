// Last updated: 05/08/2026, 10:32:43
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int t = 0;
        int b = matrix.length - 1;
        int l = 0;
        int r = matrix[0].length - 1;

        while (t <= b && l <= r) {

            for (int j = l; j <= r; j++) {
                ans.add(matrix[t][j]);
            }
            t++;

            for (int i = t; i <= b; i++) {
                ans.add(matrix[i][r]);
            }
            r--;

            if (t <= b) {
                for (int j = r; j >= l; j--) {
                    ans.add(matrix[b][j]);
                }
                b--;
            }

            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    ans.add(matrix[i][l]);
                }
                l++;
            }
        }

        return ans;
    }
}