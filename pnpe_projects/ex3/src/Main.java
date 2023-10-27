import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
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
        arrayMin(array1);
        arrayMax(array1);


        scanner.close();
    }
    public static void arrayMin(int[] array1){
        int min = array1[0];
        for(int i = 0; i < array1.length; i++)
        {
            if(array1[i] < min)
            {
                min = array1[i];
            }
        }
        System.out.println("Minimum number is: " + min);
    }
    public static void arrayMax(int[] array1){
        int max = array1[0];
        for(int i = 0; i < array1.length; i++)
        {
            if(array1[i] > max)
            {
                max = array1[i];
            }
        }
        System.out.println("Maximum number is: " + max);
    }

}