import java.util.Scanner;

 class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number = input.nextDouble();
        while (number != 0) {
            total += number;
            number = input.nextDouble();
        }
        System.out.println("Total sum is " + total);
    }
}
