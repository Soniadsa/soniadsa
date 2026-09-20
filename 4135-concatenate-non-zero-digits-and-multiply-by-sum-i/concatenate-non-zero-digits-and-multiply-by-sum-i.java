class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long digit = 0;
        long product = 0;
        long rev = 0;
        long x = 0;
        while( n > 0 ){
             digit = n % 10;
                n = n / 10;
             if(digit != 0){
              rev = rev * 10 + digit;
             sum = sum + digit;
        }
        }
        while(rev > 0){
            digit = rev % 10;
            rev = rev / 10;
            x = x * 10 + digit;
        }
        return x * sum;
    }
}