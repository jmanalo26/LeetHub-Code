class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> romanNums = new HashMap<String, Integer>();
        romanNums.put("I", 1);
        romanNums.put("V", 5);
        romanNums.put("X", 10);
        romanNums.put("L", 50);
        romanNums.put("C", 100);
        romanNums.put("D", 500);
        romanNums.put("M", 1000);
        
        int num = 0;
        String[] chars = s.split("");
        for (int i = 0; i < chars.length; i++){
            if (romanNums.containsKey(chars[i])){
                if (i + 1 < chars.length && romanNums.get(chars[i + 1]) > romanNums.get(chars[i])){
                    int x = romanNums.get(chars[i + 1]) - romanNums.get(chars[i]);
                    num += x;
                    i++;
                }
                else{
                    num += romanNums.get(chars[i]);
                }
                //num += romanNums.get(chars[i]);
            }
        }
        
        return num;
    }
}