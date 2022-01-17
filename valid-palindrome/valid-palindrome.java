class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        boolean check = true;
        String[] sList = s.split("");
        int i = 0;
        int j = sList.length - 1;
        
        while(i < j){
            if (!sList[i].equals(sList[j])){
                check = false;
                break;
            }
            i++;
            j--;
        }
        
        return check;
    }
}