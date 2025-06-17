import java.util.Scanner;

 class Code14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 1) {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Both results are equal? " + (sum == formulaSum));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
