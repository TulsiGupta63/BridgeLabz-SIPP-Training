import java.util.Scanner;

 class Code11.java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 1) {
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Both results are equal? " + (sumLoop == sumFormula));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
