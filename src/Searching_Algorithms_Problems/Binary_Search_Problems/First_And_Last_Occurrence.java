package Searching_Algorithms_Problems.Binary_Search_Problems;

import java.util.Arrays;

class First_And_Last_Occurrence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 8, 8, 8, 8, 10}, 6)));
    }

    public static int[] searchRange(int[] arr, int target) {
        int left= search(arr,target,true);
        int right = search(arr,target,false);
        return new int[]{left,right};

    }
    public static int search(int[] arr, int target, boolean isleft){
        int start = 0;
        int end = arr.length - 1;
        int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid])
                start = mid + 1;
            else {
                ans=mid;
                if(isleft){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}