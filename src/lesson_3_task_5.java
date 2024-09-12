import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class lesson_3_task_5 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Enter array length: ");
        int array_length = new Scanner(System.in).nextInt();
        int[] array = new int[array_length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println("Initial array: "+Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) array[i] = 0;
        }
        System.out.println("Edited array: "+Arrays.toString(array));
    }
}
