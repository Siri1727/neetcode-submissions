class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] s =  new int[nums.length];
        int[] p = new int[nums.length];
        s[0] = 1;
        p[nums.length-1] = 1;
        for(int i = 1;i < nums.length;i++){
            s[i] = nums[i-1] * s[i-1];
        }
        for(int i = nums.length - 2;i >= 0;i--){
            p[i] = nums[i+1] * p[i+1];
        }
        for(int i = 0;i < nums.length;i++){
            res[i] = s[i] * p[i];
        }
        return res;
    }
}  
