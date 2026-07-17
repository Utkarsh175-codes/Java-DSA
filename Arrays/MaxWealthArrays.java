class maxWealthArrays{
    public static void main(String[] args){
        int[][] accounts = {{1, 2, 3},{3, 2, 1}};
        System.out.print(maximunWealth(accounts));
    }




    public static int maximunWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int r=0;r<accounts.length;r++){
            int sum = 0;
            for(int c=0;c<accounts[r].length;c++){
                
                sum = sum + accounts[r][c];
            }

            if(sum > ans){
                ans = sum; 
            }

        }
        return ans;
    }
}