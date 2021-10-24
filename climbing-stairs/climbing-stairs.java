class Solution {
    public int climbStairs(int n) {
        if (n == 0){
            return 0;
        }
        
        if (n==1 || n==2){
            return n;
        }
        
        int[] stairs = new int[n+1];
        stairs[0] = 0;
        stairs[1] = 1;
        stairs[2] = 2;
        
        for (int i = 3; i <= n; i++){
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        return stairs[n];
    }
}