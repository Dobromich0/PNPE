import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];

        for(int i = 0; i < array1.length; i++)

        {
            array1[i] = scanner.nextInt();
        }

        arrayEven(array1);

        arraySum(array1);

        arrayOdd(array1);

        scanner.close();
    }
    public static void arrayEven(int[] array1){
        int sum = 0;
        for(int i = 0; i < array1.length; i++)
        {
            if(array1[i] % 2 == 0)
            {
                sum += array1[i];
            }
        }
        System.out.println("Sum of all even numbers is: " + sum);
    }

        public static void arraySum(int[] array1){
            int sum = 0;
            for(int i = 0; i < array1.length; i++)
            {
                sum += array1[i];
            }
            System.out.println("Sum of all numbers is: " + sum);
    }
    public static void arrayOdd(int[] array1){
        int sum = 0;
        for(int i = 0; i < array1.length; i++)
        {
            if(array1[i] % 2 != 0)
            {
                sum += array1[i];
            }
        }
        System.out.println("Sum of all odd numbers is: " + sum);
    }
}