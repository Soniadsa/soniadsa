class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int digit = 0;
        for(int i = 0 ; i < n ; i++){
               int num = nums[i];
                 int sum = 0;
               while(num > 0){
            digit = num % 10;
             sum = sum + digit;
             num = num / 10;
        }
        if(i == sum){
               return i;
        }
    }
            return -1;
    }
}