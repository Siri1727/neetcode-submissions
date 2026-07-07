class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            set.add(nums[i]);
        }
        int max = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int length = 1;
            while(set.contains(length + num)){
                length++;
            }
            max = Math.max(max,length);
        }
        }
        return max;
    }
    }