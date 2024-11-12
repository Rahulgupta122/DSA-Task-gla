class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x>0){
            int val=x;
            int rev=0;
            while(x>0){
                int div=x%10;
                rev=rev*10+div;
                x=x/10;
            }
            if(rev==val){
                return true;
            }
            else{
                return false;
            }
        }
      
        return false;
    }
}