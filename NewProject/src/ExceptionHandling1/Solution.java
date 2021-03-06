package ExceptionHandling1;
import java.util.*;

public class Solution {
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getCanonicalName());
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
