import java.security.SecureRandom;
import java.util.*;
public class Password2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter desired password length: ");
            int length = input.nextInt();

            if (length <= 0) {
                System.out.println("Length must be positive.");
                return;
            }

            // Character sets
            String digits = "0123456789";
            String lower = "abcdefghijklmnopqrstuvwxyz";
            String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String symbols = "!@#$%";

            SecureRandom rnd = new SecureRandom();
            StringBuilder password = new StringBuilder(length);

            for (int i = 0; i < length; i++) {
                int category = rnd.nextInt(4); // 0:digit, 1:lower, 2:upper, 3:symbol

                switch (category) {
                    case 0 : password.append(digits.charAt(rnd.nextInt(digits.length())));
                    case 1 : password.append(lower.charAt(rnd.nextInt(lower.length())));
                    case 2 : password.append(upper.charAt(rnd.nextInt(upper.length())));
                    case 3 : password.append(symbols.charAt(rnd.nextInt(symbols.length())));
                }
            }

            System.out.println("\nGenerated strong password: " + password);
    }
}
