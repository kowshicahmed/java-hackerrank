import java.util.*;

public class InOut_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = (double)scan.nextDouble();

        /*
         * At this point, the scanner is still on the second line at the end
         * of the double, so we need to move the scanner to the next line
         * scans to the end of the previous line which contains the double.
         */
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
