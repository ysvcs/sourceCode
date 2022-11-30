import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        int swap, j, i=1;
        /*while(i<arr.length) {
            for(j=i-1; j>=0; j--) {
                if(arr[j]<=arr[j+1]) {
                    break;
                }
                else {
                    swap = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = swap;
                }
            }
            System.out.println(Arrays.toString(arr));
            i++;
        }*/
        for (i=1; i<arr.length; i++) {
            j = i-1;
            while(j>=0 && arr[j+1] < arr[j]) {
                swap = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = swap;
                j--;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
