package iii_kiss;

class FactorialCalculator {
    public static int factorial_badCode(int n) {
        if(n == 0) return 1;


        int fact = 1;
        for(int i = 1; i <= n; i++) {
            int temp = 1; // temporary variable to store intermediate results
            for(int j = 1; j <= i; j++) {
                temp *= j; //multiplying repeated in nested loops
            }
            fact = temp; // reassigning fact unnecessarily
        }
        return fact;
    }

    public static int factorial_kiss_compliant(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = FactorialCalculator.factorial_badCode(5);
        System.out.println("Factorial : " + result);


        int factorial = FactorialCalculator.factorial_kiss_compliant(5);
        System.out.println("Factorial : " + factorial);
    }
}
