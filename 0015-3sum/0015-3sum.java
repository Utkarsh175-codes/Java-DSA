class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> output = new HashSet<>();

        int n = nums.length;
        int target = 0;

        for(int i = 0; i < n - 2; i++) {

            Set<Integer> hashset = new HashSet<>();

            for(int j = i + 1; j < n; j++) {

                int third = target - nums[i] - nums[j];

                if(hashset.contains(third)) {

                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);

                    Collections.sort(temp);
                    output.add(temp);
                }

                hashset.add(nums[j]);
            }
        }

        return new ArrayList<>(output);
    }
}
