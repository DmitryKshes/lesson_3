import java.util.Arrays;

public class extra_task_2 {
    public static void main(String[] args) {
        String[] array = new String[] {"Dmitry", "Vasya", "Andrey", "Petr"};
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
        }
        System.out.println(Arrays.toString(array));
    }
}
