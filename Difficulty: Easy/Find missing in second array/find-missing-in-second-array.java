//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        
            HashSet<Integer> setb = new HashSet<>();
            for(int num : b){
                setb.add(num);
            }
            
            ArrayList<Integer> res = new ArrayList<>();
            for(int num : a){
                if(!setb.contains(num)){
                    res.add(num);
                }
            }
            
            return res;
        
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Number of test cases

        while (t-- > 0) {
            // Read first array (row sums)
            String[] rowInput = br.readLine().trim().split(" ");
            int[] a = Arrays.stream(rowInput).mapToInt(Integer::parseInt).toArray();

            // Read second array (column sums)
            String[] colInput = br.readLine().trim().split(" ");
            int[] b = Arrays.stream(colInput).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.findMissing(a, b);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends