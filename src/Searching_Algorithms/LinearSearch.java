package Searching_Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
       int index =  linearSearch(new int[]{2,4,6,7,12,32,11,1,},1);
        System.out.println("INDEX:"+index);
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
}
