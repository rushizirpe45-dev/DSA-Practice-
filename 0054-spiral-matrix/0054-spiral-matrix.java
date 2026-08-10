class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int minr = 0;
        int minc = 0;
        int maxr = m - 1;
        int maxc = n - 1;
        List<Integer> ans = new ArrayList<>();
        while (minr <= maxr && minc <= maxc) {
            //right to left
            for (int j = minc; j <= maxc; j++) {
                ans.add(arr[minr][j]);
            }
            minr++;
            if (minr > maxr) {
                break;
            }
            //top to bottom
            for (int j = minr; j <= maxr; j++) {
                ans.add(arr[j][maxc]);
            }
            maxc--;
            //left to right
            for (int j = maxc; j >= minc; j--) {
                ans.add(arr[maxr][j]);
            }
            maxr--;
            if (maxc < minc) {
                break;
            }
            //right to left
            for (int j = maxr; j >= minr; j--) {
                ans.add(arr[j][minc]);
            }
            minc++;

        }
        return ans;

    }
}