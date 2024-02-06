import java.io.*;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger integer = new BigInteger(n);
        System.out.println(integer.isProbablePrime(1)? "prime": "not prime");
        bufferedReader.close();
    }
}
