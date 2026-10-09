class Solution {
    public void moveZeroes(int[] nums) {
        /*int j = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return;  //If there is no zero in the array then it will not run the function
        }

        for(int i = j+1;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }*/

        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++){ // This loop sets the values but the endinng values are not zero
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }

        while(count < n){  // Thats why we use this loop so that we can assign 0 to remaining elements as count is at the place where the elements should end and 0 should start 

            nums[count] = 0;
            count++;
        }
    }
}