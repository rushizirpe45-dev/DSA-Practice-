class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] arr) {
        
        int n=arr.length;
        int index=-1;

        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }

        if(index!=-1){
            for(int i=n-1;i>index;i--){
                if (arr[i] > arr[index]) {
                    swap(arr, i, index);
                    break;
                }
            }
        }

        reverse(arr, index + 1, n - 1);


    }
}