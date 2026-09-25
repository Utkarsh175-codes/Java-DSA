class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList <Integer> ans = new ArrayList<>();
        
        int n = matrix.length;    // n = no. of rows
        int m = matrix[0].length; // m = no. of columns 

        int left = 0, right = m-1;    // columns 
        int top = 0, bottom = n-1;    // rows


        while(left <= right && top <= bottom){
            // 1) left --> right (at the top) 
            for(int i = left;i <= right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            // 2) top --> bottom (at the right side)
                for(int i = top;i <= bottom;i++){
                    ans.add(matrix[i][right]);
                }
                right--;

            // 3) right --> left (at the bottom)
                if(top <= bottom){
                    for(int i = right;i >= left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
                }

            // 4) bottom to top (at left side)
                if(left <= right){
                    for(int i = bottom;i >= top;i--){
                        ans.add(matrix[i][left]);
                    }
                    left++;
                }
        }
        return ans;
    }
}