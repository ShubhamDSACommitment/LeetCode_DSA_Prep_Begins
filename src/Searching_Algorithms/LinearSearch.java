package Searching_Algorithms;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
       int index =  linearSearch(new int[]{2,4,6,7,12,32,11,1,},1);
        System.out.println("INDEX:"+index);
        boolean result = linearSearchInString("Shubham", 'x');
        System.out.println("RESULT: "+result);
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        System.out.println("2D ARRAY VALUE INDEX: "+Arrays.toString(searchIn2dArray(arr,2)));
    }

    private static int linearSearch(int[] arr,int target) {
        int i=0;
        for(int num:arr){
            if(num==target) {
                return i;
            }
                i++;
        }
        return -1;
    }

    private static boolean linearSearchInString(String str, char target){
        for(char ch : str.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }

    private static int[] searchIn2dArray(int[][] arr, int target){
        int i=0;
        int j=0;
        for(int[] val:arr){
            for(int ans:val){
                if(ans==target) return new int[]{i,j};
                j++;
            }
            i++;
            j=0;
        }
        return new int[]{-1,-1};
    }
}
