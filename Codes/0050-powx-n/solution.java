class Solution {
    public double myPow(double x, int n) {
        long a= n;
        if(a==0){
            return 1;
        }
        if(a<0){
            if (a == Integer.MIN_VALUE) {
                return 1 / (myPow(x, Integer.MAX_VALUE) * x);
            }
            return 1/myPow(x, (int)(-a));
        }
     double temp = myPow(x, (int)(a/2));
      if(a%2==0){
        return temp*temp;
      }
      else{
        return x*temp*temp;
      }
    }
}
