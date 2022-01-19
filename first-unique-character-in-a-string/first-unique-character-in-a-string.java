class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> cList = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            cList.put(s.charAt(i), cList.getOrDefault(s.charAt(i), 0) + 1 );
        }
        
        for(int i = 0; i < s.length(); i++){
            if(cList.get(s.charAt(i)) == 1){
                return i;
            }
        }
        
        return -1;
    }
}