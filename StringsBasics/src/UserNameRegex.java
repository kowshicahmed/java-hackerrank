import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameRegex {
    static boolean isValidName (String name) {
        String userNameRegex = "^[a-zA-Z][\\w]{7,29}";
        Pattern userNamePattern = Pattern.compile(userNameRegex);
        Matcher matcher = userNamePattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // in the line below scanner.nextInt() is not used because
        // after calling nextInt(), the newline character (if any) is not consumed.
        int noOfPrompt = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < noOfPrompt; i++) {
            String name = scanner.nextLine();
            System.out.println(isValidName(name) ? "Valid": "Invalid");
        }
        scanner.close();
    }
}
