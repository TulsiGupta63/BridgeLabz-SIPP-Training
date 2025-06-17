import java.util.Scanner;

 class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = count - 1;
        temp = number;
        while (temp > 0) {
            digits[index--] = temp % 10;
            temp /= 10;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " => " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}
