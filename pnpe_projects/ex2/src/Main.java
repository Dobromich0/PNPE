import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[10];

        for(int i = 0; i < array1.length; i++)

        {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Array: ");

        for(int i = 0; i < array1.length; i++ )

        {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        arrayReverse(array1);

        scanner.close();
    }
    public static void arrayReverse(int[] array1){
        int[] arrayRevers = new int[10];

        for(int i = 0; i < array1.length; i++)

        {
            arrayRevers[i] = array1[array1.length - 1 -i];
        }

        System.out.print("Reverse array: ");

        for(int i = 0; i < arrayRevers.length; i++)

        {
            System.out.print(arrayRevers[i] + " ");
        }
    }
}