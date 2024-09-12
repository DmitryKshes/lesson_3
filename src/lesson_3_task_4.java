import java.util.Arrays;
import java.util.Random;

public class lesson_3_task_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arrOne = new int[5];
        int sumOfArrayOne = 0;
        int sumOfArrayTwo = 0;
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = rand.nextInt(101);
        }
        for (int i = 0; i < arrOne.length; i++) {
            sumOfArrayOne += arrOne[i];
        }
        int overageSumOfArrayOne = sumOfArrayOne / 5;
        System.out.println("Array one: " + Arrays.toString(arrOne));
        System.out.println("overage sum of array one: " + overageSumOfArrayOne);

        int[] arrTwo = new int[5];
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = rand.nextInt(101);
        }
        for (int i = 0; i < arrTwo.length; i++) {
            sumOfArrayTwo += arrTwo[i];
        }
        int overageSumOfArrayTwo = sumOfArrayTwo / 5;
        System.out.println("Array two: " + Arrays.toString(arrTwo));
        System.out.println("overage sum of array two: " + overageSumOfArrayTwo);
        if (overageSumOfArrayOne > overageSumOfArrayTwo) {
            System.out.println("Overage sum first array more.");
        } else if (overageSumOfArrayTwo > overageSumOfArrayOne) {
            System.out.println("Overage sum second array more.");
        } else {
            System.out.println("Overage sum first array equal second array.");
        }
    }
}
