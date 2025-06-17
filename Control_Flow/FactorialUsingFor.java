import java.util.Scanner;

 class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Please enter a positive integer");
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }
}
