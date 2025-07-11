// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int num = n;
        int count =0;
        while(n != 0)
        {
            int dig = n %10;
            n= n / 10;
            
            if(dig == 0){
                continue;
            }
            
            if(num % dig == 0){
                count++;
            }
            
        }
    
        return count;
    }
}