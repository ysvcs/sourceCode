import java.util.*;

import javax.swing.text.StyledEditorKit;

class MyClass {
    public static void main(String[] args) {
        System.out.println("Enter a number whose factor is to be determined:");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}