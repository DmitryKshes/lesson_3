import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class extra_task_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Enter the size of the array");
        int array_length = new Scanner(System.in).nextInt();
        while (array_length <= 5 || array_length > 10) {
            System.out.println("Incorrect array length. Please try again: ");
            array_length = new Scanner(System.in).nextInt();
        }
        int[] array = new int[array_length];
        for (int i = 0; i < array_length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println("Array: " + Arrays.toString(array));
        int lengthOfEvenArray = 0;
        for (int i = 0; i < array_length; i++) {
            if (array[i] % 2 == 0) {
                lengthOfEvenArray++;
            }
        }
        int[] evenArray = new int[lengthOfEvenArray];
        int index = 0;
        for (int i = 0; i < array_length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[index] = array[i];
                index++;
            }
        }
        System.out.println("Even array: " + Arrays.toString(evenArray));
    }
}

