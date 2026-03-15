class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m + n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i] > nums2[j])
            nums1[k--] = nums1[i--];
            else
            nums1[k--] = nums2[j--];
        }
        while(j>=0)
        nums1[k--] = nums2[j--];
        for(int p=0; p<m; p++)
        {
            System.out.print(nums1[p] + "");
        }
    }
    public static void main(String args[])
    {
        int nums1[] = {1 , 2 , 3 };
        int nums2[] = {2 , 5 , 6};
        int l = nums1.length;
        int n = nums2.length;
        int m = l+n;
        merge(nums1 , m , nums2 , n);
    }
}