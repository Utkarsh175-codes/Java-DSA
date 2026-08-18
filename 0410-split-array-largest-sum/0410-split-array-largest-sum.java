class Solution {
    public int splitArray(int[] nums, int k) {
        int i = 0;
        int low = nums[0];
        int high = 0;
        int ans = 0;

        for(i = 0;i < nums.length;i++){
            high = high + nums[i];
        }

        while(low <= high){
            int mid = (high + low)/2;
            
            if(allocationIsPossible(nums,mid,k) == true){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }



    public boolean allocationIsPossible(int[] nums, int barrier, int k){  // barrier means mid
        int allocatedStudent = 1;
        int pages = 0;

        for(int j = 0;j < nums.length;j++){
            if(nums[j] > barrier){
                return false;
            }
            if(pages + nums[j] > barrier){
                allocatedStudent = allocatedStudent + 1;
                pages = nums[j];    // we came here because pages do not fit in student1 so we do not append like on line 41 so we start a new subarray 
            }
            else{
                pages = pages + nums[j];
            }
            // Now check this
            if(allocatedStudent > k){
                return false;
            }
        }
        return true;
    }
}