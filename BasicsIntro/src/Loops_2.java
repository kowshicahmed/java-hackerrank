import java.util.Scanner;

public class Loops_2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0; j<n; j++)
            {
                result = a;
                for(int k=0; k<j+1; k++)
                {
                    result += Math.pow(2, k) *import java.util.Scanner;

public class Loops_2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0; j<n; j++)
            {
                result = a;
                for(int k=0; k<j+1; k++)
                {
                    result += Math.pow(2, k) * b;

                }
                System.out.printf("%d ", result);
            }
            System.out.println("");

        }
        in.close();
    }
}
