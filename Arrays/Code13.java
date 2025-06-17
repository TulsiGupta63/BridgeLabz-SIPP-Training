import java.util.Scanner;

 class Code13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;

        double[] salary = new double[EMPLOYEE_COUNT];
        int[] yearsOfService = new int[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input salaries and years of service
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            // Validate salary input
            System.out.print("Enter salary: ");
            double sal = input.nextDouble();
            if (sal <= 0) {
                System.out.println("Invalid salary. Please enter again.");
                i--;
                continue;
            }

            // Validate years of service input
            System.out.print("Enter years of service: ");
            int yrs = input.nextInt();
            if (yrs < 0) {
                System.out.println("Invalid years of service. Please enter again.");
                i--;
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        // Calculate bonus, new salary and totals
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print results
        System.out.println("\n--- Salary Details of Employees ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d => Old Salary: INR %.2f, Bonus: INR %.2f, New Salary: INR %.2f\n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Company Summary ---");
        System.out.printf("Total Old Salary: INR %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: INR %.2f\n", totalBonus);
        System.out.printf("Total New Salary: INR %.2f\n", totalNewSalary);

        input.close();
    }
}
