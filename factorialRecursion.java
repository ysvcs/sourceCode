import java.security.PublicKey;
import java.util.*;

class FACT {
    static int factorial(int num) {
        if (num==1)
            return 1;
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        int fact;
        System.out.print("Enter number whose factorial is to be determined:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fact = number*factorial(number-1);
        System.out.println("Factorial of " + number + ":");
        System.out.print(fact);
    }
}