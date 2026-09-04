class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[n - 1];
        return gcd(min , max);
    }
    public int gcd(int a , int b){
        while( b != 0 ){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a ;
    }
}