class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> ans = new HashSet<>();
      for(int i = 0 ; i < nums.length ; i++){
        ans.add(nums[i]);
      }
         for(int i = 1 ; i < 1000 ;i++){
            if(i % k == 0 && !ans.contains(i)){
              return i;
         }
         }
         return 0;
    }
}