class Solution {
    public int longestSubarray(int[] nums) {
        int left =0;
        int zeroes =0 , maxlen =0;
        for(int right =0; right<nums.length; right++)
        {
            if(nums[right]==0)
            zeroes++;
            if(zeroes > 1)
            {
                if(nums[left]==0)
                zeroes--;
                left++;
            }
            maxlen = Math.max(maxlen , right-left);
        }
        return maxlen;
        
    }
}