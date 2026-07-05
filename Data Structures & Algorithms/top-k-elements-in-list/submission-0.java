class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0) + 1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            arr.add(new int[] {entry.getKey(),entry.getValue()});
        }
        arr.sort((a,b) -> b[1] - a[1]);
        int[] res = new int[k];
        for(int i = 0;i < k;i++){
            res[i] = arr.get(i)[0];
        }
        return res;
    }
}
