import java.util.Scanner;

 class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = input.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        input.close();
    }
}
