import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<String>> arr = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        System.out.println(arr);
        for (int j = 0; j < arr.size() - 2; j++) {
            for (int i = 0; i < arr.get(j).size() - 2; i++) {
                sum.add(Integer.parseInt(arr.get(j).get(i)) + Integer.parseInt(arr.get(j).get(i + 1)) + Integer.parseInt(arr.get(j).get(i + 2)) +
                        Integer.parseInt(arr.get(j+1).get(i + 1)) + Integer.parseInt(arr.get(j+2).get(i)) + Integer.parseInt(arr.get(j+2).get(i + 1)) + Integer.parseInt(arr.get(j+2).get(i + 2)));
            }
        }

        Collections.sort(sum);
        System.out.println(sum.getLast());


        bufferedReader.close();
    }
}
