import java.util.*;
import java.lang.*;

public class Greedy {
    public static void main(String[] args) {
        ArrayList<int[]> arr = new ArrayList<int[]>();
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        for(int i=0; i<6; i++) {
            arr.add(new int[]{start[i], end[i]});
        }
        for(int i=0; i<6; i++) {
            int[] currArr = arr.get(i);
            System.out.println(Arrays.toString(currArr));
        }
    }
}