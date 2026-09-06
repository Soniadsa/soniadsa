class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < m ; i++){
            ans.add(nums1[i]);
        }
         for(int j = 0 ; j < n ; j++){
            ans.add(nums2[j]);
        }
        Collections.sort(ans);
        for(int i = 0 ; i < ans.size() ; i++){
            nums1[i] = ans.get(i);
        }
    }
}