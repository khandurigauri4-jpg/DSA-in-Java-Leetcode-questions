class Solution {
    public static int frequency(int arr[] , int num){
        int f = 0 ;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == num)
            f++;
        }
        return f;
    }
public static int findLucky(int a[])
{
    int n = a.length;
    int a1[] = new int[n];
    int j=0;
    for(int i=0; i<n; i++)
    {
        if(a[i] == frequency(a , a[i])){
        a1[j] = a[i];
        j++;
    }
}
int max =0;
if(j == 0)
return -1;
else{
for(int i=0; i<j; i++)
{
    if(a1[i] > max)
    max = a1[i];
}
return max;
}
}
public static void main(String args[])
{
    int array[] = {2 , 2 , 3 , 4};
    System.out.println(findLucky(array));
}
}