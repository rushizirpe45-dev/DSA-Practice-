class Solution {
    public int longestConsecutive(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        Set<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int max = 1;
        int count = 1;

        Integer prev = null;

        for (int num : set) {

            if (prev != null && num == prev + 1) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
            prev = num;
        }

        return max;
    }
}