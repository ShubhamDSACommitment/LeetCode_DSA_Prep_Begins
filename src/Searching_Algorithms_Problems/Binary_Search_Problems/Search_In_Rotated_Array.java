package Searching_Algorithms_Problems.Binary_Search_Problems;

import java.util.Arrays;

class Search_In_Rotated_Array {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 7, 8, 0, 1, 2};
        int index = findPivotIndex(arr);
        System.out.println(arr[index]);
    }

    public static int findPivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid]<arr[mid+1] && arr[mid] > arr[mid-1]) start = mid + 1;
            else end = mid;
        }
        return end;
    }
//    public int search(int[] nums, int target) {
//
//    }
}