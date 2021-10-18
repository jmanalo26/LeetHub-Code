class Solution {
    public boolean isPalindrome(int x) {
        boolean check = true;
        String num = String.valueOf(x);
        char[] letters = num.toCharArray();
        int i = 0;
		int j = num.length() - 1;
		while (i != j || i > j) {
			if (j < 0) {
				break;
			}
			if (letters[i] != letters[j]) {
				check = false;
				break;
			} else {
				i++;
				j--;
			}
		}
        return check;
        
    }
}