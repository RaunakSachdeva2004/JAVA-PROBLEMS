//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();

            Solution obj = new Solution();
            System.out.println(obj.lastIndex(s));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int lastIndex(String s) {
        int n = s.length();
        int index = -1;
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i) == '1'){
                index = i;
                break;
            }
        }
        return index;    
    }
}
