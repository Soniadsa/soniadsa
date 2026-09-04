class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int product1 = 1;
        int product2 = 1;
        for(int i = 0 ; i < n ; i++){
            Arrays.sort(nums);
         product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
         product2 = nums[0] * nums[1] * nums[n - 1];
        }
        return Math.max(product1, product2);
        
    }
}