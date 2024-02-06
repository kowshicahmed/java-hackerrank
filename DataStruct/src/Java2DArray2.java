import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java2DArray2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();

        // Read input matrix
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        System.out.println(arr);

        // Calculate hourglass sums
        for (int j = 0; j < arr.size() - 2; j++) {
            for (int i = 0; i < arr.get(j).size() - 2; i++) {
                int hourglassSum = calculateHourglassSum(arr, j, i);
                sumList.add(hourglassSum);
            }
        }

        // Find and print the maximum sum
        Collections.sort(sumList);
        System.out.println(sumList.getLast());

        bufferedReader.close();
    }

    private static int calculateHourglassSum(List<List<Integer>> arr, int row, int col) {
        return arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2)
                + arr.get(row + 1).get(col + 1)
                + arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);
    }
}
