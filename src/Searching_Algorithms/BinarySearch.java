package Searching_Algorithms;


// Binary Search implementation in Java
// Binary Search is an efficient algorithm for finding an element in a sorted array
// It works by repeatedly dividing the search space in half
public class BinarySearch {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1,2,4,6,12,13,14},1));
    }

    /**
     * Performs binary search on a sorted array to find the target element.
     * Time Complexity: O(log N) - The search space is divided in half at each step.
     * Space Complexity: O(1) - No extra space is used, only a few variables.
     *
     * @param arr    The sorted array in which to search.
     * @param target The number to search for.
     * @return The index of the target in the array if found, otherwise -1.
     */
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else return mid;
        }
        return -1 ;
    }
}
