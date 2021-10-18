class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
           if (nums[i] == target || nums[i] > target){
               return i;
           } else if (nums[i] < target && i == nums.length - 1){
               return nums.length;
           }
        }
        return 0;
    }
}