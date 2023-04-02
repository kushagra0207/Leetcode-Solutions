class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
	int m = potions.length;
	int[] pairs = new int[n];

	Arrays.sort(potions); // m log m

	for (int i = 0; i < n; i++) { // n log m
		int left = 0, right = m;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if ((long) spells[i] * (long) potions[mid] >= success)
				right = mid;
			else
				left = mid + 1;
		}

		pairs[i] = m - left;
	}

	return pairs;
    }
}