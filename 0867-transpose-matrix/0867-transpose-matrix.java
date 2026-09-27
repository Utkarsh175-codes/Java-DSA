class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length]; // we write this ulta because no. of columns and rows of transpose matrix will be ulta of original matrix 
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}