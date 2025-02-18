package Searching_Algorithms_Problems;

class CountDigitsInNumber {
    public static void main(String[] args) {
    int count = countDigitsInNumber(123);
        System.out.println(count);
        int[] arr = new int[]{12,345,2,6,7896,11};
        int val = findNumbers(arr);
        System.out.println(val);
    }
    public static int countDigitsInNumber(int num){
        if(num==0) return 1;
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int findNumbers(int[] nums) {
        int count;
        int isEven=0;
        for(int val:nums){
            count = countDigitsInNumber(val);
            if(count%2 == 0) isEven++;
        }
        return isEven;
    }
}