package org.fresh.hakerrank.medium;

public class MinimumSwaps2 {
    public static void main(String[] args) {
        minimumSwaps(new int[]{4, 3, 1, 2});
        minimumSwaps(new int[]{2, 3, 4, 1, 5});
        minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7});
    }

    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length;) {
            if(arr[i] != i+1){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
                swaps++;
            } else {
                i++;
            }
        }
        return swaps;
    }

}
