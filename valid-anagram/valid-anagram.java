class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        String[] sList = s.split("");
        ArrayList<String> letters = new ArrayList<String>();
        for(String letter: sList){
            letters.add(letter);
        }
        
        String[] tList = t.split("");
        for(String letter: tList){
            if (!letters.contains(letter)){
                return false;
            }else{
                letters.remove(letter);
            }
        }
        
        return true;
    }
}