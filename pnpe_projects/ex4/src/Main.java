import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if(simple(x))
        {
            System.out.println(x + " is Simple");
        }
        else
        {
            System.out.println(x + " is not Simple");
        }

        scanner.close();
    }
    public static boolean simple(int x) {

        if (x <= 1)
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {

                return false;
            }
        }

        return true;
    }
}