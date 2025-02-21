package Searching_Algorithms_Problems.Binary_Search_Problems;

class Search_In_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4, 5, 6, 7, 0, 1, 2};
        System.out.println(searchInARotatedSortedArrayII(arr,1));
    }
    public static boolean searchInARotatedSortedArrayII(int[] arr, int target) {
      int start = 0;
      int end = arr.length - 1;
      while(start<=end){
          int mid = start + (end - start) / 2;
          if(arr[mid] == target) return true;
          else if(arr[start]==arr[mid] && arr[mid]==arr[end]){
              if(arr[mid]!=target){
              start++;
              end--;
              }
          }
          else if(arr[start]<arr[mid]){
              if(arr[mid]>=arr[start] && arr[mid]<=arr[end]) {
                  end = mid - 1;
              }else start = mid + 1;
          }else{
              if(arr[mid]<=arr[end] && arr[mid]>arr[start]){
                  start = mid + 1;
              }else end = mid - 1;
          }
      }
      return false;
    }
}