class Solution {
    public int countOdds(int low, int high) {
        //return (high-low)-1;
        int diff=high-low;
			  int count=diff/2;

				if(low%2!=0 || high%2!=0)
					count++;

				return count;
    }
}