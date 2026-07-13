class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
       int left = 0;
       int max = 0;
       for(int i = 0;i < str.length;i++){
        while(set.contains(str[i])){
        set.remove(str[left]);
        left++;
       }
       set.add(str[i]);
       max = Math.max(max,i-left+1);
    }
    return max;
}
}
