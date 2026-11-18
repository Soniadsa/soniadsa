class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count  = 1;
        for(int i = 0 ; i < n - 1 ; i++){
            if(nums[i] == nums[i + 1] ){
             count++;
            }
            else {
                if(count == 1) {
                    return nums[i];
                }
                count = 1;
            }
        }
        return nums[n - 1];
    }
}