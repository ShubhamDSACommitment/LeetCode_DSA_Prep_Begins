package Searching_Algorithms_Problems.Binary_Search_Problems;

import java.util.Arrays;

public class Floor_Cieling_Problem {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFloorAndCeil(new int[]{3, 4,4, 7, 8, 10},12)));
        System.out.println(ceil(new int[]{12},10));
    }
    public static int[] getFloorAndCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return new int[]{arr[mid], arr[mid]};  // Exact match found
        }

        int floor = (end<0) ? -1: arr[end];
        int ceil = (start>=arr.length) ? -1:arr[start];
        return new int[]{floor, ceil};
    }
    public static int ceil(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]) end = mid-1;
            else start = mid+1;
        }
        return (start>=arr.length) ?  -1 :  arr[start];
    }

}
