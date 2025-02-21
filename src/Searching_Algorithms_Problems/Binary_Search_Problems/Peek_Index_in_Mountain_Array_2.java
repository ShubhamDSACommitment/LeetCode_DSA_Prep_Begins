package Searching_Algorithms_Problems.Binary_Search_Problems;
//https://leetcode.com/problems/find-peak-element/description/
//same as first problem just the solving style is different
public class Peek_Index_in_Mountain_Array_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,7,8,0,2,1};
        System.out.println(arr[findPeek(arr)]);
    }
    public static int findPeek(int[] arr){
        int n = arr.length-1;
        if(arr.length==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n]>arr[n-1]) return n;
        int start = 1;
        int end = arr.length-2;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
            else if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]) start = mid + 1;
            else end=mid;
        }
        return -1;
    }
}
