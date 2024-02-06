import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerAddMul {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger integer1 = new BigInteger(n);

        n = bufferedReader.readLine();
        BigInteger integer2 = new BigInteger(n);

        System.out.println(integer1.add(integer2));
        System.out.println(integer1.multiply(integer2));
    }
}
