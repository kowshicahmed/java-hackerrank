import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class ListQuery {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        for(int i=0; i<length; i++) {
            myList.add(scanner.nextInt());
        }
        int noOfQuery = scanner.nextInt();
        for(int i=0; i<noOfQuery; i++) {
            String command = scanner.next();
            if(command.equals("Insert")) {
                int pos = scanner.nextInt();
                int val = scanner.nextInt();
                myList.add(pos, val);
            }
            else if(command.equals("Delete")) {
                int pos = scanner.nextInt();
                myList.remove(pos);
            }
        }
        String delimiter = " ";
        StringJoiner joiner = new StringJoiner(delimiter);
        myList.forEach(item -> joiner.add(String.valueOf(item)));
        System.out.println(joiner.toString());
    }
}