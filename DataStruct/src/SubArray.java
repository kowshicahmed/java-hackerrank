import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        List<Integer> arr = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = arr.get(i);
            if (sum < 0) {
                count += 1;
            }
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(j);
                if (sum < 0) {
                    count += 1;
                }
            }
        }

        System.out.println(count);


    }
}
