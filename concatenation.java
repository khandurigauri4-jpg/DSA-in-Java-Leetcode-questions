class Solution {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n+n];
        int k = 0;
        for(int i=0; i<n; i++)
        {
            ans[k] = nums[i];
            k++;
        }
        for(int i=0; i<n; i++)
        {
            ans[k] = nums[i];
            k++;
        }
        return ans;
        
    }
    public static void main(String args[])
    {
        int nums[] = {1 , 2 , 1};
        System.out.println(getConcatenation(nums));
    }
}