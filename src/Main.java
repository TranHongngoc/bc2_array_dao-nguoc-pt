import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the size: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Enter size less than 20.");
            }
        }while (size > 20);

        array = new int[size];
        for (int i = 0; i< size; i++){
            System.out.println("Enter element " + (i+1) + ":");
            array[i] = scanner.nextInt();
        }

        System.out.println("The element in array: ");
        for (int i = 0; i<size; i++){
            System.out.printf(array[i] + "\t");
        }

        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        System.out.println("\nArray after: " + Arrays.toString(array));
    }
}
