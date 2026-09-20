class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int product = 1;
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'z'){
                product = 1 ;
            }
                if(s.charAt(i)== 'a'){
                    product = 26;
                }
              if(s.charAt(i) != 'a' && s.charAt(i) != 'z') {
            product = 26 - (s.charAt(i) - 'a');
              }
                sum = sum + product * ( i + 1);
            }
        return sum;
    }
}