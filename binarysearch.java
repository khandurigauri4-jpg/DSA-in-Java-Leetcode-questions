class Solution {
    public static int search(int[] nums, int target) {
        
        int l = 0;
        int u = nums.length-1;
        while(l<=u)
        {
            int mid = (l+u)/2;
            if(nums[mid] == target)
            return mid;
            else if(nums[mid] > target)
            u = mid-1;
            else
            l = mid+1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int nums[] = {-1 , 0 , 3 , 5 , 9 , 12};
        int t = 9;
        System.out.println(search(nums , t));
    }
}