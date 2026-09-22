class Solution {
    public int missingNumber(int[] nums) {
        int arrsum = 0;
        for(int i = 0;i < nums.length;i++){
            arrsum = arrsum + nums[i];
        }

        int realsum = nums.length * (nums.length + 1) /2;

        int missingnum = realsum - arrsum;
        return missingnum;
    }
}