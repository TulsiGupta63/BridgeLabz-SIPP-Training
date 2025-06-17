import java.util.Scanner;

 class Code14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Edge case for 0
        if (number == 0) {
            System.out.println("Reversed Number: 0");
            return;
        }

        // Step 2: Count digits
        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 3: Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Step 4: Create reverse array
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Step 5: Display the reversed array
        System.out.print("Digits in reverse order: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        input.close();
    }
}
