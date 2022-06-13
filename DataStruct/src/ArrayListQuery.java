import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuery {
    public static void main(String[] args) {
        ArrayList<List<String>> myList = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);
        int listSize = scanner1.nextInt();
        // Creating an object of BufferedReader class
        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        for(int i = 0; i < listSize; i++) {
            // Reading input a string
            try {
                String[] nums = bi.readLine().split(" ");
                myList.add(Arrays.asList(nums));
            } catch (IOException e) {
                System.out.println("IO exception");
            }
        }

        Scanner scanner2 = new Scanner(System.in);
        int noOfQuery = scanner2.nextInt();
        for(int i = 0; i< noOfQuery; i++) {
            int x = scanner2.nextInt();
            int y = scanner2.nextInt();
            try {
                System.out.println(myList.get(x).get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }
        scanner1.close();
        scanner2.close();
    }
}