import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {

                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {

                    ans.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    // Skip duplicate second elements
                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }

                    // Skip duplicate third elements
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }

                    low++;
                    high--;
                }

                else if (sum < 0) {
                    low++;
                }

                else {
                    high--;
                }
            }
        }

        return ans;
    }
}