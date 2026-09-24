class Solution {
    int element;
    int ans;
    public int majorityElement(int[] nums){
        int count = 0;

        for(int i=0;i < nums.length; i++){
            if(count == 0){
                element = nums[i];
                count = 1;
            }
            else if(nums[i] == element){
                count++;
            }
            else{
                count--;
            }
        }

        //Below this we check that our element that is majority is more than n/2 or no but if we do not check this condition then also it is fine because Moore's Algorithm always gives majority element that is more than n/2 times 
        //If an element occurs more than n/2 times in the entire array, it cannot be completely cancelled
        
        int count1 = 0;
        for(int i=0;i < nums.length; i++){
            if(nums[i] == element){
                count1++;
            }
        }

        if(count1 > nums.length/2){
            ans = element;
        }
        return ans;
    }
}