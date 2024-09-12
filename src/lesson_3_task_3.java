import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class lesson_3_task_3 {
    public static void main(String[] args) {

        System.out.println("Enter array length: ");
        int array_length = new Scanner(System.in).nextInt();
        int[] array = new int[array_length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println("Array is: " + Arrays.toString(array));
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Maximum element is: " + max);
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Minimum element is: " + min);
        double averageValue = 0;
        int sum = 0;
        for (int j : array){
            sum += j;
            averageValue = (double) sum / array.length;

        }
        System.out.println("Average amount: "+ averageValue);

    }
}
