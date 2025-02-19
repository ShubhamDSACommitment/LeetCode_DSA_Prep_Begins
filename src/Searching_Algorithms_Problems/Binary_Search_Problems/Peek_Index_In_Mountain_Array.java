package Searching_Algorithms_Problems.Binary_Search_Problems;

public class Peek_Index_In_Mountain_Array {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{1,2,4,5,6,7,5,3,1}));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid]<arr[mid+1]) start = mid + 1;
            else if (arr[mid]>arr[mid+1]) end = mid ;
        }
        return end;
    }
}
