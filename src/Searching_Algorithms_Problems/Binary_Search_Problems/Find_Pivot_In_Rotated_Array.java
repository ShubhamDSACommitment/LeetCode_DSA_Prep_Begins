package Searching_Algorithms_Problems.Binary_Search_Problems;

public class Find_Pivot_In_Rotated_Array {
    public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(findPivot(arr));
    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
            if(arr[start]>=arr[mid]) end = mid - 1;
            else start = mid+1;
        }
        return 0;
    }
}
