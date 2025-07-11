// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int num = n;
        int sum = 0;
        int dig = 0;
        while(num != 0){
            dig = num % 10;
            sum = sum + (dig*dig*dig);
            num = num / 10;
        }
        
        if(sum == n)   return true;
        else return false;
    }
}