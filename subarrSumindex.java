import java.util.*;

class Solution
{
    public static void main (String[] args) 
    {
        int sum=0, s=19;
        int[] arr = {8, 3, 6, 7, 5, 10, 4};
        int len = arr.length;
        int first=0, last=0;
        for (int i=0;i<len;i++) {
            sum += arr[i];
            last = i;
            if (sum == s) { 
                last = i+1;
                first += 1;
                break;
            }
            if (sum > s) {
                sum -= arr[first];
                first++;
                if (sum == s) {
                    last = last+1;
                    first += 1;
                    break; 
                }
            }
        }
        System.out.print(first);
        System.out.print(last);  
    }
}