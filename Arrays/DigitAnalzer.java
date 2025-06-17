import java.util.Scanner;
 class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;
            number /= 10;

            if (index == maxDigits) {
                maxDigits *= 2;
                int[] temp = new int[maxDigits];
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index++] = digit;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit not found (all digits are same).");
        }

        input.close();
    }
}
