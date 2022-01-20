class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int i = 0; i < nums.length; i++){
            if(count.get(nums[i]) > 1){
                return true;
            }
        }
        
        return false;
    }
}