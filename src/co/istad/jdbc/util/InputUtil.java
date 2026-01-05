package co.istad.jdbc.util;
import java.util.Scanner;
import java.math.BigDecimal;

public class InputUtil {

    private static final Scanner sc = new Scanner(System.in);

    public static int inputInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter number only!");
            }
        }
    }

    public static String inputString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static BigDecimal inputBigDecimal(String message) {
        while (true) {
            try {
                System.out.print(message);
                return new BigDecimal(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid decimal number!");
            }
        }
    }
}
