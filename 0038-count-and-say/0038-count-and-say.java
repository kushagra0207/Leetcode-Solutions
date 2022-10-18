class Solution {
    public String countAndSay(int n) {
        
                String dp[] = new String[n]; // record 1-th, 2-th, ..., n-th string
        dp[0] = "1";//first one
        for(int i = 1; i < n; i++) {
            StringBuffer sb = new StringBuffer("");
            for(int j = 0; j < dp[i-1].length(); j++) {
                int k = j;
                while(k < dp[i-1].length() - 1 && dp[i-1].charAt(k) == dp[i-1].charAt(k+1)) k++; // count dp[i-1][j] consecutive times
                sb.append(""+ (k-j+1));
                sb.append(dp[i-1].charAt(j)); 
                j = k;
            }
            dp[i] = sb.toString();
        }
        return dp[n-1];

        
    }
}