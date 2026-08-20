class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        int start = 0;
        int end = 0;
        int count = 0;
        int a = 0, b = 0, k2 = 0;

        // Find the first odd number
        while (start < n && arr[start] % 2 == 0) {
            start++;
        }

        end = start;

        // Find the kth odd number
        while (end < n && k2 < k) {
            if (arr[end] % 2 == 1) {
                k2++;
            }
            end++;
        }

        // If k odd numbers don't exist
        if (k2 < k) {
            return 0;
        }

        while (end <= n) {

            // Count possible starting positions
            a = 1;
            int temp = start - 1;

            while (temp >= 0 && arr[temp] % 2 == 0) {
                a++;
                temp--;
            }

            // Count possible ending positions
            b = 1;

            while (end < n && arr[end] % 2 == 0) {
                b++;
                end++;
            }

            count += a * b;

            // Move start to next odd number
            start++;

            while (start < n && arr[start] % 2 == 0) {
                start++;
            }

            // No more odd numbers
            if (start >= n) {
                break;
            }

            // end is currently after kth odd/even sequence.
            // Find the next odd number
            while (end < n && arr[end] % 2 == 0) {
                end++;
            }

            // Include next odd in the window
            if (end < n) {
                end++;
            } else {
                break;
            }
        }

        return count;
    }
}