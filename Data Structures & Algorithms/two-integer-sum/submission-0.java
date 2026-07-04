class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
       for(int i = 0;i < n;i++){
        for(int j = i + 1;j < n;j++){
            if(nums[i] + nums[j] == target){
                return new int[]{Math.min(i,j),Math.max(i,j)};
            }
        }
       }
       return new int[]{0};
    }
}
