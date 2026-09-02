class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int max_count = -1;
        int index = -1;

        for (int i = 0; i < mat.length; i++) {

            int count_ones = 0;

            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] == 1) {
                    count_ones++;
                }
            }

            if (count_ones > max_count) {
                max_count = count_ones;
                index = i;
            }
        }

        return new int[]{index, max_count};
    }
}