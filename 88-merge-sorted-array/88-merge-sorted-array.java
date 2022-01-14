class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Array 1 empty
        if (m == 0){
            for (int i = 0; i < nums1.length; i++){
                nums1[i] = nums2[i];
            }
        }
        
        //Array 2 empty = no change
        
        else{
            //insert elements
            int index = m;
            while (index < (m+n)){
                if(nums1[index] == 0){
                    nums1[index] = nums2[index-m];
                }
                index++;
            }
        }
        Arrays.sort(nums1);
    }
}