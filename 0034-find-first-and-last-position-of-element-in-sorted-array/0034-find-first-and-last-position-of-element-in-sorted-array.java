class Solution {
    public int[] searchRange(int[] arr, int target) {

        int first = -1;
        int last = -1;

        // Find first occurrence
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == target) {
                first = mid;
                j = mid - 1;       // search further left
            }
            else if (arr[mid] < target) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }

        // Find last occurrence
        i = 0;
        j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == target) {
                last = mid;
                i = mid + 1;       // search further right
            }
            else if (arr[mid] < target) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}