import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            long a = in.nextLong();
            long b = in.nextLong();

            long sum = (b - a + 1) * (a + b) / 2;

            System.out.println(sum);
        }
    }
}
