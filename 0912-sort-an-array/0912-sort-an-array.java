class Solution {
    public int[] sortArray(int[] nums) {
        
        // Basically Its Merge Sort Algorithm
        // Writtein by Kushagra gupta
        
        // Date - 1 March 2023
        
        // Time Complexity For all cases - O(n logn)
        // Space complexity for all cases - O(n)
        
        
        mainMergeSort(nums,0,nums.length-1);
        return nums;
    }
    
    
    
    
    public static void justMerge(int[] arr, int l, int m, int r) {
        int n1 = m + 1 - l;
        int n2 = r - m;
        int[] left = new int[n1];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        int[] right = new int[n2];
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 || j < n2) {
            if (j == n2 || i < n1 && left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
    }

    public static void mainMergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (high - low) / 2 + low;
            mainMergeSort(arr, low, middle);
            mainMergeSort(arr, middle + 1, high);
            justMerge(arr, low, middle, high);
        }
    }
}
