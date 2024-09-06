import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class lesson_3_task_1 {
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        int arraySize = new Scanner(System.in).nextInt();
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println("Array is: " + Arrays.toString(array));
        System.out.println("Enter value for array: ");
        int enterValue = new Scanner(System.in).nextInt();

        for (int j : array) {
            if (enterValue == j) {
                System.out.println("Included");
            } else System.out.println("Not included");
        }
    }
}
