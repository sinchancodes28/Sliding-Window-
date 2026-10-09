class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        // fixed Sliding window
        int left = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for( int right = 0 ; right < arr.length ; right++){
            sum += arr[right];
            if( right - left + 1 == k){
                maxSum = Math.max(sum , maxSum);
                sum -= arr[left];
                left++;
            }
        }
        return maxSum;
    }
}
