class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // Transpose
        // Swapping is done over here instead of our regular approach because they want in place means transpose in same array 
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];    
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Traverse for every row
        for(int i = 0; i < n; i++){
            int start = 0;
            int end = n - 1;

            // Reverse the elements 
            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }
    }
}
