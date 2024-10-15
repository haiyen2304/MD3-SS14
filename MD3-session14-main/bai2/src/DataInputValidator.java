import java.util.InputMismatchException;
import java.util.Scanner;

public class DataInputValidator {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        int value;
        while (true) {
            System.out.print(message);
            try {
                value = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại một số nguyên.");
                scanner.next(); // Clear the invalid input
            }
        }
        return value;
    }

    public static double getDouble(String message) {
        double value;
        while (true) {
            System.out.print(message);
            try {
                value = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại một số thực.");
                scanner.next(); // Clear the invalid input
            }
        }
        return value;
    }

    public static String getString(String message) {
        System.out.print(message);
        return scanner.next();
    }
}
