import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder B = new StringBuilder(A);
        System.out.println(A.equalsIgnoreCase(B.reverse().toString()));
        System.out.println( A.equals( new StringBuilder(A).reverse().toString())
                ? "Yes" : "No" );
        System.out.println("java" == "avaj");
    }


}
