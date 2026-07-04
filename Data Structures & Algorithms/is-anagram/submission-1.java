class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> hm1 = new HashMap<>();
      HashMap<Character,Integer> hm2 = new HashMap<>();
      for(char ch : s.toCharArray()){
        hm1.put(ch, hm1.getOrDefault(ch,0) + 1);
      }
      for(char ch : t.toCharArray()){
        hm2.put(ch, hm2.getOrDefault(ch,0) + 1);
      }
      if(hm1.equals(hm2)){
        return true;
      }
      return false;
    }
}
