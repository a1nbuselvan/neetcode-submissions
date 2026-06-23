class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0)
            return false;
        Arrays.sort(nums);
        int left=0;
        while(left != nums.length-1){
            if(nums[left]==nums[left+1]){
                return true;
            }
            left++;
        }
        return false;
    }
}