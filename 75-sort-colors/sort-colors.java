class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
             nums[minIndex] = nums[i];
            nums[i] = temp;
    }
    }
}