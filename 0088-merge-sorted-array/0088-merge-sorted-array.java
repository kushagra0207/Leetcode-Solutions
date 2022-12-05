class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     if (n == 0) {
            return;
        }
        
        // if the first array has 0 elements, then just copy nums2 to the beginning of nums1
        // if the last element in nums1 is <= than the first element in nums2,
        // then all the elements in the nums1 will be <= from all the elements in the nums2,
        // since nums1 and nums2 are already sorted in the ascending order
        if (m == 0 || nums1[m - 1] <= nums2[0]) {
            System.arraycopy(nums2, 0, nums1, m, n);
            return;
        }
        
        int i = 0;
        int j = 0;
        int tempIndex = 0;
        int[] temp = new int[m + n];
        
        while(i < m && j < n) {
            temp[tempIndex++] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
        }
        
        // copy remaining elements from nums1 to the end of temp array
        System.arraycopy(nums1, i, temp, tempIndex, m - i);
        
        // copy remaining elements from nums2 to the end of temp array
        System.arraycopy(nums2, j, temp, tempIndex, n - j);
        
        // copy the whole temp array back to nums1
        System.arraycopy(temp, 0, nums1, 0, m + n);
    }
    
}