import java.util.*;

class MyArray {
    public static void main(String[] args) {
        int arr[] = {3 ,2 ,4 ,5 ,1 ,10};
        int len = arr.length;
        int sum = 0, max=0;
        for (int i=0;i<(len-2);i++) 
        {
            for (int j=i+1;j<(len-1);j++) 
            {
                for (int k=j+1;k<len;k++) 
                {
                   if (arr[i]<arr[j] && arr[j]<arr[k]) {
                       sum = arr[i] + arr[j] +arr[k];
                       if (sum>max) {
                           max = sum;
                       }
                   }
                }
            }
        }
        System.out.println(max);
    }
}