class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] results= new int[n];
        int prefix=1;
        for(int i =0;i<n;i++){
            results[i] = prefix;
            prefix = prefix*nums[i];
        }
        int suffix = 1;
        for(int i=n-1;i>=0;i-- ){
            results[i] = results[i]*suffix;
            suffix = suffix*nums[i];
        }
        return results;
    }
}  
