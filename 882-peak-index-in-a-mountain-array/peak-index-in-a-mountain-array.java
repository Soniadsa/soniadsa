class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int n = arr.length;
      int index = 0;
      int max = Integer.MIN_VALUE;
      for(int i = 0 ; i < n ; i++){
         if(arr[i]> max){
            max = arr[i];
            index  = i;
         }
      }  
      return index;
    }
}