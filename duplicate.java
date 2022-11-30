import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> dupli = new ArrayList<Integer>();
        int[] arr = {5, 6, 2, 3, 2, 1, 5, 3, 1, 4};
        int count=0;
        int num;
        boolean redundant = false;
        int len=arr.length;
        for (int i=0;i<len;i++) {
            count=0;
            redundant = false;
            num=arr[i];
            try {
                if (!(dupli.isEmpty())) {
                    for(int l=0;l<dupli.size();l++) {
                        if(num == dupli.get(l)) {
                            redundant = true;
                            break;
                        }
                    }
                }
            }
            catch (Exception e){
                System.out.println("Beg your pardon!");
            }
            for(int j=0;j<len;j++) {
                if(num==arr[j])
                {
                    count++;
                }
            }
            if(count>1 && redundant==false) {
                dupli.add(num);
            }
        }
        for(int k=0;k<len;k++) {
            System.out.println(dupli.get(k) + " ");
        }
    }
}
